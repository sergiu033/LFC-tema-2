using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Proiect2LFC
{

    using System;
    using System.Collections.Generic;
    using System.IO;

    public class FunctionCallValidator
    {
        private HashSet<string> definedFunctions = new(); // Set de funcții definite
        public List<string> Errors { get; private set; } = new(); // Lista de erori
        private string errorFilePath;

        // Constructorul clasei
        public FunctionCallValidator(string functionsFilePath, string tokensFilePath, string errorFilePath)
        {
            this.errorFilePath = errorFilePath;

            // Citim informațiile despre funcții
            string[] functionLines = File.ReadAllLines(functionsFilePath);
            ProcessFunctionDefinitions(functionLines);

            // Verificăm apelurile funcțiilor din fișierul cu tokeni
            string[] tokenLines = File.ReadAllLines(tokensFilePath);
            ValidateFunctionCalls(tokenLines);

            // Salvăm erorile în fișierul de erori
            SaveErrorsToErrorFile();
        }

        // Metoda pentru a procesa definițiile funcțiilor
        private void ProcessFunctionDefinitions(string[] lines)
        {
            foreach (string line in lines)
            {
                // Ignorăm liniile invalide
                if (string.IsNullOrWhiteSpace(line)) continue;

                // Extragem numele funcției
                string functionName = ExtractFunctionName(line);
                functionName = functionName + '(';
                // Adăugăm funcția definită în set
                if (!string.IsNullOrEmpty(functionName))
                {
                    definedFunctions.Add(functionName);
                }
            }
        }

        // Metoda pentru a valida apelurile funcțiilor din fișierul cu tokeni
        private void ValidateFunctionCalls(string[] lines)
        {
            foreach (string line in lines)
            {
                if (string.IsNullOrWhiteSpace(line)) continue;

                // Căutăm tokenul FUNCTION_NAME
                if (line.Contains("<FUNCTION_NAME"))
                {
                    // Extragem numele funcției din token
                    string functionName = ExtractFunctionNameFromToken(line);

                    // Verificăm dacă funcția nu este definită
                    if (!string.IsNullOrEmpty(functionName) && !definedFunctions.Contains(functionName))
                    {
                        Errors.Add($"Error: Function '{functionName}' is called but not defined.");
                    }
                }
            }
        }
        private string ExtractFunctionName(string line)
        {
            int startIndex = line.IndexOf(" ") + 1;
            int endIndex = line.IndexOf("(");

            if (startIndex >= 0 && endIndex > startIndex)
            {
                return line.Substring(startIndex, endIndex - startIndex).Trim();
            }

            return string.Empty;
        }
        private string ExtractFunctionNameFromToken(string line)
        {
            string[] parts = line.Split(new[] { '<', ',', '>' }, StringSplitOptions.RemoveEmptyEntries);

            if (parts.Length > 1 && parts[0].Trim() == "FUNCTION_NAME")
            {
                return parts[1].Trim();
            }

            return string.Empty;
        }
        private void SaveErrorsToErrorFile()
        {
            using (StreamWriter writer = new StreamWriter(errorFilePath, true)) 
            {
                writer.WriteLine("\nInvalid function calls:");
            }

            if (File.Exists(errorFilePath))
            {
                List<string> existingErrors = new List<string>(File.ReadAllLines(errorFilePath));

                foreach (string error in Errors)
                {
                    if (!existingErrors.Contains(error))
                    {
                        existingErrors.Add(error);
                    }
                }

                File.WriteAllLines(errorFilePath, existingErrors);
            }
            else
            { 
                File.WriteAllLines(errorFilePath, Errors);
            }
        }
    }

}
