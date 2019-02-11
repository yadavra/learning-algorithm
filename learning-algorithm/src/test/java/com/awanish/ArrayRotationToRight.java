package com.awanish;

import java.util.Arrays;

import org.junit.Test;

public class ArrayRotationToRight {
	
	@Test 
	public void testRotation(){
		int [] in ={1,2,3,4,5,6,7};
		int numberOfRotation=3 ;
		rotateReversal(in,numberOfRotation);
		System.out.println(Arrays.toString(in));
		//expected answer should be {5, 6, 7,1,2, 3, 4 } 
	
		
		
	}
	
	 
	public void rotate(int[] a, int k) {
        k=k%a.length;
		reverseArray(a,0,a.length-1);
		reverseArray(a,0,k-1);
		reverseArray(a,k,a.length-1);
		
	    
	 }
	
	
	public void rotateReversal(int[] a, int k) {
	   int [] rotate = new int[a.length];
	   k=k%a.length;
       for (int i = 0 ; i<a.length;i++){
    	   rotate[i]=a[i];
       }
       for ( int i = 0 ; i<a.length;i++){
    	   //a[i]=rotate[(a.length-k+i)%a.length ];
    	   a[(i+k)%a.length]=rotate[i];
       }
		
	    
	 }
	
	private void reverseArray(int []a , int start , int end ){
		int i=start ;
		int j=end ;
		while ( i<j){
			int temp = a[j];
			a[j]=a[i];
			a[i]=temp ;
			i++;
			j--;
		}
		
	}
	
	public void rotateUsingMod(int[] a, int k) {
        k=k%a.length;
		
		
	    
	 }

}
