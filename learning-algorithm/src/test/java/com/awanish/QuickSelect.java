package com.awanish;

import java.util.Arrays;

import org.junit.Test;

public class QuickSelect {
	
	
	
	@Test
	public void findKthSmallestElement() {
		
//		int k = 3;
//		int[] array = { 7,4,6,3,9,1};
//
//		int start = 0;
//		int end = array.length - 1;
//
//		int currentSmallestIndex = findPivotIndex(array, start, end);
//		while (true) {
//			if (currentSmallestIndex < k) {
//				currentSmallestIndex = findPivotIndex(array, currentSmallestIndex + 1, end);
//			} else if (currentSmallestIndex > k) {
//
//				currentSmallestIndex = findPivotIndex(array, start, currentSmallestIndex - 1);
//			}
//			if (k == currentSmallestIndex) {
//				System.out.println(array[k]);
//				break;
//			}
//		}
		int[] array = { 7,4,6,3,9,1};
		quickSort(array, 0,array.length - 1);
		System.out.println("Loop ends" +Arrays.toString(array));
	}
	
	
	public int findPivotIndex(int[] arr,int start , int end) {
		int pivoteElement = arr[end];
		int j ,i= 0;
		j=i=start;
		while (j < end) {
			if (arr[j] < pivoteElement ) {
				swap(arr,i++,j++);
			} else {
				j++;
			}

		}
		arr[end] = arr[i];
		arr[i] = pivoteElement;

		return i;
	}
		
 private void swap(int arr[], int i,int j){
	 
 	 int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;
	 
 }
 
 public void quickSort( int array[] ,int start , int end ){
	    if(start>end){
	    	return ;
	    }
		int currentSmallestIndex = findPivotIndex(array, start, end);
		quickSort(array,start , currentSmallestIndex-1);
		quickSort(array,currentSmallestIndex+1 ,end );
		
	 
 }
}
