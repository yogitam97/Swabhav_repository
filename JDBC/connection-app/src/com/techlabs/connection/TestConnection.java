package com.techlabs.connection;

import java.io.BufferedReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) throws  InstantiationException, IllegalAccessException, ClassNotFoundException {
	
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			System.out.println(conn.getClass());
			
			System.out.println("Database :"+conn.getCatalog());
			System.out.println("User :"+conn.getMetaData().getUserName());
			System.out.println("Server :"+conn.getMetaData().getURL());
			    
		}
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

}
