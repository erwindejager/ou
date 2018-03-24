// Generated from PickSample.g4 by ANTLR 4.7.1

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.jxpath.JXPathContext;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PickSampleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, LETTERS=13, NUMBER=14, ALFA=15, INT=16, STRING=17, 
		WS=18;
	public static final int
		RULE_picksample = 0, RULE_v0 = 1, RULE_v = 2, RULE_kvpi = 3, RULE_kvpo = 4, 
		RULE_key = 5, RULE_value = 6, RULE_varname = 7;
	public static final String[] ruleNames = {
		"picksample", "v0", "v", "kvpi", "kvpo", "key", "value", "varname"
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

	@Override
	public String getGrammarFileName() { return "PickSample.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public PickSampleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PicksampleContext extends ParserRuleContext {
		public V0Context v0() {
			return getRuleContext(V0Context.class,0);
		}
		public VContext v() {
			return getRuleContext(VContext.class,0);
		}
		public PicksampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_picksample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).enterPicksample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).exitPicksample(this);
		}
	}

	public final PicksampleContext picksample() throws RecognitionException {
		PicksampleContext _localctx = new PicksampleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_picksample);
		try {
			enterOuterAlt(_localctx, 1);
			{

			varMap.put("input", input);
			varMap.put("output", output);
			varMap.put("clientRequest", clientRequest);
			varMap.put("clientResponse", clientResponse);

			setState(17);
			v0();
			setState(18);
			match(T__0);
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(19);
				match(T__1);
				setState(20);
				match(T__2);

				pickSampleResponse.result="tns:result";
				output.payload.result="Hello " + input.payload.input;

				setState(22);
				match(T__3);
				}
				break;
			case T__4:
				{
				setState(23);
				match(T__4);
				setState(24);
				match(T__5);

				sayGoodbyeResponse.out="tns:out";
				clientResponse.parameters.out="Goodbye " + clientRequest.parameters.in;

				setState(26);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(29);
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
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).enterV0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).exitV0(this);
		}
	}

	public final V0Context v0() throws RecognitionException {
		V0Context _localctx = new V0Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_v0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__7);
			setState(32);
			kvpi();
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				match(T__8);
				setState(34);
				kvpi();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			setState(39);
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
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).enterV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).exitV(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_v);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__7);
			setState(42);
			kvpo();
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				match(T__8);
				setState(44);
				kvpo();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			setState(49);
			match(T__9);

			  if (!verify()) {
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
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).enterKvpi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).exitKvpi(this);
		}
	}

	public final KvpiContext kvpi() throws RecognitionException {
		KvpiContext _localctx = new KvpiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_kvpi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__10);
			setState(53);
			((KvpiContext)_localctx).key = key();
			setState(54);
			match(T__8);
			setState(55);
			((KvpiContext)_localctx).value = value();
			setState(56);
			match(T__11);

			setVarValue((((KvpiContext)_localctx).key!=null?_input.getText(((KvpiContext)_localctx).key.start,((KvpiContext)_localctx).key.stop):null), trimQuote((((KvpiContext)_localctx).value!=null?_input.getText(((KvpiContext)_localctx).value.start,((KvpiContext)_localctx).value.stop):null)));

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
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).enterKvpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).exitKvpo(this);
		}
	}

	public final KvpoContext kvpo() throws RecognitionException {
		KvpoContext _localctx = new KvpoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_kvpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__10);
			setState(60);
			((KvpoContext)_localctx).key = key();
			setState(61);
			match(T__8);
			setState(62);
			((KvpoContext)_localctx).value = value();
			setState(63);
			match(T__11);

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
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_key);
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
		public TerminalNode STRING() { return getToken(PickSampleParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
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

	public static class VarnameContext extends ParserRuleContext {
		public List<TerminalNode> LETTERS() { return getTokens(PickSampleParser.LETTERS); }
		public TerminalNode LETTERS(int i) {
			return getToken(PickSampleParser.LETTERS, i);
		}
		public List<TerminalNode> ALFA() { return getTokens(PickSampleParser.ALFA); }
		public TerminalNode ALFA(int i) {
			return getToken(PickSampleParser.ALFA, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PickSampleParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PickSampleParser.NUMBER, i);
		}
		public VarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PickSampleListener ) ((PickSampleListener)listener).exitVarname(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==LETTERS || _la==ALFA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERS) | (1L << NUMBER) | (1L << ALFA))) != 0)) {
				{
				{
				setState(71);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTERS) | (1L << NUMBER) | (1L << ALFA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(76);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\36\n\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3&\n\3\r"+
		"\3\16\3\'\3\3\3\3\3\4\3\4\3\4\3\4\6\4\60\n\4\r\4\16\4\61\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\7\tK\n\t\f\t\16\tN\13\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\4\2\17"+
		"\17\21\21\3\2\17\21\2K\2\22\3\2\2\2\4!\3\2\2\2\6+\3\2\2\2\b\66\3\2\2\2"+
		"\n=\3\2\2\2\fD\3\2\2\2\16F\3\2\2\2\20H\3\2\2\2\22\23\b\2\1\2\23\24\5\4"+
		"\3\2\24\35\7\3\2\2\25\26\7\4\2\2\26\27\7\5\2\2\27\30\b\2\1\2\30\36\7\6"+
		"\2\2\31\32\7\7\2\2\32\33\7\b\2\2\33\34\b\2\1\2\34\36\7\t\2\2\35\25\3\2"+
		"\2\2\35\31\3\2\2\2\36\37\3\2\2\2\37 \5\6\4\2 \3\3\2\2\2!\"\7\n\2\2\"%"+
		"\5\b\5\2#$\7\13\2\2$&\5\b\5\2%#\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2"+
		"\2()\3\2\2\2)*\7\f\2\2*\5\3\2\2\2+,\7\n\2\2,/\5\n\6\2-.\7\13\2\2.\60\5"+
		"\n\6\2/-\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2"+
		"\63\64\7\f\2\2\64\65\b\4\1\2\65\7\3\2\2\2\66\67\7\r\2\2\678\5\f\7\289"+
		"\7\13\2\29:\5\16\b\2:;\7\16\2\2;<\b\5\1\2<\t\3\2\2\2=>\7\r\2\2>?\5\f\7"+
		"\2?@\7\13\2\2@A\5\16\b\2AB\7\16\2\2BC\b\6\1\2C\13\3\2\2\2DE\5\20\t\2E"+
		"\r\3\2\2\2FG\7\23\2\2G\17\3\2\2\2HL\t\2\2\2IK\t\3\2\2JI\3\2\2\2KN\3\2"+
		"\2\2LJ\3\2\2\2LM\3\2\2\2M\21\3\2\2\2NL\3\2\2\2\6\35\'\61L";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}