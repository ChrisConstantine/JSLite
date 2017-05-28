package com.jslite.ast;

import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class DecimalLiteral extends Expression
{
	private double value;

	public DecimalLiteral(double value)
	{
		this.value = value;
	}

	public double getValue()
	{
		return value;
	}

	@Override
	public Object eval(ScopeNode environment)
	{
		return value;
	}
}
