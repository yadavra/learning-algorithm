package com.awanish.datastructure;

public interface Node<E> {

	public E getElement();
	public Node<E> nextNode() ;
	public Node<E> previousNode() ;
	void setElement(E element);
	void setNextNode(Node<E> node);
	public void setPreviouNode(Node<E> curr);
	
}
