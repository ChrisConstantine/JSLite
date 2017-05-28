package com.jslite.parser;

import com.jslite.ast.*;
import jdk.nashorn.internal.parser.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class JSLiteVisitorImpl extends JSLiteBaseVisitor<Node>
{
	@Override
	public Node visitDecimalLiteralExp(JSLiteParser.DecimalLiteralExpContext ctx)
	{
		return new DecimalLiteral(Double.parseDouble(ctx.DecimalLiteral().getText()));
	}

	@Override
	public Node visitL2BinaryExp(JSLiteParser.L2BinaryExpContext ctx)
	{
		String op=ctx.op.getText();

		Operator operator=null;

		if(op.equals("+"))
			operator=Operator.ADD;
		else if(op.equals("-"))
			operator=Operator.SUB;


		return new BinaryExpression(operator,(Expression) visit(ctx.expression(0)),(Expression)visit(ctx.expression(1)));

	}

	@Override
	public Node visitStringLiteralExp(JSLiteParser.StringLiteralExpContext ctx)
	{
		return new StringLiteral(ctx.getText());
	}

	@Override
	public Node visitParenthesesExp(JSLiteParser.ParenthesesExpContext ctx)
	{
		return visit(ctx.expression());
	}

	@Override
	public Node visitIntegerLiteralExp(JSLiteParser.IntegerLiteralExpContext ctx)
	{
		return new IntegerLiteral(Integer.parseInt(ctx.IntegerLiteral().getText()));
	}

	@Override
	public Node visitNotExpression(JSLiteParser.NotExpressionContext ctx)
	{
		Expression expression=(Expression) visit(ctx.expression());
		return new UnaryExpression(Operator.NOT,expression);
	}

	@Override
	public Node visitL3BinaryExp(JSLiteParser.L3BinaryExpContext ctx)
	{
		String op=ctx.op.getText();

		Operator operator=null;

		if(op.equals("<"))
			operator=Operator.LT;
		else if(op.equals(">"))
			operator=Operator.GT;
		else if(op.equals(">="))
			operator=Operator.GTE;
		else if(op.equals("<="))
			operator=Operator.LTE;
		else if(op.equals("=="))
			operator=Operator.EQ;
		else if(op.equals("!="))
			operator=Operator.NEQ;

		return new BinaryExpression(operator,(Expression) visit(ctx.expression(0)),(Expression)visit(ctx.expression(1)));

	}

	@Override
	public Node visitL1BinaryExp(JSLiteParser.L1BinaryExpContext ctx)
	{

		String op=ctx.op.getText();

		Operator operator=null;

		if(op.equals("*"))
			operator=Operator.MUL;
		else if(op.equals("/"))
			operator=Operator.DIV;
		else if(op.equals("%"))
			operator=Operator.MOD;

		return new BinaryExpression(operator,(Expression) visit(ctx.expression(0)),(Expression)visit(ctx.expression(1)));
	}

	@Override
	public Node visitCallExp(JSLiteParser.CallExpContext ctx)
	{
		return super.visitCallExp(ctx);
	}

	@Override
	public Node visitIdentifierLiteralExp(JSLiteParser.IdentifierLiteralExpContext ctx)
	{
		return new Identifier(ctx.Identifier().getText());
	}

	@Override
	public Node visitStart(JSLiteParser.StartContext ctx)
	{
		List<JSLiteParser.StatementContext> statementContextList = ctx.statement();
		Statement[] statements=new Statement[statementContextList.size()];

		for (int i = 0; i < statementContextList.size(); i++)
		{
			statements[i]=(Statement) visit(statementContextList.get(i));
		}

		return new StatementList(statements);
	}

	@Override
	public Node visitStatement(JSLiteParser.StatementContext ctx)
	{
		return super.visitStatement(ctx);
	}

	@Override
	public Node visitVariableDefinitionsStatement(JSLiteParser.VariableDefinitionsStatementContext ctx)
	{
		List<JSLiteParser.VariableDefinitionContext> variableDefinitionContexts = ctx.variableDefinition();

		VariableDefinition[] variableDefinitions=new VariableDefinition[variableDefinitionContexts.size()];

		for (int i = 0; i < variableDefinitionContexts.size(); i++)
			variableDefinitions[i]=(VariableDefinition) visit(variableDefinitionContexts.get(i));

		return new VariableDefinitionsStatement(variableDefinitions);
	}

	@Override
	public Node visitVariableDefinition(JSLiteParser.VariableDefinitionContext ctx)
	{
		JSLiteParser.ExpressionContext expression = ctx.expression();
		return new VariableDefinition(new Identifier(ctx.Identifier().getText()),
				expression==null?null:(Expression)visit(expression));
	}

	@Override
	public Node visitAssignStatement(JSLiteParser.AssignStatementContext ctx)
	{
		return new AssignStatement(
				new Identifier(ctx.Identifier().getText()),
				(Expression)visit(ctx.expression())
		);
	}

	@Override
	public Node visitFunctionDefinitionStatement(JSLiteParser.FunctionDefinitionStatementContext ctx)
	{
		Identifier identifier=new Identifier(ctx.Identifier().getText());

		ArgumentList argumentList= (ArgumentList) visit(ctx.argumentList());

		FunctionBody functionBody= (FunctionBody) visit(ctx.functionBody());

		return new FunctionDefinitionStatement(identifier,argumentList.getArguments(),functionBody.getStatements());
	}

	@Override
	public Node visitFunctionBody(JSLiteParser.FunctionBodyContext ctx)
	{
		List<JSLiteParser.StatementContext> statementContexts = ctx.statement();

		Statement[] statements=new Statement[statementContexts.size()];

		for (int i = 0; i < statementContexts.size(); i++)
			statements[i] = (Statement) visit(statementContexts.get(i));
		return new FunctionBody(statements);
	}

	@Override
	public Node visitArgumentList(JSLiteParser.ArgumentListContext ctx)
	{
		List<TerminalNode> terminalNodes = ctx.Identifier();
		Identifier[] identifiers=new Identifier[terminalNodes.size()];

		for (int i = 0; i < terminalNodes.size(); i++)
		{
			identifiers[i]=new Identifier(terminalNodes.get(i).getText());
		}

		return new ArgumentList(identifiers);
	}

	@Override
	public Node visitEmptyStatement(JSLiteParser.EmptyStatementContext ctx)
	{
		return new EmptyStatement();
	}

	@Override
	public Node visitReturnStatement(JSLiteParser.ReturnStatementContext ctx)
	{
		JSLiteParser.ExpressionContext expression = ctx.expression();
		return new ReturnStatement(expression==null?null:(Expression) visit(ctx.expression()));
	}

	@Override
	public Node visitCallStatement(JSLiteParser.CallStatementContext ctx)
	{
		return new CallStatement((Call) visit(ctx.call()));
	}

	@Override
	public Node visitCall(JSLiteParser.CallContext ctx)
	{
		Identifier identifier=new Identifier(ctx.Identifier().getText());
		CallArgumentList argumentList=(CallArgumentList) visit(ctx.callArgumentList());
		return new Call(identifier,argumentList.getExpressions());
	}

	@Override
	public Node visitCallArgumentList(JSLiteParser.CallArgumentListContext ctx)
	{
		List<JSLiteParser.ExpressionContext> expressionContexts = ctx.expression();
		Expression[] expressions=new Expression[expressionContexts.size()];

		for (int i = 0; i < expressionContexts.size(); i++)
		{
			expressions[i]= (Expression) visit(expressionContexts.get(i));
		}
		return new CallArgumentList(expressions);
	}

	@Override
	public Node visitBlockStatement(JSLiteParser.BlockStatementContext ctx)
	{
		List<JSLiteParser.StatementContext> statementContextList = ctx.statement();
		Statement[] statements=new Statement[statementContextList.size()];

		for (int i = 0; i < statementContextList.size(); i++)
		{
			statements[i]= (Statement) visit(statementContextList.get(i));
		}

		return new BlockStatement(statements);
	}

	@Override
	public Node visitIfStatement(JSLiteParser.IfStatementContext ctx)
	{
		Expression condition= (Expression) visit(ctx.expression());
		Statement trueBranch= (Statement) visit(ctx.statement(0));
		Statement falseBranch= ctx.statement().size()==2? (Statement) visit(ctx.statement(1)) :null;

		return new IfStatement(condition,trueBranch,falseBranch);
	}

	@Override
	public Node visitWhileStatement(JSLiteParser.WhileStatementContext ctx)
	{
		Expression expression= (Expression) visit(ctx.expression());
		Statement statement=(Statement)visit(ctx.statement());

		return new WhileStatement(expression,statement);
	}

	@Override
	public Node visitBooleanLiteral(JSLiteParser.BooleanLiteralContext ctx)
	{
		TerminalNode aTrue = ctx.TRUE();

		return new BooleanLiteral(aTrue==null?false:true);
	}

	@Override
	public Node visitL4BinaryExp(JSLiteParser.L4BinaryExpContext ctx)
	{
		String op=ctx.op.getText();

		Operator operator=null;

		if(op.equals("&&"))
			operator=Operator.AND;
		else if(op.equals("||"))
			operator=Operator.OR;

		return new BinaryExpression(operator,(Expression) visit(ctx.expression(0)),(Expression)visit(ctx.expression(1)));

	}

	@Override
	public Node visitBreakStatement(JSLiteParser.BreakStatementContext ctx)
	{
		return new BreakStatement();
	}
}
