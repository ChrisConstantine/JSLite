package com.jslite.ast;

import com.jslite.$;
import com.jslite.runtime.Action;
import com.jslite.runtime.ScopeNode;
import com.jslite.runtime.Status;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class WhileStatement extends Statement
{
	private Expression condition;
	private Statement statement;

	public WhileStatement(Expression condition, Statement statement)
	{
		this.condition = condition;
		this.statement = statement;
	}

	public Expression getCondition()
	{
		return condition;
	}

	public Statement getStatement()
	{
		return statement;
	}

	@Override
	public Action execute(ScopeNode environment)
	{
		Status.enterLoop();

		while (true)
		{
			Object predict = condition.eval(environment);
			if(!(predict instanceof Boolean))
				$.die("the condition value type must be boolean in while");

			if((Boolean) predict==false)
				break;


			Action action = statement.execute(environment);

			switch (action)
			{
				case NOTHING:
					break;
				case RETURN:
					Status.leaveLoop();
					return Action.RETURN;
				case BREAK:
					Status.leaveLoop();
					return Action.NOTHING;
				case CONTINUE:
					continue;
			}
		}

		Status.leaveLoop();

		return Action.NOTHING;
	}
}
