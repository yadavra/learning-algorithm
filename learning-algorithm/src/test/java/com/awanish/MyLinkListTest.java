package com.awanish;

import org.junit.Test;

import com.awanish.datastructure.MyLinkList;
import com.awanish.datastructure.MySinglyLinkedListImpl;
import com.awanish.datastructure.Node;

public class MyLinkListTest {

	@Test
	public void testMyLinkList() {

		MyLinkList<String> list = new MySinglyLinkedListImpl<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		//Node<String> node = list.reverseList();
		//list.addAfter("walmart", "not");
		
		//list.addBefore("Awanish", "Ramesh");
//		assertEquals("Ramesh is not in list" ,false,list.contains("Ramesh"));
//		assertEquals("Rick is in List",true,list.contains("Rick"));
		//assertEquals(false, list.removeBefore("Amazon"));
		//assertEquals(false,list.contains("Awanish"));
//		Node<String> head = list.getHead();
//		while(head!=null){
//			System.out.print("->" + head.getElement());
//			head=head.nextNode();
//		}
//		System.out.println();
//		System.out.println("-------------");
//		list.reverseListRecursively();
//		head = list.getHead();
//		while(head!=null){
//			System.out.print("->" + head.getElement());
//			head=head.nextNode();
//		}
//		System.out.println();
		oddEvenListReorder(list);
		System.out.println("End Of reverse");
	}
	
	public Node<String>  oddEvenListReorder(MyLinkList<String> list ){
		if(list==null ){
			return null ;
		}
		Node<String> head = list.getHead();
		Node<String> ptr1=head;
		Node<String> ptr2 =head.nextNode();
		Node<String> headOfEvenNode=null;
		while (ptr1!=null && ptr2!=null && ptr1.nextNode()!=null && ptr2.nextNode()!=null ){
			headOfEvenNode=ptr1.nextNode();//Head of the even node . 
			ptr1.setNextNode(ptr2.nextNode());
			ptr2.setNextNode(ptr1.nextNode().nextNode());
			ptr1.nextNode().setNextNode(headOfEvenNode);
			ptr1=ptr1.nextNode();
			ptr2=ptr2.nextNode();
			
		}
		
        		
		
		return null ;
		
	}
}
