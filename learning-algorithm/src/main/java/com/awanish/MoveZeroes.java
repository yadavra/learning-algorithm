package com.awanish;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeroes {

	@Test
	public void testMoveZero(){
		
		int in [] ={1,1,1,0};
		moveZeroes(in);
		
	}
	
	//revisit best version of the moving zero.
	public void moveZeroes(int[] a) {

  	 int len = a.length;
	 
	 int j=0;
     for (int i=0;i<len ;i++){
    	 if(a[j]!=0)j++;
    	 else if (a[i]!=0 && a[j]==0){
    		 a[j]=a[i];
    		 a[i]=0;
    		 j++;
    		 
    	 }
     }	 


	System.out.println(Arrays.toString(a));
	}
	
	
	public void moveZeroesV2(int[] a) {
        
	      if(a==null || a.length==1){
	          return ;
	      }  
	     int len = a.length;
		 
		 int i=0;
		 int j=0;
	        
		 
		 while ( i<len && j<len){
			   while(j<len &&a[j]==0){
				   j++;
			   }
			   
	         while ( i<j && a[i]!=0){
				   i++ ;
			   }
			  
	        if(i<len && j<len){
	         int temp = a[j];
			 a[j]=a[i];
			 a[i]=temp ;
			 i++ ;j++;   
	            
	        }  
	         
			 
		 }
	        
	    }

}
