package com.cts.feb22;
import java.util.*;
public class NumberSeries {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number = src.nextInt();
		for(int i=0; i<9; i++) {
			if(i%2==0)
				System.out.println(number -= 2 );
			else if(i%2==1)
				System.out.println(number -= 4 );
			}		
		src.close();
	}

}
