using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Proiect2LFC
{ 

    internal class GlobalVariablesUniquenessChecker
    {
        private HashSet<string> globalVariables = new();
        private string outputFilePath;

        public GlobalVariablesUniquenessChecker(string globalsFilePath, string outputFilePath)
        {
            this.outputFilePath = outputFilePath;

            File.WriteAllText(outputFilePath, string.Empty);

            if (File.Exists(globalsFilePath))
            {
                WriteToOutputFile("Global variables errors:");
                var lines = File.ReadAllLines(globalsFilePath);
                foreach (var line in lines)
                {
                    ParseGlobalLine(line);
                }
                WriteToOutputFile("\n");
            }
        }

        private void ParseGlobalLine(string line)
        {
            Regex globalRegex = new Regex(@"^\s*(\w+)\s+(\w+)\s+\(Global\s+Variable\s+at\s+Line\s+(\d+)\)(?:\s*=\s*(.+))?$");

            Match match = globalRegex.Match(line);
            if (match.Success)
            {
                string variableType = match.Groups[1].Value;
                string variableName = match.Groups[2].Value;
                int lineNumber = int.Parse(match.Groups[3].Value);
                string initialValue = match.Groups[4].Success ? match.Groups[4].Value : null;

                if (globalVariables.Contains(variableName))
                {
                    WriteToOutputFile($"Error: Global variable '{variableName}' already declared! (Line {lineNumber})");
                }
                else
                {
                    globalVariables.Add(variableName);

                }
            }
            else
            {
                WriteToOutputFile($"Linie invalidă în fișierul de variabile globale: {line}");
            }

        }

        private void WriteToOutputFile(string message)
        {
            File.AppendAllText(outputFilePath, message + Environment.NewLine);
        }
    }

}
