//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.13.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from d:/facultate/anul2/anul2sem1/LFC/proiect2v3/Proiect2LFC/Proiect2LFC/MiniLang.g4 by ANTLR 4.13.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.1")]
[System.CLSCompliant(false)]
public partial class MiniLangLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		CONST=1, INT_TYPE=2, FLOAT_TYPE=3, DOUBLE_TYPE=4, STRING_TYPE=5, VOID_TYPE=6, 
		IF=7, ELSE=8, FOR=9, WHILE=10, RETURN=11, FUNCTION_NAME=12, VARIABLE_NAME=13, 
		NUMBER=14, STRING=15, LTE=16, GTE=17, LT=18, GT=19, EQ=20, NEQ=21, INCREMENT=22, 
		DECREMENT=23, EQUALS=24, PLUS_EQUALS=25, MINUS_EQUALS=26, MUL_EQUALS=27, 
		DIV_EQUALS=28, MOD_EQUALS=29, PLUS=30, MINUS=31, ASTERISK=32, SLASH=33, 
		MODULO=34, AND=35, OR=36, NOT=37, LPAREN=38, RPAREN=39, LBRACE=40, RBRACE=41, 
		COMMA=42, SEMICOLON=43, WS=44, COMMENT=45, BLOCK_COMMENT=46;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"CONST", "INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", "VOID_TYPE", 
		"IF", "ELSE", "FOR", "WHILE", "RETURN", "FUNCTION_NAME", "VARIABLE_NAME", 
		"NUMBER", "STRING", "LTE", "GTE", "LT", "GT", "EQ", "NEQ", "INCREMENT", 
		"DECREMENT", "EQUALS", "PLUS_EQUALS", "MINUS_EQUALS", "MUL_EQUALS", "DIV_EQUALS", 
		"MOD_EQUALS", "PLUS", "MINUS", "ASTERISK", "SLASH", "MODULO", "AND", "OR", 
		"NOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", "WS", 
		"COMMENT", "BLOCK_COMMENT"
	};


	public MiniLangLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public MiniLangLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'const'", "'int'", "'float'", "'double'", "'string'", "'void'", 
		null, "'else'", null, null, "'return'", null, null, null, null, "'<='", 
		"'>='", "'<'", "'>'", "'=='", "'!='", "'++'", "'--'", "'='", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", 
		"'!'", "'('", "')'", "'{'", "'}'", "','", "';'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "CONST", "INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", 
		"VOID_TYPE", "IF", "ELSE", "FOR", "WHILE", "RETURN", "FUNCTION_NAME", 
		"VARIABLE_NAME", "NUMBER", "STRING", "LTE", "GTE", "LT", "GT", "EQ", "NEQ", 
		"INCREMENT", "DECREMENT", "EQUALS", "PLUS_EQUALS", "MINUS_EQUALS", "MUL_EQUALS", 
		"DIV_EQUALS", "MOD_EQUALS", "PLUS", "MINUS", "ASTERISK", "SLASH", "MODULO", 
		"AND", "OR", "NOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", 
		"WS", "COMMENT", "BLOCK_COMMENT"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "MiniLang.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override int[] SerializedAtn { get { return _serializedATN; } }

	static MiniLangLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static int[] _serializedATN = {
		4,0,46,322,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
		6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,
		7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,7,20,2,21,
		7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,2,27,7,27,2,28,
		7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,7,33,2,34,7,34,2,35,
		7,35,2,36,7,36,2,37,7,37,2,38,7,38,2,39,7,39,2,40,7,40,2,41,7,41,2,42,
		7,42,2,43,7,43,2,44,7,44,2,45,7,45,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,
		1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,
		4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,5,6,133,8,6,10,6,12,
		6,136,9,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,5,8,150,8,8,
		10,8,12,8,153,9,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,1,9,5,9,164,8,9,10,9,
		12,9,167,9,9,1,9,1,9,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,11,1,11,5,11,
		180,8,11,10,11,12,11,183,9,11,1,11,5,11,186,8,11,10,11,12,11,189,9,11,
		1,11,1,11,1,12,1,12,5,12,195,8,12,10,12,12,12,198,9,12,1,13,4,13,201,8,
		13,11,13,12,13,202,1,13,1,13,4,13,207,8,13,11,13,12,13,208,3,13,211,8,
		13,1,14,1,14,5,14,215,8,14,10,14,12,14,218,9,14,1,14,1,14,1,15,1,15,1,
		15,1,16,1,16,1,16,1,17,1,17,1,18,1,18,1,19,1,19,1,19,1,20,1,20,1,20,1,
		21,1,21,1,21,1,22,1,22,1,22,1,23,1,23,1,24,1,24,1,24,1,25,1,25,1,25,1,
		26,1,26,1,26,1,27,1,27,1,27,1,28,1,28,1,28,1,29,1,29,1,30,1,30,1,31,1,
		31,1,32,1,32,1,33,1,33,1,34,1,34,1,34,1,35,1,35,1,35,1,36,1,36,1,37,1,
		37,1,38,1,38,1,39,1,39,1,40,1,40,1,41,1,41,1,42,1,42,1,43,4,43,292,8,43,
		11,43,12,43,293,1,43,1,43,1,44,1,44,1,44,1,44,5,44,302,8,44,10,44,12,44,
		305,9,44,1,44,1,44,1,45,1,45,1,45,1,45,5,45,313,8,45,10,45,12,45,316,9,
		45,1,45,1,45,1,45,1,45,1,45,2,216,314,0,46,1,1,3,2,5,3,7,4,9,5,11,6,13,
		7,15,8,17,9,19,10,21,11,23,12,25,13,27,14,29,15,31,16,33,17,35,18,37,19,
		39,20,41,21,43,22,45,23,47,24,49,25,51,26,53,27,55,28,57,29,59,30,61,31,
		63,32,65,33,67,34,69,35,71,36,73,37,75,38,77,39,79,40,81,41,83,42,85,43,
		87,44,89,45,91,46,1,0,5,3,0,65,90,95,95,97,122,4,0,48,57,65,90,95,95,97,
		122,1,0,48,57,3,0,9,10,13,13,32,32,2,0,10,10,13,13,334,0,1,1,0,0,0,0,3,
		1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,
		0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,
		1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,1,0,0,
		0,0,37,1,0,0,0,0,39,1,0,0,0,0,41,1,0,0,0,0,43,1,0,0,0,0,45,1,0,0,0,0,47,
		1,0,0,0,0,49,1,0,0,0,0,51,1,0,0,0,0,53,1,0,0,0,0,55,1,0,0,0,0,57,1,0,0,
		0,0,59,1,0,0,0,0,61,1,0,0,0,0,63,1,0,0,0,0,65,1,0,0,0,0,67,1,0,0,0,0,69,
		1,0,0,0,0,71,1,0,0,0,0,73,1,0,0,0,0,75,1,0,0,0,0,77,1,0,0,0,0,79,1,0,0,
		0,0,81,1,0,0,0,0,83,1,0,0,0,0,85,1,0,0,0,0,87,1,0,0,0,0,89,1,0,0,0,0,91,
		1,0,0,0,1,93,1,0,0,0,3,99,1,0,0,0,5,103,1,0,0,0,7,109,1,0,0,0,9,116,1,
		0,0,0,11,123,1,0,0,0,13,128,1,0,0,0,15,139,1,0,0,0,17,144,1,0,0,0,19,156,
		1,0,0,0,21,170,1,0,0,0,23,177,1,0,0,0,25,192,1,0,0,0,27,200,1,0,0,0,29,
		212,1,0,0,0,31,221,1,0,0,0,33,224,1,0,0,0,35,227,1,0,0,0,37,229,1,0,0,
		0,39,231,1,0,0,0,41,234,1,0,0,0,43,237,1,0,0,0,45,240,1,0,0,0,47,243,1,
		0,0,0,49,245,1,0,0,0,51,248,1,0,0,0,53,251,1,0,0,0,55,254,1,0,0,0,57,257,
		1,0,0,0,59,260,1,0,0,0,61,262,1,0,0,0,63,264,1,0,0,0,65,266,1,0,0,0,67,
		268,1,0,0,0,69,270,1,0,0,0,71,273,1,0,0,0,73,276,1,0,0,0,75,278,1,0,0,
		0,77,280,1,0,0,0,79,282,1,0,0,0,81,284,1,0,0,0,83,286,1,0,0,0,85,288,1,
		0,0,0,87,291,1,0,0,0,89,297,1,0,0,0,91,308,1,0,0,0,93,94,5,99,0,0,94,95,
		5,111,0,0,95,96,5,110,0,0,96,97,5,115,0,0,97,98,5,116,0,0,98,2,1,0,0,0,
		99,100,5,105,0,0,100,101,5,110,0,0,101,102,5,116,0,0,102,4,1,0,0,0,103,
		104,5,102,0,0,104,105,5,108,0,0,105,106,5,111,0,0,106,107,5,97,0,0,107,
		108,5,116,0,0,108,6,1,0,0,0,109,110,5,100,0,0,110,111,5,111,0,0,111,112,
		5,117,0,0,112,113,5,98,0,0,113,114,5,108,0,0,114,115,5,101,0,0,115,8,1,
		0,0,0,116,117,5,115,0,0,117,118,5,116,0,0,118,119,5,114,0,0,119,120,5,
		105,0,0,120,121,5,110,0,0,121,122,5,103,0,0,122,10,1,0,0,0,123,124,5,118,
		0,0,124,125,5,111,0,0,125,126,5,105,0,0,126,127,5,100,0,0,127,12,1,0,0,
		0,128,129,5,105,0,0,129,130,5,102,0,0,130,134,1,0,0,0,131,133,3,87,43,
		0,132,131,1,0,0,0,133,136,1,0,0,0,134,132,1,0,0,0,134,135,1,0,0,0,135,
		137,1,0,0,0,136,134,1,0,0,0,137,138,3,75,37,0,138,14,1,0,0,0,139,140,5,
		101,0,0,140,141,5,108,0,0,141,142,5,115,0,0,142,143,5,101,0,0,143,16,1,
		0,0,0,144,145,5,102,0,0,145,146,5,111,0,0,146,147,5,114,0,0,147,151,1,
		0,0,0,148,150,3,87,43,0,149,148,1,0,0,0,150,153,1,0,0,0,151,149,1,0,0,
		0,151,152,1,0,0,0,152,154,1,0,0,0,153,151,1,0,0,0,154,155,3,75,37,0,155,
		18,1,0,0,0,156,157,5,119,0,0,157,158,5,104,0,0,158,159,5,105,0,0,159,160,
		5,108,0,0,160,161,5,101,0,0,161,165,1,0,0,0,162,164,3,87,43,0,163,162,
		1,0,0,0,164,167,1,0,0,0,165,163,1,0,0,0,165,166,1,0,0,0,166,168,1,0,0,
		0,167,165,1,0,0,0,168,169,3,75,37,0,169,20,1,0,0,0,170,171,5,114,0,0,171,
		172,5,101,0,0,172,173,5,116,0,0,173,174,5,117,0,0,174,175,5,114,0,0,175,
		176,5,110,0,0,176,22,1,0,0,0,177,181,7,0,0,0,178,180,7,1,0,0,179,178,1,
		0,0,0,180,183,1,0,0,0,181,179,1,0,0,0,181,182,1,0,0,0,182,187,1,0,0,0,
		183,181,1,0,0,0,184,186,3,87,43,0,185,184,1,0,0,0,186,189,1,0,0,0,187,
		185,1,0,0,0,187,188,1,0,0,0,188,190,1,0,0,0,189,187,1,0,0,0,190,191,5,
		40,0,0,191,24,1,0,0,0,192,196,7,0,0,0,193,195,7,1,0,0,194,193,1,0,0,0,
		195,198,1,0,0,0,196,194,1,0,0,0,196,197,1,0,0,0,197,26,1,0,0,0,198,196,
		1,0,0,0,199,201,7,2,0,0,200,199,1,0,0,0,201,202,1,0,0,0,202,200,1,0,0,
		0,202,203,1,0,0,0,203,210,1,0,0,0,204,206,5,46,0,0,205,207,7,2,0,0,206,
		205,1,0,0,0,207,208,1,0,0,0,208,206,1,0,0,0,208,209,1,0,0,0,209,211,1,
		0,0,0,210,204,1,0,0,0,210,211,1,0,0,0,211,28,1,0,0,0,212,216,5,34,0,0,
		213,215,9,0,0,0,214,213,1,0,0,0,215,218,1,0,0,0,216,217,1,0,0,0,216,214,
		1,0,0,0,217,219,1,0,0,0,218,216,1,0,0,0,219,220,5,34,0,0,220,30,1,0,0,
		0,221,222,5,60,0,0,222,223,5,61,0,0,223,32,1,0,0,0,224,225,5,62,0,0,225,
		226,5,61,0,0,226,34,1,0,0,0,227,228,5,60,0,0,228,36,1,0,0,0,229,230,5,
		62,0,0,230,38,1,0,0,0,231,232,5,61,0,0,232,233,5,61,0,0,233,40,1,0,0,0,
		234,235,5,33,0,0,235,236,5,61,0,0,236,42,1,0,0,0,237,238,5,43,0,0,238,
		239,5,43,0,0,239,44,1,0,0,0,240,241,5,45,0,0,241,242,5,45,0,0,242,46,1,
		0,0,0,243,244,5,61,0,0,244,48,1,0,0,0,245,246,5,43,0,0,246,247,5,61,0,
		0,247,50,1,0,0,0,248,249,5,45,0,0,249,250,5,61,0,0,250,52,1,0,0,0,251,
		252,5,42,0,0,252,253,5,61,0,0,253,54,1,0,0,0,254,255,5,47,0,0,255,256,
		5,61,0,0,256,56,1,0,0,0,257,258,5,37,0,0,258,259,5,61,0,0,259,58,1,0,0,
		0,260,261,5,43,0,0,261,60,1,0,0,0,262,263,5,45,0,0,263,62,1,0,0,0,264,
		265,5,42,0,0,265,64,1,0,0,0,266,267,5,47,0,0,267,66,1,0,0,0,268,269,5,
		37,0,0,269,68,1,0,0,0,270,271,5,38,0,0,271,272,5,38,0,0,272,70,1,0,0,0,
		273,274,5,124,0,0,274,275,5,124,0,0,275,72,1,0,0,0,276,277,5,33,0,0,277,
		74,1,0,0,0,278,279,5,40,0,0,279,76,1,0,0,0,280,281,5,41,0,0,281,78,1,0,
		0,0,282,283,5,123,0,0,283,80,1,0,0,0,284,285,5,125,0,0,285,82,1,0,0,0,
		286,287,5,44,0,0,287,84,1,0,0,0,288,289,5,59,0,0,289,86,1,0,0,0,290,292,
		7,3,0,0,291,290,1,0,0,0,292,293,1,0,0,0,293,291,1,0,0,0,293,294,1,0,0,
		0,294,295,1,0,0,0,295,296,6,43,0,0,296,88,1,0,0,0,297,298,5,47,0,0,298,
		299,5,47,0,0,299,303,1,0,0,0,300,302,8,4,0,0,301,300,1,0,0,0,302,305,1,
		0,0,0,303,301,1,0,0,0,303,304,1,0,0,0,304,306,1,0,0,0,305,303,1,0,0,0,
		306,307,6,44,0,0,307,90,1,0,0,0,308,309,5,47,0,0,309,310,5,42,0,0,310,
		314,1,0,0,0,311,313,9,0,0,0,312,311,1,0,0,0,313,316,1,0,0,0,314,315,1,
		0,0,0,314,312,1,0,0,0,315,317,1,0,0,0,316,314,1,0,0,0,317,318,5,42,0,0,
		318,319,5,47,0,0,319,320,1,0,0,0,320,321,6,45,0,0,321,92,1,0,0,0,14,0,
		134,151,165,181,187,196,202,208,210,216,293,303,314,1,6,0,0
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
