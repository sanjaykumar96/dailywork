package com.cts.feb26;

import java.util.Scanner;

public class ArrayReverse {
	static void reverse(int a[], int n) {
		System.out.println("array before reverse:\n");
		for (int k = 0; k < n; k++) {
			System.out.print(a[k]);
		}
		int[] b = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}

		System.out.println("\nReversed array is: \n");
		for (int k = 0; k < n; k++) {
			System.out.print(b[k]);
		}
	}

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
		
		reverse(a, n);

	}
}
