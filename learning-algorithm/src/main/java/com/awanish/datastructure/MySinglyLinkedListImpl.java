package com.awanish.datastructure;

public class MySinglyLinkedListImpl<E> implements MyLinkList<E> {

	private Node<E> head;
	int size;

	public MySinglyLinkedListImpl() {

	}

	public Node<E> getHead() {
		return this.head;
	}

	public E get(int i) {
		E ret = null;
		if (i > size) {
			return ret;
		} else {
			Node<E> temp = head;
			for (int k = 0; k < i; k++) {
				temp = temp.nextNode();
			}
			ret = temp.getElement();

		}
		return ret;
	}

	public void add(E element) {
		Node<E> temp = new NodeImpl<E>();
		temp.setElement(element);

		if (head == null && size == 0) {
			head = temp;
		} else {
			Node<E> p = head;
			while (p.nextNode() != null) {
				p = p.nextNode();
			}
			p.setNextNode(temp);
		}
		size++;
	}

	public boolean contains(E element) {
		Node<E> p = head;
		if (isEmpty()) {
			return false;
		}
		while (p.nextNode() != null) {
			if (p.getElement().equals(element)) {
				break;
			}
			p = p.nextNode();

		}
		return p != null && p.getElement().equals(element);
	}

	public Node<E> findElement(E element) {
		Node<E> p = head;
		if (isEmpty()) {
			return null;
		}
		while (p != null && !p.getElement().equals(element)) {
			p = p.nextNode();
		}
		return p;
	}

	public Node<E> findPreviousElement(E element) {
		Node<E> p = head;
		if (isEmpty()) {
			return null;
		}
		Node<E> prev = null;
		while (p != null && !p.getElement().equals(element)) {
			prev = p;
			p = p.nextNode();

		}

		return p != null ? prev : null;
	}

	public void addAfter(E element, E elimentToBeAdded) {
		Node<E> currentNode = findElement(element);
		if (currentNode != null) {
			Node<E> nextNode = currentNode.nextNode();
			Node<E> temp = new NodeImpl<E>();
			temp.setElement(elimentToBeAdded);
			currentNode.setNextNode(temp);
			temp.setNextNode(nextNode);
			size++;

		}

	}

	public void addBefore(E element, E elimentToBeAdded) {
		Node<E> currentNode = findPreviousElement(element);

		if (currentNode != null) {
			Node<E> nextNode = currentNode.nextNode();
			Node<E> temp = new NodeImpl<E>();
			temp.setElement(elimentToBeAdded);
			currentNode.setNextNode(temp);
			temp.setNextNode(nextNode);
			size++;

		}

	}

	public void addBegningOfList(E element) {

	}

	public boolean remove(E element) {
		boolean ret = false;
		if (isEmpty()) {
			return ret;
		}
		Node<E> currentNode = head;
		Node<E> previousNode = null;
		while (currentNode != null && currentNode.getElement() != null && !currentNode.getElement().equals(element)) {
			previousNode = currentNode;
			currentNode = currentNode.nextNode();
		}
		// This indicate we found the node
		if (previousNode == null) {
			if (head != null) {
				head = head.nextNode();
			}
			ret = true;
		} else {
			if (currentNode != null) {
				previousNode.setNextNode(currentNode.nextNode());
				ret = true;
			}
		}
		if (ret) {
			this.size--;
		}
		return ret;
	}

	public E removeAfter(E element) {
		E ret = null;
		if (isEmpty()) {
			return null;
		}
		Node<E> currentNode = head;
		Node<E> previousNode = null;
		Node<E> nodeToBeRemoved = null;
		// special case

		while (currentNode != null && currentNode.getElement() != null && !currentNode.getElement().equals(element)) {
			previousNode = currentNode;
			currentNode = currentNode.nextNode();
		}
		// This indicate we found the node at head or did not find

		if (previousNode == null && head.getElement() != null && head.getElement().equals(element)) {
			nodeToBeRemoved = head.nextNode();
			head.setNextNode(nodeToBeRemoved.nextNode());

		} else {
			if (currentNode != null && currentNode.nextNode() != null) {
				nodeToBeRemoved = currentNode.nextNode();
				currentNode.setNextNode(nodeToBeRemoved.nextNode());
				ret = currentNode.getElement();
			}
		}
		if (nodeToBeRemoved != null) {
			this.size--;
			return nodeToBeRemoved.getElement();
		} else {
			return null;
		}

	}

	public E removeBefore(E element) {
		E ret = null;
		if (isEmpty() || null == element) {
			return null;
		}
		Node<E> currentNode = head;
		Node<E> previousNode = null;
		// special case
		if (head != null && head.getElement().equals(element)) {
			return null;
		}
		while (currentNode != null && currentNode.nextNode() != null && currentNode.nextNode().getElement() != null
				&& !currentNode.nextNode().getElement().equals(element)) {
			previousNode = currentNode;
			currentNode = currentNode.nextNode();
		}
		// This indicate we found the node
		if (previousNode == null) {
			return null;
		} else {
			if (currentNode != null) {
				previousNode.setNextNode(currentNode.nextNode());
				ret = currentNode.getElement();
			}
		}
		if (ret != null) {
			this.size--;
		}
		return ret;
	}

