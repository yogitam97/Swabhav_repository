package com.techlabs.viewmodel;

import com.techlabs.model.Customer;

public class LoginVM {
	private String username;
	private String password;

	public LoginVM() {

	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
