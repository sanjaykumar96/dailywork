package com.cts.feb22;

public class MainThreadDemo {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);	
		Resource res=new Resource();
		System.out.println(Thread.currentThread().getName());
		ThreadDemo threadOne = new ThreadDemo(res);
		ThreadTwo threadtwo = new ThreadTwo(res);
		Thread t1=new Thread(threadOne);
		Thread t2=new Thread(threadtwo);
		
//		t1.setPriority(Thread.MIN_PRIORITY);
//		t2.setPriority(Thread.NORM_PRIORITY+2);
//		
		t1.start();
		t2.start();
		
//		System.out.println("main thread priority: "+Thread.currentThread() .getPriority());
//		System.out.println("thead 1 priority:"+t1.getPriority());
//		System.out.println("thead 2 priority:"+t2.getPriority());
//		
		//threadOne.start();
		//threadtwo.start();
//	for(int i=1;i<=5;i++)
//	{
//		System.out.println(Thread.currentThread().getName()+"i"+i);
//	}

	}
}
