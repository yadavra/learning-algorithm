package com.awanish;

import org.junit.Test;

public class SIngleNumber {
	
	@Test
	public void testSingle(){
		int [] in ={4,1,2,1,2};
		System.out.println(singleNumber(in));
		
	}
	
	
	public int singleNumber(int [] a){
		int len= a.length;
		int num=a[0];
		for (int i=1;i<=len-1;i++ ){
			num=num^a[i];
		}
		
		return num;
	}

}

