// Generated from Refactor.g4 by ANTLR 4.13.1

package com.refactor;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RefactorParser}.
 */
public interface RefactorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RefactorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RefactorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefactorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RefactorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefactorParser#dependencyCall}.
	 * @param ctx the parse tree
	 */
	void enterDependencyCall(RefactorParser.DependencyCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefactorParser#dependencyCall}.
	 * @param ctx the parse tree
	 */
	void exitDependencyCall(RefactorParser.DependencyCallContext ctx);
}