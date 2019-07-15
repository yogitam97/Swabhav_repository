package com.techlabs.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class LogoutAction implements SessionAware ,Action{

	SessionMap< String, Object>sessionMap;
	
	@Override
	public void setSession(Map<String, Object> session) {
		
		sessionMap=(SessionMap)session;
			
		
	
	}

	@Override
	public String execute() throws Exception {
		sessionMap.invalidate();
		System.out.println("Clear");
		return this.SUCCESS;
	}

}
