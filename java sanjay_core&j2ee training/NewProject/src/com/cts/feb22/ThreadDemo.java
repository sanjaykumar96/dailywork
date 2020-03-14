package com.cts.feb22;

public class ThreadDemo implements Runnable{
   Resource resource;
   public ThreadDemo(Resource resource) {
	   this.resource=resource;
   }
	@Override
	public void run() {
		resource.display("Thread 1");
	}
	
	
	
}
//	@Override
//	public void run() {
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 != 0) {
//				System.out.println("Thread 1:" + i);
//			}
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}
//public class ThreadDemo extends Thread {
//	@Override
//	public void run() {
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 != 0) {
//				System.out.println("Thread 1:" + i);
//			}
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}