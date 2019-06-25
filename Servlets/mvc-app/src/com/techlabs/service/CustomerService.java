package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlabs.model.CardType;
import com.techlabs.model.Customer;

public class CustomerService {
	private static CustomerService instance;
	private Customer customer1,customer2,customer3,customer4,customer5;
	private List<Customer> customers;
	
	public CustomerService() {
		System.out.println("Inside customer service");
		customer1=new Customer("yogita","more","20/05/2019",30000,CardType.CREDIT_CARD);
		customer2=new Customer("shekhar","patil","20/05/2019",30000,CardType.CREDIT_CARD);
		customer3=new Customer("deepak","gupta","20/05/2019",30000,CardType.CREDIT_CARD);
		customer4=new Customer("abhishek","londhe","20/05/2019",30000,CardType.CREDIT_CARD);
		customer5=new Customer("pranjal","khule","20/05/2019",30000,CardType.CREDIT_CARD);
		customers=new ArrayList();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
	}
	public static CustomerService getInstance() {
		if(instance==null) {
			instance=new CustomerService();
		}
		return instance;
	}
	public void addCustomers(Customer customer) {
		customers.add(customer);
	}
	public void deleteCustomer(String id) {
		for(Customer c:customers) {
			if(c.getId().equals(id)) {
				customers.remove(c);
				return;
			}
		}
	}
	public Customer getCustomerById(String id) {
		String newId="";
		if(id==null) {
			id = UUID.randomUUID().toString();
		}else {
			String[] splitId=id.split("id");
			 newId=splitId[0];	
		}
		for(Customer c:customers) {
			if(c.getId().equals(id)) {
				return c;
			}
		}
		
		return null;
	}
	public List<Customer> getCustomers(){
		return customers;
	}
}
