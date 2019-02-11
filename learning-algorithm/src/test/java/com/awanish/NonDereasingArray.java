package com.awanish;

import org.junit.Test;

public class NonDereasingArray {
	
	@Test
	public void testNonDecreasingArray(){
		//int [] in={4,2,1};
		//[-1,4,2,3]
		int [] in ={3,4,2,3};
		//[-1,4,2,3]
		//int [] in ={-1,4,2,3};
		//int [] in ={4,2,3};
		//int [] in ={1,5,4,6,7,10,10,8,9};
		checkPossibility(in);
	}
	
	
	
	  public boolean checkPossibility(int[] nums) {
		  int cnt = 0;                                                                    //the number of changes
	        for(int i = 1; i < nums.length && cnt<=1 ; i++){
	            if(nums[i-1] > nums[i]){
	                cnt++;
	                if(i-2<0 || nums[i-2] <= nums[i])nums[i-1] = nums[i];                    //modify nums[i-1] of a priority
	                else nums[i] = nums[i-1];                                                //have to modify nums[i]
	            }
	        }
	        return cnt<=1;
	        
	    }

}
