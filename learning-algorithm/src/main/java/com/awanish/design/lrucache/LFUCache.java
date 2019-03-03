package com.awanish.design.lrucache;

import java.util.HashMap;
import java.util.Map;



class LFUCache {
	LinkedNode header ;
	LinkedNode tail ;
	int size ;
	int capacity ;
	Map<Integer,LinkedNode> m =new HashMap<Integer, LinkedNode>();
    public LFUCache(int capacity) {
        this.capacity=capacity;
        header=new LinkedNode(0,0);
        tail=new LinkedNode(0,0);
        header.next=tail;
        tail.prev=header;
    }
    
    public int get(int key) {
    
    	if(m.get(key)!=null){
    		LinkedNode node = m.get(key);
    		moveToHead(node);
    		
    	}
        return m.get(key)==null?-1: m.get(key).value;
    }
    
    private void moveToHead(LinkedNode node) {
    	removeNode(node);
    	addNode(node);
	}

	public void put(int key, int value) {
    	if(m.get(key)==null && size>=capacity){
    		m.remove(tail.prev.key);
    		removeNode(tail.prev);
    		size--;
    	}
        if(m.get(key)!=null){
           LinkedNode node = m.get(key);
           node.value=value ; 
            
        }else{
            LinkedNode node = new LinkedNode(key,value);
            m.put(key, node);
            addNode(node);
            size++;    
        }
    	
        
    }

	private void addNode(LinkedNode node) {
		if(header.next==tail){
    		header.next=node ;
    		node.prev=header;
    		node.next=tail;
    		tail.prev=node;
    	}else {
    		 LinkedNode next = header.next ;
    		 header.next=node;
    		 node.prev=header;
    		 node.next=next;
    		 next.prev=node;
    		
    	}
	}
	
	private void removeNode(LinkedNode node) {
		LinkedNode prev =node.prev;
		LinkedNode next =node.next;
		prev.next=next;
		next.prev=prev;
		
		
	}
    
    
    class LinkedNode {
    	private int key ;
    	private int value ;
    	public LinkedNode(int key , int value ){
 		 	this.key=key ;
    		this.value=value;
    	}
    	LinkedNode next ;   
    	LinkedNode prev ;
    	
    }
    
   
    
}
    
   
    


