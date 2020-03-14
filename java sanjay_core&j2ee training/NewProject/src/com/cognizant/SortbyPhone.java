package com.cognizant;
import java.util.Comparator;
public class SortbyPhone implements Comparator<Employee17>{

	@Override
	public int compare(Employee17 emp1, Employee17 emp2) {
		if(emp1.getPhone()>emp2.getPhone()) {
			return 1;
		}
		else if(emp1.getPhone()==emp2.getPhone())
		{
			return 0;
		}else {
			return -1;
	}
	}}


