package com.cts.feb26;

import java.util.Scanner;

public class DuplicatesInArray {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter"+n+"  elements:" );
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			System.out.println("element -" + i + ":" + a[i]);
			
		}

		int count=0;
		for (int i = 0; i <n; i++)
		{    
			for(int j = i+1 ; j < n; j++)
			{
	    		if(a[i] == a[j])
	    		{
	    			count++;
					break;
				}
			}
			
		}
		System.out.println("total number of duplicate in an arrayis  :  "+count);	
		

	}
	
}