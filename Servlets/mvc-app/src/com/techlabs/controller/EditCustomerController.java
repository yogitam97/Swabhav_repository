package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import com.techlabs.model.CardType;
import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;

@WebServlet("/EditCustomer")
public class EditCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CardType card;
	String url = "";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		String id = request.getParameter("Id");
		url="EditCustomer?Id="+id;
		request.setAttribute("url", url);
		if (session.getAttribute("username") != null) {
			String name = (String) session.getAttribute("name");
			Customer cs = CustomerService.getInstance().getCustomerById(id);

			request.setAttribute("customerOBJ", cs);
			RequestDispatcher view = request.getRequestDispatcher("edit.jsp");
			view.forward(request, response);
		} else {
			RequestDispatcher view = request.getRequestDispatcher("LoginController");
			view.forward(request, response);
			
//			out.println("<script type=\"text/javascript\">");
//			out.println("alert('Please login first');");
//			out.println("location='login.jsp';");
//			out.println("</script>");
			
		}

		out.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("inside post of edit");

		String fname = request.getParameter("firstName").toString();
		String lname = request.getParameter("lastName").toString();
		String id = request.getParameter("id");
		double balance = Double.parseDouble(request.getParameter("balance"));
		String date = request.getParameter("dob").toString();

		if (request.getParameter("myRadio").toString().equals("CREDIT")) {
			card = CardType.CREDIT_CARD;
		}
		if (request.getParameter("myRadio").toString().equals("DEBIT")) {
			card = CardType.DEBIT_CARD;
		}
		Customer c1 = CustomerService.getInstance().getCustomerById(id);
		c1.setBalance(balance);
		c1.setFirstName(fname);
		c1.setLastName(lname);
		c1.setDob(date);
		c1.setCard(card);
		response.sendRedirect("customer");
	}
}
