// Generated from IfElse.g4 by ANTLR 4.7.1

import java.util.HashMap;
import java.util.Map;

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
		T__9=10, INT=11, WS=12;
	public static final int
		RULE_ifelse = 0, RULE_v0 = 1, RULE_v = 2, RULE_input = 3, RULE_output = 4, 
		RULE_input_ = 5, RULE_output_ = 6;
	public static final String[] ruleNames = {
		"ifelse", "v0", "v", "input", "output", "input_", "output_"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'receive'", "'If_0'", "'Assign_1'", "'replyIf'", "'else'", "'Assign_0'", 
		"'ReplyElse'", "'('", "','", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "INT", 
		"WS"
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


	String input;
	String output;
	Map<String,String> varMap = new HashMap<>();
	Map<String,String> vMap = new HashMap();

	 boolean verify() {
	  boolean result = true;
	  for (String key : varMap.keySet()) {
	   if (!varMap.get(key).equals(vMap.get(key + "_"))) {
	    System.out.println(key + " : " + varMap.get(key) + " <> " + key + "_ : " + vMap.get(key + "_"));
	    result = false; 
	   }
	  }
	  return result;
	 }

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
			setState(14);
			v0();
			setState(15);
			match(T__0);
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(16);
				match(T__1);
				 if (!input.equals("0")) System.out.println("ERROR: NOT input.equals('0')"); 
				setState(18);
				match(T__2);

				output="tns:result";
				output="1";

				setState(20);
				match(T__3);
				}
				break;
			case T__4:
				{
				setState(21);
				match(T__4);
				 if (input.equals("0")) System.out.println("ERROR: input.equals('0')"); 
				setState(23);
				match(T__5);

				output="tns:result";
				output="0";

				setState(25);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(28);
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
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__7);
			setState(31);
			input();
			setState(32);
			match(T__8);
			setState(33);
			output();
			setState(34);
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
		public Input_Context input_;
		public Output_Context output_;
		public Input_Context input_() {
			return getRuleContext(Input_Context.class,0);
		}
		public Output_Context output_() {
			return getRuleContext(Output_Context.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__7);
			setState(37);
			((VContext)_localctx).input_ = input_();
			setState(38);
			match(T__8);
			setState(39);
			((VContext)_localctx).output_ = output_();
			setState(40);
			match(T__9);

			varMap.put("input", input);
			varMap.put("output", output);
			vMap.put("input_", (((VContext)_localctx).input_!=null?_input.getText(((VContext)_localctx).input_.start,((VContext)_localctx).input_.stop):null));
			vMap.put("output_", (((VContext)_localctx).output_!=null?_input.getText(((VContext)_localctx).output_.start,((VContext)_localctx).output_.stop):null));

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

	public static class InputContext extends ParserRuleContext {
		public Token INT;
		public TerminalNode INT() { return getToken(IfElseParser.INT, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((InputContext)_localctx).INT = match(INT);
			 input=(((InputContext)_localctx).INT!=null?((InputContext)_localctx).INT.getText():null); 
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

	public static class OutputContext extends ParserRuleContext {
		public Token INT;
		public TerminalNode INT() { return getToken(IfElseParser.INT, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			((OutputContext)_localctx).INT = match(INT);
			 output=(((OutputContext)_localctx).INT!=null?((OutputContext)_localctx).INT.getText():null); 
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

	public static class Input_Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(IfElseParser.INT, 0); }
		public Input_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterInput_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitInput_(this);
		}
	}

	public final Input_Context input_() throws RecognitionException {
		Input_Context _localctx = new Input_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_input_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(INT);
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

	public static class Output_Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(IfElseParser.INT, 0); }
		public Output_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).enterOutput_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfElseListener ) ((IfElseListener)listener).exitOutput_(this);
		}
	}

	public final Output_Context output_() throws RecognitionException {
		Output_Context _localctx = new Output_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_output_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(INT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\168\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2\35\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\2"+
		"\t\2\4\6\b\n\f\16\2\2\2\61\2\20\3\2\2\2\4 \3\2\2\2\6&\3\2\2\2\b-\3\2\2"+
		"\2\n\60\3\2\2\2\f\63\3\2\2\2\16\65\3\2\2\2\20\21\5\4\3\2\21\34\7\3\2\2"+
		"\22\23\7\4\2\2\23\24\b\2\1\2\24\25\7\5\2\2\25\26\b\2\1\2\26\35\7\6\2\2"+
		"\27\30\7\7\2\2\30\31\b\2\1\2\31\32\7\b\2\2\32\33\b\2\1\2\33\35\7\t\2\2"+
		"\34\22\3\2\2\2\34\27\3\2\2\2\35\36\3\2\2\2\36\37\5\6\4\2\37\3\3\2\2\2"+
		" !\7\n\2\2!\"\5\b\5\2\"#\7\13\2\2#$\5\n\6\2$%\7\f\2\2%\5\3\2\2\2&\'\7"+
		"\n\2\2\'(\5\f\7\2()\7\13\2\2)*\5\16\b\2*+\7\f\2\2+,\b\4\1\2,\7\3\2\2\2"+
		"-.\7\r\2\2./\b\5\1\2/\t\3\2\2\2\60\61\7\r\2\2\61\62\b\6\1\2\62\13\3\2"+
		"\2\2\63\64\7\r\2\2\64\r\3\2\2\2\65\66\7\r\2\2\66\17\3\2\2\2\3\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}