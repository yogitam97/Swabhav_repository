package com.techlabs.customer.presentation;

import com.techlabs.customer.*;
import com.techlabs.customer.details.CustomerStore;
import com.techlabs.customer.service.Customer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Presentation {
	public void userMenu() throws IOException {
		CustomerStore customerStore = new CustomerStore();
		List<Customer> customers = new ArrayList();
		List<Customer> search = new ArrayList();
		Scanner sc = new Scanner(System.in);
		String choice;
		boolean notExit = true;
		while (notExit) {
			System.out.println("Please enter your choice:\n 1 for adding customer\n "
					+ "2 for display all customers\n 3 for search the customer\n 4 for exit");
			choice = sc.nextLine().toLowerCase();
			switch (choice) {
			case "add":
				System.out.println("Enter first name of customer:");
				String firstname = sc.nextLine();
				System.out.println("Enter last name:");
				String lastname = sc.nextLine();
				System.out.println("Enter credit card type:");
				String creditCardType = sc.nextLine();
				System.out.println("Enter the balance:");
				double balance = sc.nextDouble();
				Customer customer = new Customer(firstname, lastname, creditCardType, balance);
				customerStore.add(customer);
				break;
			case "show":
				customers = customerStore.getCustomers();
				System.out.println(customers);
				break;
			case "find":
				System.out.println("Enter the balance of the customer to search:");
				double searchBalance = sc.nextDouble();
				search = customerStore.searchCustomer(searchBalance);
				System.out.println(search);
				break;
			case "exit":
				System.out.println("Thank you!");
				notExit = false;
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}

}
