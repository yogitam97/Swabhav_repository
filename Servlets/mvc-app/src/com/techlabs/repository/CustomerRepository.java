package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlabs.model.CardType;
import com.techlabs.model.Customer;
import com.techlabs.model.Users;

public class CustomerRepository {
	private List<Customer> customers = new ArrayList();
	private List<Users> users=new ArrayList();
	CardType card;
	public CustomerRepository() {
		System.out.println("Inside customer repository constructor");
	}

	public void loadData() {
		
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			stmt = conn.createStatement();
			
			String query = "SELECT * FROM CUSTOMERS";
			PreparedStatement ps = conn.prepareStatement(query);
			
			rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getString(6).equals(card.CREDIT_CARD)) {
					card = card.CREDIT_CARD;
				}
				if (rs.getString(6).equals(card.DEBIT_CARD)) {
					card = card.DEBIT_CARD;
				}
				Customer c = new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDouble(5), card);
				customers.add(c);
			}
			conn.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	public void addCustomer(Customer c) {
		customers.add(c);
	}
	public List<Customer> getCustomers() {
		return customers;
	}

	public void addDataToTable(Customer customer) {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			stmt = conn.createStatement();
			String card="";
			String id=customer.getId();
			System.out.println("id :"+id);
			System.out.println(id+" "+customer.getFirstName()+" "+customer.getLastName()+" "+customer.getDob()+" "+customer.getBalance());
			if(customer.getCard()==null) {
				card="Null";
			}
			String query = "INSERT INTO CUSTOMERS(ID,FIRST_NAME,LAST_NAME,DOB,BALANCE,CARD) VALUES(?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1,id);
			ps.setString(2,customer.getFirstName());
			ps.setString(3,customer.getLastName());
			ps.setString(4,customer.getDob());
			ps.setInt(5,(int) customer.getBalance());
			ps.setString(6,card);
			ps.executeUpdate();
		}catch(Exception ex) {
			System.out.println("exception occured "+ex.getMessage());
		}
	}

	public void deleteFromTable(String id) {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			stmt = conn.createStatement();

			String query = "DELETE FROM CUSTOMERS WHERE ID='"+id+"';";
			stmt.executeUpdate(query);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public List<Users> getUsers() {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			stmt = conn.createStatement();
			
			String query = "SELECT * FROM USERS";
			PreparedStatement ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				Users user = new Users(rs.getString(1), rs.getString(2), rs.getString(3));
				users.add(user);
			}
			for(Users u:users) {
				System.out.println("username"+u.getUsername());
			}
			conn.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	return users;
	}
	

	public void editDatabase(Customer customer) {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			stmt = conn.createStatement();
			String card="";
			String id=customer.getId();
			System.out.println("id :"+id);
			System.out.println(id+" "+customer.getFirstName()+" "+customer.getLastName()+" "+customer.getDob()+" "+customer.getBalance());
			if(customer.getCard()==null) {
				card="Null";
			}
			String query = "UPDATE CUSTOMERS SET FIRST_NAME=?,LAST_NAME=?,DOB=?,BALANCE=?,CARD=? WHERE ID=?";
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1,customer.getFirstName());
			ps.setString(2,customer.getLastName());
			ps.setString(3,customer.getDob());
			ps.setInt(4,(int) customer.getBalance());
			ps.setString(5,card);
			ps.setString(6,id);
			ps.executeUpdate();
		}catch(Exception ex) {
			System.out.println("exception occured "+ex.getMessage());
		}

	}

}
