// Generated from InvokeIncrementProcess.g4 by ANTLR 4.7.1

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
public class InvokeIncrementProcessLexer extends Lexer {
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
		null, "'receiveInput'", "'PrepareInvokeIncrement'", "'Invoke'", "'PrepareOutput'", 
		"'replyOutput'", "'('", "','", "')'", "'<'", "'>'", "'['", "']'"
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

	public class InvokeIncrementProcessRequest {
	String input;
	public String getInput() { return input; }
	public void setInput(String s) { input = s; }
	}
	InvokeIncrementProcessRequest invokeIncrementProcessRequest = new InvokeIncrementProcessRequest();

	public class InvokeIncrementProcessResponse {
	String result;
	public String getResult() { return result; }
	public void setResult(String s) { result = s; }
	}
	InvokeIncrementProcessResponse invokeIncrementProcessResponse = new InvokeIncrementProcessResponse();

	public class Incr {
	String i;
	public String getI() { return i; }
	public void setI(String s) { i = s; }
	}
	Incr incr = new Incr();

	public class IncrResponse {
	String incrReturn;
	public String getIncrReturn() { return incrReturn; }
	public void setIncrReturn(String s) { incrReturn = s; }
	}
	IncrResponse incrResponse = new IncrResponse();

	public class InvokeIncrementProcessRequestMessage_ {
	InvokeIncrementProcessRequest payload = new InvokeIncrementProcessRequest();
	public InvokeIncrementProcessRequest getPayload() { return payload; }
	}
	InvokeIncrementProcessRequestMessage_ invokeIncrementProcessRequestMessage_ = new InvokeIncrementProcessRequestMessage_();

	public class InvokeIncrementProcessResponseMessage_ {
	InvokeIncrementProcessResponse payload = new InvokeIncrementProcessResponse();
	public InvokeIncrementProcessResponse getPayload() { return payload; }
	}
	InvokeIncrementProcessResponseMessage_ invokeIncrementProcessResponseMessage_ = new InvokeIncrementProcessResponseMessage_();

	public class IncrResponse_ {
	IncrResponse parameters = new IncrResponse();
	public IncrResponse getParameters() { return parameters; }
	}
	IncrResponse_ incrResponse_ = new IncrResponse_();

	public class IncrRequest_ {
	Incr parameters = new Incr();
	public Incr getParameters() { return parameters; }
	}
	IncrRequest_ incrRequest_ = new IncrRequest_();

	InvokeIncrementProcessRequestMessage_ input = invokeIncrementProcessRequestMessage_;
	InvokeIncrementProcessResponseMessage_ output = invokeIncrementProcessResponseMessage_;
	IncrResponse_ incrementPLResponse = incrResponse_;
	IncrRequest_ incrementPLRequest = incrRequest_;



	public InvokeIncrementProcessLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "InvokeIncrementProcess.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u009e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\6\16|\n\16\r\16\16\16}\3\17\6\17\u0081\n\17\r\17\16\17\u0082\3\20"+
		"\6\20\u0086\n\20\r\20\16\20\u0087\3\21\6\21\u008b\n\21\r\21\16\21\u008c"+
		"\3\22\3\22\7\22\u0091\n\22\f\22\16\22\u0094\13\22\3\22\3\22\3\23\6\23"+
		"\u0099\n\23\r\23\16\23\u009a\3\23\3\23\3\u0092\2\24\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3"+
		"\2\6\4\2C\\c|\4\2\60\60aa\5\2\62;AA~~\5\2\13\f\17\17\"\"\2\u00a3\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\3\'\3\2\2\2\5\64\3\2\2\2\7K\3\2\2\2\tR\3\2\2\2\13`\3\2\2\2\r"+
		"l\3\2\2\2\17n\3\2\2\2\21p\3\2\2\2\23r\3\2\2\2\25t\3\2\2\2\27v\3\2\2\2"+
		"\31x\3\2\2\2\33{\3\2\2\2\35\u0080\3\2\2\2\37\u0085\3\2\2\2!\u008a\3\2"+
		"\2\2#\u008e\3\2\2\2%\u0098\3\2\2\2\'(\7t\2\2()\7g\2\2)*\7e\2\2*+\7g\2"+
		"\2+,\7k\2\2,-\7x\2\2-.\7g\2\2./\7K\2\2/\60\7p\2\2\60\61\7r\2\2\61\62\7"+
		"w\2\2\62\63\7v\2\2\63\4\3\2\2\2\64\65\7R\2\2\65\66\7t\2\2\66\67\7g\2\2"+
		"\678\7r\2\289\7c\2\29:\7t\2\2:;\7g\2\2;<\7K\2\2<=\7p\2\2=>\7x\2\2>?\7"+
		"q\2\2?@\7m\2\2@A\7g\2\2AB\7K\2\2BC\7p\2\2CD\7e\2\2DE\7t\2\2EF\7g\2\2F"+
		"G\7o\2\2GH\7g\2\2HI\7p\2\2IJ\7v\2\2J\6\3\2\2\2KL\7K\2\2LM\7p\2\2MN\7x"+
		"\2\2NO\7q\2\2OP\7m\2\2PQ\7g\2\2Q\b\3\2\2\2RS\7R\2\2ST\7t\2\2TU\7g\2\2"+
		"UV\7r\2\2VW\7c\2\2WX\7t\2\2XY\7g\2\2YZ\7Q\2\2Z[\7w\2\2[\\\7v\2\2\\]\7"+
		"r\2\2]^\7w\2\2^_\7v\2\2_\n\3\2\2\2`a\7t\2\2ab\7g\2\2bc\7r\2\2cd\7n\2\2"+
		"de\7{\2\2ef\7Q\2\2fg\7w\2\2gh\7v\2\2hi\7r\2\2ij\7w\2\2jk\7v\2\2k\f\3\2"+
		"\2\2lm\7*\2\2m\16\3\2\2\2no\7.\2\2o\20\3\2\2\2pq\7+\2\2q\22\3\2\2\2rs"+
		"\7>\2\2s\24\3\2\2\2tu\7@\2\2u\26\3\2\2\2vw\7]\2\2w\30\3\2\2\2xy\7_\2\2"+
		"y\32\3\2\2\2z|\t\2\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\34\3\2"+
		"\2\2\177\u0081\4\63;\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\36\3\2\2\2\u0084\u0086\t\3\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088 \3\2\2\2\u0089\u008b\t\4\2\2\u008a\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\"\3\2\2\2\u008e"+
		"\u0092\7)\2\2\u008f\u0091\13\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0096\7)\2\2\u0096$\3\2\2\2\u0097\u0099\t\5\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\23\2\2\u009d&\3\2\2\2\t\2}\u0082"+
		"\u0087\u008c\u0092\u009a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}