package com.awanish;

import org.junit.Test;

public class RemoveDuplicateFromSortedArrayWhenNDuplicateAllowed {
	
	@Test
	public void testDuplicate(){
		int numberOfDuplicateAllowed=2 ;
		int [] in ={1,1,1,2,2,3}; //answer should be [1,1,2,2,3] 
		System.out.println(removeDuplicate(in));
		
	}
	
	public int removeDuplicate(int []a){
		//it represent the duplicate element index ( slow pointer ) 
		int index =0 ;
		int count=1;
		for (int i=0 ; i<a.length;i++){
			if(count<=2 && a[index]==a[i]){
				   count++;
				   continue ;
			}
			a[++index]=a[i];
			
			
			
			
		}
		
		return index+1;
		
	}

}
