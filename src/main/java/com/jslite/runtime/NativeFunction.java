package com.jslite.runtime;

import com.jslite.$;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Constantine on 2017-05-24 0024.
 */

public class NativeFunction extends Function
{
	private Method method;

	public NativeFunction(Method method)
	{
		this.method = method;
	}

	@Override
	public Object call(Object[] args)
	{
		try
		{
			return method.invoke(null,new Object[]{args});
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
		catch (InvocationTargetException e)
		{
			e.printStackTrace();
		}

		$.die();

		return null;
	}

	@Override
	public String toString()
	{
		int argLen=method.getTypeParameters().length;

		return "function("+(argLen==0?"":argLen)+")";
	}
}
