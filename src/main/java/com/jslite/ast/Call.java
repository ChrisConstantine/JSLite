package com.jslite.ast;

import com.jslite.$;
import com.jslite.runtime.Function;
import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class Call extends Expression
{
	private Identifier identifier;
	private Expression[] arguments;

	public Call(Identifier identifier, Expression[] arguments)
	{
		this.identifier = identifier;
		this.arguments = arguments;
	}

	public Identifier getIdentifier()
	{
		return identifier;
	}

	public Expression[] getArguments()
	{
		return arguments;
	}

	@Override
	public Object eval(ScopeNode environment)
	{
		Object[] args = new Object[arguments.length];
		for (int i = 0; i < args.length; i++)
			args[i] = arguments[i].eval(environment);

		Object fun = environment.lookUp(identifier);

		if (fun==null)
			$.die("not found such function:"+identifier);
		else if (!(fun instanceof Function))
			$.die(identifier+" is not a function");
		else
			return ((Function)fun).call(args);

		return null;
	}
}
