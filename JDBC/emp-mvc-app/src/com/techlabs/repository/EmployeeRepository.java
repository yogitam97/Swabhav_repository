package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Employee;

public class EmployeeRepository {
	private List<Employee> employees = new ArrayList();

	public void loadData() {
		System.out.println("loadin...");
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			stmt = conn.createStatement();

			String query = "SELECT * FROM emp";
			PreparedStatement ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("inside while");
				Employee emp = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
						rs.getString(5),rs.getInt(6),rs.getString(7),rs.getInt(8));
				employees.add(emp);
				//System.out.println(rs.getInt(1) + "||" + rs.getString(2) + "||" + rs.getString(3));
			}
			conn.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public List<Employee> getEmployees() {
		System.out.println("hiii");
		return employees;
	}
}
