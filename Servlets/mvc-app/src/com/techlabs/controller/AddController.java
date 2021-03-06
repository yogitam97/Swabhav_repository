package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;
import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.CardType;
import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;

/**
 * Servlet implementation class AddController
 */
@WebServlet("/AddCustomer")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CardType card;
	private Customer customer;
	String id;

	public AddController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("inside get method");
			RequestDispatcher view = request.getRequestDispatcher("AddCustomer.jsp");
			view.forward(request, response);
	
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
		PrintWriter out = response.getWriter();
		
		String firstName = request.getParameter("firstName").toString();
		String lastName = request.getParameter("lastName").toString();
		if( request.getParameter("id") == null) {
			id=UUID.randomUUID().toString();
		}
		
		double balance = Double.parseDouble(request.getParameter("balance"));
		String date = request.getParameter("dob").toString();
		System.out.println(firstName);

		if (request.getParameter("myRadio").toString().equals("CREDIT")) {
			card = CardType.CREDIT_CARD;
		}
		if (request.getParameter("myRadio").toString().equals("DEBIT")) {
			card = CardType.DEBIT_CARD;
		}

		if (firstName == "" || lastName == "" || date == "") {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Please fill all details');");
			out.println("location='login.jsp';");
			out.println("</script>");
		}
		if (CustomerService.getInstance().getCustomerById(id) != null) {
			Customer c1 = CustomerService.getInstance().getCustomerById(id);
			c1.setBalance(balance);
			c1.setId(id);
			c1.setFirstName(firstName);
			c1.setLastName(lastName);
			c1.setDob(date);
			if(card.equals(null)) {
				c1.setCard(CardType.NULL);
			}
			
			return;
		}
		customer = new Customer(id,firstName, lastName, date, balance, card);
		System.out.println(id+" "+firstName+""+lastName+""+date+""+balance+""+card);
		CustomerService.getInstance().addCustomers(customer);
		response.sendRedirect("customer");
	}

}
