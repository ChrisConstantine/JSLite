package com.jslite.runtime;

import com.jslite.$;

/**
 * Created by Constantine on 2017-05-24 0024.
 */

public final class Compute
{
	private Compute()
	{
	}

	public static Object Addition(Object a, Object b)
	{
		if (a instanceof Integer)
		{
			if (b instanceof Integer)
				return (Integer) a + (Integer) b;
			else if (b instanceof Double)
				return (Integer) a + (Double) b;
			else if (b instanceof String)
				return a + (String) b;
		}
		else if (a instanceof Double)
		{
			if (b instanceof Integer)
				return (Double) a + (Integer) b;
			else if (b instanceof Double)
				return (Double) a + (Double) b;
			else if (b instanceof String)
				return a + (String) b;
		}
		else if (a instanceof String)
		{
			return (String) a + b;
		}

		$.error("operator + can not be applied:" + getType(a) + "," + getType(b));
		$.die();
		return null;
	}

	public static Object Subtraction(Object a, Object b)
	{
		if (a instanceof Integer)
		{
			if (b instanceof Integer)
				return (Integer) a - (Integer) b;
			else if (b instanceof Double)
				return (Integer) a - (Double) b;
		}
		else if (a instanceof Double)
		{
			if (b instanceof Integer)
				return (Double) a - (Integer) b;
			else if (b instanceof Double)
				return (Double) a - (Double) b;

		}


		$.error("operator - can not be applied:" + getType(a) + "," + getType(b));
		$.die();
		return null;
	}

	public static Object Multiplicative(Object a, Object b)
	{
		if (a instanceof Integer)
		{
			if (b instanceof Integer)
				return (Integer) a * (Integer) b;
			else if (b instanceof Double)
				return (Integer) a * (Double) b;
		}
		else if (a instanceof Double)
		{
			if (b instanceof Integer)
				return (Double) a * (Integer) b;
			else if (b instanceof Double)
				return (Double) a * (Double) b;

		}

		$.error("operator * can not be applied:" + getType(a) + "," + getType(b));
		$.die();
		return null;
	}

	public static Object Division(Object a, Object b)
	{

		if (a instanceof Integer)
		{
			if (b instanceof Integer)
				return (Integer) a / (Integer) b;
			else if (b instanceof Double)
				return (Integer) a / (Double) b;
		}
		else if (a instanceof Double)
		{
			if (b instanceof Integer)
				return (Double) a / (Integer) b;
			else if (b instanceof Double)
				return (Double) a / (Double) b;

		}

		$.error("operator / can not be applied:" + getType(a) + "," + getType(b));
		$.die();
		return null;
	}

	public static Object Mod(Object a, Object b)
	{

		if (a instanceof Integer && b instanceof Integer)
		{
			return (Integer) a % (Integer) b;
		}

		$.error("operator % can not be applied:" + getType(a) + "," + getType(b));
		$.die();
		return null;
	}

	public static Object And(Object a, Object b)
	{

		if (a instanceof Boolean && b instanceof Boolean)
		{
			return (Boolean) a && (Boolean) b;
		}

		$.error("operator && can not be applied:" + getType(a) + "," + getType(b));
		$.die();
		return null;
	}

	public static Object Or(Object a, Object b)
	{

		if (a instanceof Boolean && b instanceof Boolean)
		{
			return (Boolean) a || (Boolean) b;
		}

		$.error("operator || can not be applied:" + getType(a) + "," + getType(b));
		$.die();
		return null;
	}


	public static Object lessThan(Object a, Object b)
	{
		if (a instanceof Integer)
		{
			if (b instanceof Integer)
				return (Integer) a < (Integer) b;
			else if (b instanceof Double)
				return (Integer) a < (Double) b;
		}
		else if (a instanceof Double)
		{
			if (b instanceof Integer)
				return (Double) a < (Integer) b;
			else if (b instanceof Double)
				return (Double) a < (Double) b;

		}


		$.error("operator < can not be applied:" + getType(a) + "," + getType(b));
		$.die();
		return null;
	}

