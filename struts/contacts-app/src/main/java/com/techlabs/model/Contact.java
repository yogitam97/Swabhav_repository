package com.techlabs.model;

public class Contact {
	private String id;
	
	private String name;
	private String number;
	private String address;
	private String email;
	public Contact(String id,String name, String number, String address,String email) {
		this.id=id;
		this.name = name;
		this.number = number;
		this.address = address;
		this.email=email;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Contact name=" + name + ", number=" + number + ", address=" + address + ", email=" + email + " ";
	}
}
