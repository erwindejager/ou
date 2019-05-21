// Generated from GitTest.g4 by ANTLR 4.7.1

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
public class GitTestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, LETTERS=11, NUMBER=12, ALFA=13, INT=14, STRING=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "LETTERS", "NUMBER", "ALFA", "INT", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'receiveInput'", "'Assign'", "'replyOutput'", "'('", "','", "')'", 
		"'<'", "'>'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "LETTERS", 
		"NUMBER", "ALFA", "INT", "STRING", "WS"
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
	String catchExceptionPoint = "";

	public class GitTestRequest {
	String input;
	public String getInput() { return input; }
	public void setInput(String s) { input = s; }
	}
	GitTestRequest gitTestRequest = new GitTestRequest();

	public class GitTestResponse {
	String result;
	public String getResult() { return result; }
	public void setResult(String s) { result = s; }
	}
	GitTestResponse gitTestResponse = new GitTestResponse();

	public class GitTestRequestMessage_ {
	GitTestRequest payload = new GitTestRequest();
	public GitTestRequest getPayload() { return payload; }
	}
	GitTestRequestMessage_ gitTestRequestMessage_ = new GitTestRequestMessage_();

	public class GitTestResponseMessage_ {
	GitTestResponse payload = new GitTestResponse();
	public GitTestResponse getPayload() { return payload; }
	}
	GitTestResponseMessage_ gitTestResponseMessage_ = new GitTestResponseMessage_();

	GitTestRequestMessage_ input = gitTestRequestMessage_;
	GitTestResponseMessage_ output = gitTestResponseMessage_;



	public GitTestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GitTest.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22u\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fS\n\f\r\f\16\fT\3\r\6\rX\n"+
		"\r\r\r\16\rY\3\16\6\16]\n\16\r\16\16\16^\3\17\6\17b\n\17\r\17\16\17c\3"+
		"\20\3\20\7\20h\n\20\f\20\16\20k\13\20\3\20\3\20\3\21\6\21p\n\21\r\21\16"+
		"\21q\3\21\3\21\3i\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22\3\2\6\4\2C\\c|\4\2\60\60aa\5\2\62;AA~~"+
		"\5\2\13\f\17\17\"\"\2z\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\3#\3\2\2\2\5\60\3\2\2\2\7\67\3\2\2\2\tC\3\2\2\2\13E\3"+
		"\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27R"+
		"\3\2\2\2\31W\3\2\2\2\33\\\3\2\2\2\35a\3\2\2\2\37e\3\2\2\2!o\3\2\2\2#$"+
		"\7t\2\2$%\7g\2\2%&\7e\2\2&\'\7g\2\2\'(\7k\2\2()\7x\2\2)*\7g\2\2*+\7K\2"+
		"\2+,\7p\2\2,-\7r\2\2-.\7w\2\2./\7v\2\2/\4\3\2\2\2\60\61\7C\2\2\61\62\7"+
		"u\2\2\62\63\7u\2\2\63\64\7k\2\2\64\65\7i\2\2\65\66\7p\2\2\66\6\3\2\2\2"+
		"\678\7t\2\289\7g\2\29:\7r\2\2:;\7n\2\2;<\7{\2\2<=\7Q\2\2=>\7w\2\2>?\7"+
		"v\2\2?@\7r\2\2@A\7w\2\2AB\7v\2\2B\b\3\2\2\2CD\7*\2\2D\n\3\2\2\2EF\7.\2"+
		"\2F\f\3\2\2\2GH\7+\2\2H\16\3\2\2\2IJ\7>\2\2J\20\3\2\2\2KL\7@\2\2L\22\3"+
		"\2\2\2MN\7]\2\2N\24\3\2\2\2OP\7_\2\2P\26\3\2\2\2QS\t\2\2\2RQ\3\2\2\2S"+
		"T\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\30\3\2\2\2VX\4\63;\2WV\3\2\2\2XY\3\2\2"+
		"\2YW\3\2\2\2YZ\3\2\2\2Z\32\3\2\2\2[]\t\3\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3"+
		"\2\2\2^_\3\2\2\2_\34\3\2\2\2`b\t\4\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2c"+
		"d\3\2\2\2d\36\3\2\2\2ei\7)\2\2fh\13\2\2\2gf\3\2\2\2hk\3\2\2\2ij\3\2\2"+
		"\2ig\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7)\2\2m \3\2\2\2np\t\5\2\2on\3\2\2"+
		"\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\21\2\2t\"\3\2\2\2\t\2T"+
		"Y^ciq\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}