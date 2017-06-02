package com.jslite.ast;

import com.jslite.$;
import com.jslite.runtime.Action;
import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class IfStatement extends Statement
{
	private Expression condition;
	private Statement trueBranch;
	private Statement falseBranch;

	public IfStatement(Expression condition, Statement trueBranch, Statement falseBranch)
	{
		this.condition = condition;
		this.trueBranch = trueBranch;
		this.falseBranch = falseBranch;
	}

	public Expression getCondition()
	{
		return condition;
	}

	public Statement getTrueBranch()
	{
		return trueBranch;
	}

	public Statement getFalseBranch()
	{
		return falseBranch;
	}

	@Override
	public Action execute(ScopeNode environment)
	{
		Object predict = condition.eval(environment);

		if(!(predict instanceof Boolean))
			$.die("if-else statement must has a boolean condition");

		Action action;

		if((Boolean) predict)
			action=trueBranch.execute(environment);
		else
			if(falseBranch==null)
				action=Action.NOTHING;
			else
				action=falseBranch.execute(environment);

		return action;
	}
}
