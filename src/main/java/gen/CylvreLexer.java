package gen;// Generated from C:/Users/user/IdeaProjects/Cylvre/src\Cylvre.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CylvreLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "FUNC", "CLASS", "PRINTLN", "PRINT", "PRINT_ERR", "FOR", 
			"RETURN", "ELSE", "TO", "SUPER", "NEW", "TRUE", "FALSE", "SCANNER", "ASSIGN", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "STRING_KW", "BYTE_KW", "INT_KW", 
			"LONG_KW", "SHORT_KW", "BOOL_KW", "VOID_KW", "CHAR_KW", "FLOAT_KW", "DOUBLE_KW", 
			"EQUALS", "GREATER_THAN", "LESS_THAN", "GREATER_OR_EQUALS", "LESS_OR_EQUALS", 
			"DIFFERENT", "TILDE", "DB_TILDE", "RBOX", "LBOX", "RCURLY", "LCURLY", 
			"RPAREN", "LPAREN", "SEMICOLON", "Q_MARK", "ARROW", "NUMBER", "BOOL", 
			"STRING", "ID", "WS"
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


	public CylvreLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cylvre.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u014a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\5"+
		"\62\u012b\n\62\3\62\6\62\u012e\n\62\r\62\16\62\u012f\3\63\3\63\5\63\u0134"+
		"\n\63\3\64\3\64\7\64\u0138\n\64\f\64\16\64\u013b\13\64\3\64\3\64\3\65"+
		"\6\65\u0140\n\65\r\65\16\65\u0141\3\66\6\66\u0145\n\66\r\66\16\66\u0146"+
		"\3\66\3\66\2\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67\3\2\6\4\2\60\60\62;\5\2\f\f\17\17$$\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\2\u014f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\tv\3\2\2\2\13|\3\2\2\2\r"+
		"\u0084\3\2\2\2\17\u008a\3\2\2\2\21\u0094\3\2\2\2\23\u0098\3\2\2\2\25\u009f"+
		"\3\2\2\2\27\u00a4\3\2\2\2\31\u00a7\3\2\2\2\33\u00ad\3\2\2\2\35\u00b1\3"+
		"\2\2\2\37\u00b6\3\2\2\2!\u00bc\3\2\2\2#\u00c4\3\2\2\2%\u00c6\3\2\2\2\'"+
		"\u00c8\3\2\2\2)\u00ca\3\2\2\2+\u00cc\3\2\2\2-\u00ce\3\2\2\2/\u00d2\3\2"+
		"\2\2\61\u00d7\3\2\2\2\63\u00db\3\2\2\2\65\u00e0\3\2\2\2\67\u00e6\3\2\2"+
		"\29\u00eb\3\2\2\2;\u00f0\3\2\2\2=\u00f5\3\2\2\2?\u00fb\3\2\2\2A\u0102"+
		"\3\2\2\2C\u0104\3\2\2\2E\u0106\3\2\2\2G\u0108\3\2\2\2I\u010b\3\2\2\2K"+
		"\u010e\3\2\2\2M\u0111\3\2\2\2O\u0113\3\2\2\2Q\u0116\3\2\2\2S\u0118\3\2"+
		"\2\2U\u011a\3\2\2\2W\u011c\3\2\2\2Y\u011e\3\2\2\2[\u0120\3\2\2\2]\u0122"+
		"\3\2\2\2_\u0124\3\2\2\2a\u0126\3\2\2\2c\u012a\3\2\2\2e\u0133\3\2\2\2g"+
		"\u0135\3\2\2\2i\u013f\3\2\2\2k\u0144\3\2\2\2mn\7.\2\2n\4\3\2\2\2op\7\60"+
		"\2\2p\6\3\2\2\2qr\7h\2\2rs\7w\2\2st\7p\2\2tu\7e\2\2u\b\3\2\2\2vw\7e\2"+
		"\2wx\7n\2\2xy\7c\2\2yz\7u\2\2z{\7u\2\2{\n\3\2\2\2|}\7r\2\2}~\7t\2\2~\177"+
		"\7k\2\2\177\u0080\7p\2\2\u0080\u0081\7v\2\2\u0081\u0082\7n\2\2\u0082\u0083"+
		"\7p\2\2\u0083\f\3\2\2\2\u0084\u0085\7r\2\2\u0085\u0086\7t\2\2\u0086\u0087"+
		"\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089\7v\2\2\u0089\16\3\2\2\2\u008a\u008b"+
		"\7r\2\2\u008b\u008c\7t\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e"+
		"\u008f\7v\2\2\u008f\u0090\7a\2\2\u0090\u0091\7g\2\2\u0091\u0092\7t\2\2"+
		"\u0092\u0093\7t\2\2\u0093\20\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7"+
		"q\2\2\u0096\u0097\7t\2\2\u0097\22\3\2\2\2\u0098\u0099\7t\2\2\u0099\u009a"+
		"\7g\2\2\u009a\u009b\7v\2\2\u009b\u009c\7w\2\2\u009c\u009d\7t\2\2\u009d"+
		"\u009e\7p\2\2\u009e\24\3\2\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7n\2\2\u00a1"+
		"\u00a2\7u\2\2\u00a2\u00a3\7g\2\2\u00a3\26\3\2\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"\u00a6\7q\2\2\u00a6\30\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7w\2\2\u00a9"+
		"\u00aa\7r\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7t\2\2\u00ac\32\3\2\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7y\2\2\u00b0\34\3\2\2\2\u00b1"+
		"\u00b2\7v\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7g\2\2"+
		"\u00b5\36\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7"+
		"n\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7g\2\2\u00bb \3\2\2\2\u00bc\u00bd"+
		"\7u\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		"\u00c1\7p\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7t\2\2\u00c3\"\3\2\2\2\u00c4"+
		"\u00c5\7<\2\2\u00c5$\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7&\3\2\2\2\u00c8\u00c9"+
		"\7/\2\2\u00c9(\3\2\2\2\u00ca\u00cb\7,\2\2\u00cb*\3\2\2\2\u00cc\u00cd\7"+
		"\61\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1"+
		"\7t\2\2\u00d1.\3\2\2\2\u00d2\u00d3\7d\2\2\u00d3\u00d4\7{\2\2\u00d4\u00d5"+
		"\7v\2\2\u00d5\u00d6\7g\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9"+
		"\7p\2\2\u00d9\u00da\7v\2\2\u00da\62\3\2\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd"+
		"\7q\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7i\2\2\u00df\64\3\2\2\2\u00e0\u00e1"+
		"\7u\2\2\u00e1\u00e2\7j\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7t\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\66\3\2\2\2\u00e6\u00e7\7d\2\2\u00e7\u00e8\7q\2\2\u00e8"+
		"\u00e9\7q\2\2\u00e9\u00ea\7n\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7x\2\2\u00ec"+
		"\u00ed\7q\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7f\2\2\u00ef:\3\2\2\2\u00f0"+
		"\u00f1\7e\2\2\u00f1\u00f2\7j\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7t\2\2"+
		"\u00f4<\3\2\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7q\2"+
		"\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7v\2\2\u00fa>\3\2\2\2\u00fb\u00fc\7"+
		"f\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7d\2\2\u00ff\u0100"+
		"\7n\2\2\u0100\u0101\7g\2\2\u0101@\3\2\2\2\u0102\u0103\7?\2\2\u0103B\3"+
		"\2\2\2\u0104\u0105\7@\2\2\u0105D\3\2\2\2\u0106\u0107\7>\2\2\u0107F\3\2"+
		"\2\2\u0108\u0109\7@\2\2\u0109\u010a\7?\2\2\u010aH\3\2\2\2\u010b\u010c"+
		"\7>\2\2\u010c\u010d\7?\2\2\u010dJ\3\2\2\2\u010e\u010f\7#\2\2\u010f\u0110"+
		"\7?\2\2\u0110L\3\2\2\2\u0111\u0112\7\u0080\2\2\u0112N\3\2\2\2\u0113\u0114"+
		"\5M\'\2\u0114\u0115\5M\'\2\u0115P\3\2\2\2\u0116\u0117\7_\2\2\u0117R\3"+
		"\2\2\2\u0118\u0119\7]\2\2\u0119T\3\2\2\2\u011a\u011b\7\177\2\2\u011bV"+
		"\3\2\2\2\u011c\u011d\7}\2\2\u011dX\3\2\2\2\u011e\u011f\7+\2\2\u011fZ\3"+
		"\2\2\2\u0120\u0121\7*\2\2\u0121\\\3\2\2\2\u0122\u0123\7=\2\2\u0123^\3"+
		"\2\2\2\u0124\u0125\7A\2\2\u0125`\3\2\2\2\u0126\u0127\7\u0080\2\2\u0127"+
		"\u0128\7@\2\2\u0128b\3\2\2\2\u0129\u012b\7/\2\2\u012a\u0129\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012e\t\2\2\2\u012d\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"d\3\2\2\2\u0131\u0134\5\35\17\2\u0132\u0134\5\37\20\2\u0133\u0131\3\2"+
		"\2\2\u0133\u0132\3\2\2\2\u0134f\3\2\2\2\u0135\u0139\7$\2\2\u0136\u0138"+
		"\n\3\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7$"+
		"\2\2\u013dh\3\2\2\2\u013e\u0140\t\4\2\2\u013f\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142j\3\2\2\2\u0143"+
		"\u0145\t\5\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\b\66\2\2\u0149"+
		"l\3\2\2\2\t\2\u012a\u012f\u0133\u0139\u0141\u0146\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}