package com.jslite.ast;

import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class Identifier extends Expression
{
	private String value;

	public Identifier(String identifier)
	{
		this.value = identifier;
	}

	public String getIdentifier()
	{
		return value;
	}

	@Override
	public int hashCode()
	{
		return value.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (!(o instanceof Identifier)) return false;

		Identifier that = (Identifier) o;

		return value.equals(that.value);
	}

	@Override
	public String toString()
	{
		return value;
	}

	@Override
	public Object eval(ScopeNode environment)
	{
		return environment.lookUp(this);
	}
}
