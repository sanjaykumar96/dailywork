package com.cognizant;

public interface Add {
	int add (int a,int b);
	default int mult(int a, int b)
	{
		return a*b;
	}
	static int modul(int a,int b)
	{
		return a%b;
	}
}
