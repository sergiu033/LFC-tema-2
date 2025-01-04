using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Proiect2LFC
{
    internal class LocalVariablesUniqueness
    {
        public List<string> Locals { get; private set; } = new();
        public LocalVariablesUniqueness(string inputFile, string outputFile)
        {
            string[] lines = File.ReadAllLines(inputFile);

            CheckForDuplicateLocals(lines);

            WriteDuplicatesToFile(outputFile);
        }

        public void CheckForDuplicateLocals(string[] lines)
        {
            Dictionary<string, HashSet<string>> functionVariables = new();

            for (int i = 0; i < lines.Length; i++)
            {
                string line = lines[i];

                var parts = line.Split(new[] { " (" }, StringSplitOptions.None);

                if (parts.Length < 2) continue;

                string variableInfo = parts[0]; 
                string functionInfo = parts[1]; 
                string functionName = functionInfo.Split(new[] { "Function " }, StringSplitOptions.None)[1].Split('(')[0].Trim();

                string variableName = variableInfo.Split(' ')[1];

                if (!functionVariables.ContainsKey(functionName))
                {
                    functionVariables[functionName] = new HashSet<string>();
                }

                if (functionVariables[functionName].Contains(variableName))
                {
                    Locals.Add($"Duplicate Variable: {variableName} in Function {functionName} at Line {i + 1}");
                }
                else
                {
                    functionVariables[functionName].Add(variableName);
                }
            }
        }

        public void WriteDuplicatesToFile(string outputFile)
        {
            using (StreamWriter writer = new StreamWriter(outputFile, true))
            {
                writer.WriteLine("Local variables uniqueness errors:");
            }
            
            if (File.Exists(outputFile))
            {
                File.AppendAllLines(outputFile, Locals);
            }
            else
            {
                File.WriteAllLines(outputFile, Locals);
            }
        }
    }
}
