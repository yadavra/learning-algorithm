package com.awanish.datastructure;

public class NodeImpl<E> implements Node<E> {
	private E element;
	private Node<E> next ;
	private Node<E> previousNode;
	
	@Override
	public E getElement() {
		return element;
	}

	@Override
	public void setElement(E element) {
		this.element = element;
	}
	@Override
	public Node<E> nextNode() {
		return next;
	}
    
	@Override
	public void setNextNode( Node<E> node){
		this.next=node ;
	}

	@Override
	public Node<E> previousNode() {
		// TODO Auto-generated method stub
		return this.previousNode;
	}

	@Override
	public void setPreviouNode(Node<E> curr) {
		this.previousNode=curr;
		
	}
	
}
