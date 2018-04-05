// Generated from IfElse.g4 by ANTLR 4.7.1

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
 * {@link IfElseParser}.
 */
public interface IfElseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IfElseParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(IfElseParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(IfElseParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseParser#v0}.
	 * @param ctx the parse tree
	 */
	void enterV0(IfElseParser.V0Context ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseParser#v0}.
	 * @param ctx the parse tree
	 */
	void exitV0(IfElseParser.V0Context ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseParser#v}.
	 * @param ctx the parse tree
	 */
	void enterV(IfElseParser.VContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseParser#v}.
	 * @param ctx the parse tree
	 */
	void exitV(IfElseParser.VContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseParser#kvpi}.
	 * @param ctx the parse tree
	 */
	void enterKvpi(IfElseParser.KvpiContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseParser#kvpi}.
	 * @param ctx the parse tree
	 */
	void exitKvpi(IfElseParser.KvpiContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseParser#kvpo}.
	 * @param ctx the parse tree
	 */
	void enterKvpo(IfElseParser.KvpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseParser#kvpo}.
	 * @param ctx the parse tree
	 */
	void exitKvpo(IfElseParser.KvpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(IfElseParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(IfElseParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(IfElseParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(IfElseParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(IfElseParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(IfElseParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseParser#varname}.
	 * @param ctx the parse tree
	 */
	void enterVarname(IfElseParser.VarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseParser#varname}.
	 * @param ctx the parse tree
	 */
	void exitVarname(IfElseParser.VarnameContext ctx);
}