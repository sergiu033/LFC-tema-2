using Antlr4.Runtime;
using Proiect2LFC;
using System;
using System.IO;
using System.Text.RegularExpressions;

class Program
{
    static void Main(string[] args)
    {
        string inputFilePath = "sourceCode.txt"; // Fișierul cu cod sursă
        string outputFilePath = "tokens.txt";   // Fișierul pentru tokeni
        string outputFileGloabls = "globals.txt";
        string outputFileFunctions = "functions.txt";
        string outputFileLocals = "locals.txt";
        string outputFileControlStructures="controlStructures.txt";
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

        AnalyzeTokens(outputFilePath,outputFileGloabls, outputFileFunctions,outputFileLocals, outputFileControlStructures);

        Console.WriteLine($"Tokenizarea s-a încheiat. Rezultatul a fost salvat în {outputFilePath}");
    }

    static void SaveTokens(MiniLangLexer lexer, string outputPath)
    {
        using StreamWriter writer = new(outputPath);

        // Iterăm prin tokeni
        foreach (var token in lexer.GetAllTokens())
        {
            writer.WriteLine($"<{lexer.Vocabulary.GetSymbolicName(token.Type)} , {token.Text} , {token.Line}>");
        } 
    }

    static void AnalyzeTokens(string tokensFilePath, string globalsPath, string functionsPath,string outputFileLocals,string outputFileControlStructures)
    {
        string[] lines = File.ReadAllLines(tokensFilePath);

        // Creăm instanțele claselor
        GlobalVariables globalVariables = new();
        Functions functions = new();
        LocalVariables localVariables = new();
        ControlStructures controlStructures = new();

        // Analizăm tokens pentru variabile globale și funcții
        globalVariables.AnalyzeTokensForGlobals(lines);
        functions.AnalyzeTokensForFunctions(lines);
        localVariables.AnalyzeTokensForLocals(lines);
        controlStructures.AnalyzeTokensForLocals(lines); 

        // Scriem rezultatele în fișiere
        globalVariables.WriteGlobalsToFile(globalsPath);
        functions.WriteFunctionsToFile(functionsPath);
        localVariables.WriteLocalsToFile(outputFileLocals);
        controlStructures.WriteStructuresToFile(outputFileControlStructures);
    }
}
