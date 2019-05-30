package com.techlabs.account.proxy;

import java.time.LocalTime;

import com.techlabs.account.Account;
import com.techlabs.account.IAccount;

public class ProxyAccount extends Account {

	private LocalTime time = LocalTime.now();

	public ProxyAccount(int acc_no, String name, double balance) {
		super(acc_no, name, balance);
	}

	@Override
	public void deposite(double amount) {
		super.deposite(amount);
		System.out.println("Time is:" + time);
	}

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		System.out.println("Time is:" + time);
	}

	public double getBalance() {
		return super.getBalance();
	}

	public LocalTime getTime() {
		return time;
	}

}
