package com.cognizant;
import java.util.*;
public class Palindrome { 
	static boolean isPalindrome(String str) 
{ 
    int i = 0, j = str.length() - 1; 
    while (i < j) { 
        if (str.charAt(i) != str.charAt(j)) 
            return false; 
        i++; 
        j--; 
    } 

    return true; 
} 
	public static void main(String[]  args)
	{       
		System.out.println("enter your string:   ");
	    Scanner input = new Scanner(System.in);
	    String str = input.nextLine();
		if (isPalindrome(str)) 
            System.out.print("Yes"); 
        else
            System.out.print("No");
	}

}
