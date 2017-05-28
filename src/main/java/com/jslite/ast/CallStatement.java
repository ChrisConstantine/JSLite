package com.jslite.ast;

import com.jslite.runtime.Action;
import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class CallStatement extends Statement
{
	private Call call;

	public CallStatement(Call call)
	{
		this.call = call;
	}

	public Call getCall()
	{
		return call;
	}

	@Override
	public Action execute(ScopeNode environment)
	{
		call.eval(environment);
		return Action.NOTHING;
	}
}
