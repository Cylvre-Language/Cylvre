package Cylvre.antlr.gen;// Generated from C:/Users/user/IdeaProjects/Cylvre/src\Cylvre.g4 by ANTLR 4.9.1
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
		T__0=1, T__1=2, FUNC=3, CLASS=4, PRINTLN=5, PRINT=6, FOR=7, RETURN=8, 
		ELSE=9, TO=10, SUPER=11, NEW=12, TRUE=13, FALSE=14, ASSIGN=15, PLUS=16, 
		MINUS=17, MULTIPLY=18, DIVIDE=19, STRING_KW=20, BYTE_KW=21, INT_KW=22, 
		LONG_KW=23, SHORT_KW=24, BOOL_KW=25, VOID_KW=26, CHAR_KW=27, FLOAT_KW=28, 
		DOUBLE_KW=29, EQUALS=30, GREATER_THAN=31, LESS_THAN=32, GREATER_OR_EQUALS=33, 
		LESS_OR_EQUALS=34, DIFFERENT=35, TILDE=36, DB_TILDE=37, RBOX=38, LBOX=39, 
		RCURLY=40, LCURLY=41, RPAREN=42, LPAREN=43, SEMICOLON=44, Q_MARK=45, ARROW=46, 
		NUMBER=47, BOOL=48, STRING=49, ID=50, WS=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "FUNC", "CLASS", "PRINTLN", "PRINT", "FOR", "RETURN", 
			"ELSE", "TO", "SUPER", "NEW", "TRUE", "FALSE", "ASSIGN", "PLUS", "MINUS", 
			"MULTIPLY", "DIVIDE", "STRING_KW", "BYTE_KW", "INT_KW", "LONG_KW", "SHORT_KW", 
			"BOOL_KW", "VOID_KW", "CHAR_KW", "FLOAT_KW", "DOUBLE_KW", "EQUALS", "GREATER_THAN", 
			"LESS_THAN", "GREATER_OR_EQUALS", "LESS_OR_EQUALS", "DIFFERENT", "TILDE", 
			"DB_TILDE", "RBOX", "LBOX", "RCURLY", "LCURLY", "RPAREN", "LPAREN", "SEMICOLON", 
			"Q_MARK", "ARROW", "NUMBER", "BOOL", "STRING", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", "'func'", "'class'", "'println'", "'print'", "'for'", 
			"'return'", "'else'", "'to'", "'super'", "'new'", "'true'", "'false'", 
			"':'", "'+'", "'-'", "'*'", "'/'", "'str'", "'byte'", "'int'", "'long'", 
			"'short'", "'bool'", "'void'", "'char'", "'float'", "'double'", "'='", 
			"'>'", "'<'", "'>='", "'<='", "'!='", "'~'", null, "']'", "'['", "'}'", 
			"'{'", "')'", "'('", "';'", "'?'", "'~>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "FUNC", "CLASS", "PRINTLN", "PRINT", "FOR", "RETURN", 
			"ELSE", "TO", "SUPER", "NEW", "TRUE", "FALSE", "ASSIGN", "PLUS", "MINUS", 
			"MULTIPLY", "DIVIDE", "STRING_KW", "BYTE_KW", "INT_KW", "LONG_KW", "SHORT_KW", 
			"BOOL_KW", "VOID_KW", "CHAR_KW", "FLOAT_KW", "DOUBLE_KW", "EQUALS", "GREATER_THAN", 
			"LESS_THAN", "GREATER_OR_EQUALS", "LESS_OR_EQUALS", "DIFFERENT", "TILDE", 
			"DB_TILDE", "RBOX", "LBOX", "RCURLY", "LCURLY", "RPAREN", "LPAREN", "SEMICOLON", 
			"Q_MARK", "ARROW", "NUMBER", "BOOL", "STRING", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0134\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*"+
		"\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\5\60\u0115\n\60\3\60\6\60\u0118"+
		"\n\60\r\60\16\60\u0119\3\61\3\61\5\61\u011e\n\61\3\62\3\62\7\62\u0122"+
		"\n\62\f\62\16\62\u0125\13\62\3\62\3\62\3\63\6\63\u012a\n\63\r\63\16\63"+
		"\u012b\3\64\6\64\u012f\n\64\r\64\16\64\u0130\3\64\3\64\2\2\65\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\6\4\2\60\60\62"+
		";\5\2\f\f\17\17$$\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0139\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\tr\3\2\2"+
		"\2\13x\3\2\2\2\r\u0080\3\2\2\2\17\u0086\3\2\2\2\21\u008a\3\2\2\2\23\u0091"+
		"\3\2\2\2\25\u0096\3\2\2\2\27\u0099\3\2\2\2\31\u009f\3\2\2\2\33\u00a3\3"+
		"\2\2\2\35\u00a8\3\2\2\2\37\u00ae\3\2\2\2!\u00b0\3\2\2\2#\u00b2\3\2\2\2"+
		"%\u00b4\3\2\2\2\'\u00b6\3\2\2\2)\u00b8\3\2\2\2+\u00bc\3\2\2\2-\u00c1\3"+
		"\2\2\2/\u00c5\3\2\2\2\61\u00ca\3\2\2\2\63\u00d0\3\2\2\2\65\u00d5\3\2\2"+
		"\2\67\u00da\3\2\2\29\u00df\3\2\2\2;\u00e5\3\2\2\2=\u00ec\3\2\2\2?\u00ee"+
		"\3\2\2\2A\u00f0\3\2\2\2C\u00f2\3\2\2\2E\u00f5\3\2\2\2G\u00f8\3\2\2\2I"+
		"\u00fb\3\2\2\2K\u00fd\3\2\2\2M\u0100\3\2\2\2O\u0102\3\2\2\2Q\u0104\3\2"+
		"\2\2S\u0106\3\2\2\2U\u0108\3\2\2\2W\u010a\3\2\2\2Y\u010c\3\2\2\2[\u010e"+
		"\3\2\2\2]\u0110\3\2\2\2_\u0114\3\2\2\2a\u011d\3\2\2\2c\u011f\3\2\2\2e"+
		"\u0129\3\2\2\2g\u012e\3\2\2\2ij\7.\2\2j\4\3\2\2\2kl\7\60\2\2l\6\3\2\2"+
		"\2mn\7h\2\2no\7w\2\2op\7p\2\2pq\7e\2\2q\b\3\2\2\2rs\7e\2\2st\7n\2\2tu"+
		"\7c\2\2uv\7u\2\2vw\7u\2\2w\n\3\2\2\2xy\7r\2\2yz\7t\2\2z{\7k\2\2{|\7p\2"+
		"\2|}\7v\2\2}~\7n\2\2~\177\7p\2\2\177\f\3\2\2\2\u0080\u0081\7r\2\2\u0081"+
		"\u0082\7t\2\2\u0082\u0083\7k\2\2\u0083\u0084\7p\2\2\u0084\u0085\7v\2\2"+
		"\u0085\16\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088\7q\2\2\u0088\u0089\7"+
		"t\2\2\u0089\20\3\2\2\2\u008a\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c\u008d"+
		"\7v\2\2\u008d\u008e\7w\2\2\u008e\u008f\7t\2\2\u008f\u0090\7p\2\2\u0090"+
		"\22\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094"+
		"\u0095\7g\2\2\u0095\24\3\2\2\2\u0096\u0097\7v\2\2\u0097\u0098\7q\2\2\u0098"+
		"\26\3\2\2\2\u0099\u009a\7u\2\2\u009a\u009b\7w\2\2\u009b\u009c\7r\2\2\u009c"+
		"\u009d\7g\2\2\u009d\u009e\7t\2\2\u009e\30\3\2\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\u00a2\7y\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7v\2\2\u00a4"+
		"\u00a5\7t\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7g\2\2\u00a7\34\3\2\2\2\u00a8"+
		"\u00a9\7h\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7u\2\2"+
		"\u00ac\u00ad\7g\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7<\2\2\u00af \3\2\2\2"+
		"\u00b0\u00b1\7-\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7/\2\2\u00b3$\3\2\2\2"+
		"\u00b4\u00b5\7,\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b7(\3\2\2\2"+
		"\u00b8\u00b9\7u\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7t\2\2\u00bb*\3\2\2"+
		"\2\u00bc\u00bd\7d\2\2\u00bd\u00be\7{\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0"+
		"\7g\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4"+
		"\7v\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8"+
		"\7p\2\2\u00c8\u00c9\7i\2\2\u00c9\60\3\2\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc"+
		"\7j\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"\62\3\2\2\2\u00d0\u00d1\7d\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7n\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7x\2\2\u00d6\u00d7\7q\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7f\2\2\u00d9\66\3\2\2\2\u00da\u00db\7e\2\2\u00db"+
		"\u00dc\7j\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7t\2\2\u00de8\3\2\2\2\u00df"+
		"\u00e0\7h\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7c\2\2"+
		"\u00e3\u00e4\7v\2\2\u00e4:\3\2\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7q\2"+
		"\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7d\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb"+
		"\7g\2\2\u00eb<\3\2\2\2\u00ec\u00ed\7?\2\2\u00ed>\3\2\2\2\u00ee\u00ef\7"+
		"@\2\2\u00ef@\3\2\2\2\u00f0\u00f1\7>\2\2\u00f1B\3\2\2\2\u00f2\u00f3\7@"+
		"\2\2\u00f3\u00f4\7?\2\2\u00f4D\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6\u00f7"+
		"\7?\2\2\u00f7F\3\2\2\2\u00f8\u00f9\7#\2\2\u00f9\u00fa\7?\2\2\u00faH\3"+
		"\2\2\2\u00fb\u00fc\7\u0080\2\2\u00fcJ\3\2\2\2\u00fd\u00fe\5I%\2\u00fe"+
		"\u00ff\5I%\2\u00ffL\3\2\2\2\u0100\u0101\7_\2\2\u0101N\3\2\2\2\u0102\u0103"+
		"\7]\2\2\u0103P\3\2\2\2\u0104\u0105\7\177\2\2\u0105R\3\2\2\2\u0106\u0107"+
		"\7}\2\2\u0107T\3\2\2\2\u0108\u0109\7+\2\2\u0109V\3\2\2\2\u010a\u010b\7"+
		"*\2\2\u010bX\3\2\2\2\u010c\u010d\7=\2\2\u010dZ\3\2\2\2\u010e\u010f\7A"+
		"\2\2\u010f\\\3\2\2\2\u0110\u0111\7\u0080\2\2\u0111\u0112\7@\2\2\u0112"+
		"^\3\2\2\2\u0113\u0115\7/\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0118\t\2\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a`\3\2\2\2\u011b\u011e"+
		"\5\33\16\2\u011c\u011e\5\35\17\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2"+
		"\2\u011eb\3\2\2\2\u011f\u0123\7$\2\2\u0120\u0122\n\3\2\2\u0121\u0120\3"+
		"\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7$\2\2\u0127d\3\2\2\2\u0128"+
		"\u012a\t\4\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012cf\3\2\2\2\u012d\u012f\t\5\2\2\u012e\u012d"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0133\b\64\2\2\u0133h\3\2\2\2\t\2\u0114\u0119\u011d"+
		"\u0123\u012b\u0130\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}