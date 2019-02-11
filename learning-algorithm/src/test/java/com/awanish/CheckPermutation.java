package com.awanish;

import org.junit.Test;

public class CheckPermutation {
	
	
	
	@Test
	public void testPermutation(){
		
		org.junit.Assert.assertTrue(isPermutation("ABCD" ,"BACD"));
		org.junit.Assert.assertTrue(isPermutation("ABCD" ,"AB"));
		org.junit.Assert.assertFalse(isPermutation("ABC" ,"BACD"));
		
	}
	
	public boolean isPermutation(String str1,String str2){
		
		boolean ret=true ;
		int []array = new int[256];
		if(str1==null||str2==null ){
			return false ;
		}
		
		for (char ch:str1.toCharArray()){
			array[ch]+=1;
		}
		for (char ch:str2.toCharArray()){
			array[ch]-=1;
			if(array[ch]<0){
				ret=false ;
				break ;
			}
		}
		
		
		return ret ;
	}

}
