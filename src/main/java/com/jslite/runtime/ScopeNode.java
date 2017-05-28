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
	private Map<Identifier,Object> scope=new HashMap<Identifier, Object>();

	private ScopeNode nextScope=null;

	public ScopeNode(ScopeNode nextScope)
	{
		this.nextScope = nextScope;
	}

	public Object lookUp(Identifier identifier)
	{
		ScopeNode current=this;

		while (current!=null)
		{
			if(current.scope.containsKey(identifier))
				return current.scope.get(identifier);
			else
				current=current.nextScope;
		}

		return null;
	}

	public void add(Identifier identifier,Object value)
	{
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
				current=current.nextScope;
		}

		$.error("can not resolve symbol "+identifier);
		$.die();
	}
}
