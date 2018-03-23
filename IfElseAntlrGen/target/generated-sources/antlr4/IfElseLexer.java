// Generated from IfElse.g4 by ANTLR 4.7.1

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
public class IfElseLexer extends Lexer {
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
		null, "'receive'", "'If_0'", "'Assign_1'", "'replyIf'", "'else'", "'Assign_0'", 
		"'ReplyElse'", "'('", "','", "')'", "'['", "']'"
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

	public class IfElseRequest {
	String input;
	public String getInput() { return input; }
	public void setInput(String s) { input = s; }
	}
	IfElseRequest ifelserequest = new IfElseRequest();

	public class IfElseResponse {
	String result;
	public String getResult() { return result; }
	public void setResult(String s) { result = s; }
	}
	IfElseResponse ifelseresponse = new IfElseResponse();

	public class IfElseRequestMessage {
	IfElseRequest payload = new IfElseRequest();
	public IfElseRequest getPayload() { return payload; }
	}
	IfElseRequestMessage ifelserequestmessage = new IfElseRequestMessage();

	public class IfElseResponseMessage {
	IfElseResponse payload = new IfElseResponse();
	public IfElseResponse getPayload() { return payload; }
	}
	IfElseResponseMessage ifelseresponsemessage = new IfElseResponseMessage();

	IfElseRequestMessage input = ifelserequestmessage;
	IfElseResponseMessage output = ifelseresponsemessage;

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\6\16i\n\16\r\16\16\16j\3\17\6\17n\n\17\r\17\16\17o\3\17\6\17s\n\17\r"+
		"\17\16\17t\3\20\6\20x\n\20\r\20\16\20y\3\21\6\21}\n\21\r\21\16\21~\3\22"+
		"\3\22\7\22\u0083\n\22\f\22\16\22\u0086\13\22\3\22\3\22\3\23\6\23\u008b"+
		"\n\23\r\23\16\23\u008c\3\23\3\23\3\u0084\2\24\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\6\4"+
		"\2C\\c|\4\2\60\60aa\5\2\62;AA~~\5\2\13\f\17\17\"\"\2\u0096\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\3\'\3\2\2\2\5/\3\2\2\2\7\64\3\2\2\2\t=\3\2\2\2\13E\3\2\2\2\rJ\3\2\2"+
		"\2\17S\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31e\3\2"+
		"\2\2\33h\3\2\2\2\35m\3\2\2\2\37w\3\2\2\2!|\3\2\2\2#\u0080\3\2\2\2%\u008a"+
		"\3\2\2\2\'(\7t\2\2()\7g\2\2)*\7e\2\2*+\7g\2\2+,\7k\2\2,-\7x\2\2-.\7g\2"+
		"\2.\4\3\2\2\2/\60\7K\2\2\60\61\7h\2\2\61\62\7a\2\2\62\63\7\62\2\2\63\6"+
		"\3\2\2\2\64\65\7C\2\2\65\66\7u\2\2\66\67\7u\2\2\678\7k\2\289\7i\2\29:"+
		"\7p\2\2:;\7a\2\2;<\7\63\2\2<\b\3\2\2\2=>\7t\2\2>?\7g\2\2?@\7r\2\2@A\7"+
		"n\2\2AB\7{\2\2BC\7K\2\2CD\7h\2\2D\n\3\2\2\2EF\7g\2\2FG\7n\2\2GH\7u\2\2"+
		"HI\7g\2\2I\f\3\2\2\2JK\7C\2\2KL\7u\2\2LM\7u\2\2MN\7k\2\2NO\7i\2\2OP\7"+
		"p\2\2PQ\7a\2\2QR\7\62\2\2R\16\3\2\2\2ST\7T\2\2TU\7g\2\2UV\7r\2\2VW\7n"+
		"\2\2WX\7{\2\2XY\7G\2\2YZ\7n\2\2Z[\7u\2\2[\\\7g\2\2\\\20\3\2\2\2]^\7*\2"+
		"\2^\22\3\2\2\2_`\7.\2\2`\24\3\2\2\2ab\7+\2\2b\26\3\2\2\2cd\7]\2\2d\30"+
		"\3\2\2\2ef\7_\2\2f\32\3\2\2\2gi\t\2\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2"+
		"jk\3\2\2\2k\34\3\2\2\2ln\4\63;\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2"+
		"\2pr\3\2\2\2qs\4\62;\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\36\3\2"+
		"\2\2vx\t\3\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z \3\2\2\2{}\t\4"+
		"\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\"\3\2\2\2\u0080\u0084"+
		"\7)\2\2\u0081\u0083\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7)\2\2\u0088$\3\2\2\2\u0089\u008b\t\5\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\b\23\2\2\u008f&\3\2\2\2\n\2joty~\u0084\u008c"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}