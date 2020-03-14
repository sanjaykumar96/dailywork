package com.cts.feb24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPreparedStatement {

	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		// ********************* 2 *********************
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee Id: ");
		int id = Integer.parseInt(br.readLine());
	//	System.out.println("Enter Employee Name: ");
	//	String name = br.readLine();
//		System.out.println("Enter Employee Address: ");
//		String address = br.readLine();
//		System.out.println("Enter age of an Employee: ");
//		int age = Integer.parseInt(br.readLine());JDBCDemo.java
//		System.out.println("Enter Phone no of an Employee: ");
//		long phone = Long.parseLong(br.readLine());
		// ********************* 1 *********************
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url, "root", "root");
	//	String query = "insert into employee value(?,?,?,?,?)";
	//	String query="update  employee set name=? where id=?"; //for update
	//	 String query = "delete from employee where id = ?";  //for delete
	
		PreparedStatement ps = conn.prepareStatement(query);
	//	ps.setString(1, name); //for update
	//	ps.setInt(2, id); //for update
	//	 ps.setInt(1,id);//for delete

		// ********************* 3 ********************* Setting values using
		// PreparedStatement Interface
//		ps.setInt(1, id);
//		ps.setString(2, name);
//
//		ps.setString(3, address);
//		ps.setInt(4, age);
//		ps.setLong(5, phone);
		int result = ps.executeUpdate();
		if (result > 0)
			System.out.println("Data inserted successfully!");
		else
			System.out.println("Something went wrong...");

	}
}
