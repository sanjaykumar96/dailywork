package com.cts.feb21;

import java.util.Scanner;

public class CountPre {public static void main(String[] args) {
	
	String prefix;
	Scanner sc = new Scanner(System.in);
	
	String[] str = {"1000","101010","110011" ,"12200"};
	
	System.out.println(" Enter Prefix string for search");
	prefix =sc.next();
	int len=str.length;
	
	int count=0;
	String num;
	
	for( int j=0 ; j<len ;j++)
	{
		num=str[j];
		if(num.startsWith(prefix)&& !num.equals(prefix))
		{
			count ++;
	
		}
	}
    System.out.println("Searched digit = " +count);
}

}
