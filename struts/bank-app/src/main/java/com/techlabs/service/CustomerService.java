package com.techlabs.service;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Customer;
import com.techlabs.repository.CustomerRepository;
@Service("customerService")
public class CustomerService {
	@Autowired
	private CustomerRepository cr;
	
	private CustomerService () {
		System.out.println("service created");
	}
	
	public boolean addCustomer(Customer customer) throws SQLException  {	
		return cr.addCustomerToDB(customer);
	}
	public Customer getPassword(String username) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		return cr.getCustomer(username);
	}
	public void doTransaction(String name,String amount,String transaction) throws SQLException {
		cr.doTransaction(name,amount,transaction);
		
	}
	public void getPassbookdetails(Object object) {
		// TODO Auto-generated method stub
		
	}
	

}
