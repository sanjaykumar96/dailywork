package com.cts.feb26;

import java.util.Scanner;

public class SeparateEvenOdd {
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
			int[] b=new int[n];
			int[] c=new int[n];
			int j=0,k=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]%2==0)
					{b[j]=a[i];
					j++;
					}
					else { c[k]=a[i];
					k++;
					}
					
					}
			
			
			System.out.println("\n  even element  array:\n");
			for(int l=0;l<j;l++)
			System.out.println(b[l]+"");
			
			System.out.println("\n  odd element  array:\n");
			for(int l=0;l<k;l++)
			System.out.println(c[l]+"");
} 
}
