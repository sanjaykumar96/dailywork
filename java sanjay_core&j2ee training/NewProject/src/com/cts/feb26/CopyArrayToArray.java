package com.cts.feb26;

import java.util.Scanner;

public class CopyArrayToArray {

	public static void main(String[] args) {
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
		System.out.println("\nelement stored in first array:\n");
		for (int l= 0; l < n; l++) {
			System.out.print(a[l]+"");
			}
		int[] b = new int[n];
		int j = 0;
		for (int k = 0; k < n; k++) {
			b[j] = a[k];
			j ++;
			}
			System.out.println("\n element stored in copied array:\n");
			for (int k = 0; k < n; k++) 
				System.out.print(a[k]+"");

}
	}

		