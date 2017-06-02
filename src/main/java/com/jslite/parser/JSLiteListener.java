// Generated from E:/Home/Workspace/IntelliJ/JSLite/src/main/resources\JSLite.g4 by ANTLR 4.7
package com.jslite.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSLiteParser}.
 */
public interface JSLiteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code decimalLiteralExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteralExp(JSLiteParser.DecimalLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteralExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteralExp(JSLiteParser.DecimalLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteralExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExp(JSLiteParser.StringLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteralExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExp(JSLiteParser.StringLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExp(JSLiteParser.ParenthesesExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExp(JSLiteParser.ParenthesesExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(JSLiteParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(JSLiteParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code l1BinaryExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterL1BinaryExp(JSLiteParser.L1BinaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code l1BinaryExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitL1BinaryExp(JSLiteParser.L1BinaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallExp(JSLiteParser.CallExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallExp(JSLiteParser.CallExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code l4BinaryExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterL4BinaryExp(JSLiteParser.L4BinaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code l4BinaryExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitL4BinaryExp(JSLiteParser.L4BinaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code l2BinaryExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterL2BinaryExp(JSLiteParser.L2BinaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code l2BinaryExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitL2BinaryExp(JSLiteParser.L2BinaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteralExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteralExp(JSLiteParser.IntegerLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteralExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteralExp(JSLiteParser.IntegerLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaExpr}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpr(JSLiteParser.LambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaExpr}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpr(JSLiteParser.LambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code l3BinaryExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterL3BinaryExp(JSLiteParser.L3BinaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code l3BinaryExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitL3BinaryExp(JSLiteParser.L3BinaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierLiteralExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierLiteralExp(JSLiteParser.IdentifierLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierLiteralExp}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierLiteralExp(JSLiteParser.IdentifierLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(JSLiteParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link JSLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(JSLiteParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JSLiteParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JSLiteParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JSLiteParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JSLiteParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JSLiteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JSLiteParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#variableDefinitionsStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinitionsStatement(JSLiteParser.VariableDefinitionsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#variableDefinitionsStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinitionsStatement(JSLiteParser.VariableDefinitionsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(JSLiteParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(JSLiteParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(JSLiteParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(JSLiteParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#functionDefinitionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinitionStatement(JSLiteParser.FunctionDefinitionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#functionDefinitionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinitionStatement(JSLiteParser.FunctionDefinitionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(JSLiteParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(JSLiteParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JSLiteParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JSLiteParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(JSLiteParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(JSLiteParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JSLiteParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JSLiteParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JSLiteParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JSLiteParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JSLiteParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JSLiteParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(JSLiteParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(JSLiteParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(JSLiteParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(JSLiteParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#callArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterCallArgumentList(JSLiteParser.CallArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#callArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitCallArgumentList(JSLiteParser.CallArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JSLiteParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JSLiteParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JSLiteParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JSLiteParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSLiteParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JSLiteParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSLiteParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JSLiteParser.WhileStatementContext ctx);
}