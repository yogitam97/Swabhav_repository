package com.techlabs.actions;


import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.ContactService;

public class DeleteAction implements Action {
	
	
	public DeleteAction() {
		
		
	}

	@Override
	public String execute() throws Exception {
		String id = ServletActionContext.getRequest().getParameter("id");
		System.out.println(id);
		ContactService.getInstance().getOBJ(id);
		ContactService.getInstance().deleteFromList(id);
		return this.SUCCESS;
	}
	

}

