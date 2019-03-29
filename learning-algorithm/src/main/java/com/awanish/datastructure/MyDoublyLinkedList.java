package com.awanish.datastructure;

public class MyDoublyLinkedList<E> implements MyLinkList<E> {
     private Node<E> head ;
     private int size ;
	
	
	@Override
	public Node<E> getHead() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(E element) {
		
		Node<E> newNode = new NodeImpl<E>();
		newNode.setElement(element);
		Node<E> curr =null;
		curr=head;
 		if(curr==null){
		   head=newNode ;	
		}else {
			while(curr.nextNode()!=null){
				curr=curr.nextNode();
			}
			curr.setNextNode(newNode);
			newNode.setPreviouNode(curr);
		}
 		size++;

	}

	@Override
	public boolean contains(E element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addAfter(E element, E elimentToBeAdded) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBefore(E element, E elimentToBeAdded) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBegningOfList(E element) {
		Node<E> newNode = new NodeImpl<E>();
		newNode.setElement(element);
		
		if(head==null){
			head=newNode;
			head.setNextNode(null);
			head.setPreviouNode(null);
		}else {
			
			Node<E> temp = head;
			head=newNode;
			head.setNextNode(temp);
			temp.setPreviouNode(head);
			
		}
		size++;
		
	}

	@Override
	public boolean remove(E element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E removeAfter(E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeBefore(E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeBegningOfList() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Node<E> reverseList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node<E> reverseListRecursively() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node<E> findNthNodeFromLast(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node<E> deleteNthNodeFromLast(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isListContainCycle() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Node<E> findLoopStartNode() {
		// TODO Auto-generated method stub
		return null;
	}

}
