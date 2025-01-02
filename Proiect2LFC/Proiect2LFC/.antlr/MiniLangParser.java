// Generated from d:/facultate/anul2/anul2sem1/LFC/proiect2v3/Proiect2LFC/Proiect2LFC/MiniLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniLangParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_type = 3, 
		RULE_block = 4, RULE_expression = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "type", "block", "expression"
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

	@Override
	public String getGrammarFileName() { return "MiniLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniLangParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275414843134L) != 0)) {
				{
				{
				setState(12);
				statement();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStmtContext extends StatementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterDeclarationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitDeclarationStmt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends StatementContext {
		public TerminalNode FOR() { return getToken(MiniLangParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(MiniLangParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniLangParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(MiniLangParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitForStmt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(MiniLangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MiniLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniLangParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitWhileStmt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StatementContext {
		public TerminalNode IF() { return getToken(MiniLangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MiniLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniLangParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitIfStmt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStmtContext extends StatementContext {
		public TerminalNode IF() { return getToken(MiniLangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MiniLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniLangParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniLangParser.ELSE, 0); }
		public IfElseStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitIfElseStmt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStmtContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniLangParser.SEMICOLON, 0); }
		public ExpressionStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitExpressionStmt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MiniLangParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniLangParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitReturnStmt(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new DeclarationStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				declaration();
				}
				break;
			case 2:
				_localctx = new ExpressionStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				expression(0);
				setState(22);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				match(IF);
				setState(25);
				match(LPAREN);
				setState(26);
				expression(0);
				setState(27);
				match(RPAREN);
				setState(28);
				block();
				}
				break;
			case 4:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				match(IF);
				setState(31);
				match(LPAREN);
				setState(32);
				expression(0);
				setState(33);
				match(RPAREN);
				setState(34);
				block();
				setState(35);
				match(ELSE);
				setState(36);
				block();
				}
				break;
			case 5:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				match(FOR);
				setState(39);
				match(LPAREN);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275414839296L) != 0)) {
					{
					setState(40);
					expression(0);
					}
				}

				setState(43);
				match(SEMICOLON);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275414839296L) != 0)) {
					{
					setState(44);
					expression(0);
					}
				}

				setState(47);
				match(SEMICOLON);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275414839296L) != 0)) {
					{
					setState(48);
					expression(0);
					}
				}

				setState(51);
				match(RPAREN);
				setState(52);
				block();
				}
				break;
			case 6:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				match(WHILE);
				setState(54);
				match(LPAREN);
				setState(55);
				expression(0);
				setState(56);
				match(RPAREN);
				setState(57);
				block();
				}
				break;
			case 7:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				match(RETURN);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275414839296L) != 0)) {
					{
					setState(60);
					expression(0);
					}
				}

				setState(63);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARIABLE_NAME() { return getToken(MiniLangParser.VARIABLE_NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniLangParser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(MiniLangParser.CONST, 0); }
		public TerminalNode EQUALS() { return getToken(MiniLangParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(66);
				match(CONST);
				}
			}

			setState(69);
			type();
			setState(70);
			match(VARIABLE_NAME);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(71);
				match(EQUALS);
				setState(72);
				expression(0);
				}
			}

			setState(75);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(MiniLangParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(MiniLangParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(MiniLangParser.DOUBLE_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(MiniLangParser.STRING_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(MiniLangParser.VOID_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 124L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MiniLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniLangParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LBRACE);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275414843134L) != 0)) {
				{
				{
				setState(80);
				statement();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericAtomExpContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(MiniLangParser.NUMBER, 0); }
		public NumericAtomExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterNumericAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitNumericAtomExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomExpContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MiniLangParser.STRING, 0); }
		public StringAtomExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterStringAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitStringAtomExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpContext extends ExpressionContext {
		public TerminalNode FUNCTION_NAME() { return getToken(MiniLangParser.FUNCTION_NAME, 0); }
		public TerminalNode RPAREN() { return getToken(MiniLangParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniLangParser.COMMA, i);
		}
		public FunctionCallExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterFunctionCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitFunctionCallExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(MiniLangParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(MiniLangParser.SLASH, 0); }
		public TerminalNode MODULO() { return getToken(MiniLangParser.MODULO, 0); }
		public MulDivExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterMulDivExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitMulDivExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisExpContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(MiniLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniLangParser.RPAREN, 0); }
		public ParenthesisExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterParenthesisExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitParenthesisExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementDecrementExpContext extends ExpressionContext {
		public TerminalNode VARIABLE_NAME() { return getToken(MiniLangParser.VARIABLE_NAME, 0); }
		public TerminalNode INCREMENT() { return getToken(MiniLangParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(MiniLangParser.DECREMENT, 0); }
		public IncrementDecrementExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterIncrementDecrementExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitIncrementDecrementExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(MiniLangParser.LT, 0); }
		public TerminalNode GT() { return getToken(MiniLangParser.GT, 0); }
		public TerminalNode LTE() { return getToken(MiniLangParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(MiniLangParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(MiniLangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MiniLangParser.NEQ, 0); }
		public RelationalExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterRelationalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitRelationalExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpContext extends ExpressionContext {
		public TerminalNode VARIABLE_NAME() { return getToken(MiniLangParser.VARIABLE_NAME, 0); }
		public TerminalNode EQUALS() { return getToken(MiniLangParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterAssignmentExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitAssignmentExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MiniLangParser.AND, 0); }
		public TerminalNode OR() { return getToken(MiniLangParser.OR, 0); }
		public LogicalExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterLogicalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitLogicalExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(MiniLangParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterNotExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitNotExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MiniLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniLangParser.MINUS, 0); }
		public AddSubExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).enterAddSubExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLangListener ) ((MiniLangListener)listener).exitAddSubExp(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(89);
				match(LPAREN);
				setState(90);
				expression(0);
				setState(91);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(NOT);
				setState(94);
				expression(6);
				}
				break;
			case 3:
				{
				_localctx = new IncrementDecrementExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(VARIABLE_NAME);
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(96);
					_la = _input.LA(1);
					if ( !(_la==INCREMENT || _la==DECREMENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new AssignmentExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(VARIABLE_NAME);
				setState(100);
				match(EQUALS);
				setState(101);
				expression(4);
				}
				break;
			case 5:
				{
				_localctx = new FunctionCallExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(FUNCTION_NAME);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275414839296L) != 0)) {
					{
					setState(103);
					expression(0);
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(104);
						match(COMMA);
						setState(105);
						expression(0);
						}
						}
						setState(110);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(113);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new NumericAtomExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(NUMBER);
				}
				break;
			case 7:
				{
				_localctx = new StringAtomExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(119);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(120);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(121);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(122);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(123);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(125);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 132120576L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(126);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new LogicalExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(127);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(128);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001*\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001.\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00012\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001>\b\u0001\u0001\u0001\u0003\u0001A\b\u0001"+
		"\u0001\u0002\u0003\u0002D\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002J\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0005\u0004R\b\u0004\n\u0004\f\u0004"+
		"U\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005b\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005k\b\u0005\n\u0005\f\u0005"+
		"n\t\u0005\u0003\u0005p\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005u\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0083\b\u0005\n\u0005\f\u0005\u0086\t\u0005"+
		"\u0001\u0005\u0000\u0001\n\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0006"+
		"\u0001\u0000\u0002\u0006\u0001\u0000$%\u0001\u0000\u0012\u0014\u0001\u0000"+
		"\u0010\u0011\u0001\u0000\u0015\u001a\u0001\u0000\u001b\u001c\u009c\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0002@\u0001\u0000\u0000\u0000\u0004C\u0001"+
		"\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000"+
		"\u0000\nt\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f"+
		"\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000\u0000\u000f\r\u0001"+
		"\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0012\u0001"+
		"\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0013\u0005"+
		"\u0000\u0000\u0001\u0013\u0001\u0001\u0000\u0000\u0000\u0014A\u0003\u0004"+
		"\u0002\u0000\u0015\u0016\u0003\n\u0005\u0000\u0016\u0017\u0005+\u0000"+
		"\u0000\u0017A\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0007\u0000\u0000"+
		"\u0019\u001a\u0005&\u0000\u0000\u001a\u001b\u0003\n\u0005\u0000\u001b"+
		"\u001c\u0005\'\u0000\u0000\u001c\u001d\u0003\b\u0004\u0000\u001dA\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0005\u0007\u0000\u0000\u001f \u0005&\u0000"+
		"\u0000 !\u0003\n\u0005\u0000!\"\u0005\'\u0000\u0000\"#\u0003\b\u0004\u0000"+
		"#$\u0005\b\u0000\u0000$%\u0003\b\u0004\u0000%A\u0001\u0000\u0000\u0000"+
		"&\'\u0005\t\u0000\u0000\')\u0005&\u0000\u0000(*\u0003\n\u0005\u0000)("+
		"\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+-\u0005+\u0000\u0000,.\u0003\n\u0005\u0000-,\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0005+\u0000"+
		"\u000002\u0003\n\u0005\u000010\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000034\u0005\'\u0000\u00004A\u0003\b\u0004"+
		"\u000056\u0005\n\u0000\u000067\u0005&\u0000\u000078\u0003\n\u0005\u0000"+
		"89\u0005\'\u0000\u00009:\u0003\b\u0004\u0000:A\u0001\u0000\u0000\u0000"+
		";=\u0005\u000b\u0000\u0000<>\u0003\n\u0005\u0000=<\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0005+\u0000\u0000"+
		"@\u0014\u0001\u0000\u0000\u0000@\u0015\u0001\u0000\u0000\u0000@\u0018"+
		"\u0001\u0000\u0000\u0000@\u001e\u0001\u0000\u0000\u0000@&\u0001\u0000"+
		"\u0000\u0000@5\u0001\u0000\u0000\u0000@;\u0001\u0000\u0000\u0000A\u0003"+
		"\u0001\u0000\u0000\u0000BD\u0005\u0001\u0000\u0000CB\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0003\u0006"+
		"\u0003\u0000FI\u0005\f\u0000\u0000GH\u0005\u001e\u0000\u0000HJ\u0003\n"+
		"\u0005\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KL\u0005+\u0000\u0000L\u0005\u0001\u0000\u0000\u0000"+
		"MN\u0007\u0000\u0000\u0000N\u0007\u0001\u0000\u0000\u0000OS\u0005(\u0000"+
		"\u0000PR\u0003\u0002\u0001\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005)\u0000\u0000W\t\u0001"+
		"\u0000\u0000\u0000XY\u0006\u0005\uffff\uffff\u0000YZ\u0005&\u0000\u0000"+
		"Z[\u0003\n\u0005\u0000[\\\u0005\'\u0000\u0000\\u\u0001\u0000\u0000\u0000"+
		"]^\u0005\u001d\u0000\u0000^u\u0003\n\u0005\u0006_a\u0005\f\u0000\u0000"+
		"`b\u0007\u0001\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bu\u0001\u0000\u0000\u0000cd\u0005\f\u0000\u0000de\u0005\u001e\u0000"+
		"\u0000eu\u0003\n\u0005\u0004fo\u0005\r\u0000\u0000gl\u0003\n\u0005\u0000"+
		"hi\u0005*\u0000\u0000ik\u0003\n\u0005\u0000jh\u0001\u0000\u0000\u0000"+
		"kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000og\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qu\u0005"+
		"\'\u0000\u0000ru\u0005\u000e\u0000\u0000su\u0005\u000f\u0000\u0000tX\u0001"+
		"\u0000\u0000\u0000t]\u0001\u0000\u0000\u0000t_\u0001\u0000\u0000\u0000"+
		"tc\u0001\u0000\u0000\u0000tf\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000u\u0084\u0001\u0000\u0000\u0000vw\n\n"+
		"\u0000\u0000wx\u0007\u0002\u0000\u0000x\u0083\u0003\n\u0005\u000byz\n"+
		"\t\u0000\u0000z{\u0007\u0003\u0000\u0000{\u0083\u0003\n\u0005\n|}\n\b"+
		"\u0000\u0000}~\u0007\u0004\u0000\u0000~\u0083\u0003\n\u0005\t\u007f\u0080"+
		"\n\u0007\u0000\u0000\u0080\u0081\u0007\u0005\u0000\u0000\u0081\u0083\u0003"+
		"\n\u0005\b\u0082v\u0001\u0000\u0000\u0000\u0082y\u0001\u0000\u0000\u0000"+
		"\u0082|\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0083"+
		"\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u000b\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u000f\u000f)-1=@CISalot\u0082\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}