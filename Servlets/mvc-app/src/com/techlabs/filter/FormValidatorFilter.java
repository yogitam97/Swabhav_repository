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

import com.techlabs.model.CardType;

/**
 * Servlet Filter implementation class FormValidatorFilter
 */
@WebFilter("/Add")
public class FormValidatorFilter implements Filter {
	private CardType card;
    public FormValidatorFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String errorPage="errorPage.jsp";
		HttpServletRequest hsr=(HttpServletRequest)request;
		
		if (request.getParameter("firstName").toString() == null || "".equals(request.getParameter("firstName").toString())
                || request.getParameter("lastName").toString() == null || "".equals(request.getParameter("lastName").toString())
                || request.getParameter("dob").toString()==null || "".equals(request.getParameter("dob").toString())
                || request.getParameter("balance").toString()==null || "".equals(request.getParameter("balance").toString())) {

            request.setAttribute("errMsg", "One or more fields are empty");
            RequestDispatcher rd = request.getRequestDispatcher("AddCustomer.jsp");
            rd.forward(request, response);
            return;
		}
		String fname=request.getParameter("firstName").toString();
		String lname=request.getParameter("lastName").toString();
		
		double balance=Double.parseDouble(request.getParameter("balance"));
		String date=request.getParameter("dob").toString();
		
		if(request.getParameter("myRadio").toString().equals("CREDIT")) {
			card=CardType.CREDIT_CARD;
		}
		if(request.getParameter("myRadio").toString().equals("DEBIT")) {
			card=CardType.DEBIT_CARD;
		}
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
