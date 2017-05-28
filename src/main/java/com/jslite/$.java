package com.jslite;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class $
{
	//从给定路径读取文本文件所有内容到字符串
	public static String readStringFromFile(String path)
	{
		try
		{
			File file = new File(path);


			byte[] data = new byte[(int) file.length()];

			FileInputStream fileInputStream = new FileInputStream(file);

			fileInputStream.read(data);

			fileInputStream.close();

			return new String(data);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			die();
		}

		return null;
	}


	public static void error(String msg)
	{
		System.err.println(msg);
	}

	public static void print(Object msg)
	{
		System.out.print(msg);
	}

	public static void println(Object msg)
	{
		System.out.println(msg);
	}

	//退出程序
	public static void die(String msg)
	{
		$.error(msg);
		System.exit(-1);
	}

	//退出程序
	public static void die()
	{
		System.exit(-1);
	}
}
