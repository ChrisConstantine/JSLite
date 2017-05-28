package com.jslite.runtime;

import com.jslite.ast.Expression;

/**
 * Created by Constantine on 2017-05-21 0021.
 */
public enum Action
{
	NOTHING,
	RETURN,
	BREAK,
	CONTINUE;

	public Object returnValue;
}
