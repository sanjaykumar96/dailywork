package com.cts.training.controller;
import java.util.*;
import java.util.List;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;
;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDAO empObj = new EmployeeDAOImpl();
		
		 Employee emp=empObj.getEmployeeById(100);
		 System.out.println(emp);
		 
		//Employee employee=new Employee(100, "anuj", "Bhopal", 22, 46566);
		//empObj.saveEmployee(employee);
		//List<Employee> list = empObj.getAllEmployees();
			//	list.forEach(System.out::println);
		
//		Scanner input =new Scanner(System.in);
//				int choice=input.nextInt();
		//Employee emp = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
		//empObj.addEmployee(emp);
	//System.out.println( empObj.getEmployeeById(2));
		//empObj.deleteEmployee( empObj.getEmployeeById(111));
		
		//Employee em=empObj.getEmployeeById(9987);
		//em.setName("sanjay");
		//empObj.updateEmployee(em);
		//List<Employee> list = empObj.getAllEmployees();
		//list.forEach(System.out::println);
	}

}

