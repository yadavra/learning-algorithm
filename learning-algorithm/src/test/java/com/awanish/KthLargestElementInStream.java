package com.awanish;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Test;

public class KthLargestElementInStream {
	
   @Test
	public void testKthElement(){
		int[] arr = {4,5,8,2};

		
		KthLargest ob= new KthLargest(3, arr);
		org.junit.Assert.assertEquals(4, ob.add(3));
		org.junit.Assert.assertEquals(5, ob.add(5));
		
	}
	 
   


	class KthLargest {
	    private int kthLargest ;
	    private Queue<Integer> q = new PriorityQueue<Integer>();	    	
	    
	    public KthLargest(int k, int[] nums) {
	    	this.kthLargest=k ;
	    	 for (int i:nums){
	    		 this.add(i);
	    	 }
	    }
	    
	    public int add(int val) {
          if(q.size()<kthLargest){
        	  q.offer(val);
          }	else if(q.peek()<val) {
        	     q.poll();
        	     q.offer(val);
          }
          return q.peek();
	    }
	}
}
