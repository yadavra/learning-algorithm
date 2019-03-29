package com.awanish;

import org.junit.Test;

public class IsUniqueString {
	
	/*
	 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
	   cannot use additional data structures?
	 * 
	 * 
	 */
	@Test
	public void testUnique (){
		
	  org.junit.Assert.assertTrue(isUniqueWitoutUsingAnyDataStructure("ABCDE"));
	  org.junit.Assert.assertFalse(isUniqueWitoutUsingAnyDataStructure("ABADE"));
	  org.junit.Assert.assertFalse(isUniqueWitoutUsingAnyDataStructure("ABCDA"));
	  
		  
	}
	
	
	public boolean isUniqueIgnoreCase (String str){
		boolean ret = true ;
		if(str==null||str==" "){
			return ret ;
		}
		char [] chArray= str.toCharArray();
		int [] charFrequency = new int[256];
		
		for (char ch:chArray){
			char char1=Character.toUpperCase(ch);
			if(charFrequency[char1]>=1){
				ret=false ;
				break ;
			}else {
				charFrequency[char1]=1;
			}
			
		}
		return ret ;
	}
	
	public boolean isUnique(String str){
		boolean ret = true ;
		if(str==null||str==" "){
			return ret ;
		}
		char [] chArray= str.toCharArray();
		int [] charFrequency = new int[256];
		
		for (char ch:chArray){
			if(charFrequency[ch]>=1){
				ret=false ;
				break ;
			}else {
				charFrequency[ch]=1;
			}
			
		}
		return ret ;
	}
	
	public boolean isUniqueWitoutUsingAnyDataStructure(String str){
		boolean ret = true ;
		if(str==null||str==" "){
			return ret ;
		}
		for (int i=0;i<str.length();i++){
			for (int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					return false ;
				}
			}
		}
		return ret ;
	}

}
