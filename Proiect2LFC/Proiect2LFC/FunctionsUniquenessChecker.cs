using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Proiect2LFC
{
    internal class FunctionsUniquenessChecker
    {
        private string sourceFilePath;
        private string errorsFilePath;

        public FunctionsUniquenessChecker(string sourceFile, string errorsFile)
        {
            sourceFilePath = sourceFile;
            errorsFilePath = errorsFile;
        }
        public void VerifyFunctionUniqueness()
        {
            var functions = ReadFunctionsFromFile(sourceFilePath);

            List<string> errors = new List<string>();
            var functionSignatures = new HashSet<string>();

            foreach (var function in functions)
            {
                if (!functionSignatures.Add(function.Signature))
                {
                    errors.Add($"ERROR: Duplicate function signature found: {function.Signature} (Defined at Line {function.Line})");
                }
            }
            WriteErrorsToFile(errors);
        }

        private List<FunctionInfo> ReadFunctionsFromFile(string filePath)
        {
            List<FunctionInfo> functions = new List<FunctionInfo>();

            Regex functionRegex = new Regex(@"(\w+)\s+(\w+)\s*\(([^)]*)\)\s*\(([^)]*)\)\s*\(([^)]*)\)\s*\(([^)]+)\s*at\s*Line\s*(\d+),Ends\s*(\d+)\)");

            foreach (var line in File.ReadLines(filePath))
            {
                var match = functionRegex.Match(line);
                if (match.Success)
                {
                    string returnType = match.Groups[1].Value.Trim();
                    string functionName = match.Groups[2].Value.Trim(); 
                    string parameters = match.Groups[3].Value.Trim();
                    string iterationType = match.Groups[4].Value.Trim();
                    string isMain = match.Groups[5].Value.Trim();
                    string declarationType = match.Groups[6].Value.Trim(); 
                    int lineNumber = int.Parse(match.Groups[7].Value.Trim()); 

                    string functionSignature = $"{functionName}({parameters})";

                    FunctionInfo functionInfo = new FunctionInfo
                    {
                        ReturnType = returnType,
                        FunctionName = functionName,
                        Parameters = parameters,
                        IterationType = iterationType,
                        IsMain = isMain,
                        DeclarationType = declarationType,
                        Line = lineNumber,
                        Signature = functionSignature
                    };

                    functions.Add(functionInfo);

                }
                
            }

            return functions;
        }

        private void WriteErrorsToFile(List<string> errors)
        {
            using (StreamWriter writer = new StreamWriter(errorsFilePath, true)) 
            {
                writer.WriteLine("Function uniqueness errors:");
                foreach (var error in errors)
                {
                    writer.WriteLine(error);
                }
                writer.WriteLine();
            }
        }
    }

    public class FunctionInfo
    {
        public string ReturnType { get; set; }
        public string FunctionName { get; set; }
        public string Parameters { get; set; }
        public string IterationType { get; set; }
        public string IsMain { get; set; }
        public string DeclarationType { get; set; }
        public int Line { get; set; }
        public string Signature { get; set; }
    }
}

