// Generated from IfElse.g4 by ANTLR 4.7.1

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
public class IfElseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, LETTERS=15, NUMBER=16, 
		ALFA=17, INT=18, STRING=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "LETTERS", "NUMBER", "ALFA", 
		"INT", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'receive'", "'If_0'", "'Assign_1'", "'replyIf'", "'else'", "'Assign_0'", 
		"'ReplyElse'", "'('", "','", "')'", "'<'", "'>'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "LETTERS", "NUMBER", "ALFA", "INT", "STRING", "WS"
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
	IfElseRequest ifElseRequest = new IfElseRequest();

	public class IfElseResponse {
	String result;
	public String getResult() { return result; }
	public void setResult(String s) { result = s; }
	}
	IfElseResponse ifElseResponse = new IfElseResponse();

	public class IfElseRequestMessage_ {
	IfElseRequest payload = new IfElseRequest();
	public IfElseRequest getPayload() { return payload; }
	}
	IfElseRequestMessage_ ifElseRequestMessage_ = new IfElseRequestMessage_();

	public class IfElseResponseMessage_ {
	IfElseResponse payload = new IfElseResponse();
	public IfElseResponse getPayload() { return payload; }
	}
	IfElseResponseMessage_ ifElseResponseMessage_ = new IfElseResponseMessage_();

	IfElseRequestMessage_ input = ifElseRequestMessage_;
	IfElseResponseMessage_ output = ifElseResponseMessage_;



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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20q\n\20\r\20\16\20r\3\21\6"+
		"\21v\n\21\r\21\16\21w\3\22\6\22{\n\22\r\22\16\22|\3\23\6\23\u0080\n\23"+
		"\r\23\16\23\u0081\3\24\3\24\7\24\u0086\n\24\f\24\16\24\u0089\13\24\3\24"+
		"\3\24\3\25\6\25\u008e\n\25\r\25\16\25\u008f\3\25\3\25\3\u0087\2\26\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26\3\2\6\4\2C\\c|\4\2\60\60aa\5\2\62;AA~~\5\2\13\f"+
		"\17\17\"\"\2\u0098\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\63"+
		"\3\2\2\2\78\3\2\2\2\tA\3\2\2\2\13I\3\2\2\2\rN\3\2\2\2\17W\3\2\2\2\21a"+
		"\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35"+
		"m\3\2\2\2\37p\3\2\2\2!u\3\2\2\2#z\3\2\2\2%\177\3\2\2\2\'\u0083\3\2\2\2"+
		")\u008d\3\2\2\2+,\7t\2\2,-\7g\2\2-.\7e\2\2./\7g\2\2/\60\7k\2\2\60\61\7"+
		"x\2\2\61\62\7g\2\2\62\4\3\2\2\2\63\64\7K\2\2\64\65\7h\2\2\65\66\7a\2\2"+
		"\66\67\7\62\2\2\67\6\3\2\2\289\7C\2\29:\7u\2\2:;\7u\2\2;<\7k\2\2<=\7i"+
		"\2\2=>\7p\2\2>?\7a\2\2?@\7\63\2\2@\b\3\2\2\2AB\7t\2\2BC\7g\2\2CD\7r\2"+
		"\2DE\7n\2\2EF\7{\2\2FG\7K\2\2GH\7h\2\2H\n\3\2\2\2IJ\7g\2\2JK\7n\2\2KL"+
		"\7u\2\2LM\7g\2\2M\f\3\2\2\2NO\7C\2\2OP\7u\2\2PQ\7u\2\2QR\7k\2\2RS\7i\2"+
		"\2ST\7p\2\2TU\7a\2\2UV\7\62\2\2V\16\3\2\2\2WX\7T\2\2XY\7g\2\2YZ\7r\2\2"+
		"Z[\7n\2\2[\\\7{\2\2\\]\7G\2\2]^\7n\2\2^_\7u\2\2_`\7g\2\2`\20\3\2\2\2a"+
		"b\7*\2\2b\22\3\2\2\2cd\7.\2\2d\24\3\2\2\2ef\7+\2\2f\26\3\2\2\2gh\7>\2"+
		"\2h\30\3\2\2\2ij\7@\2\2j\32\3\2\2\2kl\7]\2\2l\34\3\2\2\2mn\7_\2\2n\36"+
		"\3\2\2\2oq\t\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s \3\2\2\2t"+
		"v\4\63;\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\"\3\2\2\2y{\t\3\2\2"+
		"zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}$\3\2\2\2~\u0080\t\4\2\2\177"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"&\3\2\2\2\u0083\u0087\7)\2\2\u0084\u0086\13\2\2\2\u0085\u0084\3\2\2\2"+
		"\u0086\u0089\3\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7)\2\2\u008b(\3\2\2\2\u008c\u008e"+
		"\t\5\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\25\2\2\u0092*\3\2\2\2"+
		"\t\2rw|\u0081\u0087\u008f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}