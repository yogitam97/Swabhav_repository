package com.techlabs.customer.test;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.customer.details.CustomerStore;
import com.techlabs.customer.presentation.Presentation;
import com.techlabs.customer.service.Customer;

public class TestCustomer {
	public static void main(String[] args) throws IOException {
		Presentation presentation=new Presentation();
		presentation.userMenu();
		
		/*List<Customer> customers = new LinkedList();
		List<Customer> search = new LinkedList();
		Customer c1 = new Customer("shekhar", "patil", "Master", 50000);
		Customer c2 = new Customer("Yogita", "more", "Master", 40000);
		Customer c3 = new Customer("Pranjal", "khule", "Master", 75000);
		Customer c4 = new Customer("Aditya", "telure", "Master", 80000);
		CustomerStore cs = new CustomerStore();
		cs.add(c1);
		cs.add(c2);
		cs.add(c3);
		cs.add(c4);
		customers = cs.getCustomers();
		// System.out.println(customer);
		search = cs.searchCustomer(75000);
		System.out.println(search);*/
	}

}