	public boolean removeBegningOfList() {
		boolean ret = false;
		if (isEmpty()) {
			ret = false;
		} else {
			Node<E> temp = head;
			head = temp.nextNode();
			ret = true;
		}
		return ret;
	}

	public int size() {

		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	
	@Override
	public Node<E> reverseList() {
		  if(isEmpty()){
			  return null ;
		  }
		  Node<E> curr = head.nextNode(); //one pointer ahead 
		  Node<E> prev = head;//Previous pointer so that it can be set in curr
		  head.setNextNode(null);
		  while ( curr.nextNode()!=null){
			  Node<E> temp = curr.nextNode() ;
			  curr.setNextNode(prev);
			  prev=curr;
			  curr=temp;
		  }
		  curr.setNextNode(prev);
		  head=curr ;
		return curr ;
	}
	
	@Override
	public Node<E> reverseListRecursively() {
		  if(isEmpty()){
			  return null ;
		  }
		  Node<E> curr = head.nextNode(); //one pointer ahead 
		  Node<E> prev = head;//Previous pointer so that it can be set in curr
		  head.setNextNode(null);
		  reverListRecusrsive(curr,prev);
		return head ;
	}
	
	private void reverListRecusrsive( Node<E> curr , Node<E> prev){
		  if(curr.nextNode()==null){
			  curr.setNextNode(prev);
			  head=curr ;
			  //base condition
			  return ;
		  }
		  Node<E> temp = curr.nextNode() ;
		  curr.setNextNode(prev);
		  prev=curr;
		  curr=temp;
		  reverListRecusrsive(curr,prev);
         		
	}

	@Override
	public Node<E> findNthNodeFromLast(int position) {
	     if(isEmpty()){
	    	 return null ;
	     }
	     Node<E> slowPtr = this.head ;
	     Node<E> fastPtr = this.head ;
	     for (int i=0;i<position;i++){
	    	 if(fastPtr==null){
	    		 return null ;
	    	 }
	    	 fastPtr= fastPtr.nextNode();
	     }
	     
	     while ( fastPtr!=null){
	    	 fastPtr= fastPtr.nextNode();
	    	 slowPtr= slowPtr.nextNode();
	    	 
	     }
		return slowPtr ;
	}
	
	@Override
	public Node<E> deleteNthNodeFromLast(int position) {
	     if(isEmpty()){
	    	 return null ;
	     }
	     Node<E> slowPtr = this.head ;
	     Node<E> fastPtr = this.head ;
	     for (int i=0;i<position;i++){
	    	 if(fastPtr==null){
	    		 return head ;
	    	 }
	    	 fastPtr= fastPtr.nextNode();
	     }
	     if(fastPtr==null){
	    	 head=head.nextNode();
	    	 return head ;
	     }
	     
	     while ( fastPtr.nextNode()!=null){
	    	 fastPtr= fastPtr.nextNode();
	    	 slowPtr= slowPtr.nextNode();
	    	 
	     }
	     slowPtr.setNextNode(slowPtr.nextNode().nextNode());
	     
		return head ;
	}
	
	@Override
	public boolean isListContainCycle(){
		 boolean ret=false ;
	        if(head==null || head.nextNode()==null){
	            return ret ;
	        }
	        if(head==head.nextNode()) return true ;
	        
	        Node<E> slowPtr=head ;
	        Node<E> fastPtr=head ;
	        while(fastPtr!=null&&fastPtr.nextNode()!=null){
	            slowPtr=slowPtr.nextNode();
	            fastPtr=fastPtr.nextNode().nextNode();
	            if(slowPtr==fastPtr){
	                ret=true ;
	                break ;
	            }
	        }
	        return ret ;
	}

	@Override
	public Node<E> findLoopStartNode() {
		boolean isCycle = false ;
        Node<E> nodeAtWhichCycleBegin =null ;
        if(head==null || head.nextNode()==null){
            return null ;
        }
        if(head==head.nextNode()){
            return head ;
        }
        Node<E> slowPtr = head ;
        Node<E> fastPtr = head ;
        while (fastPtr!=null && fastPtr.nextNode()!=null){
            slowPtr=slowPtr.nextNode() ;
            fastPtr=fastPtr.nextNode().nextNode() ;
            if(slowPtr==fastPtr){
                isCycle=true ;
                slowPtr=head;
                break;
            }
        }
         if(fastPtr==head){
                return head ;
        
        }
        while(fastPtr!=null){
           
            fastPtr=fastPtr.nextNode() ;
            slowPtr=slowPtr.nextNode() ;
            if(slowPtr==fastPtr){
                nodeAtWhichCycleBegin = slowPtr ;
                break ;
            }
            
        }
        
        return nodeAtWhichCycleBegin ;
	}
	


}
