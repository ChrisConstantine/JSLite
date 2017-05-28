package com.jslite.ast;

import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class BooleanLiteral extends Expression
{
	private boolean value;

	public BooleanLiteral(boolean value)
	{
		this.value = value;
	}

	public boolean getValue()
	{
		return value;
	}

	@Override
	public Object eval(ScopeNode environment)
	{
		return value;
	}
}
