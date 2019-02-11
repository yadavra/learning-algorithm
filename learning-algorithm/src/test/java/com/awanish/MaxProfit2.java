package com.awanish;

import org.junit.Test;

public class MaxProfit2 {
	
	
	@Test 
	public void testProfit(){
	int [] in ={1,2,3,4,5};
	
	System.out.println(maxProfit(in));
		
		
	}
	
public int maxProfit(int[] a) {
         int profit = 0 ;
         int len = a.length ;
         
          for ( int i=0 ;i<len-1;i++){
        	  if((a[i+1]-a[i])>0){
        		  profit+=a[i+1]-a[i]; 
        	  }
          }
	
     	  return profit ;
   

 }

}
