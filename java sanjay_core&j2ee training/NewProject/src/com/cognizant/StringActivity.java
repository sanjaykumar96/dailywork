package com.cognizant;
import java.util.*;

public class StringActivity {
	
	
	
	public static void main(String[] args)
	{    String s="Global Warning";
		  System.out.println("Substring last four character:   " + s.substring(s.length()-4));
		  System.out.println("Substring  starting index4 and end index 8:   " + s.substring(2,8));
		  System.out.println("string has alphanumeric char or not:   " + s.matches("[A-Za-z0-9]+"));
		  System.out.println("trim last four char: " + s.substring(0,s.length()-4));
		  System.out.println("trim first four char = " + s.substring(4));
		  System.out.println("starting index for substring 'wa':     " + s.indexOf("Wa"));
		  
		  System.out.println("to change case of string:  " +s.toUpperCase());
		  System.out.println("check title case:   ");
		 System.out.println(titleCase(s)); 
	
		  System.out.println("String length = " + s.replaceAll("a","*")); 
		  
		  
		  }
	public static boolean titleCase(String s) {
		boolean result = false;
		String arr[] = s.split("\\s+");
		for(int i=0; i<arr.length; i++) {
			char ch = arr[i].charAt(0);
			if(ch >= 65 && ch <= 90)
				result = true;
			else {
				result = false;
				break;
			}
		}
		return result;
	}
}
/*Consider the string str="Global Warming"
Write statements in Java to implement the following
a) To display the last four characters.
b) To display the substring starting from index 4 and ending at index 8.
c) To check whether string has alphanumeric characters or not.
d) To trim the last four characters from the string.
e) To trim the first four characters from the string.
f) To display the starting index for the substring "Wa".
g) To change the case of the given string.
h) To check if the string is in title case.
i) To replace all the occurrences of letter "a" in the string with "*"*/