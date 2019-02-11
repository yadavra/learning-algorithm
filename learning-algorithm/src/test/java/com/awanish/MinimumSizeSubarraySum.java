package com.awanish;

import org.junit.Test;

/*
Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

Example: 

Input: s = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: the subarray [4,3] has the minimal length under the problem constraint.
Follow up:
If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n). 

https://leetcode.com/articles/minimum-size-subarray-sum/

*
*
*/ 
public class MinimumSizeSubarraySum {
	
	@Test
	public void testMinSubarray(){
		
		//int [] in = {5,1,3,5,10,7,4,9,2,8};
		//int [] in ={1,2,3,4,5};
		int [] in ={2,3,1,2,4,3};
		int sum = 7;
		int len = minSubArrayLen(sum,in);
		
		System.out.println(len);
		
	}
	
	
	
public int minSubArrayLen1(int s, int[] nums) {
	
	if(nums==null || s==0){
		return 0;
	}
        
	int minLength=Integer.MAX_VALUE;
	int arraySum=0;
    for (int i=0;i<=nums.length-1;i++){
    
    	for ( int j=i;j<=nums.length-1;j++){
    		 arraySum = arraySum+nums[j];
    		 if(arraySum>=s){
    	         int tempLength = j-i+1;
    	         minLength=Math.min(minLength, tempLength);
    	         break;
    		 }
    		
    		
    	 }
    	arraySum=0;
    }
	
	if(minLength==Integer.MAX_VALUE){
		minLength=0;
	}
	
	return minLength ;
  }


public int minSubArrayLen(int s, int[] nums) {
	
	if(nums==null || s==0){
		return 0;
	}                   
        //int [] in ={1,2,3,4,5};
	int minLength=Integer.MAX_VALUE;
	int arraySum=0;	
	int j=0;
    for (int i=0;i<=nums.length-1;i++){
    	arraySum +=nums[i]; 
    	while(arraySum>=s){
    		int tempLength = i-j+1;
        	minLength=Math.min(minLength, tempLength);
    		arraySum-=nums[j++];
    	}
    	
    }
	
	if(minLength==Integer.MAX_VALUE){
		minLength=0;
	}
	
	return minLength ;
  
  }

}
