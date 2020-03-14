package com.cts.feb24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.load database driver
		// using forName method
		Class.forName("com.mysql.jdbc.Driver");

		// 1.we create reference
		// Driver driver=new com.mysql.jdbc.Driver();
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url, "root", "root");

		System.out.println(conn.getClass().getName());
		Statement stmt = conn.createStatement();
		String sql ="create table user(id int primary key,name varchar(50),address varchar(100),age int,phone long)";

   stmt.executeUpdate(sql);
   System.out.println("Created table in given database...");
}
}
