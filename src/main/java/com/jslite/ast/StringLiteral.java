package com.jslite.ast;

import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class StringLiteral extends Expression
{
	private String value;

	public StringLiteral(java.lang.String value)
	{
		this.value = value;
	}

	public java.lang.String getValue()
	{
		return value;
	}

	@Override
	public Object eval(ScopeNode environment)
	{
		return value.substring(1,value.length()-1 );
	}
}
