package com.jslite.ast;

import com.jslite.runtime.Action;
import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public abstract class Statement implements Node
{
	public abstract Action execute(ScopeNode environment);
}
