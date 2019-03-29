package com.awanish;

import java.util.Arrays;

import org.junit.Test;

public class ArrayRotationToLeft {
	
	//This cab be solved in three way 
	//1 - with extra space 
	// 2- with reversal algorithm 
	// 3- Gcd ( not clear at this point of time )
	@Test 
	public void testRotation(){
		int [] in ={1, 3, 5, 7, 9};
		int numberOfRotation=4 ;
		rotateReversal(in,numberOfRotation);
		System.out.println(Arrays.toString(in));
		//expected answer should be {5, 6, 7,1,2, 3, 4 } 
	
		
		
	}
	
	 
	public void rotate(int[] a, int k) {
        int j=(k)%a.length;
        int rotate [] = new int[a.length];
		for(int i=0;i<a.length;i++){
			rotate[i]=a[(i+k)%a.length];
		}
		System.out.println(Arrays.toString(rotate));
	}
	
	public void rotateReversal(int[] a, int k) {
		    k=k%a.length;
			reverseArray(a,0,k-1);
			reverseArray(a,k,a.length-1);
			reverseArray(a,0,a.length-1);
		
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

}
