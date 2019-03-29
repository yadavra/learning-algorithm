package com.awanish.datastructure.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MySetImp<E> implements MySet<E> {
	
	private  List<E> data ;
	private  int top ;
	private Stack<Integer> stack = new Stack<Integer>();
	
	public MySetImp(){
		
		data=new ArrayList<E>();
		
	}

	@Override
	public void push(E element) throws MyStackException {
		if(isFull()){
			throw new MyStackException("Stack is full");
		}
		data.add(element);
		top++;
		
	}

	@Override
	public E pop() throws MyStackException {
		if(isEmpty()){
			throw new MyStackException("Stack is empty");
		}
		E element=data.get(top);
		top--;
		
		return element;
	}

	@Override
	public E findElement() {
		
		return null;
	}

	@Override
	public boolean isEmpty() {
		
		return top<=0;
	}

	@Override
	public boolean isFull() {
		
		return top>=data.size();
	}

	@Override
	public E getMin() {
		return null;
	}
	
	

}
