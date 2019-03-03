package com.awanish.datastructure;

public class DeleteNthNodeFromLast {

	public class ListNode {
		public ListNode getNext() {
			return next;
		}

		public void setNext(ListNode next) {
			this.next = next;
		}

		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return null;

		ListNode fast = head;
		ListNode slow = head;
        
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}

		// if remove the first node
		if (fast == null) {
			head = head.next;
			return head;
		}

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;

		return head;

	}
	
	public  void generateList(int size){
		
		
	}

}
