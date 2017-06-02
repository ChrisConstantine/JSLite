package com.jslite.runtime;

import com.jslite.$;
import com.jslite.ast.Identifier;
import com.jslite.ast.Statement;

/**
 * Created by Constantine on 2017-05-24 0024.
 */

public class CustomerFunction extends Function
{
	/**
	 * 闭包环境
	 */
	private ScopeNode closure;

	/**
	 * 参数列表
	 */
	private Identifier[] argumentList;

	/**
	 * 函数体
	 */
	private Statement[] bodyStatements;

	public CustomerFunction(ScopeNode closure, Identifier[] argumentList, Statement[] bodyStatements)
	{
		this.closure = closure;
		this.argumentList = argumentList;
		this.bodyStatements = bodyStatements;
	}

	@Override
	public Object call(Object[] args)
	{
		if(argumentList.length!=args.length)
			$.die("function required "+argumentList.length+" argument(s),but "+args.length+" argument(s) given");

		Status.enterFunction();

		ScopeNode currentScope=new ScopeNode(closure);
		for (int i = 0; i < argumentList.length; i++)
			currentScope.add(argumentList[i],args[i]);

		Action.RETURN.returnValue=null;

		for (int i = 0; i < bodyStatements.length; i++)
		{
			Action action = bodyStatements[i].execute(currentScope);

			switch (action)
			{
				case NOTHING:
					continue;
				case RETURN:
					Status.leaveFunction();
					return action.returnValue;
				case BREAK:
					$.error("break outside loop");
				case CONTINUE:
					$.error("continue outside loop");
			}
		}

		Status.leaveFunction();

		return null;
	}


}
