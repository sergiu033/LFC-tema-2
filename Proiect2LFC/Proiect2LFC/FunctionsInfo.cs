using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Proiect2LFC
{
    internal class FunctionsInfo
    {
        private readonly string[] _functions;
        private readonly string[] _variables;
        private readonly string[] _controlStructures;

        public FunctionsInfo(string functionsFilePath, string variablesFilePath, string controlStructuresFilePath)
        {
            _functions = File.ReadAllLines(functionsFilePath);
            _variables = File.ReadAllLines(variablesFilePath);
            _controlStructures = File.ReadAllLines(controlStructuresFilePath);
        }

        public void GenerateCombinedFile(string outputFilePath)
        {
            var output = new List<string>();

            foreach (var functionLine in _functions)
            {
                var parts = functionLine.Split('(', 2);
                var header = parts[0].Trim();
                var details = parts[1].TrimEnd(')').Split(new[] { "  " }, StringSplitOptions.RemoveEmptyEntries);

                string functionName = header.Split(' ')[1];
                string returnType = header.Split(' ')[0]; 
                string type = functionLine.Contains("Recursive") ? "Recursive" : "Iterative"; 
                string isMain = functionName == "main" ? "Yes" : "No"; 
                string lineNumberString = details.Length > 0 ? details[^1] : null;
                int startLineNumber = int.Parse(lineNumberString.Split("Line ")[1].Split(',')[0].Trim());
    
                int endLineNumber = int.Parse(lineNumberString.Split("Ends ")[1].Trim(')', ' '));

                output.Add($"Function: {functionName}");
                output.Add($"Return Type: {returnType}");
                output.Add($"Type: {type}");
                output.Add($"Main: {isMain}");
                output.Add($"Declared / Defined at Line: {startLineNumber}");

                output.Add("Parameters:");
                foreach (var variableLine in _variables)
                {
                    if (variableLine.Contains($"Parameter in Function {functionName}"))
                    {
                        var varParts = variableLine.Split(' ');
                        output.Add($"  - {varParts[0]} {varParts[1]}");
                    }
                }

                output.Add("Local Variables:");
                foreach (var variableLine in _variables)
                {
                    if (variableLine.Contains($"Local Variable in Function {functionName}"))
                    {
                        var varParts = variableLine.Split(new[] { ' ', '=' }, StringSplitOptions.RemoveEmptyEntries);
                        string typeVar = varParts[0];
                        string nameVar = varParts[1];
                        string initialValue = varParts.Length > 3 ? varParts[3] : "(uninitialized)";
                        string lineVar = variableLine.Split("at Line ")[1]; 
                        output.Add($"  - {typeVar} {nameVar} (at Line {lineVar}");
                    }
                }
                output.Add("Control Structures:");
                foreach (var controlLine in _controlStructures)
                {
                    var structureParts = controlLine.Trim('<', '>').Split(',');
                    int controlLineNumber = int.Parse(structureParts[1]);

                    if (controlLineNumber >= startLineNumber && controlLineNumber<=endLineNumber)
                    {
                        output.Add($"  - {structureParts[0]} at Line {controlLineNumber}");
                    }
                }

                output.Add("");
            }

            File.WriteAllLines(outputFilePath, output);
        }
    }
}
