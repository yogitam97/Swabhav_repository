package com.techlabs.model;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.UUID;

public class Customer {
	private String id;
	private String firstName;
	private String lastName;
	private String dob;
	private double balance;
	private CardType card;

	public Customer( String firstName, String lastName, String dob, double balance, CardType card) {
		this.id = UUID.randomUUID().toString();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.balance = balance;
		this.card = card;
	}
	
	@Override
	public String toString() {
		return "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", balance=" + balance + ", card=" + card + "<br> ";
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setCard(CardType card) {
		this.card = card;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDob() {
		return dob;
	}

	public double getBalance() {
		return balance;
	}

	public CardType getCard() {
		return card;
	}
}
