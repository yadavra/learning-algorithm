package com.awanish.java.thread;

public class TaskThree implements Runnable {

	private SharedObject sharedObject;

	@Override
	public void run() {
		synchronized (sharedObject) {
			while (sharedObject.getFlag() != 3) {
				System.out.println("Task Three is waiting for the falg==3 to run ");
				try {
					sharedObject.wait();

				} catch (InterruptedException e) {
					System.out.println("Task Three interrupted");
				}

			}
			System.out.println("Task Three is Running as falg==3 is set");
			try {
				Thread.sleep(10000);
				sharedObject.setFlag(1);
				System.out.println("Task Three is calling notify");
				sharedObject.notifyAll();
			} catch (InterruptedException e) {
				System.out.println("Task Three interrupted");
			}

		}

	}

	public TaskThree(SharedObject ob) {
		this.sharedObject = ob;
	}

}
