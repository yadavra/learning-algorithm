package com.awanish;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CommonElementsInTwoSortedArray {

	
	@Test
	public void testCommomn(){
		int a1 [] ={1, 3, 4, 6, 7, 9};
		int a2 [] ={1, 2, 4, 5, 9, 10};
		//1, 4, 9
		Integer [] finalList = commonUsingTwoPointer(a1, a2);
		System.out.println(Arrays.toString(finalList));
		
	}
	
	
	public int [] common( int [] a1, int []a2){
		
		int length = Math.min ( a1.length, a2.length);
		int [] list_final = new int [length];
		
		int k=0;
		for ( int i=0 ; i<length;i++){
			  for ( int j=0 ;j<length;j++){
		          if(a2[j]==a1[i]){
		        	  list_final[k++]=a1[i];
		        	  break ;
		          }		  
			  }
		}
		return list_final ;
	}
 public Integer [] commonUsingTwoPointer( int [] a1, int []a2){
		
		int length = Math.min ( a1.length, a2.length);
		List<Integer> finalList = new ArrayList<Integer>();
		
		int i=0;
		int j=0;
		
		while ( i<a1.length && j<a2.length){
			
			if(a1[i]==a2[j]){
				finalList.add(a1[i]);
				i++;
				j++;
			}else if (a1[i]>a2[j]){
				j++;
			}else{
				i++;
			}
		}
		Integer [] returnList= new Integer[finalList.size()];
		finalList.toArray(returnList);
		return returnList ;
	}
}
