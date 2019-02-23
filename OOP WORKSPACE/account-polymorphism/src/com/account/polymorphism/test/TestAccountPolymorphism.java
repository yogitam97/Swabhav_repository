package com.account.polymorphism.test;

import com.account.polymorphism.*;

public class TestAccountPolymorphism {

	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount(101, "abc", 1000);
		printDetails(s1);
		s1.deposit(5000);
		printDetails(s1);
		s1.withdraw(5600);
		printDetails(s1);
		
		CurrentAccount c1=new CurrentAccount(102,"xyz",3000);
		printDetails(c1);
		c1.withdraw(2000);
		printDetails(c1);

	}

	public static void printDetails(Account a) {
		System.out.println("accno: " + a.getAccno() +
				" name: " + a.getName() + " balance: " + a.getBalance());
	}

}
