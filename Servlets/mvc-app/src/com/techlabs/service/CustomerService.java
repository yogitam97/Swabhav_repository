package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlabs.model.CardType;
import com.techlabs.model.Customer;
import com.techlabs.model.Users;
import com.techlabs.repository.CustomerRepository;

public class CustomerService {
	private static CustomerService instance;
	static CustomerRepository cr = new CustomerRepository();
	Users user=new Users();
	private List<Users> users=cr.getUsers();
	private List<Customer> customers = cr.getCustomers();

	public CustomerService() {
		System.out.println("Inside customer service");

	}

	public static CustomerService getInstance() {
		
		if (instance == null) {
			instance = new CustomerService();
			cr.loadData();
		}
		return instance;
	}

	public void addCustomers(Customer customer) {
		cr.addDataToTable(customer);
		cr.addCustomer(customer);
	}

	public void deleteCustomer(String id) {
		
		for (Customer c : customers) {
			if (c.getId().equals(id)) {
				cr.deleteFromTable(id);
				customers.remove(c);
				return;
			}
		}
		getCustomers();
	}

	public Customer getCustomerById(String id) {
		String newId = "";
		if (id == null) {
			id = UUID.randomUUID().toString();
		} else {
			String[] splitId = id.split("id");
			newId = splitId[0];
		}
		for (Customer c : customers) {
			if (c.getId().equals(id)) {
				return c;
			}
		}

		return null;
	}
	
	public void editCustomer(Customer customer) {
		cr.editDatabase(customer);
	}
	
	public List<Users> getUser() {
		users=cr.getUsers();
		return users;
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}
}
