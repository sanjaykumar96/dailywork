package com.cognizant;

import java.util.Comparator;

public class SortbyName implements Comparator<Employee17> {

	@Override
	public int compare(Employee17 emp1, Employee17 emp2) {
		return emp1.getName().compareTo(emp2.getName());
	}
	

}
