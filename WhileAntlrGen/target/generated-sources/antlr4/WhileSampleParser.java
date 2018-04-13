// Generated from WhileSample.g4 by ANTLR 4.7.1

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
public class WhileSampleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, LETTERS=14, NUMBER=15, ALFA=16, 
		INT=17, STRING=18, WS=19;
	public static final int
		RULE_whilesample = 0, RULE_whilex_block_seq = 1, RULE_whilex_block = 2, 
		RULE_post_whilex = 3, RULE_v0 = 4, RULE_v = 5, RULE_kvpi = 6, RULE_kvpo = 7, 
		RULE_key = 8, RULE_value = 9, RULE_index = 10, RULE_varname = 11;
	public static final String[] ruleNames = {
		"whilesample", "whilex_block_seq", "whilex_block", "post_whilex", "v0", 
		"v", "kvpi", "kvpo", "key", "value", "index", "varname"
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

	@Override
	public String getGrammarFileName() { return "WhileSample.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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


	public WhileSampleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WhilesampleContext extends ParserRuleContext {
		public V0Context v0() {
			return getRuleContext(V0Context.class,0);
		}
		public Whilex_block_seqContext whilex_block_seq() {
			return getRuleContext(Whilex_block_seqContext.class,0);
		}
		public Post_whilexContext post_whilex() {
			return getRuleContext(Post_whilexContext.class,0);
		}
		public WhilesampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilesample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).enterWhilesample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).exitWhilesample(this);
		}
	}

	public final WhilesampleContext whilesample() throws RecognitionException {
		WhilesampleContext _localctx = new WhilesampleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_whilesample);
		try {
			enterOuterAlt(_localctx, 1);
			{

			JXPathContext inputCtx = JXPathContext.newContext(input);
			varMap.put("input", inputCtx);
			JXPathContext outputCtx = JXPathContext.newContext(output);
			varMap.put("output", outputCtx);
			JXPathContext iteratorCtx = JXPathContext.newContext(iterator);
			varMap.put("iterator", iteratorCtx);
			JXPathContext tempCtx = JXPathContext.newContext(temp);
			varMap.put("temp", tempCtx);

			setState(25);
			v0();
			setState(26);
			match(T__0);
			setState(27);
			match(T__1);

			iterator = 0;
			temp = input.payload.input;

			setState(29);
			match(T__2);
			setState(30);
			whilex_block_seq();
			setState(31);
			post_whilex();
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

	public static class Whilex_block_seqContext extends ParserRuleContext {
		public Whilex_blockContext whilex_block() {
			return getRuleContext(Whilex_blockContext.class,0);
		}
		public Whilex_block_seqContext whilex_block_seq() {
			return getRuleContext(Whilex_block_seqContext.class,0);
		}
		public Whilex_block_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilex_block_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).enterWhilex_block_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).exitWhilex_block_seq(this);
		}
	}

	public final Whilex_block_seqContext whilex_block_seq() throws RecognitionException {
		Whilex_block_seqContext _localctx = new Whilex_block_seqContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_whilex_block_seq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(33);
				whilex_block();
				}
				break;
			case 2:
				{
				setState(34);
				whilex_block();
				setState(35);
				whilex_block_seq();
				}
				break;
			case 3:
				{
				}
				break;
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

	public static class Whilex_blockContext extends ParserRuleContext {
		public Whilex_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilex_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).enterWhilex_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).exitWhilex_block(this);
		}
	}

	public final Whilex_blockContext whilex_block() throws RecognitionException {
		Whilex_blockContext _localctx = new Whilex_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whilex_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			if (!( iterator < 5 )) throw new FailedPredicateException(this, " iterator < 5 ");
			setState(41);
			match(T__3);

			iterator = iterator+1;
			temp = temp + " " + (String) Utils.getVarValue("input/payload/input", varMap);

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

	public static class Post_whilexContext extends ParserRuleContext {
		public VContext v() {
			return getRuleContext(VContext.class,0);
		}
		public Post_whilexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_whilex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).enterPost_whilex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).exitPost_whilex(this);
		}
	}

	public final Post_whilexContext post_whilex() throws RecognitionException {
		Post_whilexContext _localctx = new Post_whilexContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_post_whilex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__4);

			whileSampleResponse.result = "tns:result";

			output.payload.result = temp;

			setState(46);
			match(T__5);
			setState(47);
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
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).enterV0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).exitV0(this);
		}
	}

	public final V0Context v0() throws RecognitionException {
		V0Context _localctx = new V0Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_v0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__6);
			setState(50);
			kvpi();
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				match(T__7);
				setState(52);
				kvpi();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			setState(57);
			match(T__8);
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
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).enterV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).exitV(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_v);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__6);
			setState(60);
			kvpo();
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				match(T__7);
				setState(62);
				kvpo();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			setState(67);
			match(T__8);

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
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).enterKvpi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).exitKvpi(this);
		}
	}

	public final KvpiContext kvpi() throws RecognitionException {
		KvpiContext _localctx = new KvpiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_kvpi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__9);
			setState(71);
			((KvpiContext)_localctx).key = key();
			setState(72);
			match(T__7);
			setState(73);
			((KvpiContext)_localctx).value = value();
			setState(74);
			match(T__10);

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
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).enterKvpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).exitKvpo(this);
		}
	}

	public final KvpoContext kvpo() throws RecognitionException {
		KvpoContext _localctx = new KvpoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_kvpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__9);
			setState(78);
			((KvpoContext)_localctx).key = key();
			setState(79);
			match(T__7);
			setState(80);
			((KvpoContext)_localctx).value = value();
			setState(81);
			match(T__10);

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
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
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
		public TerminalNode STRING() { return getToken(WhileSampleParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		public TerminalNode NUMBER() { return getToken(WhileSampleParser.NUMBER, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__11);
			setState(89);
			match(NUMBER);
			setState(90);
			match(T__12);
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
		public List<TerminalNode> LETTERS() { return getTokens(WhileSampleParser.LETTERS); }
		public TerminalNode LETTERS(int i) {
			return getToken(WhileSampleParser.LETTERS, i);
		}
		public List<TerminalNode> ALFA() { return getTokens(WhileSampleParser.ALFA); }
		public TerminalNode ALFA(int i) {
			return getToken(WhileSampleParser.ALFA, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(WhileSampleParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(WhileSampleParser.NUMBER, i);
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
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileSampleListener ) ((WhileSampleListener)listener).exitVarname(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==LETTERS || _la==ALFA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << LETTERS) | (1L << NUMBER) | (1L << ALFA))) != 0)) {
				{
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LETTERS:
					{
					setState(93);
					match(LETTERS);
					}
					break;
				case NUMBER:
					{
					setState(94);
					match(NUMBER);
					}
					break;
				case ALFA:
					{
					setState(95);
					match(ALFA);
					}
					break;
				case T__11:
					{
					setState(96);
					index();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(101);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return whilex_block_sempred((Whilex_blockContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean whilex_block_sempred(Whilex_blockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  iterator < 5 ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25i\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\5\3)\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\6\68\n\6"+
		"\r\6\16\69\3\6\3\6\3\7\3\7\3\7\3\7\6\7B\n\7\r\7\16\7C\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\rd\n\r\f\r\16\rg\13\r\3\r\2\2\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\3\4\2\20\20\22\22\2d\2\32\3\2\2\2\4("+
		"\3\2\2\2\6*\3\2\2\2\b.\3\2\2\2\n\63\3\2\2\2\f=\3\2\2\2\16H\3\2\2\2\20"+
		"O\3\2\2\2\22V\3\2\2\2\24X\3\2\2\2\26Z\3\2\2\2\30^\3\2\2\2\32\33\b\2\1"+
		"\2\33\34\5\n\6\2\34\35\7\3\2\2\35\36\7\4\2\2\36\37\b\2\1\2\37 \7\5\2\2"+
		" !\5\4\3\2!\"\5\b\5\2\"\3\3\2\2\2#)\5\6\4\2$%\5\6\4\2%&\5\4\3\2&)\3\2"+
		"\2\2\')\3\2\2\2(#\3\2\2\2($\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\6\4\2\2+,"+
		"\7\6\2\2,-\b\4\1\2-\7\3\2\2\2./\7\7\2\2/\60\b\5\1\2\60\61\7\b\2\2\61\62"+
		"\5\f\7\2\62\t\3\2\2\2\63\64\7\t\2\2\64\67\5\16\b\2\65\66\7\n\2\2\668\5"+
		"\16\b\2\67\65\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\13"+
		"\2\2<\13\3\2\2\2=>\7\t\2\2>A\5\20\t\2?@\7\n\2\2@B\5\20\t\2A?\3\2\2\2B"+
		"C\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\13\2\2FG\b\7\1\2G\r\3\2\2"+
		"\2HI\7\f\2\2IJ\5\22\n\2JK\7\n\2\2KL\5\24\13\2LM\7\r\2\2MN\b\b\1\2N\17"+
		"\3\2\2\2OP\7\f\2\2PQ\5\22\n\2QR\7\n\2\2RS\5\24\13\2ST\7\r\2\2TU\b\t\1"+
		"\2U\21\3\2\2\2VW\5\30\r\2W\23\3\2\2\2XY\7\24\2\2Y\25\3\2\2\2Z[\7\16\2"+
		"\2[\\\7\21\2\2\\]\7\17\2\2]\27\3\2\2\2^e\t\2\2\2_d\7\20\2\2`d\7\21\2\2"+
		"ad\7\22\2\2bd\5\26\f\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2"+
		"\2ec\3\2\2\2ef\3\2\2\2f\31\3\2\2\2ge\3\2\2\2\7(9Cce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}