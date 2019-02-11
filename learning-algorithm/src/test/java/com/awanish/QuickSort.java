package com.awanish;

import java.util.Arrays;

import org.junit.Test;

public class QuickSort {
	ArrayPartition ap = new ArrayPartition(); 
	
	
	public void sort(int array[], int startIndex , int endIndex){
		int p = startIndex;
		int q = endIndex ;
		if(p>q){
			//break recursion
			return ;
		}
		int pivote = ap.findIndexOfPivoteElement(array, startIndex, endIndex);
		sort(array ,startIndex,pivote-1);
		sort(array,pivote+1 ,endIndex);
		
	}
	
	
	
	@Test 
	public void sortingUsingQuickSortAlgorithm(){
		int array [] ={12,7,14,9,10,11};	
		sort(array,0,5);
		System.out.println(Arrays.toString(array));
		
	}
	
}
	

