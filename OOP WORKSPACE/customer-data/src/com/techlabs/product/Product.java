package com.techlabs.product;


public class Product {
	private int id;
	private String name;
	private float discount;
	private double cost;
	private double totalCost;

	public Product(int id, String name, float discount, double cost) {
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.cost = cost;
	}
	public void calculateTotalCost() {
		totalCost=cost-(cost*discount);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Product product = (Product) obj;
		return id == product.id && name == product.name;
	}

	@Override
	public int hashCode() {
		return this.id;
	}
	public String toString() {
		return "|"+id+"|"+name+"|"+discount+"|"+cost;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getDiscount() {
		return discount;
	}
	public double getCost() {
		return cost;
	}
	public double getTotalCost() {
		return totalCost;
	}
	
}
