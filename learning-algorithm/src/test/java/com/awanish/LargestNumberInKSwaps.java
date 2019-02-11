package com.awanish;

import org.junit.Test;
//trick in this we need to find three largest elemnt to swap not necessary index 0 , 1, 2 
//4551711527  correct answer is 4551711527//this is not correct solution it wil fail in some scenario . 
//Correct solution is to call recursive swap on sublist.
public class LargestNumberInKSwaps {

	public static void main(String[] arg) {

		for (int i = 1; i <= arg.length; i = i + 2) {
			int k = Integer.parseInt(arg[i]);
			String str = arg[i + 1];
			System.out.println(formLargestNumber(str, k));
		}

	}

	@Test
	public void testLargestNumber() {

		String str = "68994579999";
		System.out.println(formLargestNumber(str, 5));
	}

	public static String formLargestNumber(String number, int k) {

		char[] numberArray = number.toCharArray();
		int l = 0;
		int swapCount = 0;
		int index =Integer.MIN_VALUE;
		String maxValueNumer=number;
		while ( l<numberArray.length && swapCount<k){
			Character max = numberArray[l];
			int i=l;
			      while (i<numberArray.length){
			    	  if(max<=numberArray[i]){
			    		  max=numberArray[i];
			    		  index=i;
			    	  }
			    	  i++;  
			       }
			      if(index !=Integer.MIN_VALUE){
			    	  char temp = numberArray[l];
			    	  numberArray[l]=numberArray[index];
			    	  numberArray[index]=temp;
			    	  index =Integer.MIN_VALUE ;
			    	  swapCount++;
			      }
			l++;
		}
		
		number=String.valueOf(numberArray);
		
		return number;

	}
}
