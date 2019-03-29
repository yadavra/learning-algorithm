package com.awanish;

import java.util.Arrays;

import org.junit.Test;

public class TwoArrayInterSection {
	
	
	@Test
	public void testInterSectionOfTwoArray(){
		int [] in1 = {1,2,2,1};
		int [] in2 = {2,2};
		
		int [] out = intersect(in1,in2);
		System.out.println(Arrays.toString(out));
		
	}
	
	
	 public int[] intersect(int[] nums1, int[] nums2) {
	        
	        if(nums1==null || nums2==null){
	            return new int[0];
	        }
	        int len1=nums1.length ;
	        int len2=nums2.length ;
	        java.util.List<Integer> finalResult = new java.util.ArrayList<Integer>();
	        java.util.Arrays.sort(nums1);
	        java.util.Arrays.sort(nums2);
	        int i=0 ;
	        int j=0;
	        while (i<len1 && j<len2){
	            if(nums1[i]==nums2[j]){
	                finalResult.add(i);
	                i++;
	                j++;
	            }else if (nums1[i]>nums2[j]) {
	                j++;
	            }else {
	                i++;
	            }
	            
	        }
	        int [] intersection = new int[finalResult.size()];
	        for (int k=0; k<finalResult.size();k++){
	            intersection[k]=finalResult.get(k);
	        }
	        
	        return intersection ;
	    }

}
