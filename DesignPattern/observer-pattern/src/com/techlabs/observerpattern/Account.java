package com.techlabs.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String email;
	private int acc_no;
	private String name;
	private double balance;
	private List<IBalanceChangeObserver> observers;

	public Account(int acc_no, String name, double balance) {
		this.acc_no = acc_no;
		this.name = name;
		this.balance = balance;
		observers = new ArrayList<IBalanceChangeObserver>();
	}

	public void deposite(double amount) {
		this.balance = this.balance + amount;
		notifyObservers();

	}

	public void withdraw(double amount) {
		this.balance = this.balance - amount;
		notifyObservers();
	}

	public void addObserver(IBalanceChangeObserver ib) {
		observers.add(ib);
	}

	public String getEmail() {
		return email;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public List<IBalanceChangeObserver> getObservers() {
		return observers;
	}

	private void notifyObservers() {
		for (IBalanceChangeObserver ib : observers)
			ib.balanceChange(this);
	}
}
