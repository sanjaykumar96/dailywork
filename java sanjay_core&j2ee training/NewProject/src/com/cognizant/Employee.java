package com.cognizant;
import java.util.*;

public class Employee {
	String name;
	int number;
	String degig;
	String addr;

public void getdata() 
{
	Scanner src=new Scanner(System.in);
	
	System.out.println("enter name:  ");
	String name=src.nextLine();
	
	System.out.println("enter number:  ");
	int number=src.nextInt();
	
	System.out.println("enter degig:  ");
	String degig=src.nextLine();
	src.nextLine();
	
	System.out.println("enter addr:  ");
	String addr=src.nextLine();
	
	
}

public void putdata()
{ System.out.println(" name:  "+name);
System.out.println(" number:  "+number);
System.out.println(" degig:  "+degig);
System.out.println(" addr:  "+addr);
	
}
}
/* Declare the derived class salary with basic pay, DA, HRA, Gross pay, PF, Income tax and Net pay. 
Declare and define the function getdata1() to call getdata() and get the basic pay,
Define the function calculate() to find the net pay.
Define the function display() to call putdata() and display salary details .
Create the derived class object.
Read the number of employees.
Call the function getdata1() and calculate() to each employees. 
Call the display() function. */


