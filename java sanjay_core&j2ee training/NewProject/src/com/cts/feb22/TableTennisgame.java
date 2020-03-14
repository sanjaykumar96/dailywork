package com.cts.feb22;

public class TableTennisgame implements Runnable {
	@Override
	public void run() {

		{
			System.out.println("player 1 ready -->");
			System.out.println("player 2 ready -->");
		}
	}

	public static void main(String[] args) {

		TableTennisgame threadOne = new TableTennisgame();
		Thread2 threadtwo = new Thread2();
		Thread t1 = new Thread(threadOne);
		Thread t2 = new Thread(threadtwo);
		
			
				t1.start();
		
				t2.start();
		}
	}
