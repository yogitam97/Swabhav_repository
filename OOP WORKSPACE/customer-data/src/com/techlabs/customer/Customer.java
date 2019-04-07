package com.techlabs.customer;

import java.util.HashSet;

import java.util.Set;

import com.techlabs.order.Order;

public class Customer {
	private String name;
	private String address;
	private static int id=0;
	private Set<Order> orders=new HashSet<Order>();;
	


	public Customer(String name,String address) {
		id++;
		this.name=name;
		this.address=address;
	}
	public String toString() {
		return " "+id+" "+name+" "+address+" "+orders;
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public static int getId() {
		return id;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	
}
