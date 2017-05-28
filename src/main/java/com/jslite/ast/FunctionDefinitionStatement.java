package com.jslite.ast;

import com.jslite.runtime.Action;
import com.jslite.runtime.CustomerFunction;
import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class FunctionDefinitionStatement extends Statement
{
	private Identifier identifier;

	private Identifier[] argumentList;

	private Statement[] statements;

	public FunctionDefinitionStatement(Identifier identifier, Identifier[] argumentList, Statement[] statements)
	{
		this.identifier = identifier;
		this.argumentList = argumentList;
		this.statements = statements;
	}

	public Identifier getIdentifier()
	{
		return identifier;
	}

	public Identifier[] getArgumentList()
	{
		return argumentList;
	}

	public Statement[] getStatements()
	{
		return statements;
	}

	@Override
	public Action execute(ScopeNode environment)
	{
		CustomerFunction function=new CustomerFunction(environment,argumentList,statements);

		environment.add(identifier,function);

		return Action.NOTHING;
	}
}
