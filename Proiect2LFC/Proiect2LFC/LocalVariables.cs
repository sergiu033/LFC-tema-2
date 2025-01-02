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

        public void AnalyzeTokensForLocals(string[] lines)
        {
            int blockDepth = 0; // Adâncimea blocurilor
            bool insideFunction = false;
            Regex tokenRegex = new Regex(@"<([^,]+),\s*(.+),\s*(\d+)>");

            string lastToken = "";
            string functionName = ""; // Numele funcției

            // Variabile pentru parametri
            string possibleParameterType = ""; // Păstrăm tipul pentru un posibil parametru
            string possibleParameterName = ""; // Păstrăm numele parametrului
            string possibleLocalType = ""; // Păstrăm tipul pentru o posibilă variabilă locală
            string possibleLocalName = ""; // Păstrăm numele variabilei locale
            string initializationValue = ""; // Păstrăm valoarea de inițializare, dacă există

            // Lista de parametri și variabile

            bool isParameter=false;

            // 1. În primul rând, analizați parametrii funcției
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
                // Gestionăm adâncimea blocurilor
                if (tokenType == "LBRACE")
                {
                    blockDepth++;
                    if (blockDepth == 1 && functionName != "")
                    {
                        insideFunction = true; // Intrăm într-o funcție când întâlnim { și avem un nume de funcție
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

                // Detectăm declarațiile de funcții
                if (tokenType == "FUNCTION_NAME" && blockDepth == 0)
                {
                    functionName = lexeme; // Setăm numele funcției când îl întâlnim
                }

                // Verificăm dacă ultimul token a fost un tip de variabilă și cel curent este un nume de variabilă (parametru)
                else if ((lastToken == "INT_TYPE" || lastToken == "FLOAT_TYPE" || lastToken == "DOUBLE_TYPE" || lastToken == "STRING_TYPE")
                    && tokenType == "VARIABLE_NAME" && !insideFunction && isParameter==true)
                {
                    // Parametru funcție
                    possibleParameterType = lastToken;
                    possibleParameterName = lexeme;
                    Locals.Add($"{possibleParameterType} {possibleParameterName} (Parameter in Function {functionName} at Line {lineNumber})");

                    // Resetăm variabilele pentru următorul parametru
                    possibleParameterType = "";
                    possibleParameterName = "";
                }
                // Setăm lastToken pentru următoarele verificări
                lastToken = tokenType;
            }

            // 2. În al doilea rând, analizați variabilele locale
            blockDepth = 0; // Resetăm adâncimea blocurilor pentru a analiza variabilele locale
            insideFunction = false; // Resetăm pentru a analiza variabilele locale din interiorul funcției

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
                    if (blockDepth == 1 && functionName != "")
                    {
                        insideFunction = true; // Intrăm într-o funcție când întâlnim { și avem un nume de funcție
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

                // Detectăm variabile locale (după ce am detectat tipul)
                else if ((lastToken == "INT_TYPE" || lastToken == "FLOAT_TYPE" || lastToken == "DOUBLE_TYPE" || lastToken == "STRING_TYPE")
                    && tokenType == "VARIABLE_NAME" && insideFunction)
                {
                    // Variabilă locală
                    possibleLocalType = lastToken;
                    possibleLocalName = lexeme;
                    initializationValue = ""; // Resetăm valoarea de inițializare
                }

                // Detectăm valoarea de inițializare pentru variabilele locale
                else if (tokenType == "EQUALS" && !string.IsNullOrEmpty(possibleLocalName))
                {
                    initializationValue = ""; // Resetăm valoarea de inițializare
                }
                else if (!string.IsNullOrEmpty(possibleLocalName) && (tokenType == "NUMBER" || tokenType == "STRING"))
                {
                    initializationValue = lexeme; // Salvăm valoarea de inițializare
                }

                // Finalizăm declarația variabilei locale
                else if (tokenType == "SEMICOLON" && !string.IsNullOrEmpty(possibleLocalName) && insideFunction)
                {
                    // Adăugăm variabila locală în lista Locals
                    string localEntry = $"{possibleLocalType} {possibleLocalName} (Local Variable at Line {lineNumber})";

                    if (!string.IsNullOrEmpty(initializationValue))
                    {
                        localEntry += $" = {initializationValue}";
                    }

                    Locals.Add(localEntry);

                    // Resetăm variabilele pentru a analiza următoarea variabilă
                    possibleLocalType = "";
                    possibleLocalName = "";
                    initializationValue = "";
                }

                // Setăm lastToken pentru următoarele verificări
                lastToken = tokenType;
            }

            // Afișăm rezultatele
            
        }

        public void WriteLocalsToFile(string globalsPath)
        {
            File.WriteAllLines(globalsPath,Locals);
        }
    }
}
