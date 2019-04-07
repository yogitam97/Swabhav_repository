package com.techlabs.ocp.solution;

import com.techlabs.ocp.violation.FestivalType;

public class FixedDeposit {
	private int accno;
	private String name;
	private double principal;
	private int years;
	private IFestival festival;
	
	public FixedDeposit(int accno, String name, double principal, int years, IFestival festival) {
		this.accno = accno;
		this.name = name;
		this.principal = principal;
		this.years = years;
		this.festival = festival;
	}
	public double calculateSimpleInterest() {
		return principal*years*festival.calculateRate();	
	}
	
}
