package com.techlabs.account.test;
import com.techlabs.account.*;
public class TestAccount {

	public static void main(String[] args) {
		Account acc1=new Account(101,"yogita",1000.0);
		printDetails(acc1);
		Account acc2=new Account(102,"deepak",500.0);
		printDetails(acc2);
		acc1.withdraw(200);
		printDetails(acc1);
		
	}
	public static void printDetails(Account a) {
		System.out.println("Account no is:"+a.getaccno()+" Name of account holder:"
	+a.getname()+" Balance is:"+a.getbalance()+"No of transactions:"+a.getTransactionCount());
		
	}

}
