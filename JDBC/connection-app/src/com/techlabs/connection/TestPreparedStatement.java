package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestPreparedStatement {

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
		    
		    String query="SELECT * FROM dept where deptno=?";
		    PreparedStatement stmt1 = conn.prepareStatement(query);
		    stmt1.setString(1, no);
		    rs = stmt1.executeQuery();
		    while (rs.next()) {
		    	System.out.println(rs);
		        System.out.println( rs.getInt(1)+"||"+rs.getString(2)+"||"+rs.getString(3));
		    }
		    conn.close();
		}
		catch(Exception ex){
			System.out.println("exception occured");
		}
	}

}
