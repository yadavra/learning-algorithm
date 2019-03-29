package com.awanish.datastructure.tree;

import org.junit.Test;

public class TestTree {
	
	@Test
	public void testTree(){
		
		
		Tree<String> t = new Tree<String>();
		t.addElement("+");
		t.addElement("-");
		t.addElement("*");
		t.addElement("A");
		t.addElement("B");
		t.addElement("C");
		t.addElement("/");
		t.addElement("E");
		t.addElement("D");
		
		t.printTreePreOrder();
	}
	
	@Test
	public void test1Tree(){
		
		
		Tree<String> t = new Tree<String>();
		t.addElement("1");
		t.addElement("2");
		t.addElement("3");
		t.addElement("4");
		t.addElement("5");
		t.printTreePreOrder();
	}
	
	@Test
	public void testInOrder(){
		
		
		Tree<String> t = new Tree<String>();
		t.addElement("1");
		t.addElement("2");
		t.addElement("3");
		t.addElement("4");
		t.addElement("5");
		t.addElement("6");
		t.addElement("7");
		t.addElement("8");
		t.printTreeInOrder();
	}
	
	@Test
	public void testPostOrder(){
		
		
		Tree<String> t = new Tree<String>();
		t.addElement("1");
		t.addElement("2");
		t.addElement("3");
		t.addElement("4");
		t.addElement("5");
		t.addElement("6");
		t.addElement("7");
		t.addElement("8");
		t.printTreePostOrder();
	}

}
