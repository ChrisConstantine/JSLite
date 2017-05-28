package com.jslite.ast;

import com.jslite.runtime.Action;
import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class EmptyStatement extends Statement
{
	@Override
	public Action execute(ScopeNode environment)
	{
		return Action.NOTHING;
	}
}
