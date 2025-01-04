using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Proiect2LFC
{
    internal class LocalVariableConflictChecker
    {
        private Dictionary<string, HashSet<string>> functionParameters = new();
        private Dictionary<string, HashSet<string>> functionLocals = new();
        public List<string> Conflicts { get; private set; } = new();
        private string errorFilePath;

        public LocalVariableConflictChecker(string variablesFilePath, string errorFilePath)
        {
            this.errorFilePath = errorFilePath;

            string[] lines = File.ReadAllLines(variablesFilePath);
            CheckForConflicts(lines);
        }

        private void CheckForConflicts(string[] lines)
        {
            for (int i = 0; i < lines.Length; i++)
            {
                string line = lines[i];

                var parts = line.Split(new[] { " (" }, StringSplitOptions.None);

                if (parts.Length < 2) continue; 

                string variableInfo = parts[0];
                string functionInfo = parts[1]; 
                string functionName = functionInfo.Split(new[] { "Function " }, StringSplitOptions.None)[1].Split('(')[0].Trim();

                string variableName = variableInfo.Split(' ')[1];

                if (functionInfo.Contains("Parameter"))
                {
                    if (!functionParameters.ContainsKey(functionName))
                    {
                        functionParameters[functionName] = new HashSet<string>();
                    }

                    functionParameters[functionName].Add(variableName);
                }
                else if (functionInfo.Contains("Local Variable"))
                {
                    if (functionParameters.ContainsKey(functionName) && functionParameters[functionName].Contains(variableName))
                    {
                        Conflicts.Add($"Conflict: Variable '{variableName}' in Function '{functionName}' at Line {i + 1} is the same as a parameter.");
                    }

                    if (!functionLocals.ContainsKey(functionName))
                    {
                        functionLocals[functionName] = new HashSet<string>();
                    }

                    functionLocals[functionName].Add(variableName);
                }
            }

            SaveConflictsToErrorFile();
        }

        private void SaveConflictsToErrorFile()
        {
            using (StreamWriter writer = new StreamWriter(errorFilePath, true)) 
            {
                writer.WriteLine("\nConflicts between locals and parameters:");
            }
            if (File.Exists(errorFilePath))
            {
                List<string> existingErrors = new List<string>(File.ReadAllLines(errorFilePath));

                foreach (string conflict in Conflicts)
                {
                    if (!existingErrors.Contains(conflict))
                    {
                        existingErrors.Add(conflict);
                    }
                }
               
                File.WriteAllLines(errorFilePath, existingErrors);
            }
            else
            {
                File.WriteAllLines(errorFilePath, Conflicts);
            }
        }

    }
}
