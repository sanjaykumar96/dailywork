package com.cognizant;

public class Print {
public static void main(String[] args) {
	GetterSetter e=new GetterSetter();
	System.out.println("Age   = " + e.getAge());
	System.out.println("salary= " + e.getSalary());
	
	e.setAge(25);
	e.setSalary(25000);
	System.out.println("age= " + e.getAge());
	System.out.println(" salary = " + e.getSalary());
}
}
