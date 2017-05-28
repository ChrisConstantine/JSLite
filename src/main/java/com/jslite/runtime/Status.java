package com.jslite.runtime;

import com.jslite.$;

/**
 * Created by Constantine on 2017-05-23 0023.
 */

public class Status
{
	private static int functionLevel=0;
	private static int loopLevel=0;

	public static boolean inFunction()
	{
		return functionLevel>0;
	}

	public static boolean inLoop()
	{
		return loopLevel>0;
	}

	public static void enterFunction()
	{
		functionLevel++;
	}

	public static void leaveFunction()
	{
		functionLevel++;
	}

	public static void enterLoop()
	{
		loopLevel++;
	}

	public static void leaveLoop()
	{
		loopLevel++;
	}

	public static void check(Action action)
	{
		switch (action)
		{
			case NOTHING:
				break;
			case RETURN:
				if(!inFunction())
					$.die("return outside function");
				break;
			case BREAK:
				if (!inLoop())
					$.die("break outside loop");
			case CONTINUE:
				if (!inLoop())
					$.die("continue outside loop");
		}
	}
}
