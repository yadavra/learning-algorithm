package com.awanish.datastructure.set;

public interface MySet<E> {
	
	
	public void push(E element) throws MyStackException;
	
	public E pop() throws MyStackException;
	
	public E findElement();
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public E getMin();
	
	

}
