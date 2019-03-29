package com.awanish.datastructure;

public interface MyLinkList<E> {
	
     public Node<E> getHead();
     public E get(int i);
     public void add(E element);
     public boolean contains(E element);
     public void  addAfter(E element ,E elimentToBeAdded ); 
     public void  addBefore(E element,E elimentToBeAdded);
     public void addBegningOfList(E element); 
     public boolean remove(E element);
     public E  removeAfter(E element ); 
     public E  removeBefore(E element);
     public boolean  removeBegningOfList(); 
     public int  size();
     public boolean isEmpty();
	Node<E> reverseList();
	Node<E> reverseListRecursively();
	
	Node<E> findNthNodeFromLast(int position);
	Node<E> deleteNthNodeFromLast(int position);
	boolean isListContainCycle();
	Node<E> findLoopStartNode();
	

}
