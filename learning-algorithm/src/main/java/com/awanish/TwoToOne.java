package com.awanish;

import java.util.Stack;

public class TwoToOne {


	

	public static String longestCommonString(String firstStr, String secondStr) {

		if(firstStr==null && secondStr==null){
			return "";
		}
		int[] charFrequency = new int[256];
		StringBuilder actualResult = new StringBuilder();
		char[] firstInputCharArray = firstStr.toCharArray();

		char[] secondInputCharArray = secondStr.toCharArray();

		for (char ch:firstInputCharArray){
			charFrequency[ch]++; //O(N)
		}
		for (char ch:secondInputCharArray){
			charFrequency[ch]++; //(M)
		}
		//Arrays.sort(charFrequency);
		for(int i =0 ;i<charFrequency.length ;i++){
			if(charFrequency[i]==0){
				continue;
			}
			//O(1)
			actualResult.append((char)i);
		}
		return actualResult.toString();
	}
	
private int calculate(Stack<Integer> stack , String str){
        
        int a = stack.pop();
        int b = stack.pop();
        int result =0;
        switch(str){
        case "*": 
        	result=a*b;
         break ;
        case "+": 
        	result=a+b;
         break ;
        case "-": 
        	result=a-b;
         break ;
        case "/": 
        	result=a/b;
         break ;
        }
		return result;
        
    }

}