	public static Object lessThanEquals(Object a, Object b)
	{
		if (a instanceof Integer)
		{
			if (b instanceof Integer)
				return (Integer) a <= (Integer) b;
			else if (b instanceof Double)
				return (Integer) a <= (Double) b;
		}
		else if (a instanceof Double)
		{
			if (b instanceof Integer)
				return (Double) a <= (Integer) b;
			else if (b instanceof Double)
				return (Double) a <= (Double) b;

		}


		$.error("operator <= can not be applied:" + getType(a) + "," + getType(b));
		$.die();
		return null;
	}


	public static Object greatThan(Object a, Object b)
	{
		if (a instanceof Integer)
		{
			if (b instanceof Integer)
				return (Integer) a > (Integer) b;
			else if (b instanceof Double)
				return (Integer) a > (Double) b;
		}
		else if (a instanceof Double)
		{
			if (b instanceof Integer)
				return (Double) a > (Integer) b;
			else if (b instanceof Double)
				return (Double) a > (Double) b;

		}


		$.error("operator > can not be applied:" + getType(a) + "," + getType(b));
		$.die();
		return null;
	}

	public static Object greatThanEqual(Object a, Object b)
	{
		if (a instanceof Integer)
		{
			if (b instanceof Integer)
				return (Integer) a >= (Integer) b;
			else if (b instanceof Double)
				return (Integer) a >= (Double) b;
		}
		else if (a instanceof Double)
		{
			if (b instanceof Integer)
				return (Double) a >= (Integer) b;
			else if (b instanceof Double)
				return (Double) a >= (Double) b;

		}


		$.error("operator >= can not be applied:" + getType(a) + "," + getType(b));
		$.die();
		return null;
	}


	public static Object equals(Object a, Object b)
	{
		if (a instanceof Integer)
		{
			if (b instanceof Integer)
				return (Integer) a == (Integer) b;
			else if (b instanceof Double)
				return ((Integer)a).doubleValue() == ((Double) b).doubleValue();
		}
		else if (a instanceof Double)
		{
			if (b instanceof Integer)
				return ((Double)a).doubleValue() == ((Integer) b).doubleValue();
			else if (b instanceof Double)
				return (Double) a == (Double) b;
		}
		else if (a instanceof Boolean && b instanceof Boolean)
		{
			return (Boolean)a==(Boolean) b;
		}
		else if(a instanceof String && b instanceof String)
		{
			return a.equals(b);
		}
		else if(a instanceof Function && b instanceof Function)
		{
			return a==b;
		}

		return false;
	}

	public static Object notEquals(Object a, Object b)
	{
		if (a instanceof Integer)
		{
			if (b instanceof Integer)
				return (Integer) a != (Integer) b;
			else if (b instanceof Double)
				return ((Integer)a).intValue() != ((Double) b).doubleValue();
		}
		else if (a instanceof Double)
		{
			if (b instanceof Integer)
				return ((Double)a).doubleValue() != ((Integer) b).intValue();
			else if (b instanceof Double)
				return (Double) a != (Double) b;
		}
		else if (a instanceof Boolean && b instanceof Boolean)
		{
			return (Boolean)a!=(Boolean) b;
		}
		else if(a instanceof String && b instanceof String)
		{
			return !a.equals(b);
		}
		else if(a instanceof Function && b instanceof Function)
		{
			return a!=b;
		}

		return true;
	}















	private static String getType(Object object)
	{
		if (object instanceof Integer)
			return "int";
		else if (object instanceof Double)
			return "double";
		else if (object instanceof String)
			return "string";
		else if (object instanceof Boolean)
			return "boolean";
		else if (object instanceof Function)
			return "function";
		else
			return object.getClass().getName();
	}

	public static Object not(Object value)
	{
		if (!(value instanceof Boolean))
			$.die("operator ! can not be applied for "+getType(value));

		return ! (Boolean) value;
	}
}
