package com.awanish;

import org.junit.Test;

import com.awanish.datastructure.MyLinkList;
import com.awanish.datastructure.MySinglyLinkedListImpl;
import com.awanish.datastructure.Node;

public class PalindromicLinkedList {

	
	MyLinkList<String> list = new MySinglyLinkedListImpl<String>();
	@Test
	public void testPalindrom(){
		
		list.add("5");
		list.add("4");
		list.add("1");
		list.add("2");
		list.add("2");
		list.add("1"); 
		list.add("4");
		list.add("5"); 
	}
	
	public boolean isPalindrome(MyLinkList<String> list){
		
		Node<String> head = list.getHead();
		Node<String> slowPtr1=head;
		Node<String> fastPtr2=head.nextNode().nextNode();
		while(fastPtr2!=null){
			fastPtr2=fastPtr2.nextNode();
			slowPtr1=slowPtr1.nextNode();
		}
        System.out.println("Middle Element" + slowPtr1.getElement());		
		
		return false ;
		
		
	}
}
