package com.techlabs.customer.service;

public class Customer {
	private String firstname;
	private String lastname;
	private String creditCardType;
	private double balance;

	public Customer(String firstname, String lastname, String creditCardType, double balance) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.creditCardType = creditCardType;
		this.balance = balance;
	}

	public String toString() {
		return "" + firstname + "," + lastname + "," + creditCardType + "," + balance;
	}

	public String getFirstName() {
		return firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public double getBalance() {
		return balance;
	}

}
