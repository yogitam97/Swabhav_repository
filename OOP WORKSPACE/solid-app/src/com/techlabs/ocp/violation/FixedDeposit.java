package com.techlabs.ocp.violation;

public class FixedDeposit {
	private int accno;
	private String name;
	private double principal;
	private int years;
	private FestivalType festival;
	
	public FixedDeposit(int accno, String name, double principal, int years, FestivalType festival) {
		this.accno = accno;
		this.name = name;
		this.principal = principal;
		this.years = years;
		this.festival = festival;
	}
	public double calculateSimpleInterest() {
		if(this.festival==FestivalType.HOLI) {
			return principal*0.08*years;	
		}
		if(this.festival==FestivalType.NEW_YEAR) {
			return principal*0.085*years; 
		}
		if(this.festival==FestivalType.NORMAL) {
			return principal*0.07*years;
		}
		return 0;	

	}
	
}