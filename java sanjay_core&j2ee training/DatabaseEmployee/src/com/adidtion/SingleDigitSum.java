package com.adidtion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Given a number we need to find the number of times its digits need
to be added so it becomes a single digit number .
   Example 91=9+1=10
   10=1+0=1
   So two times.
   Sample Input
   91
   output
   2*/

public class SingleDigitSum {
	static int NumberofTimes(String str) {
		
		int temporary_sum = 0, count = 0;

		
		while (str.length() > 1) {
			temporary_sum = 0;

			
			for (int i = 0; i < str.length(); i++)
				temporary_sum += (str.charAt(i) - '0');

			
			str = temporary_sum + "";

			
			count++;
		}

		return count;
	}

	public static void main(String argc[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an integer");
		String s = br.readLine();

		System.out.println(NumberofTimes(s));
	}

}
