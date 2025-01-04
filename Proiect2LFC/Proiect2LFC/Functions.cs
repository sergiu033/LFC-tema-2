using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Proiect2LFC
{
    internal class Functions
    {
        public List<string> FunctionsList { get; private set; } = new();
        public void AnalyzeTokensForFunctions(string[] lines)
        {
            Regex tokenRegex = new Regex(@"<([^,]+),\s*(.+),\s*(\d+)>");
            int blockDepth = 0;
            bool insideFunction = false;
            bool isRecursive = false;
            string functionReturnType = "";
            List<string> functionParameters = new();
            string functionName = "";
            string currentFunctionName = "";
            bool isMain=false;
            int currFunctionLine=0;
            foreach (string line in lines)
            {
                Match match = tokenRegex.Match(line);
                if (!match.Success) continue;

                string tokenType = match.Groups[1].Value.Trim();
                string lexeme = match.Groups[2].Value.Trim();
                int lineNumber = int.Parse(match.Groups[3].Value.Trim());

                if (tokenType == "INT_TYPE" || tokenType == "FLOAT_TYPE" || tokenType == "DOUBLE_TYPE" || tokenType == "STRING_TYPE" || tokenType == "VOID_TYPE")
                {
                    if (blockDepth == 0 && !insideFunction)
                    {
                        functionReturnType = lexeme;
                        currFunctionLine = lineNumber;
                    }
                }

                if (tokenType == "FUNCTION_NAME" && blockDepth == 0)
                {
                    functionName = lexeme;
                    //functionName = functionName.Substring(0, functionName.Length - 1); 
                    currentFunctionName = functionName;
                    functionParameters.Clear();
                    insideFunction = true;
                }
                if (insideFunction && tokenType.Contains("TYPE")  && blockDepth == 0)
                {
                    functionParameters.Add(lexeme);
                }

                if (insideFunction && tokenType == "FUNCTION_NAME" && lexeme == currentFunctionName && blockDepth != 0)
                {
                    isRecursive = true;
                }

                if (tokenType == "LBRACE") blockDepth++;
                else if (tokenType == "RBRACE") blockDepth--;

                if (tokenType == "RBRACE" && insideFunction && blockDepth == 0)
                {
                    string parametersList = functionParameters.Count > 0 ? string.Join(", ", functionParameters) : "No Parameters";
                    string functionEntry = $"{functionReturnType} {functionName} ({parametersList}) ";

                    if (isRecursive)
                    {

                        functionEntry += " (Recursive)";
                    }
                    else
                    {
                        functionEntry += " (Iterative)";
                    }

                    if (currentFunctionName == "main(")
                    {
                        functionEntry += " (Main)";
                    }
                    else
                    {
                        functionEntry += " (not Main)";
                    }

                    functionEntry+=$" (Declared / Defined at Line { currFunctionLine},Ends {lineNumber})";
                    FunctionsList.Add(functionEntry);
                    insideFunction = false;
                    functionReturnType = ""; 
                    functionParameters.Clear();
                    isRecursive = false; 
                }
            }
        }


        public void WriteFunctionsToFile(string functionsPath)
        {
            File.WriteAllLines(functionsPath, FunctionsList);
        }
    }
}
