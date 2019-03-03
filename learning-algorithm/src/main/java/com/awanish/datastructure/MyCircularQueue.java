package com.awanish.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class MyCircularQueue {

	/**
	 * Initialize your data structure here. Set the size of the queue to be k.
	 */
	int [] queue ;
	int head=0;
	int tail=0;
	int size =0;
	public MyCircularQueue(int k) {
        this.queue=new int[k];
        Queue<Integer> queue=new LinkedList<Integer>();
	}

	/**
	 * Insert an element into the circular queue. Return true if the operation
	 * is successful.
	 */
	public boolean enQueue(int value) {
		if(isFull()){
			return false ;
		}
		tail=(tail+1)%queue.length;
		queue[tail]=value;
		
		size++;
		return true;

	}

	/**
	 * Delete an element from the circular queue. Return true if the operation
	 * is successful.
	 */
	public boolean deQueue() {
		if(isEmpty()){
			return false;
		}
		head=(head+1)%queue.length;
        size--;
        return true ;
	}

	/** Get the front item from the queue. */
	public int Front() {
		if(isEmpty()){
			return Integer.MIN_VALUE;
		}
		return queue[head];

	}

	/** Get the last item from the queue. */
	public int Rear() {
		if(isEmpty()){
			return Integer.MIN_VALUE;
		}
		return queue[tail];

	}

	/** Checks whether the circular queue is empty or not. */
	public boolean isEmpty() {
		return size==0;

	}

	/** Checks whether the circular queue is full or not. */
	public boolean isFull() {
		return size==queue.length;

	}

}
