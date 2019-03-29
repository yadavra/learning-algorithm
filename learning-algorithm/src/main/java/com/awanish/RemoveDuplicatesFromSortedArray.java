package com.awanish;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArray {

	@Test
	public void testRemoveDuplicate(){
		
		int [] a ={1,2,3,4,4,5};
		System.out.println(removeDuplicates(a));
	}
	
	public int removeDuplicates(int[] a) {
		int len = a.length;
		int j = 1;
		for (int i = 0; i < len-1; i++) {
			if (a[i + 1] > a[i]) {
				a[j++]=a[i+1];
			} 
		}

		return j;

	}
	
	public int removeDuplicates1(int[] a) {
		int len = a.length;
		int index = 0;
		for (int i = 0; i <= len-1; i++) {
			if (a[i]==a[index]){
				continue;
			}
			a[++index]=a[i];
		}

		return index+1;

	}

}
