package com.jslite.ast;

import com.jslite.runtime.Action;
import com.jslite.runtime.ScopeNode;
import com.jslite.runtime.Status;

/**
 * Created by Constantine on 2017-05-24 0024.
 */

public class BreakStatement extends Statement
{
	@Override
	public Action execute(ScopeNode environment)
	{
		Status.check(Action.BREAK);
		return Action.BREAK;
	}
}
