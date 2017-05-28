package com.jslite.ast;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class CallArgumentList implements Node
{
	private Expression[] expressions;

	public CallArgumentList(Expression[] expressions)
	{
		this.expressions = expressions;
	}

	public Expression[] getExpressions()
	{
		return expressions;
	}
}
