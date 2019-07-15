package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;

public class PassbookAction implements SessionAware,Action{

	private List<Customer> customer = new ArrayList(); 
	SessionMap<String,Object> sessionMap;
	@Autowired
	public CustomerService customerService;

	@Override
	public void setSession(Map<String, Object> session) {
		
		 sessionMap=(SessionMap)session;
		
	}
	@Override
	public String execute() throws Exception {
		
		if(sessionMap.get("User")!=null) {
			customerService.getPassbookdetails(sessionMap.get("User"));
		}

		return this.SUCCESS;
	}

}
