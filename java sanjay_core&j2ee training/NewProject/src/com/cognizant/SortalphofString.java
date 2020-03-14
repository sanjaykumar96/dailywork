package com.cognizant;
import java.util.*;

//Write a program which takes input as a string and sort all the alphabets in string.
public class SortalphofString {
	public static void main(String args[]){
	System.out.println("enter your string:   ");
	Scanner input = new Scanner(System.in);
	String str = input.nextLine();
	char Array [] = str.toCharArray();
	for (int i = 0; i < Array.length; i++) {
	Arrays.sort(Array);
	System.out.print(Array[i]);
	}
	
	}
	}

