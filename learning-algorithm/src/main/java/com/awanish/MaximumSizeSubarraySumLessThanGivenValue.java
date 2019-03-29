package com.awanish;

import java.util.Scanner;

import org.junit.Test;

/*

Motivation Problem: Given an array having N integers, find the contiguous subarray having sum as great as possible, but not greater than M. 

For details on the statement, refer the problem link here

Constraints:Array can have atmost 10Pow 5 elements and each number will be non-negative and can be as big as 10 Pow 9.

Solution:As the given array contains positive elements,cumulative sum will indeed be increasing as you go on from left to right in the array.
If you have already read the binary search tutorial,I am pretty sure you must have found out a way to solve it already.

*/ 
public class MaximumSizeSubarraySumLessThanGivenValue {
	
	
	
	
	@Test
	public void testMinSubarray(){
		
		//int [] in ={7 ,3 , 5 , 6};
		//int sum = 9;
		int [] in ={2 ,1 ,3 ,4, 5};
		int sum = 12;
		int len = maxSubArraySumLessThankValueM1(sum,in);
		
		
		
		//System.out.println(len);
//		Scanner sc = new Scanner(System.in);
//		int inputSize =sc.nextInt();
//		int sum =sc.nextInt();
//		int [] in = new int[inputSize];
//		while(sc.hasNextInt()){
//			System.out.println(sc.hasNextInt());
//		}
//		
//		
//		maxSubArraySumLessThankValueM(sum,in);
	}
	
	
	


public int maxSubArraySumLessThankValueM(int s, int[] nums) {
	
	if(nums==null || s==0){
		return 0;
	}               
	int len = nums.length;
        //int [] in ={2, 1 ,3 ,4,  5 };
	int sum=0;
	int maxSum=0;
	for (int i=0 ;i<len-1;i++){
		 for ( int j=i;j<=len-1;j++){
	          if(sum+nums[j]<=s){
	        	 sum=sum+nums[j];
	          }else{
	        	  maxSum=Math.max(maxSum, sum);
	        	  sum=0;
	        	  break;
	          }		 
		 }
		
		
	}
		
	return maxSum ;
  
  }

public int maxSubArraySumLessThankValueM1(int s, int[] nums) {
	
	if(nums==null || s==0){
		return 0;
	}               
	int len = nums.length;
        //int [] in ={7, 3, 5 ,6 };
	int leftIndex=0;
	int maxSum=0;
	int sum=0;
	for (int i=0 ;i<=len-1;i++){
		sum+=nums[i];
		while(sum>s){
			sum-=nums[leftIndex++];
		}
		maxSum=Math.max(maxSum, sum); 
	}
		
	return maxSum ;
  
  }

}
