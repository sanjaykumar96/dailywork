package com.cts.feb22;

//public class Thread2 implements Runnable{

//	@Override
//	public void run() {
//		synchronized (this) {for (int i = 1; i <= 10; i++) {
//		      int m; 
//		      m=4*i;
//				System.out.println("Thread 2:" + m);
//		
//
//
//		}} 
	public class Thread2 implements Runnable{
	@Override
	public void run() {
	for(int i=1;i<=20;i++) {
		
		System.out.println("Ping-->"+"\n"+"<--pong");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


		
}}

