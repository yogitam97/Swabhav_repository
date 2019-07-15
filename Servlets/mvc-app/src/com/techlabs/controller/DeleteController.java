package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;

/**
 * Servlet implementation class DeleteController
 */
@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String url = "";
	public DeleteController() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String id = request.getParameter("Id");
		HttpSession session = request.getSession(false);
		url="DeleteController?Id="+id;
		request.setAttribute("url",url);
		System.out.println("in delete "+request.getAttribute("url"));
		if (session.getAttribute("username") != null) {
			
			System.out.println(id);
			CustomerService.getInstance().deleteCustomer(id);
			response.sendRedirect("customer");
		} else {
			RequestDispatcher view = request.getRequestDispatcher("LoginController");
			view.forward(request, response);
	
		}

		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
