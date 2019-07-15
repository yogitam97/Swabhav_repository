package com.techlabs.actions;

import java.util.UUID;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

public class AddAction extends ActionSupport{
	
	private String address;
	private String name;
	private String number;
	private String email;
	
	public AddAction() {
		
	}
	public void validate() {
		if(this.name!=null || this.number!=null || this.email!=null || this.address!=null) {
		Contact contact = new Contact( UUID.randomUUID().toString() ,this.name,this.number,this.address,this.email);
		ContactService.getInstance().addData(contact);
		System.out.println(ContactService.getInstance().getData().size());
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String execute() {
		return this.SUCCESS;
	}

}
