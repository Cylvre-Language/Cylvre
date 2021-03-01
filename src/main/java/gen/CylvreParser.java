package gen;// Generated from C:/Users/user/IdeaProjects/Cylvre/src\Cylvre.g4 by ANTLR 4.9.1
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
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
			type();
			setState(122);
			name();
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
			setState(124);
			functionDeclaration();
			setState(125);
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
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_KW) | (1L << BYTE_KW) | (1L << INT_KW) | (1L << LONG_KW) | (1L << SHORT_KW) | (1L << BOOL_KW) | (1L << VOID_KW) | (1L << CHAR_KW) | (1L << FLOAT_KW) | (1L << DOUBLE_KW) | (1L << ID))) != 0)) {
				{
				setState(127);
				type();
				}
			}

			setState(130);
			match(FUNC);
			setState(131);
			functionName();
			setState(132);
			match(LPAREN);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_KW) | (1L << BYTE_KW) | (1L << INT_KW) | (1L << LONG_KW) | (1L << SHORT_KW) | (1L << BOOL_KW) | (1L << VOID_KW) | (1L << CHAR_KW) | (1L << FLOAT_KW) | (1L << DOUBLE_KW) | (1L << ID))) != 0)) {
				{
				setState(133);
				parametersList();
				}
			}

			setState(136);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				parameter();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(139);
					match(T__0);
					setState(140);
					parameter();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				parameter();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(147);
					match(T__0);
					setState(148);
					parameterWithDefaultValue();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				parameterWithDefaultValue();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(155);
					match(T__0);
					setState(156);
					parameterWithDefaultValue();
					}
					}
					setState(161);
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
			setState(164);
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
			setState(166);
			type();
			setState(167);
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
			setState(169);
			type();
			setState(170);
			match(ID);
			setState(171);
			match(ASSIGN);
			setState(172);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				classType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
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
			setState(179);
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
			setState(181);
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
			setState(197);
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
				setState(183);
				primitiveType();
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(184);
					match(LBOX);
					setState(185);
					match(RBOX);
					}
					}
					setState(188); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBOX );
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				classType();
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(191);
					match(LBOX);
					setState(192);
					match(RBOX);
					}
					}
					setState(195); 
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
			setState(199);
			match(LCURLY);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << PRINT) | (1L << PRINT_ERR) | (1L << FOR) | (1L << RETURN) | (1L << SUPER) | (1L << NEW) | (1L << SCANNER) | (1L << STRING_KW) | (1L << BYTE_KW) | (1L << INT_KW) | (1L << LONG_KW) | (1L << SHORT_KW) | (1L << BOOL_KW) | (1L << VOID_KW) | (1L << CHAR_KW) | (1L << FLOAT_KW) | (1L << DOUBLE_KW) | (1L << LCURLY) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(200);
				statement();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				printlnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				printStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				print_errStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				forStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(215);
				ifStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(216);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(217);
				scannerStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(218);
				value();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(219);
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
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationWithAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(222);
					type();
					}
					break;
				}
				setState(225);
				name();
				setState(226);
				match(ASSIGN);
				setState(227);
				expression(0);
				setState(228);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new VariableDeclarationWithoutAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				type();
				setState(231);
				name();
				setState(232);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new VariableArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
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
			setState(237);
			arrayType();
			setState(238);
			name();
			setState(239);
			match(ASSIGN);
			setState(240);
			arrayAssignment();
			setState(241);
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
			setState(243);
			match(LBOX);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				{
				setState(244);
				value();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
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
			setState(252);
			name();
			setState(253);
			match(ASSIGN);
			setState(254);
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
			setState(256);
			match(PRINTLN);
			setState(257);
			match(LPAREN);
			setState(258);
			expression(0);
			setState(259);
			match(RPAREN);
			setState(260);
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
			setState(262);
			match(PRINT);
			setState(263);
			match(LPAREN);
			setState(264);
			expression(0);
			setState(265);
			match(RPAREN);
			setState(266);
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
			setState(268);
			match(PRINT_ERR);
			setState(269);
			match(LPAREN);
			setState(270);
			expression(0);
			setState(271);
			match(RPAREN);
			setState(272);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(SCANNER);
			setState(275);
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
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ReturnWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(RETURN);
				setState(278);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ReturnVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
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
			setState(293);
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
				setState(282);
				expression(0);
				setState(283);
				match(Q_MARK);
				setState(284);
				((IfStatementContext)_localctx).trueStatement = statement();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				block();
				setState(287);
				match(SEMICOLON);
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(288);
					match(ELSE);
					setState(289);
					((IfStatementContext)_localctx).falseStatement = statement();
					}
					break;
				case 2:
					{
					setState(290);
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
			setState(295);
			match(FOR);
			setState(296);
			forConditions();
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(297);
				statement();
				}
				break;
			case 2:
				{
				setState(298);
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
			setState(301);
			((ForConditionsContext)_localctx).iterator = variableReference();
			setState(302);
			match(LPAREN);
			setState(303);
			((ForConditionsContext)_localctx).startExpr = expression(0);
			setState(304);
			((ForConditionsContext)_localctx).range = match(TO);
			setState(305);
			((ForConditionsContext)_localctx).endExpr = expression(0);
			setState(306);
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
			setState(308);
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
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new UnnamedArgumentsListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUPER) | (1L << NEW) | (1L << LPAREN) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					setState(310);
					argument();
					}
				}

				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(313);
					match(T__0);
					setState(314);
					((UnnamedArgumentsListContext)_localctx).a = argument();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new NamedArgumentsListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(320);
					namedArgument();
					}
				}

				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(323);
					match(T__0);
					setState(324);
					namedArgument();
					}
					}
					setState(329);
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
			setState(332);
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
			setState(334);
			name();
			setState(335);
			match(ARROW);
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
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(339);
				variableReference();
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				functionName();
				setState(341);
				match(LPAREN);
				setState(342);
				argumentList();
				setState(343);
				match(RPAREN);
				setState(344);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				_localctx = new SuperCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(346);
				((SuperCallContext)_localctx).superCall = match(SUPER);
				setState(347);
				match(LPAREN);
				setState(348);
				argumentList();
				setState(349);
				match(RPAREN);
				setState(350);
				match(SEMICOLON);
				}
				break;
			case 4:
				{
				_localctx = new ConstructorCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(352);
				((ConstructorCallContext)_localctx).newCall = match(NEW);
				setState(353);
				className();
				setState(354);
				match(LPAREN);
				setState(355);
				argumentList();
				setState(356);
				match(RPAREN);
				setState(357);
				match(SEMICOLON);
				}
				break;
			case 5:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359);
				value();
				}
				break;
			case 6:
				{
				_localctx = new MultiplyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(360);
				match(LPAREN);
				setState(361);
				expression(0);
				setState(362);
				match(MULTIPLY);
				setState(363);
				expression(0);
				setState(364);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new DivideContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				match(LPAREN);
				setState(367);
				expression(0);
				setState(368);
				match(DIVIDE);
				setState(369);
				expression(0);
				setState(370);
				match(RPAREN);
				}
				break;
			case 8:
				{
				_localctx = new AddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(372);
				match(LPAREN);
				setState(373);
				expression(0);
				setState(374);
				match(PLUS);
				setState(375);
				expression(0);
				setState(376);
				match(RPAREN);
				}
				break;
			case 9:
				{
				_localctx = new SubtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(378);
				match(LPAREN);
				setState(379);
				expression(0);
				setState(380);
				match(MINUS);
				setState(381);
				expression(0);
				setState(382);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(424);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(386);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(387);
						match(MULTIPLY);
						setState(388);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new DivideContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(389);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(390);
						match(DIVIDE);
						setState(391);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(392);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(393);
						match(PLUS);
						setState(394);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new SubtractContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(395);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(396);
						match(MINUS);
						setState(397);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(398);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(399);
						((ConditionalExpressionContext)_localctx).cmp = match(GREATER_THAN);
						setState(400);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(401);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(402);
						((ConditionalExpressionContext)_localctx).cmp = match(LESS_THAN);
						setState(403);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(404);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(405);
						((ConditionalExpressionContext)_localctx).cmp = match(EQUALS);
						setState(406);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(407);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(408);
						((ConditionalExpressionContext)_localctx).cmp = match(DIFFERENT);
						setState(409);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(410);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(411);
						((ConditionalExpressionContext)_localctx).cmp = match(GREATER_OR_EQUALS);
						setState(412);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(413);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(414);
						((ConditionalExpressionContext)_localctx).cmp = match(LESS_OR_EQUALS);
						setState(415);
						expression(2);
						}
						break;
					case 11:
						{
						_localctx = new FunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						((FunctionCallContext)_localctx).owner = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(416);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(417);
						match(T__1);
						setState(418);
						functionName();
						setState(419);
						match(LPAREN);
						setState(420);
						argumentList();
						setState(421);
						match(RPAREN);
						setState(422);
						match(SEMICOLON);
						}
						break;
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
			setState(429);
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
			setState(431);
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
			setState(433);
			match(ID);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(434);
				match(T__1);
				setState(435);
				match(ID);
				}
				}
				setState(440);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u01bc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3\4\7\4c\n\4"+
		"\f\4\16\4f\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\7\7q\n\7\f\7\16\7"+
		"t\13\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\5\n\u0083"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u0089\n\n\3\n\3\n\3\13\3\13\3\13\7\13\u0090\n"+
		"\13\f\13\16\13\u0093\13\13\3\13\3\13\3\13\7\13\u0098\n\13\f\13\16\13\u009b"+
		"\13\13\3\13\3\13\3\13\7\13\u00a0\n\13\f\13\16\13\u00a3\13\13\5\13\u00a5"+
		"\n\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17"+
		"\u00b4\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\6\22\u00bd\n\22\r\22\16"+
		"\22\u00be\3\22\3\22\3\22\6\22\u00c4\n\22\r\22\16\22\u00c5\5\22\u00c8\n"+
		"\22\3\23\3\23\7\23\u00cc\n\23\f\23\16\23\u00cf\13\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00df\n\24"+
		"\3\25\5\25\u00e2\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00ee\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u00f8\n"+
		"\27\f\27\16\27\u00fb\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u011b\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u0126\n\36\5\36\u0128\n\36\3\37\3\37\3"+
		"\37\3\37\5\37\u012e\n\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3\"\5\"\u013a\n\""+
		"\3\"\3\"\7\"\u013e\n\"\f\"\16\"\u0141\13\"\3\"\5\"\u0144\n\"\3\"\3\"\7"+
		"\"\u0148\n\"\f\"\16\"\u014b\13\"\5\"\u014d\n\"\3#\3#\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0183"+
		"\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u01ab\n%\f%\16%\u01ae"+
		"\13%\3&\3&\3\'\3\'\3(\3(\3(\7(\u01b7\n(\f(\16(\u01ba\13(\3(\2\3H)\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2"+
		"\4\3\2\30!\3\2\63\65\2\u01d3\2P\3\2\2\2\4S\3\2\2\2\6X\3\2\2\2\bg\3\2\2"+
		"\2\nm\3\2\2\2\fr\3\2\2\2\16{\3\2\2\2\20~\3\2\2\2\22\u0082\3\2\2\2\24\u00a4"+
		"\3\2\2\2\26\u00a6\3\2\2\2\30\u00a8\3\2\2\2\32\u00ab\3\2\2\2\34\u00b3\3"+
		"\2\2\2\36\u00b5\3\2\2\2 \u00b7\3\2\2\2\"\u00c7\3\2\2\2$\u00c9\3\2\2\2"+
		"&\u00de\3\2\2\2(\u00ed\3\2\2\2*\u00ef\3\2\2\2,\u00f5\3\2\2\2.\u00fe\3"+
		"\2\2\2\60\u0102\3\2\2\2\62\u0108\3\2\2\2\64\u010e\3\2\2\2\66\u0114\3\2"+
		"\2\28\u011a\3\2\2\2:\u0127\3\2\2\2<\u0129\3\2\2\2>\u012f\3\2\2\2@\u0136"+
		"\3\2\2\2B\u014c\3\2\2\2D\u014e\3\2\2\2F\u0150\3\2\2\2H\u0182\3\2\2\2J"+
		"\u01af\3\2\2\2L\u01b1\3\2\2\2N\u01b3\3\2\2\2PQ\5\4\3\2QR\7\2\2\3R\3\3"+
		"\2\2\2ST\5\6\4\2T\5\3\2\2\2UW\5\20\t\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2X"+
		"Y\3\2\2\2Y^\3\2\2\2ZX\3\2\2\2[]\5&\24\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2"+
		"\2^_\3\2\2\2_d\3\2\2\2`^\3\2\2\2ac\5\b\5\2ba\3\2\2\2cf\3\2\2\2db\3\2\2"+
		"\2de\3\2\2\2e\7\3\2\2\2fd\3\2\2\2gh\7\6\2\2hi\5\n\6\2ij\7-\2\2jk\5\f\7"+
		"\2kl\7,\2\2l\t\3\2\2\2mn\5N(\2n\13\3\2\2\2oq\5\16\b\2po\3\2\2\2qt\3\2"+
		"\2\2rp\3\2\2\2rs\3\2\2\2sx\3\2\2\2tr\3\2\2\2uw\5\20\t\2vu\3\2\2\2wz\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2y\r\3\2\2\2zx\3\2\2\2{|\5\34\17\2|}\5@!\2}\17"+
		"\3\2\2\2~\177\5\22\n\2\177\u0080\5$\23\2\u0080\21\3\2\2\2\u0081\u0083"+
		"\5\34\17\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0085\7\5\2\2\u0085\u0086\5\26\f\2\u0086\u0088\7/\2\2\u0087\u0089"+
		"\5\24\13\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2"+
		"\u008a\u008b\7.\2\2\u008b\23\3\2\2\2\u008c\u0091\5\30\r\2\u008d\u008e"+
		"\7\3\2\2\u008e\u0090\5\30\r\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2"+
		"\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u00a5\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0094\u0099\5\30\r\2\u0095\u0096\7\3\2\2\u0096\u0098\5\32\16"+
		"\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u00a5\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a1\5\32\16\2"+
		"\u009d\u009e\7\3\2\2\u009e\u00a0\5\32\16\2\u009f\u009d\3\2\2\2\u00a0\u00a3"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u008c\3\2\2\2\u00a4\u0094\3\2\2\2\u00a4\u009c\3\2"+
		"\2\2\u00a5\25\3\2\2\2\u00a6\u00a7\7\66\2\2\u00a7\27\3\2\2\2\u00a8\u00a9"+
		"\5\34\17\2\u00a9\u00aa\7\66\2\2\u00aa\31\3\2\2\2\u00ab\u00ac\5\34\17\2"+
		"\u00ac\u00ad\7\66\2\2\u00ad\u00ae\7\23\2\2\u00ae\u00af\5H%\2\u00af\33"+
		"\3\2\2\2\u00b0\u00b4\5\36\20\2\u00b1\u00b4\5 \21\2\u00b2\u00b4\5\"\22"+
		"\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\35"+
		"\3\2\2\2\u00b5\u00b6\t\2\2\2\u00b6\37\3\2\2\2\u00b7\u00b8\5N(\2\u00b8"+
		"!\3\2\2\2\u00b9\u00bc\5\36\20\2\u00ba\u00bb\7+\2\2\u00bb\u00bd\7*\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c8\3\2\2\2\u00c0\u00c3\5 \21\2\u00c1\u00c2\7+\2\2\u00c2"+
		"\u00c4\7*\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00b9\3\2\2\2\u00c7"+
		"\u00c0\3\2\2\2\u00c8#\3\2\2\2\u00c9\u00cd\7-\2\2\u00ca\u00cc\5&\24\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7,\2\2\u00d1"+
		"%\3\2\2\2\u00d2\u00df\5$\23\2\u00d3\u00df\5(\25\2\u00d4\u00df\5.\30\2"+
		"\u00d5\u00df\5\60\31\2\u00d6\u00df\5\62\32\2\u00d7\u00df\5\64\33\2\u00d8"+
		"\u00df\5<\37\2\u00d9\u00df\5:\36\2\u00da\u00df\58\35\2\u00db\u00df\5\66"+
		"\34\2\u00dc\u00df\5L\'\2\u00dd\u00df\5H%\2\u00de\u00d2\3\2\2\2\u00de\u00d3"+
		"\3\2\2\2\u00de\u00d4\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d6\3\2\2\2\u00de"+
		"\u00d7\3\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00d9\3\2\2\2\u00de\u00da\3\2"+
		"\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\'\3\2\2\2\u00e0\u00e2\5\34\17\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2"+
		"\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5@!\2\u00e4\u00e5\7\23\2\2\u00e5\u00e6"+
		"\5H%\2\u00e6\u00e7\7\60\2\2\u00e7\u00ee\3\2\2\2\u00e8\u00e9\5\34\17\2"+
		"\u00e9\u00ea\5@!\2\u00ea\u00eb\7\60\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee"+
		"\5*\26\2\u00ed\u00e1\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		")\3\2\2\2\u00ef\u00f0\5\"\22\2\u00f0\u00f1\5@!\2\u00f1\u00f2\7\23\2\2"+
		"\u00f2\u00f3\5,\27\2\u00f3\u00f4\7\60\2\2\u00f4+\3\2\2\2\u00f5\u00f9\7"+
		"+\2\2\u00f6\u00f8\5L\'\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc\u00fd\7*\2\2\u00fd-\3\2\2\2\u00fe\u00ff\5@!\2\u00ff\u0100\7"+
		"\23\2\2\u0100\u0101\5H%\2\u0101/\3\2\2\2\u0102\u0103\7\7\2\2\u0103\u0104"+
		"\7/\2\2\u0104\u0105\5H%\2\u0105\u0106\7.\2\2\u0106\u0107\7\60\2\2\u0107"+
		"\61\3\2\2\2\u0108\u0109\7\b\2\2\u0109\u010a\7/\2\2\u010a\u010b\5H%\2\u010b"+
		"\u010c\7.\2\2\u010c\u010d\7\60\2\2\u010d\63\3\2\2\2\u010e\u010f\7\t\2"+
		"\2\u010f\u0110\7/\2\2\u0110\u0111\5H%\2\u0111\u0112\7.\2\2\u0112\u0113"+
		"\7\60\2\2\u0113\65\3\2\2\2\u0114\u0115\7\22\2\2\u0115\u0116\7\60\2\2\u0116"+
		"\67\3\2\2\2\u0117\u0118\7\13\2\2\u0118\u011b\5H%\2\u0119\u011b\7\13\2"+
		"\2\u011a\u0117\3\2\2\2\u011a\u0119\3\2\2\2\u011b9\3\2\2\2\u011c\u011d"+
		"\5H%\2\u011d\u011e\7\61\2\2\u011e\u011f\5&\24\2\u011f\u0128\3\2\2\2\u0120"+
		"\u0121\5$\23\2\u0121\u0125\7\60\2\2\u0122\u0123\7\f\2\2\u0123\u0126\5"+
		"&\24\2\u0124\u0126\5$\23\2\u0125\u0122\3\2\2\2\u0125\u0124\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u011c\3\2\2\2\u0127\u0120\3\2"+
		"\2\2\u0128;\3\2\2\2\u0129\u012a\7\n\2\2\u012a\u012d\5> \2\u012b\u012e"+
		"\5&\24\2\u012c\u012e\5$\23\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e"+
		"=\3\2\2\2\u012f\u0130\5J&\2\u0130\u0131\7/\2\2\u0131\u0132\5H%\2\u0132"+
		"\u0133\7\r\2\2\u0133\u0134\5H%\2\u0134\u0135\7.\2\2\u0135?\3\2\2\2\u0136"+
		"\u0137\7\66\2\2\u0137A\3\2\2\2\u0138\u013a\5D#\2\u0139\u0138\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013f\3\2\2\2\u013b\u013c\7\3\2\2\u013c\u013e\5D"+
		"#\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u014d\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\5F"+
		"$\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0149\3\2\2\2\u0145"+
		"\u0146\7\3\2\2\u0146\u0148\5F$\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2"+
		"\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u0139\3\2\2\2\u014c\u0143\3\2\2\2\u014dC\3\2\2\2\u014e"+
		"\u014f\5H%\2\u014fE\3\2\2\2\u0150\u0151\5@!\2\u0151\u0152\7\62\2\2\u0152"+
		"\u0153\5H%\2\u0153G\3\2\2\2\u0154\u0155\b%\1\2\u0155\u0183\5J&\2\u0156"+
		"\u0157\5\26\f\2\u0157\u0158\7/\2\2\u0158\u0159\5B\"\2\u0159\u015a\7.\2"+
		"\2\u015a\u015b\7\60\2\2\u015b\u0183\3\2\2\2\u015c\u015d\7\16\2\2\u015d"+
		"\u015e\7/\2\2\u015e\u015f\5B\"\2\u015f\u0160\7.\2\2\u0160\u0161\7\60\2"+
		"\2\u0161\u0183\3\2\2\2\u0162\u0163\7\17\2\2\u0163\u0164\5\n\6\2\u0164"+
		"\u0165\7/\2\2\u0165\u0166\5B\"\2\u0166\u0167\7.\2\2\u0167\u0168\7\60\2"+
		"\2\u0168\u0183\3\2\2\2\u0169\u0183\5L\'\2\u016a\u016b\7/\2\2\u016b\u016c"+
		"\5H%\2\u016c\u016d\7\26\2\2\u016d\u016e\5H%\2\u016e\u016f\7.\2\2\u016f"+
		"\u0183\3\2\2\2\u0170\u0171\7/\2\2\u0171\u0172\5H%\2\u0172\u0173\7\27\2"+
		"\2\u0173\u0174\5H%\2\u0174\u0175\7.\2\2\u0175\u0183\3\2\2\2\u0176\u0177"+
		"\7/\2\2\u0177\u0178\5H%\2\u0178\u0179\7\24\2\2\u0179\u017a\5H%\2\u017a"+
		"\u017b\7.\2\2\u017b\u0183\3\2\2\2\u017c\u017d\7/\2\2\u017d\u017e\5H%\2"+
		"\u017e\u017f\7\25\2\2\u017f\u0180\5H%\2\u0180\u0181\7.\2\2\u0181\u0183"+
		"\3\2\2\2\u0182\u0154\3\2\2\2\u0182\u0156\3\2\2\2\u0182\u015c\3\2\2\2\u0182"+
		"\u0162\3\2\2\2\u0182\u0169\3\2\2\2\u0182\u016a\3\2\2\2\u0182\u0170\3\2"+
		"\2\2\u0182\u0176\3\2\2\2\u0182\u017c\3\2\2\2\u0183\u01ac\3\2\2\2\u0184"+
		"\u0185\f\17\2\2\u0185\u0186\7\26\2\2\u0186\u01ab\5H%\20\u0187\u0188\f"+
		"\r\2\2\u0188\u0189\7\27\2\2\u0189\u01ab\5H%\16\u018a\u018b\f\13\2\2\u018b"+
		"\u018c\7\24\2\2\u018c\u01ab\5H%\f\u018d\u018e\f\t\2\2\u018e\u018f\7\25"+
		"\2\2\u018f\u01ab\5H%\n\u0190\u0191\f\b\2\2\u0191\u0192\7#\2\2\u0192\u01ab"+
		"\5H%\t\u0193\u0194\f\7\2\2\u0194\u0195\7$\2\2\u0195\u01ab\5H%\b\u0196"+
		"\u0197\f\6\2\2\u0197\u0198\7\"\2\2\u0198\u01ab\5H%\7\u0199\u019a\f\5\2"+
		"\2\u019a\u019b\7\'\2\2\u019b\u01ab\5H%\6\u019c\u019d\f\4\2\2\u019d\u019e"+
		"\7%\2\2\u019e\u01ab\5H%\5\u019f\u01a0\f\3\2\2\u01a0\u01a1\7&\2\2\u01a1"+
		"\u01ab\5H%\4\u01a2\u01a3\f\25\2\2\u01a3\u01a4\7\4\2\2\u01a4\u01a5\5\26"+
		"\f\2\u01a5\u01a6\7/\2\2\u01a6\u01a7\5B\"\2\u01a7\u01a8\7.\2\2\u01a8\u01a9"+
		"\7\60\2\2\u01a9\u01ab\3\2\2\2\u01aa\u0184\3\2\2\2\u01aa\u0187\3\2\2\2"+
		"\u01aa\u018a\3\2\2\2\u01aa\u018d\3\2\2\2\u01aa\u0190\3\2\2\2\u01aa\u0193"+
		"\3\2\2\2\u01aa\u0196\3\2\2\2\u01aa\u0199\3\2\2\2\u01aa\u019c\3\2\2\2\u01aa"+
		"\u019f\3\2\2\2\u01aa\u01a2\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2"+
		"\2\2\u01ac\u01ad\3\2\2\2\u01adI\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0"+
		"\7\66\2\2\u01b0K\3\2\2\2\u01b1\u01b2\t\3\2\2\u01b2M\3\2\2\2\u01b3\u01b8"+
		"\7\66\2\2\u01b4\u01b5\7\4\2\2\u01b5\u01b7\7\66\2\2\u01b6\u01b4\3\2\2\2"+
		"\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9O\3"+
		"\2\2\2\u01ba\u01b8\3\2\2\2#X^drx\u0082\u0088\u0091\u0099\u00a1\u00a4\u00b3"+
		"\u00be\u00c5\u00c7\u00cd\u00de\u00e1\u00ed\u00f9\u011a\u0125\u0127\u012d"+
		"\u0139\u013f\u0143\u0149\u014c\u0182\u01aa\u01ac\u01b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}