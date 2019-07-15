package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestStatement {

	public static void main(String[] args) {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:4040/swabhav?" + "user=root&password=root");
			stmt = conn.createStatement();
			Scanner sc=new Scanner(System.in);
			String no=sc.nextLine();
		    rs = stmt.executeQuery("SELECT * FROM dept where deptno="+no);
		    while (rs.next()) {
		        System.out.println( rs.getInt(1)+"||"+rs.getString(2)+"||"+rs.getString(3));
		    }
		}
		catch(Exception ex){
			
		}
	}

}
