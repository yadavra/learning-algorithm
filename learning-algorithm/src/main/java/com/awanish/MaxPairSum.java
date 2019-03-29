package com.awanish;

import org.junit.Test;

public class MaxPairSum {
    @Test
	public void maxPairSum(){
		
		int [] a ={1,4,3,2};
		org.junit.Assert.assertEquals(4, arrayPairSum(a));
		
	}
	 public int arrayPairSum(int[] nums) {
	        java.util.Arrays.sort(nums);
	        int result =0 ;
	        for(int i=0;i<nums.length;i=i+2)
	        {
	        
	            result=result+nums[i];
	           
	                            
	        }
	        return result ;
	    }
}
