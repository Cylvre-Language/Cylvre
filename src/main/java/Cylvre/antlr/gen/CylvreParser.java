package Cylvre.antlr.gen;// Generated from C:/Users/user/IdeaProjects/Cylvre/src\Cylvre.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CylvreParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, FUNC=3, CLASS=4, PRINTLN=5, PRINT=6, PRINT_ERR=7, FOR=8, 
		RETURN=9, ELSE=10, TO=11, SUPER=12, NEW=13, TRUE=14, FALSE=15, SCANNER=16, 
		ASSIGN=17, PLUS=18, MINUS=19, MULTIPLY=20, DIVIDE=21, STRING_KW=22, BYTE_KW=23, 
		INT_KW=24, LONG_KW=25, SHORT_KW=26, BOOL_KW=27, VOID_KW=28, CHAR_KW=29, 
		FLOAT_KW=30, DOUBLE_KW=31, EQUALS=32, GREATER_THAN=33, LESS_THAN=34, GREATER_OR_EQUALS=35, 
		LESS_OR_EQUALS=36, DIFFERENT=37, TILDE=38, DB_TILDE=39, RBOX=40, LBOX=41, 
		RCURLY=42, LCURLY=43, RPAREN=44, LPAREN=45, SEMICOLON=46, Q_MARK=47, ARROW=48, 
		NUMBER=49, BOOL=50, STRING=51, ID=52, WS=53;
	public static final int
		RULE_compilationUnit = 0, RULE_fileDeclaration = 1, RULE_fileBody = 2, 
		RULE_classDeclaration = 3, RULE_className = 4, RULE_classBody = 5, RULE_field = 6, 
		RULE_function = 7, RULE_functionDeclaration = 8, RULE_parametersList = 9, 
		RULE_functionName = 10, RULE_parameter = 11, RULE_parameterWithDefaultValue = 12, 
		RULE_type = 13, RULE_primitiveType = 14, RULE_classType = 15, RULE_arrayType = 16, 
		RULE_block = 17, RULE_statement = 18, RULE_variableDeclaration = 19, RULE_arrayDeclaration = 20, 
		RULE_arrayAssignment = 21, RULE_assignment = 22, RULE_printlnStatement = 23, 
		RULE_printStatement = 24, RULE_print_errStatement = 25, RULE_scannerStatement = 26, 
		RULE_returnStatement = 27, RULE_ifStatement = 28, RULE_forStatement = 29, 
		RULE_forConditions = 30, RULE_name = 31, RULE_argumentList = 32, RULE_argument = 33, 
		RULE_namedArgument = 34, RULE_expression = 35, RULE_variableReference = 36, 
		RULE_value = 37, RULE_qualifiedName = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "fileDeclaration", "fileBody", "classDeclaration", 
			"className", "classBody", "field", "function", "functionDeclaration", 
			"parametersList", "functionName", "parameter", "parameterWithDefaultValue", 
			"type", "primitiveType", "classType", "arrayType", "block", "statement", 
			"variableDeclaration", "arrayDeclaration", "arrayAssignment", "assignment", 
			"printlnStatement", "printStatement", "print_errStatement", "scannerStatement", 
			"returnStatement", "ifStatement", "forStatement", "forConditions", "name", 
			"argumentList", "argument", "namedArgument", "expression", "variableReference", 
			"value", "qualifiedName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", "'func'", "'class'", "'println'", "'print'", "'print_err'", 
			"'for'", "'return'", "'else'", "'to'", "'super'", "'new'", "'true'", 
			"'false'", "'scanner'", "':'", "'+'", "'-'", "'*'", "'/'", "'str'", "'byte'", 
			"'int'", "'long'", "'short'", "'bool'", "'void'", "'char'", "'float'", 
			"'double'", "'='", "'>'", "'<'", "'>='", "'<='", "'!='", "'~'", null, 
			"']'", "'['", "'}'", "'{'", "')'", "'('", "';'", "'?'", "'~>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "FUNC", "CLASS", "PRINTLN", "PRINT", "PRINT_ERR", "FOR", 
			"RETURN", "ELSE", "TO", "SUPER", "NEW", "TRUE", "FALSE", "SCANNER", "ASSIGN", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "STRING_KW", "BYTE_KW", "INT_KW", 
			"LONG_KW", "SHORT_KW", "BOOL_KW", "VOID_KW", "CHAR_KW", "FLOAT_KW", "DOUBLE_KW", 
			"EQUALS", "GREATER_THAN", "LESS_THAN", "GREATER_OR_EQUALS", "LESS_OR_EQUALS", 
			"DIFFERENT", "TILDE", "DB_TILDE", "RBOX", "LBOX", "RCURLY", "LCURLY", 
			"RPAREN", "LPAREN", "SEMICOLON", "Q_MARK", "ARROW", "NUMBER", "BOOL", 
			"STRING", "ID", "WS"
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
	public String getGrammarFileName() { return "Cylvre.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CylvreParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public FileDeclarationContext fileDeclaration() {
			return getRuleContext(FileDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CylvreParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			fileDeclaration();
			setState(79);
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

	public static class FileDeclarationContext extends ParserRuleContext {
		public FileBodyContext fileBody() {
			return getRuleContext(FileBodyContext.class,0);
		}
		public FileDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterFileDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitFileDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitFileDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileDeclarationContext fileDeclaration() throws RecognitionException {
		FileDeclarationContext _localctx = new FileDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fileDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			fileBody();
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

	public static class FileBodyContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public FileBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterFileBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitFileBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitFileBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileBodyContext fileBody() throws RecognitionException {
		FileBodyContext _localctx = new FileBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fileBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83);
					function();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << PRINT) | (1L << PRINT_ERR) | (1L << FOR) | (1L << RETURN) | (1L << SUPER) | (1L << NEW) | (1L << SCANNER) | (1L << STRING_KW) | (1L << BYTE_KW) | (1L << INT_KW) | (1L << LONG_KW) | (1L << SHORT_KW) | (1L << BOOL_KW) | (1L << VOID_KW) | (1L << CHAR_KW) | (1L << FLOAT_KW) | (1L << DOUBLE_KW) | (1L << LCURLY) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(89);
				statement();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(95);
				classDeclaration();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CylvreParser.CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(CylvreParser.LCURLY, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(CylvreParser.RCURLY, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(CLASS);
			setState(102);
			className();
			setState(103);
			match(LCURLY);
			setState(104);
			classBody();
			setState(105);
			match(RCURLY);
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

	public static class ClassNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			qualifiedName();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					field();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << STRING_KW) | (1L << BYTE_KW) | (1L << INT_KW) | (1L << LONG_KW) | (1L << SHORT_KW) | (1L << BOOL_KW) | (1L << VOID_KW) | (1L << CHAR_KW) | (1L << FLOAT_KW) | (1L << DOUBLE_KW) | (1L << ID))) != 0)) {
				{
				{
				setState(115);
				function();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FieldContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			variableDeclaration();
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			functionDeclaration();
			setState(124);
			block();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(CylvreParser.FUNC, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CylvreParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CylvreParser.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_KW) | (1L << BYTE_KW) | (1L << INT_KW) | (1L << LONG_KW) | (1L << SHORT_KW) | (1L << BOOL_KW) | (1L << VOID_KW) | (1L << CHAR_KW) | (1L << FLOAT_KW) | (1L << DOUBLE_KW) | (1L << ID))) != 0)) {
				{
				setState(126);
				type();
				}
			}

			setState(129);
			match(FUNC);
			setState(130);
			functionName();
			setState(131);
			match(LPAREN);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_KW) | (1L << BYTE_KW) | (1L << INT_KW) | (1L << LONG_KW) | (1L << SHORT_KW) | (1L << BOOL_KW) | (1L << VOID_KW) | (1L << CHAR_KW) | (1L << FLOAT_KW) | (1L << DOUBLE_KW) | (1L << ID))) != 0)) {
				{
				setState(132);
				parametersList();
				}
			}

			setState(135);
			match(RPAREN);
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

	public static class ParametersListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<ParameterWithDefaultValueContext> parameterWithDefaultValue() {
			return getRuleContexts(ParameterWithDefaultValueContext.class);
		}
		public ParameterWithDefaultValueContext parameterWithDefaultValue(int i) {
			return getRuleContext(ParameterWithDefaultValueContext.class,i);
		}
		public ParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterParametersList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitParametersList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitParametersList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametersList);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				parameter();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(138);
					match(T__0);
					setState(139);
					parameter();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				parameter();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(146);
					match(T__0);
					setState(147);
					parameterWithDefaultValue();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				parameterWithDefaultValue();
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(154);
					match(T__0);
					setState(155);
					parameterWithDefaultValue();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CylvreParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ID);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CylvreParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			type();
			setState(166);
			match(ID);
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

	public static class ParameterWithDefaultValueContext extends ParserRuleContext {
		public ExpressionContext defaultValue;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CylvreParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CylvreParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterWithDefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterWithDefaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterParameterWithDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitParameterWithDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitParameterWithDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterWithDefaultValueContext parameterWithDefaultValue() throws RecognitionException {
		ParameterWithDefaultValueContext _localctx = new ParameterWithDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameterWithDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			type();
			setState(169);
			match(ID);
			setState(170);
			match(ASSIGN);
			setState(171);
			((ParameterWithDefaultValueContext)_localctx).defaultValue = expression(0);
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				classType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				arrayType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOL_KW() { return getToken(CylvreParser.BOOL_KW, 0); }
		public TerminalNode STRING_KW() { return getToken(CylvreParser.STRING_KW, 0); }
		public TerminalNode CHAR_KW() { return getToken(CylvreParser.CHAR_KW, 0); }
		public TerminalNode BYTE_KW() { return getToken(CylvreParser.BYTE_KW, 0); }
		public TerminalNode SHORT_KW() { return getToken(CylvreParser.SHORT_KW, 0); }
		public TerminalNode INT_KW() { return getToken(CylvreParser.INT_KW, 0); }
		public TerminalNode LONG_KW() { return getToken(CylvreParser.LONG_KW, 0); }
		public TerminalNode FLOAT_KW() { return getToken(CylvreParser.FLOAT_KW, 0); }
		public TerminalNode DOUBLE_KW() { return getToken(CylvreParser.DOUBLE_KW, 0); }
		public TerminalNode VOID_KW() { return getToken(CylvreParser.VOID_KW, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_KW) | (1L << BYTE_KW) | (1L << INT_KW) | (1L << LONG_KW) | (1L << SHORT_KW) | (1L << BOOL_KW) | (1L << VOID_KW) | (1L << CHAR_KW) | (1L << FLOAT_KW) | (1L << DOUBLE_KW))) != 0)) ) {
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

	public static class ClassTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			qualifiedName();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> LBOX() { return getTokens(CylvreParser.LBOX); }
		public TerminalNode LBOX(int i) {
			return getToken(CylvreParser.LBOX, i);
		}
		public List<TerminalNode> RBOX() { return getTokens(CylvreParser.RBOX); }
		public TerminalNode RBOX(int i) {
			return getToken(CylvreParser.RBOX, i);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayType);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_KW:
			case BYTE_KW:
			case INT_KW:
			case LONG_KW:
			case SHORT_KW:
			case BOOL_KW:
			case VOID_KW:
			case CHAR_KW:
			case FLOAT_KW:
			case DOUBLE_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				primitiveType();
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(183);
					match(LBOX);
					setState(184);
					match(RBOX);
					}
					}
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBOX );
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				classType();
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(190);
					match(LBOX);
					setState(191);
					match(RBOX);
					}
					}
					setState(194); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBOX );
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(CylvreParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CylvreParser.RCURLY, 0); }
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
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(LCURLY);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << PRINT) | (1L << PRINT_ERR) | (1L << FOR) | (1L << RETURN) | (1L << SUPER) | (1L << NEW) | (1L << SCANNER) | (1L << STRING_KW) | (1L << BYTE_KW) | (1L << INT_KW) | (1L << LONG_KW) | (1L << SHORT_KW) | (1L << BOOL_KW) | (1L << VOID_KW) | (1L << CHAR_KW) | (1L << FLOAT_KW) | (1L << DOUBLE_KW) | (1L << LCURLY) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(199);
				statement();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(RCURLY);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintlnStatementContext printlnStatement() {
			return getRuleContext(PrintlnStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public Print_errStatementContext print_errStatement() {
			return getRuleContext(Print_errStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ScannerStatementContext scannerStatement() {
			return getRuleContext(ScannerStatementContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				printlnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				printStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				print_errStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(213);
				forStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(214);
				ifStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(215);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(216);
				scannerStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(217);
				value();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(218);
				expression(0);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationWithAssignmentContext extends VariableDeclarationContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CylvreParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CylvreParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationWithAssignmentContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterVariableDeclarationWithAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitVariableDeclarationWithAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitVariableDeclarationWithAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableArrayDeclarationContext extends VariableDeclarationContext {
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public VariableArrayDeclarationContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterVariableArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitVariableArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitVariableArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarationWithoutAssignmentContext extends VariableDeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CylvreParser.SEMICOLON, 0); }
		public VariableDeclarationWithoutAssignmentContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterVariableDeclarationWithoutAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitVariableDeclarationWithoutAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitVariableDeclarationWithoutAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableDeclaration);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationWithAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(221);
					type();
					}
					break;
				}
				setState(224);
				name();
				setState(225);
				match(ASSIGN);
				setState(226);
				expression(0);
				setState(227);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new VariableDeclarationWithoutAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				type();
				setState(230);
				name();
				setState(231);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new VariableArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				arrayDeclaration();
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CylvreParser.ASSIGN, 0); }
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CylvreParser.SEMICOLON, 0); }
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			arrayType();
			setState(237);
			name();
			setState(238);
			match(ASSIGN);
			setState(239);
			arrayAssignment();
			setState(240);
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

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public TerminalNode LBOX() { return getToken(CylvreParser.LBOX, 0); }
		public TerminalNode RBOX() { return getToken(CylvreParser.RBOX, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterArrayAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitArrayAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitArrayAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(LBOX);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				{
				setState(243);
				value();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(RBOX);
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

	public static class AssignmentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CylvreParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			name();
			setState(252);
			match(ASSIGN);
			setState(253);
			expression(0);
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

	public static class PrintlnStatementContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(CylvreParser.PRINTLN, 0); }
		public TerminalNode LPAREN() { return getToken(CylvreParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CylvreParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CylvreParser.SEMICOLON, 0); }
		public PrintlnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printlnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterPrintlnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitPrintlnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitPrintlnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnStatementContext printlnStatement() throws RecognitionException {
		PrintlnStatementContext _localctx = new PrintlnStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_printlnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(PRINTLN);
			setState(256);
			match(LPAREN);
			setState(257);
			expression(0);
			setState(258);
			match(RPAREN);
			setState(259);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CylvreParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(CylvreParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CylvreParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CylvreParser.SEMICOLON, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(PRINT);
			setState(262);
			match(LPAREN);
			setState(263);
			expression(0);
			setState(264);
			match(RPAREN);
			setState(265);
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

	public static class Print_errStatementContext extends ParserRuleContext {
		public TerminalNode PRINT_ERR() { return getToken(CylvreParser.PRINT_ERR, 0); }
		public TerminalNode LPAREN() { return getToken(CylvreParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CylvreParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CylvreParser.SEMICOLON, 0); }
		public Print_errStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_errStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterPrint_errStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitPrint_errStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitPrint_errStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_errStatementContext print_errStatement() throws RecognitionException {
		Print_errStatementContext _localctx = new Print_errStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_print_errStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(PRINT_ERR);
			setState(268);
			match(LPAREN);
			setState(269);
			expression(0);
			setState(270);
			match(RPAREN);
			setState(271);
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

	public static class ScannerStatementContext extends ParserRuleContext {
		public TerminalNode SCANNER() { return getToken(CylvreParser.SCANNER, 0); }
		public TerminalNode SEMICOLON() { return getToken(CylvreParser.SEMICOLON, 0); }
		public ScannerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scannerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterScannerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitScannerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitScannerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScannerStatementContext scannerStatement() throws RecognitionException {
		ScannerStatementContext _localctx = new ScannerStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_scannerStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(SCANNER);
			setState(275); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(274);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(277); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(279);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnVoidContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(CylvreParser.RETURN, 0); }
		public ReturnVoidContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterReturnVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitReturnVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitReturnVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnWithValueContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(CylvreParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnWithValueContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterReturnWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitReturnWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitReturnWithValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnStatement);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ReturnWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(RETURN);
				setState(282);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ReturnVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(RETURN);
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

	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext trueStatement;
		public StatementContext falseStatement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Q_MARK() { return getToken(CylvreParser.Q_MARK, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(CylvreParser.SEMICOLON, 0); }
		public TerminalNode ELSE() { return getToken(CylvreParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifStatement);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
			case NEW:
			case LPAREN:
			case NUMBER:
			case BOOL:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				expression(0);
				setState(287);
				match(Q_MARK);
				setState(288);
				((IfStatementContext)_localctx).trueStatement = statement();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				block();
				setState(291);
				match(SEMICOLON);
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(292);
					match(ELSE);
					setState(293);
					((IfStatementContext)_localctx).falseStatement = statement();
					}
					break;
				case 2:
					{
					setState(294);
					block();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CylvreParser.FOR, 0); }
		public ForConditionsContext forConditions() {
			return getRuleContext(ForConditionsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(FOR);
			setState(300);
			forConditions();
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(301);
				statement();
				}
				break;
			case 2:
				{
				setState(302);
				block();
				}
				break;
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

	public static class ForConditionsContext extends ParserRuleContext {
		public VariableReferenceContext iterator;
		public ExpressionContext startExpr;
		public Token range;
		public ExpressionContext endExpr;
		public TerminalNode LPAREN() { return getToken(CylvreParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CylvreParser.RPAREN, 0); }
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(CylvreParser.TO, 0); }
		public ForConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forConditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterForConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitForConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitForConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionsContext forConditions() throws RecognitionException {
		ForConditionsContext _localctx = new ForConditionsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forConditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			((ForConditionsContext)_localctx).iterator = variableReference();
			setState(306);
			match(LPAREN);
			setState(307);
			((ForConditionsContext)_localctx).startExpr = expression(0);
			setState(308);
			((ForConditionsContext)_localctx).range = match(TO);
			setState(309);
			((ForConditionsContext)_localctx).endExpr = expression(0);
			setState(310);
			match(RPAREN);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CylvreParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(ID);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	 
		public ArgumentListContext() { }
		public void copyFrom(ArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnnamedArgumentsListContext extends ArgumentListContext {
		public ArgumentContext a;
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public UnnamedArgumentsListContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterUnnamedArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitUnnamedArgumentsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitUnnamedArgumentsList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentsListContext extends ArgumentListContext {
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public NamedArgumentsListContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterNamedArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitNamedArgumentsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitNamedArgumentsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_argumentList);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new UnnamedArgumentsListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << NEW) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					setState(314);
					argument();
					}
				}

				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(317);
					match(T__0);
					setState(318);
					((UnnamedArgumentsListContext)_localctx).a = argument();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new NamedArgumentsListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(324);
					namedArgument();
					}
				}

				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(327);
					match(T__0);
					setState(328);
					namedArgument();
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			expression(0);
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

	public static class NamedArgumentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(CylvreParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedArgumentContext namedArgument() throws RecognitionException {
		NamedArgumentContext _localctx = new NamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			name();
			setState(339);
			match(ARROW);
			setState(340);
			expression(0);
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
	public static class AddContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(CylvreParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CylvreParser.PLUS, 0); }
		public TerminalNode RPAREN() { return getToken(CylvreParser.RPAREN, 0); }
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueExprContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(CylvreParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(CylvreParser.DIVIDE, 0); }
		public TerminalNode RPAREN() { return getToken(CylvreParser.RPAREN, 0); }
		public DivideContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarReferenceContext extends ExpressionContext {
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public VarReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterVarReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitVarReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitVarReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(CylvreParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(CylvreParser.MULTIPLY, 0); }
		public TerminalNode RPAREN() { return getToken(CylvreParser.RPAREN, 0); }
		public MultiplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public Token cmp;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(CylvreParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(CylvreParser.LESS_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(CylvreParser.EQUALS, 0); }
		public TerminalNode DIFFERENT() { return getToken(CylvreParser.DIFFERENT, 0); }
		public TerminalNode GREATER_OR_EQUALS() { return getToken(CylvreParser.GREATER_OR_EQUALS, 0); }
		public TerminalNode LESS_OR_EQUALS() { return getToken(CylvreParser.LESS_OR_EQUALS, 0); }
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(CylvreParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(CylvreParser.MINUS, 0); }
		public TerminalNode RPAREN() { return getToken(CylvreParser.RPAREN, 0); }
		public SubtractContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitSubtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitSubtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuperCallContext extends ExpressionContext {
		public Token superCall;
		public TerminalNode LPAREN() { return getToken(CylvreParser.LPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CylvreParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CylvreParser.SEMICOLON, 0); }
		public TerminalNode SUPER() { return getToken(CylvreParser.SUPER, 0); }
		public SuperCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterSuperCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitSuperCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitSuperCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExpressionContext {
		public ExpressionContext owner;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CylvreParser.LPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CylvreParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CylvreParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstructorCallContext extends ExpressionContext {
		public Token newCall;
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CylvreParser.LPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CylvreParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CylvreParser.SEMICOLON, 0); }
		public TerminalNode NEW() { return getToken(CylvreParser.NEW, 0); }
		public ConstructorCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitConstructorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitConstructorCall(this);
			else return visitor.visitChildren(this);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(343);
				variableReference();
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(344);
				functionName();
				setState(345);
				match(LPAREN);
				setState(346);
				argumentList();
				setState(347);
				match(RPAREN);
				setState(348);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				_localctx = new SuperCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350);
				((SuperCallContext)_localctx).superCall = match(SUPER);
				setState(351);
				match(LPAREN);
				setState(352);
				argumentList();
				setState(353);
				match(RPAREN);
				setState(354);
				match(SEMICOLON);
				}
				break;
			case 4:
				{
				_localctx = new ConstructorCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				((ConstructorCallContext)_localctx).newCall = match(NEW);
				setState(357);
				className();
				setState(358);
				match(LPAREN);
				setState(359);
				argumentList();
				setState(360);
				match(RPAREN);
				setState(361);
				match(SEMICOLON);
				}
				break;
			case 5:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(363);
				value();
				}
				break;
			case 6:
				{
				_localctx = new MultiplyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(364);
				match(LPAREN);
				setState(365);
				expression(0);
				setState(366);
				match(MULTIPLY);
				setState(367);
				expression(0);
				setState(368);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new DivideContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(370);
				match(LPAREN);
				setState(371);
				expression(0);
				setState(372);
				match(DIVIDE);
				setState(373);
				expression(0);
				setState(374);
				match(RPAREN);
				}
				break;
			case 8:
				{
				_localctx = new AddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(376);
				match(LPAREN);
				setState(377);
				expression(0);
				setState(378);
				match(PLUS);
				setState(379);
				expression(0);
				setState(380);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new SubtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(382);
				match(LPAREN);
				setState(383);
				expression(0);
				setState(384);
				match(MINUS);
				setState(385);
				expression(0);
				setState(386);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(390);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(391);
						match(MULTIPLY);
						setState(392);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new DivideContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(393);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(394);
						match(DIVIDE);
						setState(395);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(396);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(397);
						match(PLUS);
						setState(398);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new SubtractContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(399);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(400);
						match(MINUS);
						setState(401);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(402);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(403);
						((ConditionalExpressionContext)_localctx).cmp = match(GREATER_THAN);
						setState(404);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(405);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(406);
						((ConditionalExpressionContext)_localctx).cmp = match(LESS_THAN);
						setState(407);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(408);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(409);
						((ConditionalExpressionContext)_localctx).cmp = match(EQUALS);
						setState(410);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(411);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(412);
						((ConditionalExpressionContext)_localctx).cmp = match(DIFFERENT);
						setState(413);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(414);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(415);
						((ConditionalExpressionContext)_localctx).cmp = match(GREATER_OR_EQUALS);
						setState(416);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(417);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(418);
						((ConditionalExpressionContext)_localctx).cmp = match(LESS_OR_EQUALS);
						setState(419);
						expression(2);
						}
						break;
					case 11:
						{
						_localctx = new FunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						((FunctionCallContext)_localctx).owner = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(420);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(421);
						match(T__1);
						setState(422);
						functionName();
						setState(423);
						match(LPAREN);
						setState(424);
						argumentList();
						setState(425);
						match(RPAREN);
						setState(426);
						match(SEMICOLON);
						}
						break;
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CylvreParser.ID, 0); }
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(ID);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CylvreParser.NUMBER, 0); }
		public TerminalNode BOOL() { return getToken(CylvreParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(CylvreParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING))) != 0)) ) {
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CylvreParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CylvreParser.ID, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CylvreListener ) ((CylvreListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CylvreVisitor ) return ((CylvreVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(ID);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(438);
				match(T__1);
				setState(439);
				match(ID);
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		case 10:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u01c0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3\4\7\4c\n\4"+
		"\f\4\16\4f\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\7\7q\n\7\f\7\16\7"+
		"t\13\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\b\3\b\3\t\3\t\3\t\3\n\5\n\u0082\n"+
		"\n\3\n\3\n\3\n\3\n\5\n\u0088\n\n\3\n\3\n\3\13\3\13\3\13\7\13\u008f\n\13"+
		"\f\13\16\13\u0092\13\13\3\13\3\13\3\13\7\13\u0097\n\13\f\13\16\13\u009a"+
		"\13\13\3\13\3\13\3\13\7\13\u009f\n\13\f\13\16\13\u00a2\13\13\5\13\u00a4"+
		"\n\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17"+
		"\u00b3\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\6\22\u00bc\n\22\r\22\16"+
		"\22\u00bd\3\22\3\22\3\22\6\22\u00c3\n\22\r\22\16\22\u00c4\5\22\u00c7\n"+
		"\22\3\23\3\23\7\23\u00cb\n\23\f\23\16\23\u00ce\13\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00de\n\24"+
		"\3\25\5\25\u00e1\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00ed\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u00f7\n"+
		"\27\f\27\16\27\u00fa\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\6\34\u0116\n\34\r\34\16\34\u0117\3\34\3\34\3\35\3\35\3"+
		"\35\5\35\u011f\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u012a\n\36\5\36\u012c\n\36\3\37\3\37\3\37\3\37\5\37\u0132\n\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3!\3!\3\"\5\"\u013e\n\"\3\"\3\"\7\"\u0142\n\"\f\"\16\""+
		"\u0145\13\"\3\"\5\"\u0148\n\"\3\"\3\"\7\"\u014c\n\"\f\"\16\"\u014f\13"+
		"\"\5\"\u0151\n\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0187\n%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\7%\u01af\n%\f%\16%\u01b2\13%\3&\3&\3\'\3\'\3(\3"+
		"(\3(\7(\u01bb\n(\f(\16(\u01be\13(\3(\3\u0117\3H)\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\4\3\2\30!\3\2\63"+
		"\65\2\u01d8\2P\3\2\2\2\4S\3\2\2\2\6X\3\2\2\2\bg\3\2\2\2\nm\3\2\2\2\fr"+
		"\3\2\2\2\16{\3\2\2\2\20}\3\2\2\2\22\u0081\3\2\2\2\24\u00a3\3\2\2\2\26"+
		"\u00a5\3\2\2\2\30\u00a7\3\2\2\2\32\u00aa\3\2\2\2\34\u00b2\3\2\2\2\36\u00b4"+
		"\3\2\2\2 \u00b6\3\2\2\2\"\u00c6\3\2\2\2$\u00c8\3\2\2\2&\u00dd\3\2\2\2"+
		"(\u00ec\3\2\2\2*\u00ee\3\2\2\2,\u00f4\3\2\2\2.\u00fd\3\2\2\2\60\u0101"+
		"\3\2\2\2\62\u0107\3\2\2\2\64\u010d\3\2\2\2\66\u0113\3\2\2\28\u011e\3\2"+
		"\2\2:\u012b\3\2\2\2<\u012d\3\2\2\2>\u0133\3\2\2\2@\u013a\3\2\2\2B\u0150"+
		"\3\2\2\2D\u0152\3\2\2\2F\u0154\3\2\2\2H\u0186\3\2\2\2J\u01b3\3\2\2\2L"+
		"\u01b5\3\2\2\2N\u01b7\3\2\2\2PQ\5\4\3\2QR\7\2\2\3R\3\3\2\2\2ST\5\6\4\2"+
		"T\5\3\2\2\2UW\5\20\t\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y^\3\2\2"+
		"\2ZX\3\2\2\2[]\5&\24\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_d\3\2"+
		"\2\2`^\3\2\2\2ac\5\b\5\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\7\3"+
		"\2\2\2fd\3\2\2\2gh\7\6\2\2hi\5\n\6\2ij\7-\2\2jk\5\f\7\2kl\7,\2\2l\t\3"+
		"\2\2\2mn\5N(\2n\13\3\2\2\2oq\5\16\b\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs"+
		"\3\2\2\2sx\3\2\2\2tr\3\2\2\2uw\5\20\t\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2"+
		"xy\3\2\2\2y\r\3\2\2\2zx\3\2\2\2{|\5(\25\2|\17\3\2\2\2}~\5\22\n\2~\177"+
		"\5$\23\2\177\21\3\2\2\2\u0080\u0082\5\34\17\2\u0081\u0080\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\5\2\2\u0084\u0085\5\26"+
		"\f\2\u0085\u0087\7/\2\2\u0086\u0088\5\24\13\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7.\2\2\u008a\23\3\2\2\2"+
		"\u008b\u0090\5\30\r\2\u008c\u008d\7\3\2\2\u008d\u008f\5\30\r\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u00a4\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0098\5\30\r\2\u0094\u0095\7"+
		"\3\2\2\u0095\u0097\5\32\16\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a4\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u00a0\5\32\16\2\u009c\u009d\7\3\2\2\u009d\u009f\5\32\16\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u008b\3\2\2\2\u00a3"+
		"\u0093\3\2\2\2\u00a3\u009b\3\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a6\7\66\2"+
		"\2\u00a6\27\3\2\2\2\u00a7\u00a8\5\34\17\2\u00a8\u00a9\7\66\2\2\u00a9\31"+
		"\3\2\2\2\u00aa\u00ab\5\34\17\2\u00ab\u00ac\7\66\2\2\u00ac\u00ad\7\23\2"+
		"\2\u00ad\u00ae\5H%\2\u00ae\33\3\2\2\2\u00af\u00b3\5\36\20\2\u00b0\u00b3"+
		"\5 \21\2\u00b1\u00b3\5\"\22\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2"+
		"\u00b2\u00b1\3\2\2\2\u00b3\35\3\2\2\2\u00b4\u00b5\t\2\2\2\u00b5\37\3\2"+
		"\2\2\u00b6\u00b7\5N(\2\u00b7!\3\2\2\2\u00b8\u00bb\5\36\20\2\u00b9\u00ba"+
		"\7+\2\2\u00ba\u00bc\7*\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c7\3\2\2\2\u00bf\u00c2\5 "+
		"\21\2\u00c0\u00c1\7+\2\2\u00c1\u00c3\7*\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2"+
		"\2\2\u00c6\u00b8\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00cc"+
		"\7-\2\2\u00c9\u00cb\5&\24\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d0\7,\2\2\u00d0%\3\2\2\2\u00d1\u00de\5$\23\2\u00d2\u00de"+
		"\5(\25\2\u00d3\u00de\5.\30\2\u00d4\u00de\5\60\31\2\u00d5\u00de\5\62\32"+
		"\2\u00d6\u00de\5\64\33\2\u00d7\u00de\5<\37\2\u00d8\u00de\5:\36\2\u00d9"+
		"\u00de\58\35\2\u00da\u00de\5\66\34\2\u00db\u00de\5L\'\2\u00dc\u00de\5"+
		"H%\2\u00dd\u00d1\3\2\2\2\u00dd\u00d2\3\2\2\2\u00dd\u00d3\3\2\2\2\u00dd"+
		"\u00d4\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00d7\3\2"+
		"\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\'\3\2\2\2\u00df\u00e1\5\34\17"+
		"\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3"+
		"\5@!\2\u00e3\u00e4\7\23\2\2\u00e4\u00e5\5H%\2\u00e5\u00e6\7\60\2\2\u00e6"+
		"\u00ed\3\2\2\2\u00e7\u00e8\5\34\17\2\u00e8\u00e9\5@!\2\u00e9\u00ea\7\60"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ed\5*\26\2\u00ec\u00e0\3\2\2\2\u00ec"+
		"\u00e7\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed)\3\2\2\2\u00ee\u00ef\5\"\22\2"+
		"\u00ef\u00f0\5@!\2\u00f0\u00f1\7\23\2\2\u00f1\u00f2\5,\27\2\u00f2\u00f3"+
		"\7\60\2\2\u00f3+\3\2\2\2\u00f4\u00f8\7+\2\2\u00f5\u00f7\5L\'\2\u00f6\u00f5"+
		"\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7*\2\2\u00fc-\3\2\2\2\u00fd"+
		"\u00fe\5@!\2\u00fe\u00ff\7\23\2\2\u00ff\u0100\5H%\2\u0100/\3\2\2\2\u0101"+
		"\u0102\7\7\2\2\u0102\u0103\7/\2\2\u0103\u0104\5H%\2\u0104\u0105\7.\2\2"+
		"\u0105\u0106\7\60\2\2\u0106\61\3\2\2\2\u0107\u0108\7\b\2\2\u0108\u0109"+
		"\7/\2\2\u0109\u010a\5H%\2\u010a\u010b\7.\2\2\u010b\u010c\7\60\2\2\u010c"+
		"\63\3\2\2\2\u010d\u010e\7\t\2\2\u010e\u010f\7/\2\2\u010f\u0110\5H%\2\u0110"+
		"\u0111\7.\2\2\u0111\u0112\7\60\2\2\u0112\65\3\2\2\2\u0113\u0115\7\22\2"+
		"\2\u0114\u0116\13\2\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\60"+
		"\2\2\u011a\67\3\2\2\2\u011b\u011c\7\13\2\2\u011c\u011f\5H%\2\u011d\u011f"+
		"\7\13\2\2\u011e\u011b\3\2\2\2\u011e\u011d\3\2\2\2\u011f9\3\2\2\2\u0120"+
		"\u0121\5H%\2\u0121\u0122\7\61\2\2\u0122\u0123\5&\24\2\u0123\u012c\3\2"+
		"\2\2\u0124\u0125\5$\23\2\u0125\u0129\7\60\2\2\u0126\u0127\7\f\2\2\u0127"+
		"\u012a\5&\24\2\u0128\u012a\5$\23\2\u0129\u0126\3\2\2\2\u0129\u0128\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0120\3\2\2\2\u012b"+
		"\u0124\3\2\2\2\u012c;\3\2\2\2\u012d\u012e\7\n\2\2\u012e\u0131\5> \2\u012f"+
		"\u0132\5&\24\2\u0130\u0132\5$\23\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2"+
		"\2\2\u0132=\3\2\2\2\u0133\u0134\5J&\2\u0134\u0135\7/\2\2\u0135\u0136\5"+
		"H%\2\u0136\u0137\7\r\2\2\u0137\u0138\5H%\2\u0138\u0139\7.\2\2\u0139?\3"+
		"\2\2\2\u013a\u013b\7\66\2\2\u013bA\3\2\2\2\u013c\u013e\5D#\2\u013d\u013c"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0143\3\2\2\2\u013f\u0140\7\3\2\2\u0140"+
		"\u0142\5D#\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2"+
		"\2\u0143\u0144\3\2\2\2\u0144\u0151\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148"+
		"\5F$\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014d\3\2\2\2\u0149"+
		"\u014a\7\3\2\2\u014a\u014c\5F$\2\u014b\u0149\3\2\2\2\u014c\u014f\3\2\2"+
		"\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u0150\u013d\3\2\2\2\u0150\u0147\3\2\2\2\u0151C\3\2\2\2\u0152"+
		"\u0153\5H%\2\u0153E\3\2\2\2\u0154\u0155\5@!\2\u0155\u0156\7\62\2\2\u0156"+
		"\u0157\5H%\2\u0157G\3\2\2\2\u0158\u0159\b%\1\2\u0159\u0187\5J&\2\u015a"+
		"\u015b\5\26\f\2\u015b\u015c\7/\2\2\u015c\u015d\5B\"\2\u015d\u015e\7.\2"+
		"\2\u015e\u015f\7\60\2\2\u015f\u0187\3\2\2\2\u0160\u0161\7\16\2\2\u0161"+
		"\u0162\7/\2\2\u0162\u0163\5B\"\2\u0163\u0164\7.\2\2\u0164\u0165\7\60\2"+
		"\2\u0165\u0187\3\2\2\2\u0166\u0167\7\17\2\2\u0167\u0168\5\n\6\2\u0168"+
		"\u0169\7/\2\2\u0169\u016a\5B\"\2\u016a\u016b\7.\2\2\u016b\u016c\7\60\2"+
		"\2\u016c\u0187\3\2\2\2\u016d\u0187\5L\'\2\u016e\u016f\7/\2\2\u016f\u0170"+
		"\5H%\2\u0170\u0171\7\26\2\2\u0171\u0172\5H%\2\u0172\u0173\7.\2\2\u0173"+
		"\u0187\3\2\2\2\u0174\u0175\7/\2\2\u0175\u0176\5H%\2\u0176\u0177\7\27\2"+
		"\2\u0177\u0178\5H%\2\u0178\u0179\7.\2\2\u0179\u0187\3\2\2\2\u017a\u017b"+
		"\7/\2\2\u017b\u017c\5H%\2\u017c\u017d\7\24\2\2\u017d\u017e\5H%\2\u017e"+
		"\u017f\7.\2\2\u017f\u0187\3\2\2\2\u0180\u0181\7/\2\2\u0181\u0182\5H%\2"+
		"\u0182\u0183\7\25\2\2\u0183\u0184\5H%\2\u0184\u0185\7.\2\2\u0185\u0187"+
		"\3\2\2\2\u0186\u0158\3\2\2\2\u0186\u015a\3\2\2\2\u0186\u0160\3\2\2\2\u0186"+
		"\u0166\3\2\2\2\u0186\u016d\3\2\2\2\u0186\u016e\3\2\2\2\u0186\u0174\3\2"+
		"\2\2\u0186\u017a\3\2\2\2\u0186\u0180\3\2\2\2\u0187\u01b0\3\2\2\2\u0188"+
		"\u0189\f\17\2\2\u0189\u018a\7\26\2\2\u018a\u01af\5H%\20\u018b\u018c\f"+
		"\r\2\2\u018c\u018d\7\27\2\2\u018d\u01af\5H%\16\u018e\u018f\f\13\2\2\u018f"+
		"\u0190\7\24\2\2\u0190\u01af\5H%\f\u0191\u0192\f\t\2\2\u0192\u0193\7\25"+
		"\2\2\u0193\u01af\5H%\n\u0194\u0195\f\b\2\2\u0195\u0196\7#\2\2\u0196\u01af"+
		"\5H%\t\u0197\u0198\f\7\2\2\u0198\u0199\7$\2\2\u0199\u01af\5H%\b\u019a"+
		"\u019b\f\6\2\2\u019b\u019c\7\"\2\2\u019c\u01af\5H%\7\u019d\u019e\f\5\2"+
		"\2\u019e\u019f\7\'\2\2\u019f\u01af\5H%\6\u01a0\u01a1\f\4\2\2\u01a1\u01a2"+
		"\7%\2\2\u01a2\u01af\5H%\5\u01a3\u01a4\f\3\2\2\u01a4\u01a5\7&\2\2\u01a5"+
		"\u01af\5H%\4\u01a6\u01a7\f\25\2\2\u01a7\u01a8\7\4\2\2\u01a8\u01a9\5\26"+
		"\f\2\u01a9\u01aa\7/\2\2\u01aa\u01ab\5B\"\2\u01ab\u01ac\7.\2\2\u01ac\u01ad"+
		"\7\60\2\2\u01ad\u01af\3\2\2\2\u01ae\u0188\3\2\2\2\u01ae\u018b\3\2\2\2"+
		"\u01ae\u018e\3\2\2\2\u01ae\u0191\3\2\2\2\u01ae\u0194\3\2\2\2\u01ae\u0197"+
		"\3\2\2\2\u01ae\u019a\3\2\2\2\u01ae\u019d\3\2\2\2\u01ae\u01a0\3\2\2\2\u01ae"+
		"\u01a3\3\2\2\2\u01ae\u01a6\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1I\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4"+
		"\7\66\2\2\u01b4K\3\2\2\2\u01b5\u01b6\t\3\2\2\u01b6M\3\2\2\2\u01b7\u01bc"+
		"\7\66\2\2\u01b8\u01b9\7\4\2\2\u01b9\u01bb\7\66\2\2\u01ba\u01b8\3\2\2\2"+
		"\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bdO\3"+
		"\2\2\2\u01be\u01bc\3\2\2\2$X^drx\u0081\u0087\u0090\u0098\u00a0\u00a3\u00b2"+
		"\u00bd\u00c4\u00c6\u00cc\u00dd\u00e0\u00ec\u00f8\u0117\u011e\u0129\u012b"+
		"\u0131\u013d\u0143\u0147\u014d\u0150\u0186\u01ae\u01b0\u01bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}