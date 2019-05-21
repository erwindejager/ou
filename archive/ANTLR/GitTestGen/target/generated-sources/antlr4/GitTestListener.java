// Generated from GitTest.g4 by ANTLR 4.7.1

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
 * {@link GitTestParser}.
 */
public interface GitTestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GitTestParser#gittest}.
	 * @param ctx the parse tree
	 */
	void enterGittest(GitTestParser.GittestContext ctx);
	/**
	 * Exit a parse tree produced by {@link GitTestParser#gittest}.
	 * @param ctx the parse tree
	 */
	void exitGittest(GitTestParser.GittestContext ctx);
	/**
	 * Enter a parse tree produced by {@link GitTestParser#v0}.
	 * @param ctx the parse tree
	 */
	void enterV0(GitTestParser.V0Context ctx);
	/**
	 * Exit a parse tree produced by {@link GitTestParser#v0}.
	 * @param ctx the parse tree
	 */
	void exitV0(GitTestParser.V0Context ctx);
	/**
	 * Enter a parse tree produced by {@link GitTestParser#v}.
	 * @param ctx the parse tree
	 */
	void enterV(GitTestParser.VContext ctx);
	/**
	 * Exit a parse tree produced by {@link GitTestParser#v}.
	 * @param ctx the parse tree
	 */
	void exitV(GitTestParser.VContext ctx);
	/**
	 * Enter a parse tree produced by {@link GitTestParser#kvpi}.
	 * @param ctx the parse tree
	 */
	void enterKvpi(GitTestParser.KvpiContext ctx);
	/**
	 * Exit a parse tree produced by {@link GitTestParser#kvpi}.
	 * @param ctx the parse tree
	 */
	void exitKvpi(GitTestParser.KvpiContext ctx);
	/**
	 * Enter a parse tree produced by {@link GitTestParser#kvpo}.
	 * @param ctx the parse tree
	 */
	void enterKvpo(GitTestParser.KvpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GitTestParser#kvpo}.
	 * @param ctx the parse tree
	 */
	void exitKvpo(GitTestParser.KvpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GitTestParser#exit}.
	 * @param ctx the parse tree
	 */
	void enterExit(GitTestParser.ExitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GitTestParser#exit}.
	 * @param ctx the parse tree
	 */
	void exitExit(GitTestParser.ExitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GitTestParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(GitTestParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GitTestParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(GitTestParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GitTestParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GitTestParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GitTestParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GitTestParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GitTestParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(GitTestParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GitTestParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(GitTestParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GitTestParser#varname}.
	 * @param ctx the parse tree
	 */
	void enterVarname(GitTestParser.VarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GitTestParser#varname}.
	 * @param ctx the parse tree
	 */
	void exitVarname(GitTestParser.VarnameContext ctx);
}