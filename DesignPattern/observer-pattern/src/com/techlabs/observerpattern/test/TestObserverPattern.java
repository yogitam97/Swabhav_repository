package com.techlabs.observerpattern.test;

import com.techlabs.observerpattern.Account;
import com.techlabs.observerpattern.EmailObserver;
import com.techlabs.observerpattern.SMSObserver;

public class TestObserverPattern {

	public static void main(String[] args) {
		Account acc1=new Account(101,"yogita",3000);
		Account acc2=new Account(102,"shekhar",5000);
		
		acc1.addObserver(new EmailObserver());
		acc1.addObserver(new SMSObserver());
		
		acc1.withdraw(100);
		
		acc2.addObserver(new EmailObserver());
		acc2.addObserver(new SMSObserver());
		
		acc2.deposite(100);
		
	}

}
