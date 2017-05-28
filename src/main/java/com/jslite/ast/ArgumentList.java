package com.jslite.ast;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class ArgumentList implements Node
{
	private Identifier[] arguments;

	public ArgumentList(Identifier[] arguments)
	{
		this.arguments = arguments;
	}

	public Identifier[] getArguments()
	{
		return arguments;
	}
}
