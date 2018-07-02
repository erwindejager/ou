// Generated from WhileSample.g4 by ANTLR 4.7.1

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WhileSampleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, LETTERS=14, NUMBER=15, ALFA=16, 
		INT=17, STRING=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "LETTERS", "NUMBER", "ALFA", "INT", 
		"STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'receiveInput'", "'Assign'", "'Whilex'", "'LoopAssign'", "'AssignOutput'", 
		"'replyOutput'", "'('", "','", "')'", "'<'", "'>'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "LETTERS", "NUMBER", "ALFA", "INT", "STRING", "WS"
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


	Map<String,Object> varMap = new HashMap();
	Map<String,String> vMap = new HashMap();

	public class WhileSampleRequest {
	String input;
	public String getInput() { return input; }
	public void setInput(String s) { input = s; }
	}
	WhileSampleRequest whileSampleRequest = new WhileSampleRequest();

	public class WhileSampleResponse {
	String result;
	public String getResult() { return result; }
	public void setResult(String s) { result = s; }
	}
	WhileSampleResponse whileSampleResponse = new WhileSampleResponse();

	public class WhileSampleRequestMessage_ {
	WhileSampleRequest payload = new WhileSampleRequest();
	public WhileSampleRequest getPayload() { return payload; }
	}
	WhileSampleRequestMessage_ whileSampleRequestMessage_ = new WhileSampleRequestMessage_();

	public class WhileSampleResponseMessage_ {
	WhileSampleResponse payload = new WhileSampleResponse();
	public WhileSampleResponse getPayload() { return payload; }
	}
	WhileSampleResponseMessage_ whileSampleResponseMessage_ = new WhileSampleResponseMessage_();

	WhileSampleRequestMessage_ input = whileSampleRequestMessage_;
	WhileSampleResponseMessage_ output = whileSampleResponseMessage_;
	int iterator;
	String temp;



	public WhileSampleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WhileSample.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17x"+
		"\n\17\r\17\16\17y\3\20\6\20}\n\20\r\20\16\20~\3\21\6\21\u0082\n\21\r\21"+
		"\16\21\u0083\3\22\6\22\u0087\n\22\r\22\16\22\u0088\3\23\3\23\7\23\u008d"+
		"\n\23\f\23\16\23\u0090\13\23\3\23\3\23\3\24\6\24\u0095\n\24\r\24\16\24"+
		"\u0096\3\24\3\24\3\u008e\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\6\4\2C\\c|\4\2"+
		"\60\60aa\5\2\62;AA~~\5\2\13\f\17\17\"\"\2\u009f\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\3)\3\2\2\2\5\66\3\2\2\2\7=\3\2\2\2\tD\3\2\2\2\13O\3\2\2\2\r\\\3"+
		"\2\2\2\17h\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31"+
		"r\3\2\2\2\33t\3\2\2\2\35w\3\2\2\2\37|\3\2\2\2!\u0081\3\2\2\2#\u0086\3"+
		"\2\2\2%\u008a\3\2\2\2\'\u0094\3\2\2\2)*\7t\2\2*+\7g\2\2+,\7e\2\2,-\7g"+
		"\2\2-.\7k\2\2./\7x\2\2/\60\7g\2\2\60\61\7K\2\2\61\62\7p\2\2\62\63\7r\2"+
		"\2\63\64\7w\2\2\64\65\7v\2\2\65\4\3\2\2\2\66\67\7C\2\2\678\7u\2\289\7"+
		"u\2\29:\7k\2\2:;\7i\2\2;<\7p\2\2<\6\3\2\2\2=>\7Y\2\2>?\7j\2\2?@\7k\2\2"+
		"@A\7n\2\2AB\7g\2\2BC\7z\2\2C\b\3\2\2\2DE\7N\2\2EF\7q\2\2FG\7q\2\2GH\7"+
		"r\2\2HI\7C\2\2IJ\7u\2\2JK\7u\2\2KL\7k\2\2LM\7i\2\2MN\7p\2\2N\n\3\2\2\2"+
		"OP\7C\2\2PQ\7u\2\2QR\7u\2\2RS\7k\2\2ST\7i\2\2TU\7p\2\2UV\7Q\2\2VW\7w\2"+
		"\2WX\7v\2\2XY\7r\2\2YZ\7w\2\2Z[\7v\2\2[\f\3\2\2\2\\]\7t\2\2]^\7g\2\2^"+
		"_\7r\2\2_`\7n\2\2`a\7{\2\2ab\7Q\2\2bc\7w\2\2cd\7v\2\2de\7r\2\2ef\7w\2"+
		"\2fg\7v\2\2g\16\3\2\2\2hi\7*\2\2i\20\3\2\2\2jk\7.\2\2k\22\3\2\2\2lm\7"+
		"+\2\2m\24\3\2\2\2no\7>\2\2o\26\3\2\2\2pq\7@\2\2q\30\3\2\2\2rs\7]\2\2s"+
		"\32\3\2\2\2tu\7_\2\2u\34\3\2\2\2vx\t\2\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2"+
		"\2yz\3\2\2\2z\36\3\2\2\2{}\4\63;\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177 \3\2\2\2\u0080\u0082\t\3\2\2\u0081\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\"\3\2\2\2\u0085"+
		"\u0087\t\4\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089$\3\2\2\2\u008a\u008e\7)\2\2\u008b\u008d"+
		"\13\2\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008f\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092"+
		"\7)\2\2\u0092&\3\2\2\2\u0093\u0095\t\5\2\2\u0094\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\b\24\2\2\u0099(\3\2\2\2\t\2y~\u0083\u0088\u008e\u0096\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}