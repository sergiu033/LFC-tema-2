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
            bool isRecursive = false;  // Flag pentru a verifica dacă funcția este recursivă
            string functionReturnType = ""; // Păstrăm tipul returnat al funcției
            List<string> functionParameters = new(); // Lista de parametri ai funcției
            string functionName = ""; // Numele funcției
            string currentFunctionName = ""; // Numele funcției curente
            bool isMain=false;

            foreach (string line in lines)
            {
                Match match = tokenRegex.Match(line);
                if (!match.Success) continue;

                string tokenType = match.Groups[1].Value.Trim();
                string lexeme = match.Groups[2].Value.Trim();
                int lineNumber = int.Parse(match.Groups[3].Value.Trim());

                // Detectăm tipul funcției
                if (tokenType == "INT_TYPE" || tokenType == "FLOAT_TYPE" || tokenType == "DOUBLE_TYPE" || tokenType == "STRING_TYPE" || tokenType == "VOID_TYPE")
                {
                    if (blockDepth == 0 && !insideFunction)
                    {
                        functionReturnType = lexeme; // Capturăm tipul returnat
                    }
                }

                // Detectăm începutul unei funcții
                if (tokenType == "FUNCTION_NAME" && blockDepth == 0)
                {
                    functionName = lexeme;
                    //functionName = functionName.Substring(0, functionName.Length - 1); // Eliminăm paranteza
                    currentFunctionName = functionName; // Setăm numele funcției curente
                    functionParameters.Clear(); // Resetăm parametrii la începutul funcției
                    insideFunction = true;
                }

                // Colectăm parametrii funcției (între paranteze)
                if (insideFunction && tokenType == "VARIABLE_NAME" && blockDepth == 0)
                {
                    functionParameters.Add(lexeme); // Adăugăm parametrii
                }

                // Verificăm apelurile funcției (dacă funcția se apelează pe sine)
                if (insideFunction && tokenType == "FUNCTION_NAME" && lexeme == currentFunctionName && blockDepth != 0)
                {
                    isRecursive = true; // Funcția este recursivă
                }

                // Gestionăm închiderea blocurilor pentru funcții
                if (tokenType == "LBRACE") blockDepth++;
                else if (tokenType == "RBRACE") blockDepth--;

                // Adăugăm funcția completă când blocul funcției se închide
                if (tokenType == "RBRACE" && insideFunction && blockDepth == 0)
                {
                    string parametersList = functionParameters.Count > 0 ? string.Join(", ", functionParameters) : "No Parameters";
                    string functionEntry = $"{functionReturnType} {functionName} ({parametersList}) ";
                    // Adăugăm funcția ca recursivă sau nu, în funcție de flag-ul `isRecursive`
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

                    functionEntry+=$" (Declared / Defined at Line { lineNumber})";
                    FunctionsList.Add(functionEntry);
                    insideFunction = false;
                    functionReturnType = ""; // Resetăm tipul returnat
                    functionParameters.Clear(); // Resetăm parametrii
                    isRecursive = false; // Resetăm flag-ul pentru recursivitate
                }
            }
        }


        public void WriteFunctionsToFile(string functionsPath)
        {
            File.WriteAllLines(functionsPath, FunctionsList);
        }
    }
}
