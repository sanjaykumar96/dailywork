package com.cognizant;
import java.util.*;
//Write a code to input string from terminal window. Use chartAt. Toggle each alphabet case in output.
// Input String: Java programming is easy
public class Toggle { 
	public static void main(String args[]){
		System.out.println("enter your string:   ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		char Array [] = str.toCharArray();
			for(char ch: Array)
			  {
			if(Character.isUpperCase(ch)){
			ch= Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch)){
			    ch= Character.toUpperCase(ch);
			}
			System.out.print(ch);
			} 
		
}
}
