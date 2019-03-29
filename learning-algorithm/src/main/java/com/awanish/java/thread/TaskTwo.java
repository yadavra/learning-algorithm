package com.awanish.java.thread;

public class TaskTwo implements Runnable {

	private SharedObject sharedObject;

	@Override
	public void run() {
		synchronized (sharedObject) {
			while (sharedObject.getFlag() != 2) {
				System.out.println("Task Two is waiting for the falg==2 to run ");
				try {
					sharedObject.wait();

				} catch (InterruptedException e) {
					System.out.println("Task Two interrupted");
				}

			}

			System.out.println("Task Two is Running as falg==2 is set");
			try {
				Thread.sleep(10000);
				sharedObject.setFlag(3);
				System.out.println("Task Two is calling notify");
				sharedObject.notifyAll();
			} catch (InterruptedException e) {
				System.out.println("Task Two interrupted");
			}

		}

	}

	public TaskTwo(SharedObject ob) {
		this.sharedObject = ob;
	}

}
