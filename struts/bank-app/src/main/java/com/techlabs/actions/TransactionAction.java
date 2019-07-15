package com.techlabs.actions;


import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;

public class TransactionAction extends ActionSupport implements SessionAware {
	
	private String amount;
	private String transaction;
	@Autowired
	public CustomerService customerService;
	
	SessionMap <String,Object> sessionMap;
	
	public TransactionAction() {
		
	}

	@Override
	public void setSession(Map<String, Object> session) {
		
		sessionMap=(SessionMap)session;
		
	}
	public void validate() {
		if(this.amount!=null && this.transaction!=null) {
			
			Customer customer= (Customer) sessionMap.get("object");
			try {
				customerService.doTransaction(customer.getName(),this.amount,this.transaction);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(this.transaction);
			System.out.println(this.amount);
			
		}
		
	}
	
	@Override
	public String execute() throws Exception {
		return this.SUCCESS;
	}
	
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		
		this.transaction = transaction;
		
	}


}
