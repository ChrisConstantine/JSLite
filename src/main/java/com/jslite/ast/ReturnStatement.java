package com.jslite.ast;

import com.jslite.runtime.Action;
import com.jslite.runtime.ScopeNode;
import com.jslite.runtime.Status;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class ReturnStatement extends Statement
{
	private Expression expression;

	public ReturnStatement(Expression expression)
	{
		this.expression = expression;
	}

	public Expression getExpression()
	{
		return expression;
	}

	@Override
	public Action execute(ScopeNode environment)
	{
		Status.check(Action.RETURN);

		if(expression!=null)
			Action.RETURN.returnValue=expression.eval(environment);

		return Action.RETURN;
	}
}
