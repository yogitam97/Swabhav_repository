package com.techlabs.lineitem;

import com.techlabs.product.Product;

public class LineItem {
	private int id;
	private int quantity;
	private Product product;
	private double totalCost;
	
	public LineItem(int id, int quantity, Product product) {
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}
	public double lineItemTotalCost() {
		totalCost=(product.getTotalCost())*quantity;
		return totalCost;
	}
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		LineItem lineitem = (LineItem) obj;
		return id == lineitem.id && quantity == lineitem.quantity;
	}

	@Override
	public int hashCode() {
		return this.id;
	}*/
	public String toString() {
		return " "+id+" "+quantity+" "+product;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public int getId() {
		return id;
	}
	public int getQuantity() {
		return quantity;
	}
	public Product getProduct() {
		return product;
	}
	
}
