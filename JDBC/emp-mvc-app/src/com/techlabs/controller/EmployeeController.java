package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.service.EmployeeService;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/Employee")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EmployeeController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeService es=new EmployeeService();
		request.setAttribute("Employees", es.getData());
		RequestDispatcher view=request.getRequestDispatcher("employee.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
