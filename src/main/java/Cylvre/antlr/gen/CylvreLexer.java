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
		T__0=1, T__1=2, FUNC=3, CLASS=4, PRINTLN=5, PRINT=6, PRINT_ERR=7, FOR=8, 
		RETURN=9, ELSE=10, TO=11, SUPER=12, NEW=13, TRUE=14, FALSE=15, ASSIGN=16, 
		PLUS=17, MINUS=18, MULTIPLY=19, DIVIDE=20, STRING_KW=21, BYTE_KW=22, INT_KW=23, 
		LONG_KW=24, SHORT_KW=25, BOOL_KW=26, VOID_KW=27, CHAR_KW=28, FLOAT_KW=29, 
		DOUBLE_KW=30, EQUALS=31, GREATER_THAN=32, LESS_THAN=33, GREATER_OR_EQUALS=34, 
		LESS_OR_EQUALS=35, DIFFERENT=36, TILDE=37, DB_TILDE=38, RBOX=39, LBOX=40, 
		RCURLY=41, LCURLY=42, RPAREN=43, LPAREN=44, SEMICOLON=45, Q_MARK=46, ARROW=47, 
		NUMBER=48, BOOL=49, STRING=50, ID=51, WS=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "FUNC", "CLASS", "PRINTLN", "PRINT", "PRINT_ERR", "FOR", 
			"RETURN", "ELSE", "TO", "SUPER", "NEW", "TRUE", "FALSE", "ASSIGN", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "STRING_KW", "BYTE_KW", "INT_KW", "LONG_KW", 
			"SHORT_KW", "BOOL_KW", "VOID_KW", "CHAR_KW", "FLOAT_KW", "DOUBLE_KW", 
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
			"'false'", "':'", "'+'", "'-'", "'*'", "'/'", "'str'", "'byte'", "'int'", 
			"'long'", "'short'", "'bool'", "'void'", "'char'", "'float'", "'double'", 
			"'='", "'>'", "'<'", "'>='", "'<='", "'!='", "'~'", null, "']'", "'['", 
			"'}'", "'{'", "')'", "'('", "';'", "'?'", "'~>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "FUNC", "CLASS", "PRINTLN", "PRINT", "PRINT_ERR", "FOR", 
			"RETURN", "ELSE", "TO", "SUPER", "NEW", "TRUE", "FALSE", "ASSIGN", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "STRING_KW", "BYTE_KW", "INT_KW", "LONG_KW", 
			"SHORT_KW", "BOOL_KW", "VOID_KW", "CHAR_KW", "FLOAT_KW", "DOUBLE_KW", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0140\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\60\3\61\5\61\u0121\n\61\3\61\6\61\u0124\n\61\r\61"+
		"\16\61\u0125\3\62\3\62\5\62\u012a\n\62\3\63\3\63\7\63\u012e\n\63\f\63"+
		"\16\63\u0131\13\63\3\63\3\63\3\64\6\64\u0136\n\64\r\64\16\64\u0137\3\65"+
		"\6\65\u013b\n\65\r\65\16\65\u013c\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66\3\2\6\4\2\60\60\62;\5\2\f"+
		"\f\17\17$$\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0145\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tt\3"+
		"\2\2\2\13z\3\2\2\2\r\u0082\3\2\2\2\17\u0088\3\2\2\2\21\u0092\3\2\2\2\23"+
		"\u0096\3\2\2\2\25\u009d\3\2\2\2\27\u00a2\3\2\2\2\31\u00a5\3\2\2\2\33\u00ab"+
		"\3\2\2\2\35\u00af\3\2\2\2\37\u00b4\3\2\2\2!\u00ba\3\2\2\2#\u00bc\3\2\2"+
		"\2%\u00be\3\2\2\2\'\u00c0\3\2\2\2)\u00c2\3\2\2\2+\u00c4\3\2\2\2-\u00c8"+
		"\3\2\2\2/\u00cd\3\2\2\2\61\u00d1\3\2\2\2\63\u00d6\3\2\2\2\65\u00dc\3\2"+
		"\2\2\67\u00e1\3\2\2\29\u00e6\3\2\2\2;\u00eb\3\2\2\2=\u00f1\3\2\2\2?\u00f8"+
		"\3\2\2\2A\u00fa\3\2\2\2C\u00fc\3\2\2\2E\u00fe\3\2\2\2G\u0101\3\2\2\2I"+
		"\u0104\3\2\2\2K\u0107\3\2\2\2M\u0109\3\2\2\2O\u010c\3\2\2\2Q\u010e\3\2"+
		"\2\2S\u0110\3\2\2\2U\u0112\3\2\2\2W\u0114\3\2\2\2Y\u0116\3\2\2\2[\u0118"+
		"\3\2\2\2]\u011a\3\2\2\2_\u011c\3\2\2\2a\u0120\3\2\2\2c\u0129\3\2\2\2e"+
		"\u012b\3\2\2\2g\u0135\3\2\2\2i\u013a\3\2\2\2kl\7.\2\2l\4\3\2\2\2mn\7\60"+
		"\2\2n\6\3\2\2\2op\7h\2\2pq\7w\2\2qr\7p\2\2rs\7e\2\2s\b\3\2\2\2tu\7e\2"+
		"\2uv\7n\2\2vw\7c\2\2wx\7u\2\2xy\7u\2\2y\n\3\2\2\2z{\7r\2\2{|\7t\2\2|}"+
		"\7k\2\2}~\7p\2\2~\177\7v\2\2\177\u0080\7n\2\2\u0080\u0081\7p\2\2\u0081"+
		"\f\3\2\2\2\u0082\u0083\7r\2\2\u0083\u0084\7t\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7p\2\2\u0086\u0087\7v\2\2\u0087\16\3\2\2\2\u0088\u0089\7r\2\2\u0089"+
		"\u008a\7t\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c\u008d\7v\2\2"+
		"\u008d\u008e\7a\2\2\u008e\u008f\7g\2\2\u008f\u0090\7t\2\2\u0090\u0091"+
		"\7t\2\2\u0091\20\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\7q\2\2\u0094\u0095"+
		"\7t\2\2\u0095\22\3\2\2\2\u0096\u0097\7t\2\2\u0097\u0098\7g\2\2\u0098\u0099"+
		"\7v\2\2\u0099\u009a\7w\2\2\u009a\u009b\7t\2\2\u009b\u009c\7p\2\2\u009c"+
		"\24\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7q\2\2\u00a4"+
		"\30\3\2\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7r\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7t\2\2\u00aa\32\3\2\2\2\u00ab\u00ac\7p\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\u00ae\7y\2\2\u00ae\34\3\2\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7g\2\2\u00b3\36\3\2\2\2\u00b4"+
		"\u00b5\7h\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7u\2\2"+
		"\u00b8\u00b9\7g\2\2\u00b9 \3\2\2\2\u00ba\u00bb\7<\2\2\u00bb\"\3\2\2\2"+
		"\u00bc\u00bd\7-\2\2\u00bd$\3\2\2\2\u00be\u00bf\7/\2\2\u00bf&\3\2\2\2\u00c0"+
		"\u00c1\7,\2\2\u00c1(\3\2\2\2\u00c2\u00c3\7\61\2\2\u00c3*\3\2\2\2\u00c4"+
		"\u00c5\7u\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7t\2\2\u00c7,\3\2\2\2\u00c8"+
		"\u00c9\7d\2\2\u00c9\u00ca\7{\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7g\2\2"+
		"\u00cc.\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7v\2"+
		"\2\u00d0\60\3\2\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4"+
		"\7p\2\2\u00d4\u00d5\7i\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8"+
		"\7j\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7v\2\2\u00db"+
		"\64\3\2\2\2\u00dc\u00dd\7d\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7q\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\66\3\2\2\2\u00e1\u00e2\7x\2\2\u00e2\u00e3\7q\2\2\u00e3"+
		"\u00e4\7k\2\2\u00e4\u00e5\7f\2\2\u00e58\3\2\2\2\u00e6\u00e7\7e\2\2\u00e7"+
		"\u00e8\7j\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7t\2\2\u00ea:\3\2\2\2\u00eb"+
		"\u00ec\7h\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7c\2\2"+
		"\u00ef\u00f0\7v\2\2\u00f0<\3\2\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7q\2"+
		"\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7d\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7"+
		"\7g\2\2\u00f7>\3\2\2\2\u00f8\u00f9\7?\2\2\u00f9@\3\2\2\2\u00fa\u00fb\7"+
		"@\2\2\u00fbB\3\2\2\2\u00fc\u00fd\7>\2\2\u00fdD\3\2\2\2\u00fe\u00ff\7@"+
		"\2\2\u00ff\u0100\7?\2\2\u0100F\3\2\2\2\u0101\u0102\7>\2\2\u0102\u0103"+
		"\7?\2\2\u0103H\3\2\2\2\u0104\u0105\7#\2\2\u0105\u0106\7?\2\2\u0106J\3"+
		"\2\2\2\u0107\u0108\7\u0080\2\2\u0108L\3\2\2\2\u0109\u010a\5K&\2\u010a"+
		"\u010b\5K&\2\u010bN\3\2\2\2\u010c\u010d\7_\2\2\u010dP\3\2\2\2\u010e\u010f"+
		"\7]\2\2\u010fR\3\2\2\2\u0110\u0111\7\177\2\2\u0111T\3\2\2\2\u0112\u0113"+
		"\7}\2\2\u0113V\3\2\2\2\u0114\u0115\7+\2\2\u0115X\3\2\2\2\u0116\u0117\7"+
		"*\2\2\u0117Z\3\2\2\2\u0118\u0119\7=\2\2\u0119\\\3\2\2\2\u011a\u011b\7"+
		"A\2\2\u011b^\3\2\2\2\u011c\u011d\7\u0080\2\2\u011d\u011e\7@\2\2\u011e"+
		"`\3\2\2\2\u011f\u0121\7/\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u0124\t\2\2\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126b\3\2\2\2\u0127\u012a"+
		"\5\35\17\2\u0128\u012a\5\37\20\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2"+
		"\2\u012ad\3\2\2\2\u012b\u012f\7$\2\2\u012c\u012e\n\3\2\2\u012d\u012c\3"+
		"\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7$\2\2\u0133f\3\2\2\2\u0134"+
		"\u0136\t\4\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138h\3\2\2\2\u0139\u013b\t\5\2\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\b\65\2\2\u013fj\3\2\2\2\t\2\u0120\u0125\u0129"+
		"\u012f\u0137\u013c\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}