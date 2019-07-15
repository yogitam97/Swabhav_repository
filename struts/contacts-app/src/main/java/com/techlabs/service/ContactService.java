package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Contact;
import com.techlabs.repository.ContactRepository;

public class ContactService {
	
	private static ContactService instance;
	
	private List<Contact> contact = new ArrayList<Contact>();
	ContactRepository cr = new  ContactRepository();
	
	private ContactService() {
		
	}
	
	public static ContactService getInstance() {
		if (instance == null) {
			instance = new ContactService();
		}
		return instance;
	}
	
	public List getData() {
		
		return contact=cr.getData();
		
	}
	public void updateData(Contact c,String id) {
		cr.update(c,id);
	}
	
	public void addData(Contact c) {
		cr.addData(c);
	}

	public void deleteFromList(String id) {
		
		cr.removeFromList(id);
		
	}

	public Contact getOBJ(String id) {
		System.out.println(id);
		return cr.getObject(id);
		
	}

}
