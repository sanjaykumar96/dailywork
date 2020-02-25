package com.cts.feb24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable1 {
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
		//String sql ="create table person(id int primary key,name varchar(50),address varchar(100),age int,phone long)";
		//String query = "insert into person values(10,'sanjay','pune',20,8817544087)";
		//String query="update employee set address='jabalpur' where id=1";
		//String query="insert into employee values(45,'sanket','mumbai1',20,8817544087)";
		String query="select *from person";
		ResultSet rs = stmt.executeQuery(query);
         while(rs.next())
		{
			int id =rs.getInt(1); //or in place of index we can provide the column name ("id")
			String name =rs.getString(2);
			String address=rs.getString(3);
			int age =rs.getInt(4);
			long phone=rs.getLong(5);
			System.out.println("\n"+id+"  "+name+"  "+address+"  "+age+"  "+phone);
		}
   //stmt.executeUpdate(sql);
   System.out.println("Created table in given database...");
//  int result=stmt.executeUpdate(query);
//if(result>0) {
//		System.out.println("record succesfull updated");
//}
//	else
//		System.out.println("wrong");
}
}
