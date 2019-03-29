package com.awanish.datastructure.tree;

public class NodeImpl<E> implements Node<E> {
	
	 private Node<E> leftChild ;
	 private Node<E> rightChild ;
	 private E  element ;
	 private boolean isNodePartOfTree ;

	@Override
	public Node<E> getRightChild() {
	
		return this.rightChild;
	}

	@Override
	public Node<E> getLeftChild() {
		return this.leftChild;
	}

	@Override
	public E getElement() {
		return this.element;
	}

	@Override
	public void setRightChild(Node<E> node) {
		
		this.rightChild=node;
	}

	@Override
	public void setLeftChild(Node<E> node) {
		this.leftChild=node;
		
	}

	@Override
	public void setElement(E element) {
		this.element=element ;
		
	}

	@Override
	public boolean isNodePartOfTree() {
		// TODO Auto-generated method stub
		return this.isNodePartOfTree;
	}
	@Override
	public void setIsNodePartOfTree(boolean isNodePartOfTree) {
		// TODO Auto-generated method stub
		 this.isNodePartOfTree=isNodePartOfTree;
	}

}
