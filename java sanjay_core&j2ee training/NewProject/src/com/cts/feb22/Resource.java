package com.cts.feb22;

public class Resource {
//	public synchronized void display(String name) {
//		for (int i = 0; i <= 5; i++) {
//			System.out.println("name count: " + i + " " + name);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//	}

	public void display(String name) {
		synchronized (this) {
			for (int i = 0; i <= 5; i++) {
				System.out.println("name count: " + i + " " + name);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
}
