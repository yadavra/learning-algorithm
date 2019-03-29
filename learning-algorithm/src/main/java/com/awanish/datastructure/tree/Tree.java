package com.awanish.datastructure.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.logging.Logger;

public class Tree<E> {
    Logger log = Logger.getLogger(this.getClass().getName());
    
	private Node<E> rootNode;

	public void addElement(E element) {
		Node<E> node = new NodeImpl<E>();
		node.setElement(element);

		if (rootNode == null) {
			rootNode = node;
		} else {
			addElement(node);

		}
      Math.max(2, 2);
	}

	// Process CurrentNode > Then Left child > Right Child
	public void printTreePreOrder() {
		List<E> elements = new ArrayList<E>();
		log.info("Pre Order Recursive");
		printPreOrderRecursivly(rootNode, elements);
		log.info(elements.toString());
		log.info("Pre Order Interative");
		log.info(printPreOrderIterative(rootNode).toString());

	}

	private void printPreOrderRecursivly(Node<E> rootNode, List<E> elements) {
		if (rootNode == null) {
			return;
		}
		elements.add(rootNode.getElement());
		printPreOrderRecursivly(rootNode.getLeftChild(), elements);
		printPreOrderRecursivly(rootNode.getRightChild(), elements);

	}

	private List<E> printPreOrderIterative(Node<E> rootNode) {
		List<E> elements = new ArrayList<E>();
		Deque<Node<E>> stack = new LinkedList<Node<E>>();
		stack.push(rootNode);
		while (!stack.isEmpty()) {
			Node<E> node = stack.pop();
			if (node != null) {
				elements.add(node.getElement());
				stack.push(node.getRightChild());
				stack.push(node.getLeftChild());
			}
		}
		return elements;
	}

	// Process Left Child > Then Current Node > Right Child
	public void printTreeInOrder() {
		if (rootNode == null) {
			return;
		}
		List<E> elements = new ArrayList<E>();

		log.info("In Order Recursive");

		printTreeInOrderRecursively(rootNode, elements);
		log.info(elements.toString());
		log.info("In Order Iterative");
		log.info(printTreeInOrderIteratively(rootNode).toString());

	}

	private void printTreeInOrderRecursively(Node<E> rootNode, List<E> elements) {

		if (rootNode == null) {
			return;
		}
		printTreeInOrderRecursively(rootNode.getLeftChild(), elements);

		elements.add(rootNode.getElement());

		printTreeInOrderRecursively(rootNode.getRightChild(), elements);
		return;
	}

	private List<E> printTreeInOrderIteratively(Node<E> rootNode) {
		List<E> elements = new ArrayList<E>();

		if (rootNode == null) {
			return elements;
		}
		Deque<Node<E>> stack = new LinkedList<Node<E>>();
		stack.push(rootNode);
		Node<E> currentNode = stack.peek();
		while (true) {

			if (currentNode != null && currentNode.getLeftChild() != null) {
				stack.push(currentNode.getLeftChild());
				currentNode = currentNode.getLeftChild();

			} else {
				if (stack.isEmpty()) {
					break;
				}
				currentNode = stack.pop();
				elements.add(currentNode.getElement());
				if (currentNode.getRightChild() != null) {
					stack.push(currentNode.getRightChild());
				}
				currentNode = currentNode.getRightChild();

			}
		}
		return elements;

	}

	// LRD
	public void printTreePostOrder() {
		log.info("Post Order Recursive");
		List<E> elements = new ArrayList<E>();
		printTreePostOrderRecursively(rootNode, elements);
		log.info(elements.toString());
		log.info("Post Order Iterative");
		log.info(printTreePostOrderIteratively(rootNode).toString());
	}

	private void printTreePostOrderRecursively(Node<E> rootNode, List<E> elements) {
		if (rootNode == null) {
			return;
		}
		printTreePostOrderRecursively(rootNode.getLeftChild(), elements);
		printTreePostOrderRecursively(rootNode.getRightChild(), elements);
		elements.add(rootNode.getElement());

	}

	private List<E> printTreePostOrderIteratively(Node<E> rootNode) {
		List<E> elements = new ArrayList<E>();
		if (rootNode == null) {
			return elements;
		}
		LinkedList<Node<E>> stack = new LinkedList<Node<E>>();
		Node<E> currentNode = rootNode;
		Node<E> lastVisitedNode = null;
		while (!stack.isEmpty() || currentNode != null) {
			if (currentNode!= null) {
				stack.push(currentNode);
				currentNode = currentNode.getLeftChild();
			} else {
				Node<E> node = stack.peek();
				if (node.getRightChild() != null && node.getRightChild() != lastVisitedNode) {
					currentNode = node.getRightChild();
				} else {
					elements.add(node.getElement());
					lastVisitedNode = stack.pop();
				}
			}
		}
		return elements;
	}

	private void addElement(Node<E> toBeAdd) {
		Queue<Node<E>> queue = new LinkedList<Node<E>>();
		queue.offer(rootNode);
		while (!queue.isEmpty()) {
			Node<E> currentNode = queue.poll();
			if (currentNode.getLeftChild() == null) {
				currentNode.setLeftChild(toBeAdd);
				return;
			}
			if (currentNode.getRightChild() == null) {
				currentNode.setRightChild(toBeAdd);
				return;
			}
			queue.offer(currentNode.getLeftChild());
			queue.offer(currentNode.getRightChild());
		}

	}

	public int findMaxPathSum(Node<E> node){
		LinkedList<Node<E>> l = new LinkedList<Node<E>>();
		ListIterator<Node<E>> itr = l.listIterator();
		while( itr.hasNext()){
			Node<E> obj = itr.next();
		}
		
		return 0;
	}
	
	
	public int findMaxDepth(){
		
		return findMaxDepth(rootNode);
	}

  private int findMaxDepth(Node<E> node){
	  if(node==null){
		  return 0 ;
	  }
	  return Math.max(findMaxDepth(node.getLeftChild()), findMaxDepth(node.getRightChild())) +1 ;
	  
	  
  }
  
  public int findMaxDepthIterative(){
	  int hight =0;
	  
	  LinkedList<Node<E>> stack = new LinkedList<Node<E>>();
	  Node<E> visited =null ;
	  Node<E> currentNode = rootNode ;
	  
	  while (!stack.isEmpty() || currentNode!=null ){
		   if(currentNode!=null){
			   stack.push(currentNode);
			   currentNode=currentNode.getLeftChild();
		   }else {
			   Node<E> temp =stack.peek();
			   if(temp.getRightChild()!=null && visited!=temp.getRightChild()){
				   currentNode=temp.getRightChild();
			   }else{

				   if(temp.getLeftChild()==null && temp.getRightChild()==null){
	                    hight = Math.max(hight, stack.size());				   
				   }
				   visited = stack.pop();
			   }
			   
		   }
		 
		  
		  
		  
	  }
	   
	  return hight ;
  }
  
  
}
