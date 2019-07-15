package com.techlabs.actions;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private String msg;

	@Override
	public String execute() throws Exception {
		System.out.println("login action");
		return this.SUCCESS;
	}

	@Override
	public void validate() {
		if (this.username != null && this.password != null) {
			if (username.trim().equals("")) {
				addFieldError("username", "username can't be blank.");
			}
			if (password.trim().equals("")) {
				addFieldError("password", "password can't be blank.");
			}
			if (this.username.trim().equals("") && this.password.trim().equals("")) {
				addActionError("Fill all fields");
				return;
			}
			if (this.username.equals(this.password)) {
				this.msg = "Login succesful!" + this.username;
				return;
			}
			System.out.println("failed");
			this.msg = "Login failed!!";
			return;
			// doLogin();
		}
	}

	public String doLogin() {
		if (this.username.equals(this.password)) {
			this.msg = "Login succesful!" + this.username;
			return "true";
		}
		System.out.println("failed");
		this.msg = "Login failed!!";
		return "false";
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMsg() {
		return this.msg;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
