package com.awanish;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;



public class MaxSubArraySumTest {
	
	private int [] input={12,12,45,1} ;
	@Before
	public void initialize(){
		
		input = new int[]{-2,-3,4,-5,-2,-1,5,-3,4} ;
	}
	
	
	@Test
	public void testNullArray (){
		
		if(input==null||input.length==0){
			assertNotNull(input);
		}
		
	}
	
	@Test
	public void findMaxSubArraySum(){
	   //Kadane's algorithm  : Max  ( subarray at ending index i , x )  	
		int maxSum=input[0];
		int currentSum=input[0];
		
		int maxSubarrayEnding = 0 ;
		int startIndexOfSubarray = 0 ;
		int endIndexOfSubarray =0;
		for(int i=1 ;i< input.length ;i++){
			if(currentSum+input[i]<input[i]){
  				currentSum=input[i];
  				maxSubarrayEnding=i;
			}else{
				currentSum=currentSum+input[i];
				
			}
			if(currentSum>maxSum){
				startIndexOfSubarray=maxSubarrayEnding;
				endIndexOfSubarray=i;
				maxSum=currentSum ;
			}
		}
		System.out.print("maxSubarray["+startIndexOfSubarray + "," + endIndexOfSubarray +"] Max Sum is :" + maxSum);
		assertEquals(5, maxSum);
	}
   }
