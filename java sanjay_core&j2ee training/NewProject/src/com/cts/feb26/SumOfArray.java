package com.cts.feb26;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter"+n+"  elements:" );
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			System.out.println("element -" + i + ":" + a[i]);
			sum+=a[i];
		}
		System.out.println("the sum of all element in array is :  "+sum);

}
}