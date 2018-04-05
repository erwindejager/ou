// Generated from IfElse.g4 by ANTLR 4.7.1

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
public class IfElseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, LETTERS=15, NUMBER=16, 
		ALFA=17, INT=18, STRING=19, WS=20;
	public static final int
		RULE_ifelse = 0, RULE_v0 = 1, RULE_v = 2, RULE_kvpi = 3, RULE_kvpo = 4, 
		RULE_key = 5, RULE_value = 6, RULE_index = 7, RULE_varname = 8;
	public static final String[] ruleNames = {
		"ifelse", "v0", "v", "kvpi", "kvpo", "key", "value", "index", "varname"
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

	@Override
	public String getGrammarFileName() { return "IfElse.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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


	public IfElseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IfelseContext extends ParserRuleContext {
		public V0Context v0() {
			return getRuleContext(V0Context.class,0);
		}
		public VContext v() {
			return getRuleContext(VContext.class,0);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitIfelse(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ifelse);
		try {
			enterOuterAlt(_localctx, 1);
			{

			JXPathContext inputCtx = JXPathContext.newContext(input);
			varMap.put("input", inputCtx);
			JXPathContext outputCtx = JXPathContext.newContext(output);
			varMap.put("output", outputCtx);

			setState(19);
			v0();
			setState(20);
			match(T__0);
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(21);
				match(T__1);
				setState(22);
				if (!( input.payload.input.equals("0") )) throw new FailedPredicateException(this, " input.payload.input.equals(\"0\") ");
				setState(23);
				match(T__2);

				ifElseResponse.result = "tns:result";

				output.payload.result = "1";

				setState(25);
				match(T__3);
				}
				break;
			case T__4:
				{
				setState(26);
				match(T__4);
				setState(27);
				if (!( !input.payload.input.equals("0") )) throw new FailedPredicateException(this, " !input.payload.input.equals(\"0\") ");
				setState(28);
				match(T__5);

				ifElseResponse.result = "tns:result";

				output.payload.result = "0";

				setState(30);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(33);
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
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterV0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitV0(this);
		}
	}

	public final V0Context v0() throws RecognitionException {
		V0Context _localctx = new V0Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_v0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__7);
			setState(36);
			kvpi();
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				match(T__8);
				setState(38);
				kvpi();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			setState(43);
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
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitV(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_v);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__7);
			setState(46);
			kvpo();
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				match(T__8);
				setState(48);
				kvpo();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			setState(53);
			match(T__9);

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
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterKvpi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitKvpi(this);
		}
	}

	public final KvpiContext kvpi() throws RecognitionException {
		KvpiContext _localctx = new KvpiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_kvpi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__10);
			setState(57);
			((KvpiContext)_localctx).key = key();
			setState(58);
			match(T__8);
			setState(59);
			((KvpiContext)_localctx).value = value();
			setState(60);
			match(T__11);

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
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterKvpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitKvpo(this);
		}
	}

	public final KvpoContext kvpo() throws RecognitionException {
		KvpoContext _localctx = new KvpoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_kvpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__10);
			setState(64);
			((KvpoContext)_localctx).key = key();
			setState(65);
			match(T__8);
			setState(66);
			((KvpoContext)_localctx).value = value();
			setState(67);
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
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
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
		public TerminalNode STRING() { return getToken(IfElseParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
		public TerminalNode NUMBER() { return getToken(IfElseParser.NUMBER, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__12);
			setState(75);
			match(NUMBER);
			setState(76);
			match(T__13);
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
		public List<TerminalNode> LETTERS() { return getTokens(IfElseParser.LETTERS); }
		public TerminalNode LETTERS(int i) {
			return getToken(IfElseParser.LETTERS, i);
		}
		public List<TerminalNode> ALFA() { return getTokens(IfElseParser.ALFA); }
		public TerminalNode ALFA(int i) {
			return getToken(IfElseParser.ALFA, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(IfElseParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(IfElseParser.NUMBER, i);
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
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitVarname(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==LETTERS || _la==ALFA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << LETTERS) | (1L << NUMBER) | (1L << ALFA))) != 0)) {
				{
				setState(83);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LETTERS:
					{
					setState(79);
					match(LETTERS);
					}
					break;
				case NUMBER:
					{
					setState(80);
					match(NUMBER);
					}
					break;
				case ALFA:
					{
					setState(81);
					match(ALFA);
					}
					break;
				case T__12:
					{
					setState(82);
					index();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(87);
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
		case 0:
			return ifelse_sempred((IfelseContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ifelse_sempred(IfelseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  input.payload.input.equals("0") ;
		case 1:
			return  !input.payload.input.equals("0") ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\"\n\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\6\3*\n\3\r\3\16\3+\3\3\3\3\3\4\3\4\3\4\3\4\6\4\64\n\4\r\4\16\4\65"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\nV\n\n\f\n\16\nY"+
		"\13\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\4\2\21\21\23\23\2X\2\24\3\2"+
		"\2\2\4%\3\2\2\2\6/\3\2\2\2\b:\3\2\2\2\nA\3\2\2\2\fH\3\2\2\2\16J\3\2\2"+
		"\2\20L\3\2\2\2\22P\3\2\2\2\24\25\b\2\1\2\25\26\5\4\3\2\26!\7\3\2\2\27"+
		"\30\7\4\2\2\30\31\6\2\2\2\31\32\7\5\2\2\32\33\b\2\1\2\33\"\7\6\2\2\34"+
		"\35\7\7\2\2\35\36\6\2\3\2\36\37\7\b\2\2\37 \b\2\1\2 \"\7\t\2\2!\27\3\2"+
		"\2\2!\34\3\2\2\2\"#\3\2\2\2#$\5\6\4\2$\3\3\2\2\2%&\7\n\2\2&)\5\b\5\2\'"+
		"(\7\13\2\2(*\5\b\5\2)\'\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2"+
		"\2-.\7\f\2\2.\5\3\2\2\2/\60\7\n\2\2\60\63\5\n\6\2\61\62\7\13\2\2\62\64"+
		"\5\n\6\2\63\61\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67"+
		"\3\2\2\2\678\7\f\2\289\b\4\1\29\7\3\2\2\2:;\7\r\2\2;<\5\f\7\2<=\7\13\2"+
		"\2=>\5\16\b\2>?\7\16\2\2?@\b\5\1\2@\t\3\2\2\2AB\7\r\2\2BC\5\f\7\2CD\7"+
		"\13\2\2DE\5\16\b\2EF\7\16\2\2FG\b\6\1\2G\13\3\2\2\2HI\5\22\n\2I\r\3\2"+
		"\2\2JK\7\25\2\2K\17\3\2\2\2LM\7\17\2\2MN\7\22\2\2NO\7\20\2\2O\21\3\2\2"+
		"\2PW\t\2\2\2QV\7\21\2\2RV\7\22\2\2SV\7\23\2\2TV\5\20\t\2UQ\3\2\2\2UR\3"+
		"\2\2\2US\3\2\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\23\3\2\2\2Y"+
		"W\3\2\2\2\7!+\65UW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}