package com.awanish;

import java.util.Stack;

import org.junit.Test;

import com.awanish.datastructure.MyLinkList;
import com.awanish.datastructure.MySinglyLinkedListImpl;
import com.awanish.datastructure.Node;

public class PalindromicLinkedList {

	
	MyLinkList<String> list = new MySinglyLinkedListImpl<String>();
	@Test
	public void testPalindrom(){
		
		list.add("1");
		list.add("2");
		list.add("2");
        list.add("2");
	    list.add("1");
//		list.add("1"); 
//		list.add("4");
//		list.add("5"); 
	    isPalindromeUsingStack(list);
	}
	
	public boolean isPalindrome(MyLinkList<String> list){
		
		Node<String> head = list.getHead();
		Node<String> slowPtr1=head;
		Node<String> fastPtr2=head;
		Node<String> prev=null ; 
		int count =1;
		while(fastPtr2!=null && fastPtr2.nextNode()!=null){
			fastPtr2=fastPtr2.nextNode().nextNode();
			Node<String> temp =slowPtr1.nextNode();
			slowPtr1.setNextNode(prev);
			prev=slowPtr1;
			slowPtr1=temp;
			count ++;
		}
        System.out.println("Middle Node" + slowPtr1.getElement());
        Node<String> tempBackwardList1Head=prev;
        Node<String> tempForwardListHead=slowPtr1;
        if(fastPtr2!=null){
        	slowPtr1=slowPtr1.nextNode();
        }
        prev=null ;
        while(tempBackwardList1Head!=null && tempForwardListHead!=null ){
        	if(! tempBackwardList1Head.getElement().equals(tempForwardListHead.getElement())){
        		return false ;
        	}else {
        		//Node<String> temp =tempBackwardList1Head.nextNode();  		
        		//tempBackwardList1Head.setNextNode(slowPtr1.nextNode());
        		tempBackwardList1Head=tempBackwardList1Head.nextNode();
        		tempForwardListHead=tempForwardListHead.nextNode();
        		continue ;
        		
        	}
        	
        }
		
		return true ;
		
		
	}
	
public boolean isPalindromeUsingStack(MyLinkList<String> list){
		
		Node<String> head = list.getHead();
		Node<String> slowPtr1=head;
		Node<String> fastPtr2=head;
		Stack<Node<String>> stack = new Stack<Node<String>>();  
		while(fastPtr2!=null && fastPtr2.nextNode()!=null){
			fastPtr2=fastPtr2.nextNode().nextNode();
			stack.push(slowPtr1);
			slowPtr1 =slowPtr1.nextNode();
			
		}
        System.out.println("Middle Node" + slowPtr1.getElement());
        if(fastPtr2!=null){
        	//stack.push(slowPtr1.nextNode());
        	slowPtr1 =slowPtr1.nextNode();
        }

        while(slowPtr1!=null ){
        	Node<String> temp=slowPtr1 ;
        	slowPtr1=slowPtr1.nextNode();
        	if(! temp.getElement().equals(stack.pop().getElement())){
        		return false ;
        	}
        	
        }
		
		return true ;
		
		
	}
}
