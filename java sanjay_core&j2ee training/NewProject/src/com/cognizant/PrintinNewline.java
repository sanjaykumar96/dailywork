package com.cognizant;
import java.util.Scanner;
public class PrintinNewline {
		public static void main(String args[]){
		System.out.println("enter your string:   ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String arrOfStr[] = str.split(" "); 
		for (String a : arrOfStr) 
            System.out.println(a);
}
}
