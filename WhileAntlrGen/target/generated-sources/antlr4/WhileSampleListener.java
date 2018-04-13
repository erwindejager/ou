// Generated from WhileSample.g4 by ANTLR 4.7.1

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WhileSampleParser}.
 */
public interface WhileSampleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WhileSampleParser#whilesample}.
	 * @param ctx the parse tree
	 */
	void enterWhilesample(WhileSampleParser.WhilesampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileSampleParser#whilesample}.
	 * @param ctx the parse tree
	 */
	void exitWhilesample(WhileSampleParser.WhilesampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileSampleParser#whilex_block_seq}.
	 * @param ctx the parse tree
	 */
	void enterWhilex_block_seq(WhileSampleParser.Whilex_block_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileSampleParser#whilex_block_seq}.
	 * @param ctx the parse tree
	 */
	void exitWhilex_block_seq(WhileSampleParser.Whilex_block_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileSampleParser#whilex_block}.
	 * @param ctx the parse tree
	 */
	void enterWhilex_block(WhileSampleParser.Whilex_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileSampleParser#whilex_block}.
	 * @param ctx the parse tree
	 */
	void exitWhilex_block(WhileSampleParser.Whilex_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileSampleParser#post_whilex}.
	 * @param ctx the parse tree
	 */
	void enterPost_whilex(WhileSampleParser.Post_whilexContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileSampleParser#post_whilex}.
	 * @param ctx the parse tree
	 */
	void exitPost_whilex(WhileSampleParser.Post_whilexContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileSampleParser#v0}.
	 * @param ctx the parse tree
	 */
	void enterV0(WhileSampleParser.V0Context ctx);
	/**
	 * Exit a parse tree produced by {@link WhileSampleParser#v0}.
	 * @param ctx the parse tree
	 */
	void exitV0(WhileSampleParser.V0Context ctx);
	/**
	 * Enter a parse tree produced by {@link WhileSampleParser#v}.
	 * @param ctx the parse tree
	 */
	void enterV(WhileSampleParser.VContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileSampleParser#v}.
	 * @param ctx the parse tree
	 */
	void exitV(WhileSampleParser.VContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileSampleParser#kvpi}.
	 * @param ctx the parse tree
	 */
	void enterKvpi(WhileSampleParser.KvpiContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileSampleParser#kvpi}.
	 * @param ctx the parse tree
	 */
	void exitKvpi(WhileSampleParser.KvpiContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileSampleParser#kvpo}.
	 * @param ctx the parse tree
	 */
	void enterKvpo(WhileSampleParser.KvpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileSampleParser#kvpo}.
	 * @param ctx the parse tree
	 */
	void exitKvpo(WhileSampleParser.KvpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileSampleParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(WhileSampleParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileSampleParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(WhileSampleParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileSampleParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(WhileSampleParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileSampleParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(WhileSampleParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileSampleParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(WhileSampleParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileSampleParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(WhileSampleParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileSampleParser#varname}.
	 * @param ctx the parse tree
	 */
	void enterVarname(WhileSampleParser.VarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileSampleParser#varname}.
	 * @param ctx the parse tree
	 */
	void exitVarname(WhileSampleParser.VarnameContext ctx);
}