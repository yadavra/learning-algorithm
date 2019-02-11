package com.awanish;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayPartition {

	public  int[] partionArroundLastElementInArray(int[] array, int startPosition, int endPosition) {

		int pivoteElement = array[endPosition];
		int q = 0;
		for (int j = 0; j <= endPosition; j++) {
			if (array[j] >= pivoteElement)
				continue;
			swap(array,q,j);
			q++;
		}
		array[endPosition] = array[q];
		array[q] = pivoteElement;

		return array;
	}
	
	public int findIndexOfPivoteElement(int[] array, int startPosition, int endPosition){
		int pivoteElement = array[endPosition];
		int q = 0;
		for (int j = 0; j <= endPosition; j++) {
			if (array[j] >= pivoteElement)
				continue;
			swap(array,q,j);
			q++;
		}
		array[endPosition] = array[q];
		array[q] = pivoteElement;
		
		return q;
	}
	
	public void swap(int [] arr , int indexI , int indexJ){
		int temp = arr[indexJ];
		arr[indexJ] = arr[indexI];
		arr[indexI] = temp;
		
	}
	
	@Test
	public void testPartition(){
		int array [] ={12,7,14,9,10,11};
		int expecteds [] ={7,9,10,11,14,12};
		assertArrayEquals(expecteds, partionArroundLastElementInArray(array,0,5));
		
	}

}
