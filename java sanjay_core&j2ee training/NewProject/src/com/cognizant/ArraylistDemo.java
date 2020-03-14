package com.cognizant;
import java.util.*;

public class ArraylistDemo {
	public static void main(String[] args)
	{
		LinkedList<String>list = new LinkedList<>();
		list.add("hello");	
		list.add("to");		
		list.add("java");		
		list.add("batch");		
	   list.add("7");		
		list.add("true");
		ListIterator<String> it=list.listIterator();
		System.out.println("******forward direction********");
		while(it.hasNext())
		{
			String element =it.next();
			System.out.println(element);
			if(element.contentEquals("java"))
			{
				break;
			}
		}
		System.out.println("*****backward direction******");
		while(it.hasPrevious())
		{
			String element=it.previous();
			System.out.println(element);
		}		
		
		
		
		/*System.out.println(list);
		list.remove(2);
		list.add(2,"adv java");
		
		System.out.println("liat contain: " +list.contains("python"));
		 for(String obj:list)
    	 { if(obj.contains("to"))
    	 {
    		 System.out.println(obj);
    	 }
    	 System.out.println(obj);
    	 if(obj.equals("java"))
    	 {
    		 break;
    	 }
    	 }*/
		
		
		
	}
}
