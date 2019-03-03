package com.awanish;

import java.util.Arrays;

import org.junit.Test;

/*
 *Given an array of elements of length N, ranging from 0 to N – 1. All elements may not be present in the array.
 * If element is not present then there will be -1 present in the array. Rearrange the array such that A[i] = i 
 * and if i is not present, display -1 at that place
 * 
 */
public class RearrangeArray {
	
	@Test
	public void test(){
		Integer []a ={19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
	              11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
		rearrange(a);
	}
	
	
	public void rearrange(Integer []a){
		
		for (int i=0 ;i<a.length;i++){
			 if(a[i]==-1 || a[i]==i )continue ;
			 //trick is afe adjusting current element we need to see 
			 //the next element proper position untill we find a[i]==i
			 while ( a[i]!=i && a[i]!=-1){
				 int temp =a[a[i]];
				 a[a[i]]=a[i];
				 a[i]=temp;
			 }
			
		}
		System.out.println(Arrays.toString(a));
	}

}
