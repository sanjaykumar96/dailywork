package com.cognizant;
import java.util.Comparator;
public class SortbyAge implements Comparator<Employee17>{

	@Override
	public int compare(Employee17 emp1, Employee17 emp2) {
		if(emp1.getAge()>emp2.getAge()) {
			return 1;
		}
		else if(emp1.getAge()==emp2.getAge())
		{
			return 0;
		}else {
			return -1;
	}
	}}


