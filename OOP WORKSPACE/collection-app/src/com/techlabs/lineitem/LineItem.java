package com.techlabs.lineitem;

import java.util.Comparator;

public class LineItem implements Comparable<LineItem>{
	private int id;
	private String name;
	private double cost;
	private int quantity;
	
	public LineItem(int id,String name,double cost,int quantity) {
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.quantity=quantity;
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

	public int getQuantity() {
		return quantity;
	}
	public double calculateTotal() {
		return quantity*cost;
	}

	@Override
	public int compareTo(LineItem o) {
		return id-o.id;
	}
}
