package com.revature.app.threads;

public class Main {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		ThreadDemo thread = new ThreadDemo();
		thread.start();
		
		ThreadDemo thread1 = new ThreadDemo();
		ThreadDemo thread2 = new ThreadDemo();
		ThreadDemo thread3 = new ThreadDemo();
		ThreadDemo thread4 = new ThreadDemo();
		ThreadDemo thread5 = new ThreadDemo();
		ThreadDemo thread6 = new ThreadDemo();
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
	}
	/*ThreadDemoRunnable runnable = new ThreadDemoRunnable();
		Thread threadRunnable = new Thread(runnable);
		threadRunnable.start();*/
		
	

}
