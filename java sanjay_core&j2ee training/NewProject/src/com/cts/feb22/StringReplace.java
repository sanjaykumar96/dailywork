package com.cts.feb22;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReplace {
	
	public static void main(String[] args) throws IOException {
		//Scanner sc=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in));
		System.out.println("Enter the String = ");
		String name=br.readLine();
		String name2=modify(name);
		System.out.println("The SMSLingo is = "+name2);
	}
	static String  modify(String toreplace)
	{	String str=toreplace;
	    str=str.replaceAll("yes", "s");
	    str=str.replaceAll("you","u");
	    str=str.replaceAll("today", "2day");
	    str=str.replaceAll("why","y");
		return str;
	}

}
