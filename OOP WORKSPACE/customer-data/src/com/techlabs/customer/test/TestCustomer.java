package com.techlabs.customer.test;

import java.io.IOException;


import com.techlabs.customer.Customer;
import com.techlabs.htmlfile.HtmlFileGenerator;
import com.techlabs.lineitem.LineItem;
import com.techlabs.order.Order;
import com.techlabs.product.Product;

public class TestCustomer {

	public static void main(String[] args) throws IOException {
	
		Customer customer=new Customer("yogita","ghansoli");
		Order order=new Order();
		HtmlFileGenerator obj=new HtmlFileGenerator();
		
		Product p1=new Product(101,"Book",0.20f,100);
		Product p2=new Product(102,"Pen",0.05f,10);
		Product p3=new Product(103,"NoteBook",0.20f,150);
		Product p4=new Product(103,"NoteBook",0.20f,150);
		
		LineItem l1=new LineItem(1,3,p1);
		LineItem l2=new LineItem(1,4,p1);
		LineItem l3=new LineItem(1,4,p3);
		LineItem l4=new LineItem(1,4,p4);
		
		order.addLineItem(l1);
		order.addLineItem(l2);
		order.addLineItem(l3);
		order.addLineItem(l4);
		
		p1.calculateTotalCost();
		customer.addOrder(order);
		
		System.out.println(order.checkOutPrice());
		//obj.addToHtmlFile(customer,order);
		System.out.println(customer.getOrders());
		System.out.println(p1);
		
		System.out.println(l1.lineItemTotalCost());
		System.out.println(p1.getTotalCost());
	}

}
