package com.awanish;

import java.util.HashMap;

import org.junit.Test;

public class MergeTwoSortedArray {

	/*
	 * Algorithm genericMerge(A, B)
       S  empty sequence
		while ¬A.isEmpty() ∧ ¬B.isEmpty()
				a ← A.first().element(); b ← B.first().element()
				if a < b
				aIsLess(a, S); A.remove(A.first())
				else if b < a
				bIsLess(b, S); B.remove(B.first())
				else { b = a }
				bothAreEqual(a, b, S)
				A.remove(A.first()); B.remove(B.first())
	while ¬A.isEmpty()
		aIsLess(a, S); A.remove(A.first())
		while ¬B.isEmpty()
		bIsLess(b, S); B.remove(B.first())
return S
	 * 
	 * */
	
	
	public int [] merge(int []array1 ,int[]array2){
		int lengthOfArray1 = array1.length ;
		int lengthOfArray2 = array2.length ;
		HashMap map = new HashMap();
		
		// array1 = {1,3,5,6,8,11}
		// array2 = {2,4,9,13,15}
		//output = {1,2,3,4,5,6,8,9,11,13,15}
		int []output = new int[lengthOfArray1+lengthOfArray2];
		int i=0,j=0;
		while (i<lengthOfArray1 && j<lengthOfArray2){
			output[i] = array1[i];
			if (array1[i] >= array2[i]) {
				output[i] = array1[i];
			} else {
				output[i] = array2[i];
			}
			i++;
			j++;
		}
		
        while(i<lengthOfArray1)	{
        	output[i]= array1[i];;
        	i++;
        }	
        
        while(i<lengthOfArray2)	{
        	output[i]= array2[i];;
        	i++;
        }	
			    
		
		return output ;
	}
	
	@Test
	public void testMergeTwoArray(){
		int[] array1 = {1,3,5,6,8,11};
		int[] array2 = {2,4,9,13,15};
		int[] output = {1,2,3,4,5,6,8,9,11,13,15};
		int[] result = merge(array1 ,array2);
		
		org.junit.Assert.assertArrayEquals(output, result);
	}
}
