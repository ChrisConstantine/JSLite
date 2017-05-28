package com.jslite.ast;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class FunctionBody implements Node
{
	private Statement[] statements;

	public FunctionBody(Statement[] statements)
	{
		this.statements = statements;
	}

	public Statement[] getStatements()
	{
		return statements;
	}
}
