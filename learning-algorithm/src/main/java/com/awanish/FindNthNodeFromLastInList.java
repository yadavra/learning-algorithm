package com.awanish;

import org.junit.Test;

import com.awanish.datastructure.MyDoublyLinkedList;
import com.awanish.datastructure.MyLinkList;
import com.awanish.datastructure.MySinglyLinkedListImpl;
import com.awanish.datastructure.Node;

public class FindNthNodeFromLastInList {
	
	
	
	@Test
	public void testMyLinkList() {

		MyLinkList<String> list = new MySinglyLinkedListImpl<String>();
		list.add("Ramesh");
        list.add("And");
//		list.add("Awanish");
//		list.add("will");
//		list.add("go");
//		list.add("amazon");
//		list.add("OR");
//		list.add("UBR");
//		list.add("OR");
//		list.add("SALESFORCE");
//		System.out.println("Node 3 from last " + list.findNthNodeFromLast(3).getElement());
//		System.out.println("Node 2 from last "+ list.findNthNodeFromLast(2).getElement());
//		System.out.println("Node 1 from last "+ list.findNthNodeFromLast(1).getElement());
		System.out.println("Node 1 from last "+ list.findNthNodeFromLast(1).getElement());
		//deleteNthNodeFromLast

	}
	
	@Test
	public void testDeleteNthNodeMyLinkList() {

		MyLinkList<String> list = new MySinglyLinkedListImpl<String>();
		list.add("Ramesh");
        list.add("And");
     	//list.add("Awanish");
//		list.add("will");
//		list.add("go");
//		list.add("amazon");
//		list.add("OR");
//		list.add("UBR");
//		list.add("OR");
//		list.add("SALESFORCE");
//		System.out.println("Node 3 from last " + list.findNthNodeFromLast(3).getElement());
//		System.out.println("Node 2 from last "+ list.findNthNodeFromLast(2).getElement());
//		System.out.println("Node 1 from last "+ list.findNthNodeFromLast(1).getElement());
		System.out.println("Node 1 from last "+ list.deleteNthNodeFromLast(3).getElement());
		

	}
	

}
