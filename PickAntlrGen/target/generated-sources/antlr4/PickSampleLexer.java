// Generated from PickSample.g4 by ANTLR 4.7.1

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.jxpath.JXPathContext;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PickSampleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, LETTERS=13, NUMBER=14, ALFA=15, INT=16, STRING=17, 
		WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "LETTERS", "NUMBER", "ALFA", "INT", "STRING", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Pick'", "'sayHello'", "'AssignHello'", "'replyHello'", "'sayGoodbye'", 
		"'AssignGoodbye'", "'ReplyBye'", "'('", "','", "')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "LETTERS", "NUMBER", "ALFA", "INT", "STRING", "WS"
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

	public class PickSampleRequest {
	String input;
	public String getInput() { return input; }
	public void setInput(String s) { input = s; }
	}
	PickSampleRequest pickSampleRequest = new PickSampleRequest();

	public class PickSampleResponse {
	String result;
	public String getResult() { return result; }
	public void setResult(String s) { result = s; }
	}
	PickSampleResponse pickSampleResponse = new PickSampleResponse();

	public class SayGoodbye {
	String in;
	public String getIn() { return in; }
	public void setIn(String s) { in = s; }
	}
	SayGoodbye sayGoodbye = new SayGoodbye();

	public class SayGoodbyeResponse {
	String out;
	public String getOut() { return out; }
	public void setOut(String s) { out = s; }
	}
	SayGoodbyeResponse sayGoodbyeResponse = new SayGoodbyeResponse();

	public class PickSampleRequestMessage_ {
	PickSampleRequest payload = new PickSampleRequest();
	public PickSampleRequest getPayload() { return payload; }
	}
	PickSampleRequestMessage_ pickSampleRequestMessage_ = new PickSampleRequestMessage_();

	public class PickSampleResponseMessage_ {
	PickSampleResponse payload = new PickSampleResponse();
	public PickSampleResponse getPayload() { return payload; }
	}
	PickSampleResponseMessage_ pickSampleResponseMessage_ = new PickSampleResponseMessage_();

	public class SayGoodbyeRequest_ {
	SayGoodbye parameters = new SayGoodbye();
	public SayGoodbye getParameters() { return parameters; }
	}
	SayGoodbyeRequest_ sayGoodbyeRequest_ = new SayGoodbyeRequest_();

	public class SayGoodbyeResponse_ {
	SayGoodbyeResponse parameters = new SayGoodbyeResponse();
	public SayGoodbyeResponse getParameters() { return parameters; }
	}
	SayGoodbyeResponse_ sayGoodbyeResponse_ = new SayGoodbyeResponse_();

	PickSampleRequestMessage_ input = pickSampleRequestMessage_;
	PickSampleResponseMessage_ output = pickSampleResponseMessage_;
	SayGoodbyeRequest_ clientRequest = sayGoodbyeRequest_;
	SayGoodbyeResponse_ clientResponse = sayGoodbyeResponse_;

	 boolean verify() {
	  boolean result = true;
	  for (String key : vMap.keySet()) {
	   String expectedVal = trimQuote(vMap.get(key));
	   String actualValue = getVarValue(key);
	   if (!expectedVal.equals(actualValue)) {
	    System.out.println("Actual: " + key + " : " + actualValue + " <> Expected: " + key + " : " + expectedVal);
	    result = false; 
	   }
	  }
	  return result;
	 }

	String addQuote(String s) { return "'" + s +"'"; }
	String trimQuote(String s) { return s.replace("'",""); }

	JXPathContext getCtx(String varPath) {
	String s = varPath.substring(0, varPath.indexOf('.'));
	return JXPathContext.newContext(varMap.get(s)); }

	String getxPath(String varPath) {
	String path = varPath.substring(varPath.indexOf('.') + 1);
	return path.replace(".", "/"); }

	void setVarValue(String path, String value) { getCtx(path).setValue(getxPath(path), value); }
	String getVarValue(String path) { return (String)getCtx(path).getValue(getxPath(path)); }


	public PickSampleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PickSample.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6"+
		"\16z\n\16\r\16\16\16{\3\17\6\17\177\n\17\r\17\16\17\u0080\3\17\6\17\u0084"+
		"\n\17\r\17\16\17\u0085\3\20\6\20\u0089\n\20\r\20\16\20\u008a\3\21\6\21"+
		"\u008e\n\21\r\21\16\21\u008f\3\22\3\22\7\22\u0094\n\22\f\22\16\22\u0097"+
		"\13\22\3\22\3\22\3\23\6\23\u009c\n\23\r\23\16\23\u009d\3\23\3\23\3\u0095"+
		"\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\3\2\6\4\2C\\c|\4\2\60\60aa\5\2\62;AA~~\5\2\13\f"+
		"\17\17\"\"\2\u00a7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5,\3\2\2\2\7\65\3\2\2\2\t"+
		"A\3\2\2\2\13L\3\2\2\2\rW\3\2\2\2\17e\3\2\2\2\21n\3\2\2\2\23p\3\2\2\2\25"+
		"r\3\2\2\2\27t\3\2\2\2\31v\3\2\2\2\33y\3\2\2\2\35~\3\2\2\2\37\u0088\3\2"+
		"\2\2!\u008d\3\2\2\2#\u0091\3\2\2\2%\u009b\3\2\2\2\'(\7R\2\2()\7k\2\2)"+
		"*\7e\2\2*+\7m\2\2+\4\3\2\2\2,-\7u\2\2-.\7c\2\2./\7{\2\2/\60\7J\2\2\60"+
		"\61\7g\2\2\61\62\7n\2\2\62\63\7n\2\2\63\64\7q\2\2\64\6\3\2\2\2\65\66\7"+
		"C\2\2\66\67\7u\2\2\678\7u\2\289\7k\2\29:\7i\2\2:;\7p\2\2;<\7J\2\2<=\7"+
		"g\2\2=>\7n\2\2>?\7n\2\2?@\7q\2\2@\b\3\2\2\2AB\7t\2\2BC\7g\2\2CD\7r\2\2"+
		"DE\7n\2\2EF\7{\2\2FG\7J\2\2GH\7g\2\2HI\7n\2\2IJ\7n\2\2JK\7q\2\2K\n\3\2"+
		"\2\2LM\7u\2\2MN\7c\2\2NO\7{\2\2OP\7I\2\2PQ\7q\2\2QR\7q\2\2RS\7f\2\2ST"+
		"\7d\2\2TU\7{\2\2UV\7g\2\2V\f\3\2\2\2WX\7C\2\2XY\7u\2\2YZ\7u\2\2Z[\7k\2"+
		"\2[\\\7i\2\2\\]\7p\2\2]^\7I\2\2^_\7q\2\2_`\7q\2\2`a\7f\2\2ab\7d\2\2bc"+
		"\7{\2\2cd\7g\2\2d\16\3\2\2\2ef\7T\2\2fg\7g\2\2gh\7r\2\2hi\7n\2\2ij\7{"+
		"\2\2jk\7D\2\2kl\7{\2\2lm\7g\2\2m\20\3\2\2\2no\7*\2\2o\22\3\2\2\2pq\7."+
		"\2\2q\24\3\2\2\2rs\7+\2\2s\26\3\2\2\2tu\7]\2\2u\30\3\2\2\2vw\7_\2\2w\32"+
		"\3\2\2\2xz\t\2\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\34\3\2\2\2"+
		"}\177\4\63;\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\4\62;\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\36\3\2\2"+
		"\2\u0087\u0089\t\3\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b \3\2\2\2\u008c\u008e\t\4\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\"\3\2\2\2\u0091\u0095\7)\2\2\u0092\u0094\13\2\2\2\u0093\u0092"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7)\2\2\u0099$\3\2\2\2\u009a"+
		"\u009c\t\5\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\23\2\2\u00a0"+
		"&\3\2\2\2\n\2{\u0080\u0085\u008a\u008f\u0095\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}