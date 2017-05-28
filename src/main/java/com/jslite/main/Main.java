package com.jslite.main;

import com.jslite.runtime.Boot;
import com.jslite.runtime.SystemEnvironment;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class Main
{
	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
	{
		Boot.start("code.jsl");


	}


}
