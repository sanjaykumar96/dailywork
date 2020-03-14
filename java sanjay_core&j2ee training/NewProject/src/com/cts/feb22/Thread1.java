package com.cts.feb22;
//Create a Java program that creates two threads namely Thread1 and Thread2. You need to create a method that prints a table for 
//a specified integer up to 10 numbers. Thread1 should print the table of 2 and Thread2 should print the table of 4.
//The table values must be printed with a delay of 1 second. You need to ensure that only one thread at a time 
//can print the table. Further, the name of the thread that is printing the table should be displayed. 

public class Thread1 implements Runnable{
	@Override
	public void run() {
		 {for (int i = 1; i <= 10; i++) {
		      int n; 
		      n=2*i;
				System.out.println("Thread 1:" + n);
		


		}} 
	}
	

	
	public static void main(String[] args) {
		
		Thread1 threadOne = new Thread1();
		Thread2 threadtwo = new Thread2();
		Thread t1=new Thread(threadOne);
		Thread t2=new Thread(threadtwo);
		
		t1.start();  
		 try{  
		  t1.join();  
		 }catch(Exception e){System.out.println(e);}  
		  
		 t2.start();
}
	
}