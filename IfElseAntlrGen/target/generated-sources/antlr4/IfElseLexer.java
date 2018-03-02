// Generated from IfElse.g4 by ANTLR 4.7.1

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IfElseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, INT=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "INT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'receive'", "'If_0'", "'Assign_1'", "'replyIf'", "'else'", "'Assign_0'", 
		"'ReplyElse'", "'('", "','", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "INT", 
		"WS"
	};
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


	String input;
	String output;
	Map<String,String> varMap = new HashMap<>();
	Map<String,String> vMap = new HashMap();

	 boolean verify() {
	  boolean result = true;
	  for (String key : varMap.keySet()) {
	   if (!varMap.get(key).equals(vMap.get(key + "_"))) {
	    System.out.println(key + " : " + varMap.get(key) + " <> " + key + "_ : " + vMap.get(key + "_"));
	    result = false; 
	   }
	  }
	  return result;
	 }


	public IfElseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IfElse.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16c\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fY\n\f\r\f"+
		"\16\fZ\3\r\6\r^\n\r\r\r\16\r_\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\3\2\4\5\2\62;AA~~\5\2\13\f\17\17\"\""+
		"\2d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\3\33\3\2\2\2\5#\3\2\2\2\7(\3\2\2\2\t\61\3\2\2\2\139\3"+
		"\2\2\2\r>\3\2\2\2\17G\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27X"+
		"\3\2\2\2\31]\3\2\2\2\33\34\7t\2\2\34\35\7g\2\2\35\36\7e\2\2\36\37\7g\2"+
		"\2\37 \7k\2\2 !\7x\2\2!\"\7g\2\2\"\4\3\2\2\2#$\7K\2\2$%\7h\2\2%&\7a\2"+
		"\2&\'\7\62\2\2\'\6\3\2\2\2()\7C\2\2)*\7u\2\2*+\7u\2\2+,\7k\2\2,-\7i\2"+
		"\2-.\7p\2\2./\7a\2\2/\60\7\63\2\2\60\b\3\2\2\2\61\62\7t\2\2\62\63\7g\2"+
		"\2\63\64\7r\2\2\64\65\7n\2\2\65\66\7{\2\2\66\67\7K\2\2\678\7h\2\28\n\3"+
		"\2\2\29:\7g\2\2:;\7n\2\2;<\7u\2\2<=\7g\2\2=\f\3\2\2\2>?\7C\2\2?@\7u\2"+
		"\2@A\7u\2\2AB\7k\2\2BC\7i\2\2CD\7p\2\2DE\7a\2\2EF\7\62\2\2F\16\3\2\2\2"+
		"GH\7T\2\2HI\7g\2\2IJ\7r\2\2JK\7n\2\2KL\7{\2\2LM\7G\2\2MN\7n\2\2NO\7u\2"+
		"\2OP\7g\2\2P\20\3\2\2\2QR\7*\2\2R\22\3\2\2\2ST\7.\2\2T\24\3\2\2\2UV\7"+
		"+\2\2V\26\3\2\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\30"+
		"\3\2\2\2\\^\t\3\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2"+
		"ab\b\r\2\2b\32\3\2\2\2\5\2Z_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}