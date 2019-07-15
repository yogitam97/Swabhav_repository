package com.techlabs.actions;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;
import com.techlabs.viewmodel.RegistrationVM;

public class RegisterAction extends ActionSupport implements ModelDriven<RegistrationVM> {

	private boolean queryFlag;
	RegistrationVM vm;
	@Autowired
	public CustomerService customerService;

	public RegisterAction() {
		vm = new RegistrationVM();
	}

	@Override
	public void validate() {

		if (vm.getName() != null || vm.getPassword() != null || vm.getConfirmPassword() != null
				|| vm.getBalance() != 0) {
			try {
				if (vm.getName().trim().equals("")) {
					addActionError("All fields are required");
					return;
				}
				if (vm.getBalance() == 0) {
					addActionError(vm.getName());
					addActionError("All fields are required");
					return;
				}
				if (vm.getPassword().equals(vm.getConfirmPassword()) || !vm.getName().equals("")
						|| vm.getBalance() != 0) {
					this.queryFlag = customerService
							.addCustomer(new Customer(vm.getName(), vm.getPassword(), vm.getBalance()));

				} else {
					addActionError(vm.getName());
					addFieldError("password", "password does not match");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public String execute() {
		return this.SUCCESS;
	}

	@Override
	public RegistrationVM getModel() {
		return vm;
	}

}
