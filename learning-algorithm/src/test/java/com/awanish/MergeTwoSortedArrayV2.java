package com.awanish;

import java.util.Arrays;

import org.junit.Test;

public class MergeTwoSortedArrayV2 {
    @Test
	public void testMergeTwoArray(){
		
			
		int a1[] = {1,2,3,0,0,0};
		int a2[] = {2,5,6};
		
		int[] output = {1,2,2,3,5,6};
		System.out.println(Arrays.toString(merge(a1,a2,3)));
		
	}
	
	
	
	public int[] merge(int nums1[], int nums2[] ,int n) {
		int len_a1 = 3;
		int len_a2 = 3;
		int len_a3 = len_a1 + len_a2;
		int[] a3 = new int[len_a3];
		int i=0,j=0,k=0;
		
		while (i<len_a1&&j<len_a2){
			if( nums1[i]>nums2[j]){
					a3[k]=nums2[j];
					j++;
				}else {
					a3[k]=nums1[i];
					 i++;
				}	
           k++;
		}
		while (i<len_a1){
			a3[k]=nums1[i];
			i++;
			k++;
		}
		while ( j<len_a2){
			a3[k]=nums2[j];
			j++;
			k++;
		}
	

     return a3 ;
	}

}
