package com.c.classical_threads;

public class C_CreatingThread_AnnInner {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("job of threads..");
			}
		});
		thread.start();
	}

}
