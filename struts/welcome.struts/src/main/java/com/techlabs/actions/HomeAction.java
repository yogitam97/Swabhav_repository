package com.techlabs.actions;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class HomeAction implements Action{
	private String msg;
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public HomeAction() {
		System.out.println("Home Action constructor");
	}
	@Override
	public String execute() throws Exception {
		//this.msg=ServletActionContext.getRequest().getParameter("msg");
		return this.SUCCESS;
	}
	
	public String getMsg() {
		return this.msg;
	}

}
