using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace Proiect2LFC
{ 
    internal class GlobalVariables
    {
        public List<string> Globals { get; private set; } = new();

        public void AnalyzeTokensForGlobals(string[] lines)
        {
            int blockDepth = 0; 
            bool insideFunction = false;
            bool isParameter = false;
            Regex tokenRegex = new Regex(@"<([^,]+),\s*(.+),\s*(\d+)>");

            string lastToken = "";
            string possibleGlobalType = "";
            string possibleGlobalName = "";
            string initializationValue = "";

            foreach (string line in lines)
            {
                Match match = tokenRegex.Match(line);
                if (!match.Success)
                {
                    Console.WriteLine($"Linie invalidă: {line}");
                    continue;
                }

                string tokenType = match.Groups[1].Value.Trim();
                string lexeme = match.Groups[2].Value.Trim();
                int lineNumber = int.Parse(match.Groups[3].Value.Trim());

                if (tokenType == "LBRACE")
                {
                    blockDepth++;
                    if (blockDepth == 1 && lastToken == "FUNCTION_NAME")
                    {
                        insideFunction = true;
                    }
                }
                else if (tokenType == "RBRACE")
                {
                    blockDepth--;
                    if (blockDepth == 0) { insideFunction = false; isParameter = false; }
                }

                if (tokenType == "FUNCTION_NAME" && blockDepth == 0)
                {
                    isParameter = true;
                }
                else if (tokenType == "INT_TYPE" || tokenType == "FLOAT_TYPE" || tokenType == "DOUBLE_TYPE" || tokenType == "STRING_TYPE")
                {
                    if (blockDepth == 0 && !insideFunction)
                    {
                        possibleGlobalType = lexeme;
                    }
                }
                else if (tokenType == "VARIABLE_NAME" && !string.IsNullOrEmpty(possibleGlobalType) && blockDepth == 0 && !insideFunction
                    && !isParameter)
                {
                    possibleGlobalName = lexeme;
                }
                else if (tokenType == "EQUALS" && !string.IsNullOrEmpty(possibleGlobalName))
                {
                    initializationValue = "";
                }
                else if (!string.IsNullOrEmpty(possibleGlobalName) && (tokenType == "NUMBER" || tokenType == "STRING"))
                {
                    initializationValue = lexeme;
                }
                else if (tokenType == "SEMICOLON" && !string.IsNullOrEmpty(possibleGlobalName))
                {
                    string globalEntry = $"{possibleGlobalType} {possibleGlobalName} (Global  Variable at Line {lineNumber})";

                    if (!string.IsNullOrEmpty(initializationValue))
                    {
                        globalEntry += $" = {initializationValue}";
                    }

                    Globals.Add(globalEntry);

                    possibleGlobalType = "";
                    possibleGlobalName = "";
                    initializationValue = "";
                }

                lastToken = tokenType;
            }
        }

        public void WriteGlobalsToFile(string globalsPath)
        {
            File.WriteAllLines(globalsPath, Globals);
        }
    }

}
