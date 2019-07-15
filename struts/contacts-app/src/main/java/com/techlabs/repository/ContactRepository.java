package com.techlabs.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlabs.model.Contact;

public class ContactRepository {

	private List<Contact> contact = new ArrayList<Contact>();

	public ContactRepository() {

		Contact c1 = new Contact("101", "Ram", "7666666125","mumbai ","ram@gmail.com");
		Contact c2 = new Contact("102", "Sham", "7506034344","mumbai ", "sham@gmail.com");
		Contact c3 = new Contact("103", "John", "8286554555","mumbai ", "john@gmail.com");
		contact.add(c1);
		contact.add(c2);
		contact.add(c3);

	}

	public void loadData() {

	}

	public void addData(Contact c) {
		contact.add(c);
	}

	public List getData() {
		return this.contact;
	}

	public void removeFromList(String id) {
		for(Iterator<Contact> iterator=contact.iterator();iterator.hasNext();) {
			Contact c =iterator.next();
			if(c.getId().equals(id)) {
				iterator.remove();
							}
		}

	}
	public void update(Contact c,String id) {
		for(Iterator<Contact> iterator=contact.iterator();iterator.hasNext();) {
			Contact contact=iterator.next();
			if(contact.getId().equals(id)) {
				contact.setName(c.getName());
				contact.setAddress(c.getAddress());
				contact.setNumber(c.getNumber());
				contact.setEmail(c.getEmail());
			}
		}
	}

	public Contact getObject(String id) {
		
		for (Contact c : contact) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
		
	}

}
