// Generated from E:/Home/Workspace/IntelliJ/JSLite/src/main/resources\JSLite.g4 by ANTLR 4.7
package com.jslite.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSLiteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSLiteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code decimalLiteralExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteralExp(JSLiteParser.DecimalLiteralExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code l2BinaryExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL2BinaryExp(JSLiteParser.L2BinaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteralExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExp(JSLiteParser.StringLiteralExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExp(JSLiteParser.ParenthesesExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteralExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteralExp(JSLiteParser.IntegerLiteralExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(JSLiteParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code l3BinaryExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL3BinaryExp(JSLiteParser.L3BinaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code l1BinaryExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL1BinaryExp(JSLiteParser.L1BinaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExp(JSLiteParser.CallExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code l4BinaryExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL4BinaryExp(JSLiteParser.L4BinaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierLiteralExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierLiteralExp(JSLiteParser.IdentifierLiteralExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(JSLiteParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(JSLiteParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JSLiteParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#variableDefinitionsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinitionsStatement(JSLiteParser.VariableDefinitionsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(JSLiteParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(JSLiteParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#functionDefinitionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinitionStatement(JSLiteParser.FunctionDefinitionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(JSLiteParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(JSLiteParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(JSLiteParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JSLiteParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JSLiteParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(JSLiteParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(JSLiteParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#callArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArgumentList(JSLiteParser.CallArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JSLiteParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JSLiteParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSLiteParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JSLiteParser.WhileStatementContext ctx);
}