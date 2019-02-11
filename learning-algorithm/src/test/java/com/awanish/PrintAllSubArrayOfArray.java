package com.awanish;

import org.junit.Before;
import org.junit.Test;

public class PrintAllSubArrayOfArray {
	
	
	
	private int[] input;

	@Before 
    public void setup(){
		
		this.input=new int[]{1, 2, 3, 4,5};
		
	}
	
    @Test
	public void printAllSubArray(){
		for (int i=0; i<this.input.length;i++){
			
			for (int j=i;j<this.input.length;j++){
				       printSubArray(i,j);	
				       
				}
			System.out.println();
			}
		}

	private void printSubArray(int i, int j) {
		System.out.print(" [");
		for (int k=i;k<=j;++k){
			System.out.print(this.input[k]);System.out.print(",");
		}
		System.out.print("]");
	}
		
	}


