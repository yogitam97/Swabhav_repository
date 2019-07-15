package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Users;
import com.techlabs.service.CustomerService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String url = "";
	private List<Users> users=new ArrayList();
	private Users user;

	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		url =  request.getAttribute("url").toString();
		session.setAttribute("url", url);
		System.out.println("in login conreoller url is:"+url);
		RequestDispatcher view = request.getRequestDispatcher("login.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		url =  session.getAttribute("url").toString();

		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		if (username.equals(password)) {
			user=CustomerService.getInstance().getUser().get(0);
	
				if(username.equalsIgnoreCase(user.getUsername())&& password.equals(user.getPassword()) ){
					System.out.println("username found");
					session.setAttribute("username", username);
					RequestDispatcher view = request.getRequestDispatcher(url);
					view.forward(request, response);
					response.sendRedirect(url);
					return;
				}
				else {
					out.println("wrong password");
				}
			}
			
			
		 else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('User or password incorrect');");
			out.println("location='login.jsp';");
			out.println("</script>");
		}
		out.close();
	}

}
