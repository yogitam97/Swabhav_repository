package com.techlabs.customer.details;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.customer.service.Customer;

public class CustomerStore {
	int count = 0;
	private List customers;

	public CustomerStore() {
		customers = new LinkedList();
	}

	public void add(Customer customer) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\SANJAY\\Desktop\\customer.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		customers.add(customer);
		pw.println("\n" + customer.toString());
		pw.close();

	}

	public List<Customer> getCustomers() {
		List<Customer> customer = new LinkedList();
		for (Iterator i = customers.iterator(); i.hasNext();) {
			Customer c = (Customer) i.next();
			customer.add(c);
		}
		return customer;
	}

	public List<Customer> searchCustomer(double balance) {
		List<Customer> listOfCustomers = new LinkedList();
		for (Iterator i = customers.iterator(); i.hasNext();) {
			Customer customer = (Customer) i.next();
			if (customer.getBalance() == balance)
				listOfCustomers.add(customer);
		}
		return listOfCustomers;
	}

}
