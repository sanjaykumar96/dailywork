package com.cts.feb22;

public class ThreadTwo implements Runnable {

	Resource resource;
	   public ThreadTwo(Resource resource) {
		   this.resource=resource;
	   }
		@Override
		public void run() {
			resource.display("Thread 2");
		}
//	@Override
//	public void run() {
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) {
//				System.out.println("thread 2:" + i);
//			}
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}

}
