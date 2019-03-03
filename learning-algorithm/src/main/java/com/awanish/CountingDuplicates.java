package com.awanish;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CountingDuplicates {
	
	public static int duplicateCount(String text) {
		
		int numberOfDuplicate =0 ;
		if(text==null || text==" "){
			return numberOfDuplicate;
		}
		String input=text.toUpperCase();
		char[] inputArray = input.toCharArray();
		Map<Character,Integer> charFrequencey = new HashMap<Character,Integer>();
		
		for (char ch : inputArray){
			if(charFrequencey.containsKey(ch)) {
				charFrequencey.put(ch, charFrequencey.get(ch)+1);
			}else {
				charFrequencey.put(ch,1);
			}
			
		}
		for (Integer val :charFrequencey.values()){
			if(val>1){
				numberOfDuplicate++;
			}
		}
		return numberOfDuplicate;
	    // Write your code here	
	  }
	
	
	
	
	
	 @Test
	    public void abcdeReturnsZero() {
	        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
	    }
	    
	    @Test
	    public void abcdeaReturnsOne() {
	        assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
	    }
	    
	    @Test
	    public void indivisibilityReturnsOne() {
	        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
	    }
	    
	    @Test 
	    public void reallyLongStringContainingDuplicatesReturnsThree() {
	        String testThousandA = new String(new char[1000]).replace('\0', 'a');
	        String testHundredB = new String(new char[100]).replace('\0', 'b');
	        String testTenC = new String(new char[10]).replace('\0', 'c');
	        String test1CapitalA = new String(new char[1]).replace('\0', 'A'); 
	        String test1d = new String(new char[1]).replace('\0', 'd'); 
	        String test = test1d + test1CapitalA + testTenC + 
	            testHundredB + testThousandA;
	        

	        assertEquals(3, CountingDuplicates.duplicateCount(test));
	    }
	    

}



