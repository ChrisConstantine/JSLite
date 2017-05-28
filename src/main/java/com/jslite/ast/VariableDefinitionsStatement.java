package com.jslite.ast;

import com.jslite.runtime.Action;
import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class VariableDefinitionsStatement extends Statement
{
	private VariableDefinition[] variableDefinitions;

	public VariableDefinitionsStatement(VariableDefinition[] variableDefinitions)
	{
		this.variableDefinitions = variableDefinitions;
	}

	@Override
	public Action execute(ScopeNode environment)
	{
		for (int i = 0; i < variableDefinitions.length; i++)
		{
			VariableDefinition variableDefinition=variableDefinitions[i];

			Identifier identifier=variableDefinition.getIdentifier();

			Expression expression=variableDefinition.getExpression();

			Object value;
			if(expression==null)
				value=null;
			else
				value=expression.eval(environment);

			environment.add(identifier,value);
		}

		return Action.NOTHING;
	}

	public VariableDefinition[] getVariableDefinitions()
	{
		return variableDefinitions;
	}
}
