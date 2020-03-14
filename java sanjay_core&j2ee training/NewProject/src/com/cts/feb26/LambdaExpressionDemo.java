package com.cts.feb26;

public class LambdaExpressionDemo {
	public static void main(String[] args) {
//		MyThread t = new MyThread();
//		Thread thread = new Thread();
//		thread.start();
		// *************** Using Lambda Expression ***************
//		Runnable r = () -> System.out.println("Hello Runnable");
//		Thread t = new Thread(r);
//		t.start();
//		Hello h = () -> "Good Morning!";
//		System.out.println(h.greetings());
		Hello add=(a,b)->a+b;
		Hello sub=(a,b)->a-b;;
		Hello div=(a,b)->a/b;
		Hello mul=(a,b)->a*b;
		System.out.println(add.calculate(3,5));
		System.out.println(sub.calculate(4,5));
		System.out.println(div.calculate(8,5));
		System.out.println(mul.calculate(9,5));
	}
}
@FunctionalInterface
interface Hello {
	
	double calculate(double a,double b);
//	String greetings();
	//public void display();
}
//class MyThread implements Runnable {
//	@Override
//	public void run() {
//		System.out.println("Hello Runnable");
//		
//	}
//}

