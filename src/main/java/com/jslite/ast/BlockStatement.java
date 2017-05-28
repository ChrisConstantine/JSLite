package com.jslite.ast;

import com.jslite.runtime.Action;
import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class BlockStatement extends Statement
{
	private Statement[] statements;

	public BlockStatement(Statement[] statements)
	{
		this.statements = statements;
	}

	public Statement[] getStatements()
	{
		return statements;
	}

	@Override
	public Action execute(ScopeNode environment)
	{
		for (int i = 0; i < statements.length; i++)
		{
			Action action=statements[i].execute(environment);

			if(action!=Action.NOTHING)
				return action;
		}

		return Action.NOTHING;
	}
}
