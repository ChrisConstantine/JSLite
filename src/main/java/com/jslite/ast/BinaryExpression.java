package com.jslite.ast;

import com.jslite.$;
import com.jslite.runtime.Compute;
import com.jslite.runtime.ScopeNode;

/**
 * Created by Constantine on 2017-05-21 0021.
 */

public class BinaryExpression extends Expression
{
	private Operator operator;
	private Expression left;
	private Expression right;

	public BinaryExpression(Operator operator, Expression left, Expression right)
	{
		this.operator = operator;
		this.left = left;
		this.right = right;
	}

	public Operator getOperator()
	{
		return operator;
	}

	public Expression getLeft()
	{
		return left;
	}

	public Expression getRight()
	{
		return right;
	}

	@Override
	public Object eval(ScopeNode environment)
	{
		Object leftValue=left.eval(environment);
		Object rightValue=right.eval(environment);

		switch (operator)
		{
			case ADD:
				return Compute.Addition(leftValue,rightValue);
			case SUB:
				return Compute.Subtraction(leftValue,rightValue);
			case DIV:
				return Compute.Division(leftValue,rightValue);
			case MUL:
				return Compute.Multiplicative(leftValue,rightValue);
			case MOD:
				return Compute.Mod(leftValue,rightValue);
			case LT:
				return Compute.lessThan(leftValue,rightValue);
			case GT:
				return Compute.greatThan(leftValue,rightValue);
			case EQ:
				return Compute.equals(leftValue,rightValue);
			case NEQ:
				return Compute.notEquals(leftValue,rightValue);
			case LTE:
				return Compute.lessThanEquals(leftValue,rightValue);
			case GTE:
				return Compute.greatThanEqual(leftValue,rightValue);
			case AND:
				return Compute.And(leftValue,rightValue);
			case OR:
				return Compute.Or(leftValue,rightValue);
			default:
				$.error("error");
				$.die();
		}

		return null;
	}


}
