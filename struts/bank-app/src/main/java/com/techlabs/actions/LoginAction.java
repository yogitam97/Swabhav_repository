package com.techlabs.actions;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;
import com.techlabs.viewmodel.LoginVM;

public class LoginAction extends ActionSupport implements SessionAware, ModelDriven<LoginVM> {

	private SessionMap<String, Object> sessionMap;
	private Customer customer;
	@Autowired
	public CustomerService customerService;
	private LoginVM vm;

	public LoginAction() {
		vm = new LoginVM();
	}

	public void validate() {
		if (vm.getUsername() != null && vm.getPassword() != null) {

			try {
				customer = customerService.getPassword(vm.getUsername());
				if (customer.getPassword() == null) {
					addActionError("No User Found");
					return;
				}
				if (!customer.getPassword().equals(vm.getPassword())) {
					addActionError("Wrong password ");
					return;
				}
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			sessionMap.put("object", customer);
			sessionMap.put("User", customer.getName());
			sessionMap.put("balance", customer.getBalance());

		}
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap) session;
	}

	public String execute() {
		return this.SUCCESS;
	}

	@Override
	public LoginVM getModel() {
		return vm;
	}

}
