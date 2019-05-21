// Generated from GitTest.g4 by ANTLR 4.7.1

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GitTestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, LETTERS=11, NUMBER=12, ALFA=13, INT=14, STRING=15, WS=16;
	public static final int
		RULE_gittest = 0, RULE_v0 = 1, RULE_v = 2, RULE_kvpi = 3, RULE_kvpo = 4, 
		RULE_exit = 5, RULE_key = 6, RULE_value = 7, RULE_index = 8, RULE_varname = 9;
	public static final String[] ruleNames = {
		"gittest", "v0", "v", "kvpi", "kvpo", "exit", "key", "value", "index", 
		"varname"
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

	@Override
	public String getGrammarFileName() { return "GitTest.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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


	public GitTestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GittestContext extends ParserRuleContext {
		public V0Context v0() {
			return getRuleContext(V0Context.class,0);
		}
		public VContext v() {
			return getRuleContext(VContext.class,0);
		}
		public GittestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gittest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).enterGittest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).exitGittest(this);
		}
	}

	public final GittestContext gittest() throws RecognitionException {
		GittestContext _localctx = new GittestContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gittest);
		try {
			enterOuterAlt(_localctx, 1);
			{

			JXPathContext inputCtx = JXPathContext.newContext(input);
			varMap.put("input", inputCtx);
			JXPathContext outputCtx = JXPathContext.newContext(output);
			varMap.put("output", outputCtx);

			setState(21);
			v0();
			setState(22);
			match(T__0);
			setState(23);
			match(T__1);

			gitTestResponse.result = "tns:result";

			output.payload.result = input.payload.input;

			setState(25);
			match(T__2);
			setState(26);
			v();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class V0Context extends ParserRuleContext {
		public List<KvpiContext> kvpi() {
			return getRuleContexts(KvpiContext.class);
		}
		public KvpiContext kvpi(int i) {
			return getRuleContext(KvpiContext.class,i);
		}
		public V0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).enterV0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).exitV0(this);
		}
	}

	public final V0Context v0() throws RecognitionException {
		V0Context _localctx = new V0Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_v0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__3);
			setState(29);
			kvpi();
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				match(T__4);
				setState(31);
				kvpi();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(36);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VContext extends ParserRuleContext {
		public List<KvpoContext> kvpo() {
			return getRuleContexts(KvpoContext.class);
		}
		public KvpoContext kvpo(int i) {
			return getRuleContext(KvpoContext.class,i);
		}
		public VContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).enterV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).exitV(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_v);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__3);
			setState(39);
			kvpo();
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				match(T__4);
				setState(41);
				kvpo();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(46);
			match(T__5);

			  if (!Utils.verify(vMap, varMap)) {
			     System.out.println("ERROR: unexpected output");
			  }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KvpiContext extends ParserRuleContext {
		public KeyContext key;
		public ValueContext value;
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public KvpiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kvpi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).enterKvpi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).exitKvpi(this);
		}
	}

	public final KvpiContext kvpi() throws RecognitionException {
		KvpiContext _localctx = new KvpiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_kvpi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__6);
			setState(50);
			((KvpiContext)_localctx).key = key();
			setState(51);
			match(T__4);
			setState(52);
			((KvpiContext)_localctx).value = value();
			setState(53);
			match(T__7);

			Utils.setVarValue((((KvpiContext)_localctx).key!=null?_input.getText(((KvpiContext)_localctx).key.start,((KvpiContext)_localctx).key.stop):null), Utils.trimQuote((((KvpiContext)_localctx).value!=null?_input.getText(((KvpiContext)_localctx).value.start,((KvpiContext)_localctx).value.stop):null)), varMap);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KvpoContext extends ParserRuleContext {
		public KeyContext key;
		public ValueContext value;
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public KvpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kvpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).enterKvpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).exitKvpo(this);
		}
	}

	public final KvpoContext kvpo() throws RecognitionException {
		KvpoContext _localctx = new KvpoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_kvpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__6);
			setState(57);
			((KvpoContext)_localctx).key = key();
			setState(58);
			match(T__4);
			setState(59);
			((KvpoContext)_localctx).value = value();
			setState(60);
			match(T__7);

			vMap.put((((KvpoContext)_localctx).key!=null?_input.getText(((KvpoContext)_localctx).key.start,((KvpoContext)_localctx).key.stop):null), (((KvpoContext)_localctx).value!=null?_input.getText(((KvpoContext)_localctx).value.start,((KvpoContext)_localctx).value.stop):null));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitContext extends ParserRuleContext {
		public VContext v() {
			return getRuleContext(VContext.class,0);
		}
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).enterExit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).exitExit(this);
		}
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			v();
			 throw new ParseCatchException(catchExceptionPoint); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			varname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GitTestParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(GitTestParser.NUMBER, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__8);
			setState(71);
			match(NUMBER);
			setState(72);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarnameContext extends ParserRuleContext {
		public List<TerminalNode> LETTERS() { return getTokens(GitTestParser.LETTERS); }
		public TerminalNode LETTERS(int i) {
			return getToken(GitTestParser.LETTERS, i);
		}
		public List<TerminalNode> ALFA() { return getTokens(GitTestParser.ALFA); }
		public TerminalNode ALFA(int i) {
			return getToken(GitTestParser.ALFA, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(GitTestParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GitTestParser.NUMBER, i);
		}
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public VarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GitTestListener ) ((GitTestListener)listener).exitVarname(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==LETTERS || _la==ALFA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << LETTERS) | (1L << NUMBER) | (1L << ALFA))) != 0)) {
				{
				setState(79);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LETTERS:
					{
					setState(75);
					match(LETTERS);
					}
					break;
				case NUMBER:
					{
					setState(76);
					match(NUMBER);
					}
					break;
				case ALFA:
					{
					setState(77);
					match(ALFA);
					}
					break;
				case T__8:
					{
					setState(78);
					index();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22W\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3#\n\3\r\3\16\3$\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\6\4-\n\4\r\4\16\4.\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13R\n\13\f\13\16\13U\13\13\3\13"+
		"\2\2\f\2\4\6\b\n\f\16\20\22\24\2\3\4\2\r\r\17\17\2R\2\26\3\2\2\2\4\36"+
		"\3\2\2\2\6(\3\2\2\2\b\63\3\2\2\2\n:\3\2\2\2\fA\3\2\2\2\16D\3\2\2\2\20"+
		"F\3\2\2\2\22H\3\2\2\2\24L\3\2\2\2\26\27\b\2\1\2\27\30\5\4\3\2\30\31\7"+
		"\3\2\2\31\32\7\4\2\2\32\33\b\2\1\2\33\34\7\5\2\2\34\35\5\6\4\2\35\3\3"+
		"\2\2\2\36\37\7\6\2\2\37\"\5\b\5\2 !\7\7\2\2!#\5\b\5\2\" \3\2\2\2#$\3\2"+
		"\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\b\2\2\'\5\3\2\2\2()\7\6\2\2)"+
		",\5\n\6\2*+\7\7\2\2+-\5\n\6\2,*\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2"+
		"/\60\3\2\2\2\60\61\7\b\2\2\61\62\b\4\1\2\62\7\3\2\2\2\63\64\7\t\2\2\64"+
		"\65\5\16\b\2\65\66\7\7\2\2\66\67\5\20\t\2\678\7\n\2\289\b\5\1\29\t\3\2"+
		"\2\2:;\7\t\2\2;<\5\16\b\2<=\7\7\2\2=>\5\20\t\2>?\7\n\2\2?@\b\6\1\2@\13"+
		"\3\2\2\2AB\5\6\4\2BC\b\7\1\2C\r\3\2\2\2DE\5\24\13\2E\17\3\2\2\2FG\7\21"+
		"\2\2G\21\3\2\2\2HI\7\13\2\2IJ\7\16\2\2JK\7\f\2\2K\23\3\2\2\2LS\t\2\2\2"+
		"MR\7\r\2\2NR\7\16\2\2OR\7\17\2\2PR\5\22\n\2QM\3\2\2\2QN\3\2\2\2QO\3\2"+
		"\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\25\3\2\2\2US\3\2\2\2\6$"+
		".QS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}