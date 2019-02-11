package com.awanish;

import org.junit.Test;

public class FibonnaciNumber {
	
	@Test
	public void testGenerateFibonnachi(){
		
		System.out.println(generateFibonnaciNumber(6));
		System.out.println(generateFibonnaciNumberWithoutTemp(6));
	}
	
	
	public int generateFibonnaciNumber(int n){
		///Given f(0)=0 f(1)=1  Fn = Fn-1+Fn-2 ; 
		//In general we  need to know only last two element to generate the third 
		
		int a =0 ;
		int b=1;
		int i =2 ;
		while(i<=n) {
		 int c = a+b;
			a=b;
			b=c;
			i++;
			
		}
		return b ;
	}
	
	public int generateFibonnaciNumberWithoutTemp(int n){
		///Given f(0)=0 f(1)=1  Fn = Fn-1+Fn-2 ; 
		//In general we  need to know only last two element to generate the third 
		
		int a =0 ;
		int b=1;
		int i =2 ;
		while(i<n) {
		  a = a+b;
		  b = a+b;
		  i=i+2;
			
		}
		if(n==i){
			return a+b ;
		}else {
			return b ;
		}
	}

}
