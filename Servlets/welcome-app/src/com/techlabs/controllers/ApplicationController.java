package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ApplicationController
 */
@WebServlet("/application")
public class ApplicationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationController() {
        super();
        System.out.println("hello");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session= request.getSession();
		ServletContext application=getServletContext(); 
		 if(application.getAttribute("count")==null){
	            application.setAttribute("count",0);
	        }
	        Object oldValue=application.getAttribute("count");
	        int old=(int)oldValue;
	        int newValue=old+1;
	        application.setAttribute("count",newValue);
	            
	        out.println("<h3>Old value:"+old+"</h3>");
	        
	        out.println("<h3>New value:"+newValue+"</h3>");
	        out.println(session.getId());
	        out.println("<a href='summary'>Check summary here</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
