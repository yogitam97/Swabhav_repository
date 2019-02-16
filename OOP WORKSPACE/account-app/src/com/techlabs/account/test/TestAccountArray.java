package com.techlabs.account.test;

import com.techlabs.account.*;

public class TestAccountArray {

	public static void main(String[] args) {
		Account arr[] = new Account[3];
		arr[0] = new Account(101, "yogita", 1000);
		arr[1] = new Account(102, "shekhar", 1500);
		arr[2] = new Account(103, "deepak", 900);
		printDetails(arr[0]);
		printDetails(arr[1]);
		printDetails(arr[2]);
		Account max = Maxbal(arr);
		printDetails(max);

	}

	public static Account Maxbal(Account arr[]) {
		double max = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i].getbalance()) {
				max = arr[i].getbalance();
				index = i;
			}

		}
		return arr[index];
	}

	public static void printDetails(Account a) {
		System.out.println("Account no is:" + a.getaccno() + " Name of account holder:" + a.getname() 
		+ " Balance is:"+ a.getbalance());

	}

}
