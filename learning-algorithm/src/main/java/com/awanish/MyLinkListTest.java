package com.awanish;

import org.junit.Test;

import com.awanish.datastructure.MyLinkList;
import com.awanish.datastructure.MySinglyLinkedListImpl;
import com.awanish.datastructure.Node;
import com.awanish.datastructure.NodeImpl;

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
	
	@Test
	public void testaddTwoNumber(){
		
		MyLinkList<Integer> list1 = new MySinglyLinkedListImpl<Integer>();
		MyLinkList<Integer> list2 = new MySinglyLinkedListImpl<Integer>();
		list1.add(5);
		//list1.add(8);
	//	list1.add(3);
		
		list2.add(5);
		//list2.add(6);
		//list2.add(4);
		addTwoNumber(list1,list2);
	} 
	public Node<Integer>  addTwoNumber(MyLinkList<Integer> list1 , MyLinkList<Integer> list2){
		Node<Integer> head1 = list1.getHead();
		Node<Integer> head2 = list2.getHead();
		if(head1==null&& head2==null){
			return null ;
		}else if (head1==null){
			return head2 ;
		}else if (head2==null){
			return head1;
		}
		Node<Integer> dummyNode = new NodeImpl<>();	
		Node <Integer> result=dummyNode;
		int carry =0;
		while (head1!=null || head2!=null){
			if(head1!=null && head2!=null){
			int tempSum=head1.getElement()+head2.getElement()+carry ;
			carry=add(dummyNode,tempSum);
			head1=head1.nextNode();
			head2=head2.nextNode();
			
			}else if (head1!=null){
				carry=add(dummyNode,head1.getElement()+carry);
				head1=head1.nextNode();
			}else if(head2!=null){
				carry=add(dummyNode,head2.getElement()+carry);
				head2=head2.nextNode();
			} 
		}
		while(head1!=null){
			carry=add(dummyNode,head1.getElement()+carry);
			head1=head1.nextNode();
			
		}
		while(head2!=null){
			carry=add(dummyNode,head2.getElement()+carry);
			head2=head2.nextNode();
		}
		if(carry>0){
			while(dummyNode.nextNode()!=null){
				dummyNode=dummyNode.nextNode();
			}
			Node<Integer> node =new NodeImpl<>();
			node.setElement(carry);
			dummyNode.setNextNode(node );
		}
		
		return result.nextNode() ;
		
	}

	private int add(Node<Integer> dummyNode, int sum) {
		
		while(dummyNode.nextNode()!=null){
			dummyNode=dummyNode.nextNode();
		}
		int carry =0;
		if(sum/10>0){
			Node<Integer> tempNode = new NodeImpl<>();
			tempNode.setElement(sum%10);
			dummyNode.setNextNode(tempNode);
			dummyNode=dummyNode.nextNode();
			carry=1;
		}else{
			Node<Integer> tempNode = new NodeImpl<>();
			tempNode.setElement(sum);
			dummyNode.setNextNode(tempNode);
			dummyNode=dummyNode.nextNode();
			carry=0;
			
		}
		return carry;
		
	}
}
