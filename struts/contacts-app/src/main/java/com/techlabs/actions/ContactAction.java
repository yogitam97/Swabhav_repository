package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

public class ContactAction implements Action {
	
	private List<Contact> contact = new ArrayList();
	
	private int sizeOfList;
	
	@Override
	public String execute() throws Exception {
		this.sizeOfList=ContactService.getInstance().getData().size();
		return this.SUCCESS;
	}
	
	public int getSizeOfList() {
		return this.sizeOfList;
	}
	
	public List getContact() {
		return this.contact=ContactService.getInstance().getData();
	}
	
	

}
