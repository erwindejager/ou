// Generated from ComplextArraySample.g4 by ANTLR 4.7.1

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
public class ComplextArraySampleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, LETTERS=11, NUMBER=12, ALFA=13, INT=14, STRING=15, WS=16;
	public static final int
		RULE_complextarraysample = 0, RULE_v0 = 1, RULE_v = 2, RULE_kvpi = 3, 
		RULE_kvpo = 4, RULE_key = 5, RULE_value = 6, RULE_index = 7, RULE_varname = 8;
	public static final String[] ruleNames = {
		"complextarraysample", "v0", "v", "kvpi", "kvpo", "key", "value", "index", 
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
	public String getGrammarFileName() { return "ComplextArraySample.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	Map<String,Object> varMap = new HashMap();
	Map<String,String> vMap = new HashMap();

	public class ComplextArraySampleRequest {
	List<People> input = new ArrayList<People>();
	public List<People> getInput() { return input; }
	public void setInput(People s) { input.add(s); }
	}
	ComplextArraySampleRequest complextArraySampleRequest = new ComplextArraySampleRequest();

	class PeopleFactory extends AbstractFactory {
	public boolean createObject(JXPathContext context, Pointer pointer, Object parent, String name, int index) {
	if ((parent instanceof ComplextArraySampleRequest) && name.equals("input")) { ((ComplextArraySampleRequest)parent).setInput(new People()); return true; }
	return false; }}

	public class ComplextArraySampleResponse {
	People result = new People();
	public People getResult() { return result; }
	public void setResult(People s) { result = s; }
	int total;
	public int getTotal() { return total; }
	public void setTotal(int s) { total = s; }
	}
	ComplextArraySampleResponse complextArraySampleResponse = new ComplextArraySampleResponse();

	public class People {
	String name;
	public String getName() { return name; }
	public void setName(String s) { name = s; }
	int age;
	public int getAge() { return age; }
	public void setAge(int s) { age = s; }
	}
	public class ComplextArraySampleRequestMessage_ {
	ComplextArraySampleRequest payload = new ComplextArraySampleRequest();
	public ComplextArraySampleRequest getPayload() { return payload; }
	}
	ComplextArraySampleRequestMessage_ complextArraySampleRequestMessage_ = new ComplextArraySampleRequestMessage_();

	public class ComplextArraySampleResponseMessage_ {
	ComplextArraySampleResponse payload = new ComplextArraySampleResponse();
	public ComplextArraySampleResponse getPayload() { return payload; }
	}
	ComplextArraySampleResponseMessage_ complextArraySampleResponseMessage_ = new ComplextArraySampleResponseMessage_();

	ComplextArraySampleRequestMessage_ input = complextArraySampleRequestMessage_;
	ComplextArraySampleResponseMessage_ output = complextArraySampleResponseMessage_;


	public ComplextArraySampleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ComplextarraysampleContext extends ParserRuleContext {
		public V0Context v0() {
			return getRuleContext(V0Context.class,0);
		}
		public VContext v() {
			return getRuleContext(VContext.class,0);
		}
		public ComplextarraysampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complextarraysample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).enterComplextarraysample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).exitComplextarraysample(this);
		}
	}

	public final ComplextarraysampleContext complextarraysample() throws RecognitionException {
		ComplextarraysampleContext _localctx = new ComplextarraysampleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_complextarraysample);
		try {
			enterOuterAlt(_localctx, 1);
			{

			JXPathContext inputCtx = JXPathContext.newContext(input);
			inputCtx.setFactory(new PeopleFactory());
			varMap.put("input", inputCtx);
			JXPathContext outputCtx = JXPathContext.newContext(output);
			outputCtx.setFactory(new PeopleFactory());
			varMap.put("output", outputCtx);

			setState(19);
			v0();
			setState(20);
			match(T__0);
			setState(21);
			match(T__1);

			complextArraySampleResponse.result.name = "tns:name";
			complextArraySampleResponse.result.age = 0;
			complextArraySampleResponse.total = 0;

			output.payload.total = Utils.getVarValueInt("count(input/payload/input)", varMap);
			output.payload.result = (People) Utils.getVarValueO("input/payload/input[last()]", varMap);

			setState(23);
			match(T__2);
			setState(24);
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
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).enterV0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).exitV0(this);
		}
	}

	public final V0Context v0() throws RecognitionException {
		V0Context _localctx = new V0Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_v0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__3);
			setState(27);
			kvpi();
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				match(T__4);
				setState(29);
				kvpi();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(34);
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
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).enterV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).exitV(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_v);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__3);
			setState(37);
			kvpo();
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				match(T__4);
				setState(39);
				kvpo();
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(44);
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
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).enterKvpi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).exitKvpi(this);
		}
	}

	public final KvpiContext kvpi() throws RecognitionException {
		KvpiContext _localctx = new KvpiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_kvpi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__6);
			setState(48);
			((KvpiContext)_localctx).key = key();
			setState(49);
			match(T__4);
			setState(50);
			((KvpiContext)_localctx).value = value();
			setState(51);
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
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).enterKvpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).exitKvpo(this);
		}
	}

	public final KvpoContext kvpo() throws RecognitionException {
		KvpoContext _localctx = new KvpoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_kvpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__6);
			setState(55);
			((KvpoContext)_localctx).key = key();
			setState(56);
			match(T__4);
			setState(57);
			((KvpoContext)_localctx).value = value();
			setState(58);
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
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
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
		public TerminalNode STRING() { return getToken(ComplextArraySampleParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
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
		public TerminalNode NUMBER() { return getToken(ComplextArraySampleParser.NUMBER, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__8);
			setState(66);
			match(NUMBER);
			setState(67);
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
		public List<TerminalNode> LETTERS() { return getTokens(ComplextArraySampleParser.LETTERS); }
		public TerminalNode LETTERS(int i) {
			return getToken(ComplextArraySampleParser.LETTERS, i);
		}
		public List<TerminalNode> ALFA() { return getTokens(ComplextArraySampleParser.ALFA); }
		public TerminalNode ALFA(int i) {
			return getToken(ComplextArraySampleParser.ALFA, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ComplextArraySampleParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ComplextArraySampleParser.NUMBER, i);
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
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplextArraySampleListener ) ((ComplextArraySampleListener)listener).exitVarname(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==LETTERS || _la==ALFA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << LETTERS) | (1L << NUMBER) | (1L << ALFA))) != 0)) {
				{
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LETTERS:
					{
					setState(70);
					match(LETTERS);
					}
					break;
				case NUMBER:
					{
					setState(71);
					match(NUMBER);
					}
					break;
				case ALFA:
					{
					setState(72);
					match(ALFA);
					}
					break;
				case T__8:
					{
					setState(73);
					index();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3!\n\3\r\3\16\3\"\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\6\4+\n\4\r\4\16\4,\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\7\nM\n\n\f\n\16\nP\13\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3"+
		"\4\2\r\r\17\17\2N\2\24\3\2\2\2\4\34\3\2\2\2\6&\3\2\2\2\b\61\3\2\2\2\n"+
		"8\3\2\2\2\f?\3\2\2\2\16A\3\2\2\2\20C\3\2\2\2\22G\3\2\2\2\24\25\b\2\1\2"+
		"\25\26\5\4\3\2\26\27\7\3\2\2\27\30\7\4\2\2\30\31\b\2\1\2\31\32\7\5\2\2"+
		"\32\33\5\6\4\2\33\3\3\2\2\2\34\35\7\6\2\2\35 \5\b\5\2\36\37\7\7\2\2\37"+
		"!\5\b\5\2 \36\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\b"+
		"\2\2%\5\3\2\2\2&\'\7\6\2\2\'*\5\n\6\2()\7\7\2\2)+\5\n\6\2*(\3\2\2\2+,"+
		"\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\b\2\2/\60\b\4\1\2\60\7\3\2"+
		"\2\2\61\62\7\t\2\2\62\63\5\f\7\2\63\64\7\7\2\2\64\65\5\16\b\2\65\66\7"+
		"\n\2\2\66\67\b\5\1\2\67\t\3\2\2\289\7\t\2\29:\5\f\7\2:;\7\7\2\2;<\5\16"+
		"\b\2<=\7\n\2\2=>\b\6\1\2>\13\3\2\2\2?@\5\22\n\2@\r\3\2\2\2AB\7\21\2\2"+
		"B\17\3\2\2\2CD\7\13\2\2DE\7\16\2\2EF\7\f\2\2F\21\3\2\2\2GN\t\2\2\2HM\7"+
		"\r\2\2IM\7\16\2\2JM\7\17\2\2KM\5\20\t\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2"+
		"LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\23\3\2\2\2PN\3\2\2\2\6\",LN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}