package com.cognizant;
import java.util.*;



public class Main {
	public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	System.out.println("enter number:  ");
	int n=src.nextInt();
    int sum=0; 
		 while (n != 0) 
	        { 
	            sum = sum + n % 10; 
	            n = n/10; 
	        } 
	        System.out.println("sum;    "+sum);  
	    } 

}
