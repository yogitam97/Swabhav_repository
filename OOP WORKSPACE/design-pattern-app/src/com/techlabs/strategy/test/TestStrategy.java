package com.techlabs.strategy.test;

import com.techlabs.strategy.Context;
import com.techlabs.strategy.OperationAdd;
import com.techlabs.strategy.OperationDivision;

public class TestStrategy {

	public static void main(String[] args) {
		Context context=new Context(new OperationAdd());
		System.out.println(context.runStrategy(10, 5));
		context=new Context(new OperationDivision());
		System.out.println(context.runStrategy(10, 5));
	}

}
