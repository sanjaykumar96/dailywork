package com.cts.feb26;

import java.util.Scanner;

public class MaxMinInArry {
	public int max(int [] array) {
	      int max = 0;
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]>max) {
	            max = array[i];
	         }
	      }
	      return max;
	   }
	   public int min(int [] array) {
	      int min = array[0];
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]<min) {
	            min = array[i];
	         }
	      }
	      return min;
	   }
	   public static void main(String args[]) {
		   int n;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter no. of elements you want in array:");
			n = s.nextInt();
			int a[] = new int[n];
			System.out.println("Enter"+n+"  elements:" );
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				System.out.println("element-  " + i + ":" + a[i]);
			}
	      
	      MaxMinInArry m = new MaxMinInArry();
	      System.out.println("Maximum value in the array is::"+m.max(a));
	      System.out.println("Minimum value in the array is::"+m.min(a));
	   }
}
