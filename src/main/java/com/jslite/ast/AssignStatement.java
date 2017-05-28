package com.jslite.ast;

import com.jslite.runtime.Action;
import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class AssignStatement extends Statement
{
	private Identifier identifier;
	private Expression expression;

	public AssignStatement(Identifier identifier, Expression expression)
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

	@Override
	public Action execute(ScopeNode environment)
	{
		environment.set(identifier,expression.eval(environment));
		return Action.NOTHING;
	}
}
