package com.techlabs.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestTransaction {

	static Connection conn;

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			conn.setAutoCommit(false);
			String sql = "INSERT INTO CUSTOMERS(ID,FIRST_NAME,LAST_NAME,DOB,BALANCE,CARD) VALUES(?,?,?,?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, "10");
			preparedStatement.setString(2, "Shekhar");
			preparedStatement.setString(3, "Patil");
			preparedStatement.setString(4, "1/2/2009");
			preparedStatement.setInt(5, 2000);
			preparedStatement.setString(6, "CREDIT");
			preparedStatement.executeUpdate();

			String sql1 = "INSERT INTO CUSTOMERS(ID,FIRST_NAME,LAST_NAME,DOB,BALANCE,CARD) VALUES(?,?,?,?,?,?)";
			preparedStatement = conn.prepareStatement(sql1);
			preparedStatement.setString(1, "10");
			preparedStatement.setString(2, "Yogita");
			preparedStatement.setString(3, "More");
			preparedStatement.setString(4, "14/08/1997");
			preparedStatement.setInt(5, 20000);
			preparedStatement.setString(6, "CREDIT");
			preparedStatement.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			conn.rollback();
		}

	}
}
