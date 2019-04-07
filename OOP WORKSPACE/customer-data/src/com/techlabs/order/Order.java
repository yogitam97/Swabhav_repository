package com.techlabs.order;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.techlabs.lineitem.LineItem;

public class Order {
	private int id;
	private String date;
	private List<LineItem> lineitems;
	
	public Order() {
		 lineitems=new ArrayList<LineItem>();
	}
	
	public Order(int id,String date,ArrayList<LineItem> lineitems) {
		this.id=id;
		this.date=date;
		this.lineitems=lineitems;
	}
	
	public void addLineItem(LineItem lineitem) {
		if(!lineitems.isEmpty()) {
			for(int index=0;index<lineitems.size();index++) {
				if(lineitem.getProduct().getId()==lineitems.get(index).getProduct().getId())
					lineitems.get(index).setQuantity(lineitem.getQuantity()+lineitems.get(index).getQuantity());
					return;
			}	
		}
		if(lineitems.isEmpty()) {
		lineitems.add(lineitem);
		}	
	}
	
	public double checkOutPrice() {
		double totalPrice=0;
		for(LineItem lineitem:lineitems) {
			totalPrice=lineitem.lineItemTotalCost()-lineitem.getProduct().getTotalCost();
		}
		return totalPrice;
	}
	
	public String toString() {
		return " "+id+" "+date+" "+lineitems;
	}
	public int getId() {
		return id;
	}
	public String getDate() {
		return date;
	}
	public List<LineItem> getLineitems() {
		return lineitems;
	}
	
}
