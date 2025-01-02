using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Proiect2LFC
{
    internal class ControlStructures
    {
        public List<string> structures { get; private set; } = new();

        public void AnalyzeTokensForLocals(string[] lines)
        {
            Regex tokenRegex = new Regex(@"<([^,]+),\s*(.+),\s*(\d+)>");
            int ifLine, elseLine;
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

                if (tokenType == "IF" || tokenType=="ELSE"|| tokenType == "FOR" || tokenType=="WHILE")
                {
                    structures.Add($"<{tokenType},{lineNumber}>");
                }
            }
        }
        public void WriteStructuresToFile(string globalsPath)
        {
            File.WriteAllLines(globalsPath, structures);
        }
    }
}
