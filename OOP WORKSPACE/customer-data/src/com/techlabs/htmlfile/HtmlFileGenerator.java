package com.techlabs.htmlfile;


import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;

import com.techlabs.customer.Customer;
import com.techlabs.order.Order;

public class HtmlFileGenerator {
	FileWriter fw;
	PrintWriter pw=null;
	
	public void addToHtmlFile(Customer customer,Order order) throws IOException {

	fw=new FileWriter("C:\\Users\\SANJAY\\Desktop\\orders.html",true);
	pw = new PrintWriter(fw);
	
	String addOrder = "<p>" + customer  + " " + order+ "<br/></p>";
	pw.println("\n" + addOrder);
	pw.close();
	}
}
