package com.awanish;

public class DailyTemperatures {
	
	 public int[] dailyTemperatures(int[] T) {
	        if(T==null || T.length==0){
	            return null ;
	        }
	        java.util.Stack<Integer> range = new java.util.Stack<Integer>();
	        int [] result = new int[T.length];
	        for ( int i=0 ;i<T.length ;i++){
	             while (!range.isEmpty() && T[i]>T[range.peek()]){
	                 
	                 int day = range.pop();
	                 result[day]=i-day;
	             }
	            range.push(i);
	            
	        }
	        
	        return result;
	    }

}
