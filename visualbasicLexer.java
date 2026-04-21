// Generated from visualbasic.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class visualbasicLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SUB=9, 
		FUNCTION=10, DIM=11, AS=12, END=13, IF=14, THEN=15, ELSE=16, RETURN=17, 
		INTEGER=18, STRINGTYPE=19, BOOLEANTYPE=20, DOUBLETYPE=21, BOOLEAN=22, 
		STRING=23, NUMBER=24, ID=25, NEWLINE=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "SUB", 
			"FUNCTION", "DIM", "AS", "END", "IF", "THEN", "ELSE", "RETURN", "INTEGER", 
			"STRINGTYPE", "BOOLEANTYPE", "DOUBLETYPE", "BOOLEAN", "STRING", "NUMBER", 
			"ID", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "','", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "SUB", "FUNCTION", 
			"DIM", "AS", "END", "IF", "THEN", "ELSE", "RETURN", "INTEGER", "STRINGTYPE", 
			"BOOLEANTYPE", "DOUBLETYPE", "BOOLEAN", "STRING", "NUMBER", "ID", "NEWLINE", 
			"WS"
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


	public visualbasicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "visualbasic.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u009d\n\27\3\30\3\30\7\30\u00a1\n\30\f\30\16\30\u00a4"+
		"\13\30\3\30\3\30\3\31\6\31\u00a9\n\31\r\31\16\31\u00aa\3\32\3\32\7\32"+
		"\u00af\n\32\f\32\16\32\u00b2\13\32\3\33\5\33\u00b5\n\33\3\33\3\33\3\34"+
		"\6\34\u00ba\n\34\r\34\16\34\u00bb\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\30\4\2UUuu\4\2WWww\4\2"+
		"DDdd\4\2HHhh\4\2PPpp\4\2EEee\4\2VVvv\4\2KKkk\4\2QQqq\4\2FFff\4\2OOoo\4"+
		"\2CCcc\4\2GGgg\4\2JJjj\4\2NNnn\4\2TTtt\4\2IIii\5\2\f\f\17\17$$\3\2\62"+
		";\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\2\u00c4\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3"+
		"\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25M"+
		"\3\2\2\2\27V\3\2\2\2\31Z\3\2\2\2\33]\3\2\2\2\35a\3\2\2\2\37d\3\2\2\2!"+
		"i\3\2\2\2#n\3\2\2\2%u\3\2\2\2\'}\3\2\2\2)\u0084\3\2\2\2+\u008c\3\2\2\2"+
		"-\u009c\3\2\2\2/\u009e\3\2\2\2\61\u00a8\3\2\2\2\63\u00ac\3\2\2\2\65\u00b4"+
		"\3\2\2\2\67\u00b9\3\2\2\29:\7*\2\2:\4\3\2\2\2;<\7+\2\2<\6\3\2\2\2=>\7"+
		"?\2\2>\b\3\2\2\2?@\7.\2\2@\n\3\2\2\2AB\7-\2\2B\f\3\2\2\2CD\7/\2\2D\16"+
		"\3\2\2\2EF\7,\2\2F\20\3\2\2\2GH\7\61\2\2H\22\3\2\2\2IJ\t\2\2\2JK\t\3\2"+
		"\2KL\t\4\2\2L\24\3\2\2\2MN\t\5\2\2NO\t\3\2\2OP\t\6\2\2PQ\t\7\2\2QR\t\b"+
		"\2\2RS\t\t\2\2ST\t\n\2\2TU\t\6\2\2U\26\3\2\2\2VW\t\13\2\2WX\t\t\2\2XY"+
		"\t\f\2\2Y\30\3\2\2\2Z[\t\r\2\2[\\\t\2\2\2\\\32\3\2\2\2]^\t\16\2\2^_\t"+
		"\6\2\2_`\t\13\2\2`\34\3\2\2\2ab\t\t\2\2bc\t\5\2\2c\36\3\2\2\2de\t\b\2"+
		"\2ef\t\17\2\2fg\t\16\2\2gh\t\6\2\2h \3\2\2\2ij\t\16\2\2jk\t\20\2\2kl\t"+
		"\2\2\2lm\t\16\2\2m\"\3\2\2\2no\t\21\2\2op\t\16\2\2pq\t\b\2\2qr\t\3\2\2"+
		"rs\t\21\2\2st\t\6\2\2t$\3\2\2\2uv\t\t\2\2vw\t\6\2\2wx\t\b\2\2xy\t\16\2"+
		"\2yz\t\22\2\2z{\t\16\2\2{|\t\21\2\2|&\3\2\2\2}~\t\2\2\2~\177\t\b\2\2\177"+
		"\u0080\t\21\2\2\u0080\u0081\t\t\2\2\u0081\u0082\t\6\2\2\u0082\u0083\t"+
		"\22\2\2\u0083(\3\2\2\2\u0084\u0085\t\4\2\2\u0085\u0086\t\n\2\2\u0086\u0087"+
		"\t\n\2\2\u0087\u0088\t\20\2\2\u0088\u0089\t\16\2\2\u0089\u008a\t\r\2\2"+
		"\u008a\u008b\t\6\2\2\u008b*\3\2\2\2\u008c\u008d\t\13\2\2\u008d\u008e\t"+
		"\n\2\2\u008e\u008f\t\3\2\2\u008f\u0090\t\4\2\2\u0090\u0091\t\20\2\2\u0091"+
		"\u0092\t\16\2\2\u0092,\3\2\2\2\u0093\u0094\t\b\2\2\u0094\u0095\t\21\2"+
		"\2\u0095\u0096\t\3\2\2\u0096\u009d\t\16\2\2\u0097\u0098\t\5\2\2\u0098"+
		"\u0099\t\r\2\2\u0099\u009a\t\20\2\2\u009a\u009b\t\2\2\2\u009b\u009d\t"+
		"\16\2\2\u009c\u0093\3\2\2\2\u009c\u0097\3\2\2\2\u009d.\3\2\2\2\u009e\u00a2"+
		"\7$\2\2\u009f\u00a1\n\23\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u00a6\7$\2\2\u00a6\60\3\2\2\2\u00a7\u00a9\t\24\2\2\u00a8\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\62\3\2\2\2\u00ac\u00b0\t\25\2\2\u00ad\u00af\t\26\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\64\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\7\17\2\2\u00b4\u00b3\3\2\2"+
		"\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\f\2\2\u00b7\66"+
		"\3\2\2\2\u00b8\u00ba\t\27\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be"+
		"\b\34\2\2\u00be8\3\2\2\2\t\2\u009c\u00a2\u00aa\u00b0\u00b4\u00bb\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}