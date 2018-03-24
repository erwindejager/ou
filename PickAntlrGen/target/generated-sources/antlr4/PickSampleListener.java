// Generated from PickSample.g4 by ANTLR 4.7.1

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.jxpath.JXPathContext;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PickSampleParser}.
 */
public interface PickSampleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PickSampleParser#picksample}.
	 * @param ctx the parse tree
	 */
	void enterPicksample(PickSampleParser.PicksampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PickSampleParser#picksample}.
	 * @param ctx the parse tree
	 */
	void exitPicksample(PickSampleParser.PicksampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PickSampleParser#v0}.
	 * @param ctx the parse tree
	 */
	void enterV0(PickSampleParser.V0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PickSampleParser#v0}.
	 * @param ctx the parse tree
	 */
	void exitV0(PickSampleParser.V0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PickSampleParser#v}.
	 * @param ctx the parse tree
	 */
	void enterV(PickSampleParser.VContext ctx);
	/**
	 * Exit a parse tree produced by {@link PickSampleParser#v}.
	 * @param ctx the parse tree
	 */
	void exitV(PickSampleParser.VContext ctx);
	/**
	 * Enter a parse tree produced by {@link PickSampleParser#kvpi}.
	 * @param ctx the parse tree
	 */
	void enterKvpi(PickSampleParser.KvpiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PickSampleParser#kvpi}.
	 * @param ctx the parse tree
	 */
	void exitKvpi(PickSampleParser.KvpiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PickSampleParser#kvpo}.
	 * @param ctx the parse tree
	 */
	void enterKvpo(PickSampleParser.KvpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PickSampleParser#kvpo}.
	 * @param ctx the parse tree
	 */
	void exitKvpo(PickSampleParser.KvpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PickSampleParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(PickSampleParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PickSampleParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(PickSampleParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PickSampleParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PickSampleParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PickSampleParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PickSampleParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PickSampleParser#varname}.
	 * @param ctx the parse tree
	 */
	void enterVarname(PickSampleParser.VarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PickSampleParser#varname}.
	 * @param ctx the parse tree
	 */
	void exitVarname(PickSampleParser.VarnameContext ctx);
}