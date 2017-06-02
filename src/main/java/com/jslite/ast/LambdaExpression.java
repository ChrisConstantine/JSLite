package com.jslite.ast;

import com.jslite.runtime.CustomerFunction;
import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-29 0029.
 */

public class LambdaExpression extends Expression
{
	private Identifier[] argumentList;

	private Statement[] statements;

	public LambdaExpression(Identifier[] argumentList, Statement[] statements)
	{
		this.argumentList = argumentList;
		this.statements = statements;
	}

	@Override
	public Object eval(ScopeNode environment)
	{
		return new CustomerFunction(environment,argumentList,statements);
	}
}
