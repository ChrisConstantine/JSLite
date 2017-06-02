package com.jslite.runtime;

import com.jslite.$;
import com.jslite.ast.Identifier;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class ScopeNode
{
	/**
	 * 当前作用域内的变量和值
	 */
	private Map<Identifier,Object> scope=new HashMap<Identifier, Object>();

	/**
	 * 父作用域
	 */
	private ScopeNode parentScope =null;

	public ScopeNode(ScopeNode parentScope)
	{
		this.parentScope = parentScope;
	}

	public Object lookUp(Identifier identifier)
	{
		ScopeNode current=this;

		while (current!=null)
		{
			if(current.scope.containsKey(identifier))
				return current.scope.get(identifier);
			else
				current=current.parentScope;
		}

		return null;
	}

	public void add(Identifier identifier,Object value)
	{
		if(scope.containsKey(identifier))
			$.die("identifier "+identifier+" already existed");
		else
			scope.put(identifier,value);
	}

	public void set(Identifier identifier,Object value)
	{
		ScopeNode current=this;

		while (current!=null)
		{
			if(current.scope.containsKey(identifier))
			{
				current.scope.put(identifier, value);
				return;
			}
			else
				current=current.parentScope;
		}

		$.die("can not resolve symbol "+identifier);
	}
}
