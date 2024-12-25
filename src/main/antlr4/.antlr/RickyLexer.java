// Generated from /Users/timbo/code/ricky/src/main/antlr4/Ricky.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RickyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, IDENTIFIER=12, NUMBER=13, WS=14, COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "IDENTIFIER", "NUMBER", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'def'", "'('", "')'", "','", "'{'", "'}'", "'+'", "'-'", 
			"'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"IDENTIFIER", "NUMBER", "WS", "COMMENT"
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


	public RickyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ricky.g4"; }

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
		"\u0004\u0000\u000f]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005"+
		"\u000b:\b\u000b\n\u000b\f\u000b=\t\u000b\u0001\f\u0004\f@\b\f\u000b\f"+
		"\f\fA\u0001\f\u0001\f\u0004\fF\b\f\u000b\f\f\fG\u0003\fJ\b\f\u0001\r\u0004"+
		"\rM\b\r\u000b\r\f\rN\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000eW\b\u000e\n\u000e\f\u000eZ\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0005\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"\n\n\r\rb\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000"+
		"\u0003!\u0001\u0000\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007\'"+
		"\u0001\u0000\u0000\u0000\t)\u0001\u0000\u0000\u0000\u000b+\u0001\u0000"+
		"\u0000\u0000\r-\u0001\u0000\u0000\u0000\u000f/\u0001\u0000\u0000\u0000"+
		"\u00111\u0001\u0000\u0000\u0000\u00133\u0001\u0000\u0000\u0000\u00155"+
		"\u0001\u0000\u0000\u0000\u00177\u0001\u0000\u0000\u0000\u0019?\u0001\u0000"+
		"\u0000\u0000\u001bL\u0001\u0000\u0000\u0000\u001dR\u0001\u0000\u0000\u0000"+
		"\u001f \u0005;\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005d\u0000"+
		"\u0000\"#\u0005e\u0000\u0000#$\u0005f\u0000\u0000$\u0004\u0001\u0000\u0000"+
		"\u0000%&\u0005(\u0000\u0000&\u0006\u0001\u0000\u0000\u0000\'(\u0005)\u0000"+
		"\u0000(\b\u0001\u0000\u0000\u0000)*\u0005,\u0000\u0000*\n\u0001\u0000"+
		"\u0000\u0000+,\u0005{\u0000\u0000,\f\u0001\u0000\u0000\u0000-.\u0005}"+
		"\u0000\u0000.\u000e\u0001\u0000\u0000\u0000/0\u0005+\u0000\u00000\u0010"+
		"\u0001\u0000\u0000\u000012\u0005-\u0000\u00002\u0012\u0001\u0000\u0000"+
		"\u000034\u0005*\u0000\u00004\u0014\u0001\u0000\u0000\u000056\u0005/\u0000"+
		"\u00006\u0016\u0001\u0000\u0000\u00007;\u0007\u0000\u0000\u00008:\u0007"+
		"\u0001\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0018\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000>@\u0007\u0002\u0000\u0000?>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BI\u0001\u0000\u0000\u0000CE\u0005.\u0000\u0000"+
		"DF\u0007\u0002\u0000\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000"+
		"\u0000\u0000IC\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u001a"+
		"\u0001\u0000\u0000\u0000KM\u0007\u0003\u0000\u0000LK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0006\r\u0000\u0000Q\u001c\u0001"+
		"\u0000\u0000\u0000RS\u0005/\u0000\u0000ST\u0005/\u0000\u0000TX\u0001\u0000"+
		"\u0000\u0000UW\b\u0004\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0006\u000e\u0000\u0000"+
		"\\\u001e\u0001\u0000\u0000\u0000\u0007\u0000;AGINX\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}