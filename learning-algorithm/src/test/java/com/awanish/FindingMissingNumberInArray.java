package com.awanish;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class FindingMissingNumberInArray {

	private int[] input;

	// Range need to provided upfront line between 1 to 9 find missing number in
	// array
	@Before
	public void setup() {
		input = new int[] { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
	}

	@Test
	public void findMissingNumber() {

		int[] numberFrequency = new int[input.length];
        int [] result =  new int[input.length];
        int []expected = new int[input.length];
        expected[0]=4;
        expected[1]=6;
        expected[1]=8;
       
		for (int i = 1; i <input.length; i++) {

			numberFrequency[input[i]]++;
		}
		int k=0;
		Arrays.sort(input);
		for (int i = 1; i < numberFrequency.length; i++) {
			if(numberFrequency[i]==0){
				System.out.println("Missing number" + i);
				result[k++]=i;
			}
		}
		
	}

}
