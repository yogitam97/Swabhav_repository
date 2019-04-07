package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.FestivalType;
import com.techlabs.ocp.violation.FixedDeposit;

public class TestFixedDeposit {

	public static void main(String[] args) {
		FixedDeposit fd=new FixedDeposit(101,"Yogita",10000,2,FestivalType.NEW_YEAR);
		System.out.println(fd.calculateSimpleInterest());
	}

}
