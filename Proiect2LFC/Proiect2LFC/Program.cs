using Antlr4.Runtime;
using Proiect2LFC;
using System;
using System.IO;
using System.Text.RegularExpressions;

class Program
{
    static void Main(string[] args)
    {
        string inputFilePath = "sourceCode.txt";
        string outputFilePath = "tokens.txt"; 
        string outputFileGlobals = "globals.txt";
        string outputFileFunctions = "functions.txt";
        string outputFileLocals = "locals.txt";
        string outputFileControlStructures="controlStructures.txt";
        string outputFileErrors = "errors.txt";
        string outputCombinedFilesFunctions = "functionsList.txt";

        try
        {
            string sourceCode = File.ReadAllText(inputFilePath);

            AntlrInputStream inputStream = new(sourceCode);
            MiniLangLexer lexer = new(inputStream);
            CommonTokenStream tokenStream = new(lexer);
            MiniLangParser parser = new(tokenStream);

            SaveTokens(lexer, outputFilePath);

            AnalyzeTokens(outputFilePath, outputFileGlobals, outputFileFunctions, outputFileLocals
                , outputFileControlStructures, outputFileErrors, outputCombinedFilesFunctions);

            MiniLangParser.ProgramContext context = parser.program();
            MiniLangBaseVisitor<string> baseVisitor = new MiniLangBaseVisitor<string>();
            var result = baseVisitor.Visit(context);

            Console.WriteLine($"Tokenizarea si analiza s-au incheiat cu succes.");
        }
        catch (Exception e)
        {
            Console.WriteLine(e.ToString());
        }
    }

    static void SaveTokens(MiniLangLexer lexer, string outputPath)
    {
        using StreamWriter writer = new(outputPath);
        foreach (var token in lexer.GetAllTokens())
        {
            writer.WriteLine($"<{lexer.Vocabulary.GetSymbolicName(token.Type)} , {token.Text} , {token.Line}>");
        }
    }

    static void AnalyzeTokens(string tokensFilePath, string globalsPath, string functionsPath,string outputFileLocals,
        string outputFileControlStructures,string outputFileErrors,string outputCombinedFilesFunctions)
    {
        string[] lines = File.ReadAllLines(tokensFilePath);

        GlobalVariables globalVariables = new();
        Functions functions = new();
        LocalVariables localVariables = new();
        ControlStructures controlStructures = new();
        globalVariables.AnalyzeTokensForGlobals(lines);
        functions.AnalyzeTokensForFunctions(lines);
        localVariables.AnalyzeTokensForLocals(lines);
        controlStructures.AnalyzeTokensForLocals(lines);

        globalVariables.WriteGlobalsToFile(globalsPath);
        functions.WriteFunctionsToFile(functionsPath);
        localVariables.WriteLocalsToFile(outputFileLocals);
        controlStructures.WriteStructuresToFile(outputFileControlStructures);

        GlobalVariablesUniquenessChecker globalVarsChecker = new GlobalVariablesUniquenessChecker(globalsPath, outputFileErrors);
        TypeCompatibility typeCompatibility = new TypeCompatibility(globalsPath, outputFileLocals, outputFileErrors);
        FunctionsUniquenessChecker functionsUniquenessChecker=new FunctionsUniquenessChecker(functionsPath, outputFileErrors);

        typeCompatibility.VerifyTypeCompatibility();
        functionsUniquenessChecker.VerifyFunctionUniqueness();

        LocalVariablesUniqueness localVariablesUniqueness = new LocalVariablesUniqueness(outputFileLocals, outputFileErrors);
        LocalVariableConflictChecker localVariableConflictChecker = new LocalVariableConflictChecker(outputFileLocals, outputFileErrors);
        FunctionCallValidator functionCallValidator = new FunctionCallValidator(functionsPath, tokensFilePath, outputFileErrors);

        FunctionsInfo functionsInfo = new FunctionsInfo(functionsPath, outputFileLocals, outputFileControlStructures);
        functionsInfo.GenerateCombinedFile(outputCombinedFilesFunctions);
    }
}
