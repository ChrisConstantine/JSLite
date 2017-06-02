package com.jslite.ast;

import com.jslite.runtime.Action;
import com.jslite.runtime.ScopeNode;
import com.jslite.runtime.Status;

/**
 * Created by Constantine on 2017-05-29 0029.
 */

public class ContinueStatement extends Statement
{
	@Override
	public Action execute(ScopeNode environment)
	{
		Status.check(Action.CONTINUE);
		return Action.CONTINUE;
	}
}
