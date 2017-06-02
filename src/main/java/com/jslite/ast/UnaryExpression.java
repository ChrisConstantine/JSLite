package com.jslite.ast;

import com.jslite.runtime.Compute;
import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class UnaryExpression extends Expression
{
	private Operator operator;
	private Expression expression;

	public UnaryExpression(Operator operator, Expression expression)
	{
		this.operator = operator;
		this.expression = expression;
	}

	public Operator getOperator()
	{
		return operator;
	}

	public Expression getExpression()
	{
		return expression;
	}

	@Override
	public Object eval(ScopeNode environment)
	{

		Object value = expression.eval(environment);

		return Compute.not(value);
	}
}
