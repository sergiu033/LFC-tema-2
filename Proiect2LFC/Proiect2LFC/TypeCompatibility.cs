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

    public class TypeCompatibility
    {
        public List<string> Globals { get; set; } = new List<string>();
        public List<string> Locals { get; set; } = new List<string>();
        private string errorLogFilePath;
        private string globalsFilePath; 
        private string localsFilePath;

        public TypeCompatibility(string globalsFilePath, string localsFilePath, string errorLogFilePath)
        {
            this.globalsFilePath = globalsFilePath;
            this.localsFilePath = localsFilePath;
            this.errorLogFilePath = errorLogFilePath;

            ReadVariablesFromFiles();
        }

        private void ReadVariablesFromFiles()
        {
            if (File.Exists(globalsFilePath))
            {
                Globals = new List<string>(File.ReadAllLines(globalsFilePath));
            }
            else
            {
                Console.WriteLine($"Fișierul {globalsFilePath} nu a fost găsit.");
            }

            if (File.Exists(localsFilePath))
            {
                Locals = new List<string>(File.ReadAllLines(localsFilePath));
            }
            else
            {
                Console.WriteLine($"Fișierul {localsFilePath} nu a fost găsit.");
            }
        }
        public void VerifyTypeCompatibility()
        {

            using (StreamWriter writer = new StreamWriter(errorLogFilePath, true)) 
            {
                writer.WriteLine("Type Compatibility errors:");

                foreach (var globalVar in Globals)
                {

                    string[] parts = globalVar.Split('=');
                    string type = parts[0].Trim().Split(' ')[0]; 
                    string value = parts.Length > 1 ? parts[1].Trim() : ""; 
                    if (!string.IsNullOrEmpty(value))
                    {
                        string errorMessage = CheckVariableTypeCompatibility(type, value);
                        if (!string.IsNullOrEmpty(errorMessage))
                        {
                            writer.WriteLine($"ERROR (Global): {errorMessage}");
                        }
                    }
                }

                foreach (var localVar in Locals)
                {

                    string[] parts = localVar.Split('=');
                    string type = parts[0].Trim().Split(' ')[0];
                    string value = parts.Length > 1 ? parts[1].Trim() : "";
                    if (!string.IsNullOrEmpty(value))
                    {
                        string errorMessage = CheckVariableTypeCompatibility(type, value);
                        if (!string.IsNullOrEmpty(errorMessage))
                        {
                            writer.WriteLine($"ERROR (Local): {errorMessage}");
                        }
                    }
                }
                writer.Write("\n");
            }
        }

        private string CheckVariableTypeCompatibility(string varType, string value)
        {
            if (string.IsNullOrEmpty(value))
            {
                return null;
            }

            switch (varType)
            {
                case "int":
                    if (!int.TryParse(value, out _))
                    {
                        return $"Incompatibility: {varType} cannot be assigned the value <{value}>";
                    }
                    break;

                case "float":
                    if (!float.TryParse(value, out _))
                    {
                        return $"Incompatibility: {varType} cannot be assigned the value <{value}>";
                    }
                    break;

                case "double":
                    if (!double.TryParse(value, out _))
                    {
                        return $"Incompatibility: {varType} cannot be assigned the value <{value}>";
                    }
                    break;

                case "string":
                    if (double.TryParse(value, out _))
                    {
                        return $"Incompatibility: string cannot be assigned the value <{value}>";
                    }
                    break;

                default:
                    return $"Unknown type: {varType}";
            }

            return null;
        }

    }

}
