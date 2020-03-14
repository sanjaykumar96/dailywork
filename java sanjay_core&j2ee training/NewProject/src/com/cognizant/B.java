package com.cognizant;

public class B {
	B() {
		super();
		System.out.println("3");
	}

	B(int a) {
		this();
		System.out.println("4");
	}

	{
		System.out.println("5");
	}
}