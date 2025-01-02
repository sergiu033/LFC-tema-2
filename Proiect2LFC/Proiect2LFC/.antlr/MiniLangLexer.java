// Generated from d:/facultate/anul2/anul2sem1/LFC/proiect2v3/Proiect2LFC/Proiect2LFC/MiniLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONST=1, INT_TYPE=2, FLOAT_TYPE=3, DOUBLE_TYPE=4, STRING_TYPE=5, VOID_TYPE=6, 
		IF=7, ELSE=8, FOR=9, WHILE=10, RETURN=11, VARIABLE_NAME=12, FUNCTION_NAME=13, 
		NUMBER=14, STRING=15, PLUS=16, MINUS=17, ASTERISK=18, SLASH=19, MODULO=20, 
		LT=21, GT=22, LTE=23, GTE=24, EQ=25, NEQ=26, AND=27, OR=28, NOT=29, EQUALS=30, 
		PLUS_EQUALS=31, MINUS_EQUALS=32, MUL_EQUALS=33, DIV_EQUALS=34, MOD_EQUALS=35, 
		INCREMENT=36, DECREMENT=37, LPAREN=38, RPAREN=39, LBRACE=40, RBRACE=41, 
		COMMA=42, SEMICOLON=43, WS=44, COMMENT=45, BLOCK_COMMENT=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONST", "INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", "VOID_TYPE", 
			"IF", "ELSE", "FOR", "WHILE", "RETURN", "VARIABLE_NAME", "FUNCTION_NAME", 
			"NUMBER", "STRING", "PLUS", "MINUS", "ASTERISK", "SLASH", "MODULO", "LT", 
			"GT", "LTE", "GTE", "EQ", "NEQ", "AND", "OR", "NOT", "EQUALS", "PLUS_EQUALS", 
			"MINUS_EQUALS", "MUL_EQUALS", "DIV_EQUALS", "MOD_EQUALS", "INCREMENT", 
			"DECREMENT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", 
			"WS", "COMMENT", "BLOCK_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'int'", "'float'", "'double'", "'string'", "'void'", 
			"'if'", "'else'", "'for'", "'while'", "'return'", null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", 
			"'!='", "'&&'", "'||'", "'!'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'++'", "'--'", "'('", "')'", "'{'", "'}'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONST", "INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", 
			"VOID_TYPE", "IF", "ELSE", "FOR", "WHILE", "RETURN", "VARIABLE_NAME", 
			"FUNCTION_NAME", "NUMBER", "STRING", "PLUS", "MINUS", "ASTERISK", "SLASH", 
			"MODULO", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "AND", "OR", "NOT", 
			"EQUALS", "PLUS_EQUALS", "MINUS_EQUALS", "MUL_EQUALS", "DIV_EQUALS", 
			"MOD_EQUALS", "INCREMENT", "DECREMENT", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "COMMA", "SEMICOLON", "WS", "COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MiniLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000.\u0124\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u009c\b\u000b\n\u000b\f\u000b\u009f\t\u000b\u0001\f\u0001\f\u0005\f\u00a3"+
		"\b\f\n\f\f\f\u00a6\t\f\u0001\f\u0001\f\u0001\r\u0004\r\u00ab\b\r\u000b"+
		"\r\f\r\u00ac\u0001\r\u0001\r\u0004\r\u00b1\b\r\u000b\r\f\r\u00b2\u0003"+
		"\r\u00b5\b\r\u0001\u000e\u0001\u000e\u0005\u000e\u00b9\b\u000e\n\u000e"+
		"\f\u000e\u00bc\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001)\u0001)\u0001*\u0001*\u0001+\u0004+\u0106\b+\u000b+\f+\u0107\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001,\u0005,\u0110\b,\n,\f,\u0113\t,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0005-\u011b\b-\n-\f-\u011e\t-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0002\u00ba\u011c\u0000.\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.\u0001"+
		"\u0000\u0005\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u012c\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"+
		"\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"+
		"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"+
		"\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M"+
		"\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000"+
		"\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000"+
		"\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000["+
		"\u0001\u0000\u0000\u0000\u0001]\u0001\u0000\u0000\u0000\u0003c\u0001\u0000"+
		"\u0000\u0000\u0005g\u0001\u0000\u0000\u0000\u0007m\u0001\u0000\u0000\u0000"+
		"\tt\u0001\u0000\u0000\u0000\u000b{\u0001\u0000\u0000\u0000\r\u0080\u0001"+
		"\u0000\u0000\u0000\u000f\u0083\u0001\u0000\u0000\u0000\u0011\u0088\u0001"+
		"\u0000\u0000\u0000\u0013\u008c\u0001\u0000\u0000\u0000\u0015\u0092\u0001"+
		"\u0000\u0000\u0000\u0017\u0099\u0001\u0000\u0000\u0000\u0019\u00a0\u0001"+
		"\u0000\u0000\u0000\u001b\u00aa\u0001\u0000\u0000\u0000\u001d\u00b6\u0001"+
		"\u0000\u0000\u0000\u001f\u00bf\u0001\u0000\u0000\u0000!\u00c1\u0001\u0000"+
		"\u0000\u0000#\u00c3\u0001\u0000\u0000\u0000%\u00c5\u0001\u0000\u0000\u0000"+
		"\'\u00c7\u0001\u0000\u0000\u0000)\u00c9\u0001\u0000\u0000\u0000+\u00cb"+
		"\u0001\u0000\u0000\u0000-\u00cd\u0001\u0000\u0000\u0000/\u00d0\u0001\u0000"+
		"\u0000\u00001\u00d3\u0001\u0000\u0000\u00003\u00d6\u0001\u0000\u0000\u0000"+
		"5\u00d9\u0001\u0000\u0000\u00007\u00dc\u0001\u0000\u0000\u00009\u00df"+
		"\u0001\u0000\u0000\u0000;\u00e1\u0001\u0000\u0000\u0000=\u00e3\u0001\u0000"+
		"\u0000\u0000?\u00e6\u0001\u0000\u0000\u0000A\u00e9\u0001\u0000\u0000\u0000"+
		"C\u00ec\u0001\u0000\u0000\u0000E\u00ef\u0001\u0000\u0000\u0000G\u00f2"+
		"\u0001\u0000\u0000\u0000I\u00f5\u0001\u0000\u0000\u0000K\u00f8\u0001\u0000"+
		"\u0000\u0000M\u00fa\u0001\u0000\u0000\u0000O\u00fc\u0001\u0000\u0000\u0000"+
		"Q\u00fe\u0001\u0000\u0000\u0000S\u0100\u0001\u0000\u0000\u0000U\u0102"+
		"\u0001\u0000\u0000\u0000W\u0105\u0001\u0000\u0000\u0000Y\u010b\u0001\u0000"+
		"\u0000\u0000[\u0116\u0001\u0000\u0000\u0000]^\u0005c\u0000\u0000^_\u0005"+
		"o\u0000\u0000_`\u0005n\u0000\u0000`a\u0005s\u0000\u0000ab\u0005t\u0000"+
		"\u0000b\u0002\u0001\u0000\u0000\u0000cd\u0005i\u0000\u0000de\u0005n\u0000"+
		"\u0000ef\u0005t\u0000\u0000f\u0004\u0001\u0000\u0000\u0000gh\u0005f\u0000"+
		"\u0000hi\u0005l\u0000\u0000ij\u0005o\u0000\u0000jk\u0005a\u0000\u0000"+
		"kl\u0005t\u0000\u0000l\u0006\u0001\u0000\u0000\u0000mn\u0005d\u0000\u0000"+
		"no\u0005o\u0000\u0000op\u0005u\u0000\u0000pq\u0005b\u0000\u0000qr\u0005"+
		"l\u0000\u0000rs\u0005e\u0000\u0000s\b\u0001\u0000\u0000\u0000tu\u0005"+
		"s\u0000\u0000uv\u0005t\u0000\u0000vw\u0005r\u0000\u0000wx\u0005i\u0000"+
		"\u0000xy\u0005n\u0000\u0000yz\u0005g\u0000\u0000z\n\u0001\u0000\u0000"+
		"\u0000{|\u0005v\u0000\u0000|}\u0005o\u0000\u0000}~\u0005i\u0000\u0000"+
		"~\u007f\u0005d\u0000\u0000\u007f\f\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005i\u0000\u0000\u0081\u0082\u0005f\u0000\u0000\u0082\u000e\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005e\u0000\u0000\u0084\u0085\u0005l\u0000\u0000"+
		"\u0085\u0086\u0005s\u0000\u0000\u0086\u0087\u0005e\u0000\u0000\u0087\u0010"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005f\u0000\u0000\u0089\u008a\u0005"+
		"o\u0000\u0000\u008a\u008b\u0005r\u0000\u0000\u008b\u0012\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005w\u0000\u0000\u008d\u008e\u0005h\u0000\u0000\u008e"+
		"\u008f\u0005i\u0000\u0000\u008f\u0090\u0005l\u0000\u0000\u0090\u0091\u0005"+
		"e\u0000\u0000\u0091\u0014\u0001\u0000\u0000\u0000\u0092\u0093\u0005r\u0000"+
		"\u0000\u0093\u0094\u0005e\u0000\u0000\u0094\u0095\u0005t\u0000\u0000\u0095"+
		"\u0096\u0005u\u0000\u0000\u0096\u0097\u0005r\u0000\u0000\u0097\u0098\u0005"+
		"n\u0000\u0000\u0098\u0016\u0001\u0000\u0000\u0000\u0099\u009d\u0007\u0000"+
		"\u0000\u0000\u009a\u009c\u0007\u0001\u0000\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u0018\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a4\u0007\u0000"+
		"\u0000\u0000\u00a1\u00a3\u0007\u0001\u0000\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005(\u0000"+
		"\u0000\u00a8\u001a\u0001\u0000\u0000\u0000\u00a9\u00ab\u0007\u0002\u0000"+
		"\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u00b4\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005.\u0000\u0000"+
		"\u00af\u00b1\u0007\u0002\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u001c\u0001\u0000\u0000\u0000\u00b6\u00ba\u0005\"\u0000\u0000\u00b7"+
		"\u00b9\t\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\"\u0000\u0000\u00be\u001e\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0005+\u0000\u0000\u00c0 \u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005-\u0000\u0000\u00c2\"\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0005*\u0000\u0000\u00c4$\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0005/\u0000\u0000\u00c6&\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005%"+
		"\u0000\u0000\u00c8(\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005<\u0000\u0000"+
		"\u00ca*\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005>\u0000\u0000\u00cc,"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005<\u0000\u0000\u00ce\u00cf\u0005"+
		"=\u0000\u0000\u00cf.\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005>\u0000"+
		"\u0000\u00d1\u00d2\u0005=\u0000\u0000\u00d20\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0005=\u0000\u0000\u00d4\u00d5\u0005=\u0000\u0000\u00d52\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005!\u0000\u0000\u00d7\u00d8\u0005=\u0000"+
		"\u0000\u00d84\u0001\u0000\u0000\u0000\u00d9\u00da\u0005&\u0000\u0000\u00da"+
		"\u00db\u0005&\u0000\u0000\u00db6\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005"+
		"|\u0000\u0000\u00dd\u00de\u0005|\u0000\u0000\u00de8\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0005!\u0000\u0000\u00e0:\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0005=\u0000\u0000\u00e2<\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005"+
		"+\u0000\u0000\u00e4\u00e5\u0005=\u0000\u0000\u00e5>\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005-\u0000\u0000\u00e7\u00e8\u0005=\u0000\u0000\u00e8"+
		"@\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005*\u0000\u0000\u00ea\u00eb\u0005"+
		"=\u0000\u0000\u00ebB\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005/\u0000"+
		"\u0000\u00ed\u00ee\u0005=\u0000\u0000\u00eeD\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0005%\u0000\u0000\u00f0\u00f1\u0005=\u0000\u0000\u00f1F\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0005+\u0000\u0000\u00f3\u00f4\u0005+\u0000"+
		"\u0000\u00f4H\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005-\u0000\u0000\u00f6"+
		"\u00f7\u0005-\u0000\u0000\u00f7J\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005"+
		"(\u0000\u0000\u00f9L\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005)\u0000"+
		"\u0000\u00fbN\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005{\u0000\u0000\u00fd"+
		"P\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005}\u0000\u0000\u00ffR\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0005,\u0000\u0000\u0101T\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0005;\u0000\u0000\u0103V\u0001\u0000\u0000\u0000\u0104"+
		"\u0106\u0007\u0003\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0006+\u0000\u0000\u010aX\u0001\u0000\u0000\u0000\u010b\u010c\u0005"+
		"/\u0000\u0000\u010c\u010d\u0005/\u0000\u0000\u010d\u0111\u0001\u0000\u0000"+
		"\u0000\u010e\u0110\b\u0004\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000"+
		"\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0115\u0006,\u0000\u0000\u0115"+
		"Z\u0001\u0000\u0000\u0000\u0116\u0117\u0005/\u0000\u0000\u0117\u0118\u0005"+
		"*\u0000\u0000\u0118\u011c\u0001\u0000\u0000\u0000\u0119\u011b\t\u0000"+
		"\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0005*\u0000\u0000\u0120\u0121\u0005/\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0006-\u0000\u0000\u0123"+
		"\\\u0001\u0000\u0000\u0000\n\u0000\u009d\u00a4\u00ac\u00b2\u00b4\u00ba"+
		"\u0107\u0111\u011c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}