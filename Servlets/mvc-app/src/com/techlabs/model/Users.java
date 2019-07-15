package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Users {
	private String username;
	private String password;
	private String role;

	
	public Users() {
		
	}
	
	public Users(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getRole() {
		return role;
	}
	
	
}
