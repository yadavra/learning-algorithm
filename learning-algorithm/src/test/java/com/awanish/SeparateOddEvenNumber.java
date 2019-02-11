package com.awanish;

import java.util.Arrays;

import org.junit.Test;

public class SeparateOddEvenNumber {
	@Test
	public void testmoveAllOddNumberAtBeginning(){
		//int [] a ={1 ,3, 2, 4, 7 ,6, 9, 10};
		
		int [] a ={1 ,2, 3, 4, 5 ,6, 7, 8};
		moveAllOddNumberAtBeginningV2(a);
		
	}
	
	
	
	public void moveAllOddNumberAtBeginning(int [] a){
		
		int start = 0;
		int end = a.length-1;
		
		while (start<end){
			
			while(a[start]%2!=0){
				start++;
			}
			while (a[end]%2==0){
				end --;
			 }
			
			if(start<end ){
				int temp = a[start];
				a[start]=a[end];
				a[end]=temp ;
			}
			
			
		}
		System.out.print(Arrays.toString(a));
		
		
	}
	
	
public void moveAllEvenNumberAtBeginning(int [] a){
		
		int start = 0;
		int end = a.length-1;
		
		while (start<end){
			
			while(a[start]%2==0){
				start++;
			}
			while (a[end]%2!=0){
				end --;
			 }
			
			if(start<end ){
				int temp = a[start];
				a[start]=a[end];
				a[end]=temp ;
			}
			
			
		}
		System.out.print(Arrays.toString(a));
		
		
	}
//Two Pointer 
public void moveAllEvenNumberAtBeginningV2(int [] a){
	
	int start = 0;
	int end = a.length-1;
	int j=0;
	for (int i=0;i<=end;i++){
		if(a[i]%2==0){
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp ;
			j++;
		}
	}
	System.out.print(Arrays.toString(a));		
	}

public void moveAllOddNumberAtBeginningV2(int [] a){
	
	int start = 0;
	int end = a.length-1;
	int j=0;
	for (int i=0;i<=end;i++){
		if(a[i]%2!=0){
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp ;
			j++;
		}
	}
		
	System.out.print(Arrays.toString(a));
	
	
	
}

	
	


}
