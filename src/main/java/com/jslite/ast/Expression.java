package com.jslite.ast;

import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public abstract class Expression implements Node
{
	public abstract Object eval(ScopeNode environment);
}
