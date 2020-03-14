package com.cognizant;
import java.util.*;
public class Setinterface {
	public static void main(String[] args)
	{
		TreeSet<String>list = new TreeSet<>();
		list.add("hello");	
		list.add("to");		
		list.add("java");		
		list.add("batch");		
	   list.add("7");		
		list.add("true");
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			String element =it.next();
			System.out.println(element);
			
		}
		

}
}
