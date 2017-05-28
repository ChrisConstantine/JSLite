package com.jslite.ast;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class VariableDefinition implements Node
{
	private Identifier identifier;
	private Expression expression;

	public VariableDefinition(Identifier identifier, Expression expression)
	{
		this.identifier = identifier;
		this.expression = expression;
	}

	public Identifier getIdentifier()
	{
		return identifier;
	}

	public Expression getExpression()
	{
		return expression;
	}
}
