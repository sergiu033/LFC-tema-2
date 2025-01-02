using Antlr4.Runtime;
using System;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        string inputFilePath = "sourceCode.txt"; // Fișierul cu cod sursă
        string outputFilePath = "tokens.txt";   // Fișierul pentru tokeni

        // Citim codul sursă
        string sourceCode = File.ReadAllText(inputFilePath);

        // Creăm un stream pentru input
        AntlrInputStream inputStream = new(sourceCode);

        // Inițializăm lexer-ul generat
        MiniLangLexer lexer = new(inputStream);

        // Creăm un token stream
        CommonTokenStream tokenStream = new(lexer);

        // Inițializăm parser-ul generat
        MiniLangParser parser = new(tokenStream);

        // Salvăm tokenii într-un fișier
        SaveTokens(lexer, outputFilePath);

        Console.WriteLine($"Tokenizarea s-a încheiat. Rezultatul a fost salvat în {outputFilePath}");
    }

    static void SaveTokens(MiniLangLexer lexer, string outputPath)
    {
        using StreamWriter writer = new(outputPath);

        // Iterăm prin tokeni
        foreach (var token in lexer.GetAllTokens())
        {
            writer.WriteLine($"<{lexer.Vocabulary.GetSymbolicName(token.Type)}, {token.Text}, {token.Line}>");
        }
    }
}
