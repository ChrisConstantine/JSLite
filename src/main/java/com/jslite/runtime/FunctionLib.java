package com.jslite.runtime;

import com.jslite.$;

/**
 * Created by Constantine on 2017-05-24 0024.
 */

public class FunctionLib
{
	public static Object print(Object[] args)
	{
		$.print(args[0]);
		return null;
	}

	public static Object println(Object[] args)
	{
		$.println(args[0]);
		return null;
	}
}
