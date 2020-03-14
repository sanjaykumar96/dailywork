package com.cts.training.dao.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO {
	Connection conn = getConnection();
	PreparedStatement ps = null;

	// static ArrayList<Employee> employees = null;
	private Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ctsPune";
			conn = DriverManager.getConnection(url, "root", "root");
			return conn;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String sql="insert into employee values(?,?,?,?,?)";
		try {
			
		ps=conn.prepareStatement(sql);
		ps.setInt(1, employee.getId());
		ps.setString(2, employee.getName());
		ps.setString(3, employee.getAddress());
		ps.setInt(4, employee.getAge());
		
		ps.setLong(5, employee.getPhone());
		
	
		ps.executeUpdate();
		return true;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
				
		
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		String sql="update  employee set name=? where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(2, employee.getId());
			ps.setString(1,employee.getName());
			//ps.setString(1, "bill");
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	@Override
	public boolean dafaultEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String sql="delete  from employee where id=?";
		try {
			ps = conn.prepareStatement(sql);
		ps.setInt(1, employee.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from employee where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			Employee emp = null;
			while(rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAge(rs.getInt("age"));
				emp.setAddress(rs.getString("address"));
				emp.setPhone(rs.getLong("phone"));
			}
			return emp;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		
	
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		String sql = "select *from employee";
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAge(rs.getInt("age"));
				emp.setAddress(rs.getString("address"));
				emp.setPhone(rs.getLong("phone"));
				employees.add(emp);
				
			}
			return employees;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
