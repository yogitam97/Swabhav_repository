package com.techlabs.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter({ "/AuthenticationFilter","/AddCustomer" })
public class AuthenticationFilter implements Filter {

    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {


HttpServletRequest httpRequest = (HttpServletRequest) request;
		String url="";
		String reqURL= httpRequest.getRequestURI();
		System.out.println("url is: "+reqURL);
		String[] arrayStr = reqURL.split("/");
		url = url + arrayStr[2];
		if( httpRequest.getParameter("Id")!=null) {
			url = url +"?Id=" +httpRequest.getParameter("Id");
		}
		HttpServletResponse httpResponse = (HttpServletResponse )response;
		HttpSession session = httpRequest.getSession();
		boolean isLoggedIn= (session.getAttribute("userName")!= null);
		

		if(isLoggedIn) {
			chain.doFilter(request, response);
			return;	 
		}
		  httpRequest.setAttribute("url", url);
		  session.setAttribute("url", url);
	      RequestDispatcher view= httpRequest.getRequestDispatcher("LoginController");
	      view.forward(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
