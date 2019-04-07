package com.techlabs.ocp.solution.test;

import com.techlabs.ocp.solution.FixedDeposit;
import com.techlabs.ocp.solution.Holi;

public class TestFixedDeposit {

	public static void main(String[] args) {
		FixedDeposit fd=new FixedDeposit(101,"Yogita",10000,2,new Holi());
		System.out.println(fd.calculateSimpleInterest());
	}

}
