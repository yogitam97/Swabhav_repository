package com.techlabs.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletListener implements ServletContextListener {
	 
	  public void contextInitialized(ServletContextEvent arg0) {
	    System.out.println("Servlet Context is initialized....");
	  }
	 
	  public void contextDestroyed(ServletContextEvent arg0) {
	    System.out.println("Servlet Context is destroyed....");
	  }


	}
