package com.awanish.java.thread;

public class TaskOne implements Runnable {
	private SharedObject sharedObject;

	@Override
	public void run() {

		synchronized (sharedObject) {
			while (sharedObject.getFlag() != 1) {
				System.out.println("Task One is waiting for the falg==1 to run ");
				try {
					sharedObject.wait();

				} catch (InterruptedException e) {
					System.out.println("Task One interrupted");
				}

			}
			System.out.println("Task One is Running as falg==1 is set");
			try {
				Thread.sleep(10000);
				sharedObject.setFlag(2);
				System.out.println("Task One is calling notify");
				sharedObject.notifyAll();
			} catch (InterruptedException e) {
				System.out.println("Task One interrupted");
			}

		}

	}

	public TaskOne(SharedObject ob) {
		this.sharedObject = ob;
	}
}
