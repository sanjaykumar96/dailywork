package com.cts.feb26;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
            System.out.println("element-  " + i + ":" + a[i]);
        }
        int largest = a[0];
		int secondLargest = a[0];
		for (int i = 0; i < a.length; i++) {
			 
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
 
			} else if (a[i] > secondLargest) {
				secondLargest = a[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
}
}
