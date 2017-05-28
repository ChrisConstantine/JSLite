package com.jslite.ast;

import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class IntegerLiteral extends Expression
{
	private int value=0;

	public IntegerLiteral(int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}

	@Override
	public Object eval(ScopeNode environment)
	{
		return value;
	}
}
