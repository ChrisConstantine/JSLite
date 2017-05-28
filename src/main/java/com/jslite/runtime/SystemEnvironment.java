package com.jslite.runtime;

import com.jslite.ast.Identifier;

import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class SystemEnvironment
{
	public static ScopeNode getSystemEnvironment()
	{
		ScopeNode scopeNode=new ScopeNode(null);

		Method[] methods = FunctionLib.class.getMethods();

		for (int i = 0; i < methods.length; i++)
		{
			Method method=methods[i];

			Class<?>[] parameterTypes = method.getParameterTypes();

			if(parameterTypes.length==1 && parameterTypes[0]==Object[].class)
			{
				scopeNode.add(new Identifier(method.getName()),
						new NativeFunction(method));
			}
		}

		return scopeNode;
	}
}
