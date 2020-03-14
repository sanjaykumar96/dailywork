package com.cognizant;
import java.util.Comparator;
public class ShortByid implements Comparator<Employee17>{

	@Override
	public int compare(Employee17 emp1, Employee17 emp2) {
		if(emp1.getId()>emp2.getId()) {
			return 1;
		}
		else if(emp1.getId()==emp2.getId())
		{
			return 0;
		}else {
			return -1;
	}
	}}
	
	
