package com.awanish.java.thread;

public class SharedObject {
	
	private int flag=1 ;
	
	public synchronized int getFlag() {
		return flag;
	}

	public  synchronized void setFlag(int flag) {
		this.flag = flag;
	}
	

}
