package com.cognizant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmployeeList {
public static void main(String[] args)
{
	ArrayList<Employee17>list=new ArrayList<>();
	addEmlpoyee(list);
	SortbyName sbn=new SortbyName();
	//SortbyPhone sbp=new SortbyPhone();
	//SortbyAge sba=new SortbyAge();
	//ShortByid sbi=new ShortByid();
	//Collections.sort(list);
	//Collections.sort(list,sbi);
	
	
	//Collections.sort(list,sba);
	//Collections.sort(list,sbp);
	Collections.sort(list,sbn);
	
	for(Employee17 emp:list)
	{
		System.out.println(emp);
	}
	
}

private static void addEmlpoyee(ArrayList<Employee17> list) {
	// TODO Auto-generated method stub
	Employee17 emp1=new Employee17(4234,"vijay","banglore","developer",28 ,42235,722);
	Employee17 emp2=new Employee17(4225,"saket","pune","tester",30,45235,235);
	Employee17 emp3=new Employee17(42544,"manish","delhi","engineer",45,25552,42354);
	Employee17 emp4=new Employee17(4455,"nimish","mubai","data ware",8,5355,53536);

	list.add(emp1);
	list.add(emp2);
	
	list.add(emp3);
	
	list.add(emp4);
	
}
}
