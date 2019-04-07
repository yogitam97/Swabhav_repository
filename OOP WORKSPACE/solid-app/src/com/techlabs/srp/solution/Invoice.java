package com.techlabs.srp.solution;


public class Invoice {
	private int id;
	private String name;
	private double cost;
	private float discount;
	private final float GST=0.12f;
	
	public Invoice(int id, String name, double cost, float discount) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
	}
	public double calculateTax() {
		return cost*GST;
	}
	public double calculateDiscount() {
		return (cost*discount);
	}
	public double finalCost() {
		return cost-calculateDiscount()+calculateTax();
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getCost() {
		return cost;
	}
	public float getDiscount() {
		return discount;
	}
	public float getGST() {
		return GST;
	}
}

