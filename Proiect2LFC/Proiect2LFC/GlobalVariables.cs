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
            int blockDepth = 0; // Adâncimea blocurilor
            bool insideFunction = false;
            bool isParameter = false;
            Regex tokenRegex = new Regex(@"<([^,]+),\s*(.+),\s*(\d+)>");

            string lastToken = "";
            string possibleGlobalType = ""; // Păstrăm tipul pentru o posibilă variabilă globală
            string possibleGlobalName = ""; // Păstrăm numele variabilei globale
            string initializationValue = ""; // Păstrăm valoarea de inițializare, dacă există

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

                // Gestionăm adâncimea blocurilor
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

                // Detectăm declarații de funcții
                if (tokenType == "FUNCTION_NAME" && blockDepth == 0)
                {
                    // Adăugăm doar dacă urmează un corp de funcție sau declarație
                    isParameter = true;
                }
                // Detectăm tipuri pentru variabile globale
                else if (tokenType == "INT_TYPE" || tokenType == "FLOAT_TYPE" || tokenType == "DOUBLE_TYPE" || tokenType == "STRING_TYPE")
                {
                    if (blockDepth == 0 && !insideFunction)
                    {
                        possibleGlobalType = lexeme; // Salvăm tipul pentru variabila globală
                    }
                }
                // Detectăm numele variabilei globale
                else if (tokenType == "VARIABLE_NAME" && !string.IsNullOrEmpty(possibleGlobalType) && blockDepth == 0 && !insideFunction
                    && !isParameter)
                {
                    possibleGlobalName = lexeme; // Salvăm numele variabilei globale
                }
                // Detectăm valoarea de inițializare
                else if (tokenType == "EQUALS" && !string.IsNullOrEmpty(possibleGlobalName))
                {
                    initializationValue = ""; // Resetăm valoarea de inițializare
                }
                else if (!string.IsNullOrEmpty(possibleGlobalName) && (tokenType == "NUMBER" || tokenType == "STRING"))
                {
                    initializationValue = lexeme; // Salvăm valoarea de inițializare
                }
                // Finalizăm declarația variabilei globale
                else if (tokenType == "SEMICOLON" && !string.IsNullOrEmpty(possibleGlobalName))
                {
                    string globalEntry = $"{possibleGlobalType} {possibleGlobalName} (Global  Variable at Line {lineNumber})";

                    if (!string.IsNullOrEmpty(initializationValue))
                    {
                        globalEntry += $" = {initializationValue}";
                    }

                    Globals.Add(globalEntry);

                    // Resetăm variabilele
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
