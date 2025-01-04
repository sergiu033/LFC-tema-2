using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Proiect2LFC
{
    internal class LocalVariables
    {
        public List<string> Locals { get; private set; } = new();

        private Dictionary<string, string> TypeMappings = new()
    {
        { "INT_TYPE", "int" },
        { "FLOAT_TYPE", "float" },
        { "DOUBLE_TYPE", "double" },
        { "STRING_TYPE", "string" }
    };

        public void AnalyzeTokensForLocals(string[] lines)
        {
            int blockDepth = 0;
            bool insideFunction = false;
            Regex tokenRegex = new Regex(@"<([^,]+),\s*(.+),\s*(\d+)>");

            string lastToken = "";
            string functionName = "";

            string possibleParameterType = "";
            string possibleParameterName = "";
            string possibleLocalType = "";
            string possibleLocalName = "";
            string initializationValue = "";

            bool isParameter = false;

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

                if (tokenType == "FUNCTION_NAME")
                {
                    isParameter = true;
                }
                else if (tokenType == "RPAREN")
                {
                    isParameter = false;
                }

                if (tokenType == "LBRACE")
                {
                    blockDepth++;
                    if (blockDepth == 1 && functionName != "")
                    {
                        insideFunction = true;
                    }
                }
                else if (tokenType == "RBRACE")
                {
                    blockDepth--;
                    if (blockDepth == 0)
                    {
                        insideFunction = false;
                    }
                }
                if (tokenType == "FUNCTION_NAME" && blockDepth == 0)
                {   
                    functionName = lexeme;
                }
                else if (TypeMappings.ContainsKey(lastToken) && tokenType == "VARIABLE_NAME" && !insideFunction && isParameter)
                {
                    possibleParameterType = TypeMappings[lastToken];
                    possibleParameterName = lexeme;

                    Locals.Add($"{possibleParameterType} {possibleParameterName} (Parameter in Function {functionName} at Line {lineNumber})");

                    possibleParameterType = "";
                    possibleParameterName = "";
                }

                lastToken = tokenType;
            }

            blockDepth = 0;
            insideFunction = false;

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

                if (tokenType == "FUNCTION_NAME" && blockDepth == 0)
                {
                    functionName = lexeme; 
                }

                if (tokenType == "LBRACE")
                {
                    blockDepth++;
                    if (blockDepth == 1 && !string.IsNullOrEmpty(functionName))
                    {
                        insideFunction = true;
                    }
                }

                else if (tokenType == "RBRACE")
                {
                    blockDepth--;
                    if (blockDepth == 0)
                    {
                        insideFunction = false;
                        functionName = "";
                    }
                }
                else if (TypeMappings.ContainsKey(lastToken) && tokenType == "VARIABLE_NAME" && insideFunction)
                {
                    possibleLocalType = TypeMappings[lastToken];
                    possibleLocalName = lexeme;
                    initializationValue = "";
                }
                else if (tokenType == "EQUALS" && !string.IsNullOrEmpty(possibleLocalName))
                {
                    initializationValue = "";
                }
                else if (!string.IsNullOrEmpty(possibleLocalName) && (tokenType == "NUMBER" || tokenType == "STRING"))
                {
                    initializationValue = lexeme;
                }
                else if (tokenType == "SEMICOLON" && !string.IsNullOrEmpty(possibleLocalName) && insideFunction)
                {
                    string localEntry = $"{possibleLocalType} {possibleLocalName} (Local Variable in Function {functionName} at Line {lineNumber})";

                    if (!string.IsNullOrEmpty(initializationValue))
                    {
                        localEntry += $" = {initializationValue}";
                    }

                    Locals.Add(localEntry);

                    possibleLocalType = "";
                    possibleLocalName = "";
                    initializationValue = "";
                }

                lastToken = tokenType;
            }

        }
        public void WriteLocalsToFile(string globalsPath)
        {
            File.WriteAllLines(globalsPath, Locals);
        }
    }
}
