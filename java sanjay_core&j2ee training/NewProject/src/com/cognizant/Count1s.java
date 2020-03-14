package com.cognizant;
import java.util.*;

public class Count1s {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("enter number 1s number:  ");
		int n=src.nextInt();
		System.out.println("enter number 2nd number:  ");
		int m=src.nextInt();
		
		  int count = 0;
		    for(int i = n; i<=m; i++)
		    {
		        String number = String.valueOf(i);
		        while(number.contains("1"))
		        {
		            number= number.substring(number.indexOf("1")+1);
		            count ++;
		        }
		    }
		    System.out.println(count);
	
	} 
			
		
	

}
