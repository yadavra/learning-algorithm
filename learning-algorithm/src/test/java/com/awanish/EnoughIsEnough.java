package com.awanish;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		java.util.Map<Integer, Integer> occurence = new java.util.HashMap<Integer , Integer>();
    List<Integer> ret = new ArrayList<Integer>();
    int j=0;
    if(maxOccurrences==0){
        return new int[]{};
      }
    for (int i=0;i<elements.length;i++){
          if(occurence.containsKey(elements[i])){
             if(occurence.get(elements[i])>=maxOccurrences){
            	  continue ;	 
             }
             Integer value = occurence.get(elements[i]);
             occurence.put(elements[i],++value);
            }else {
             occurence.put(elements[i],1);
          }
          ret.add(elements[i]);
       
    }
    int [] finalarray = new int[ret.size()];
    int k=0;
    for (int i=0;i<ret.size();i++){
       
    	   finalarray[k]=ret.get(i);
    	   k++;
       
    }
		return finalarray;
	}
	
	@Test
	public void deleteNth() throws Exception {
		assertArrayEquals(
				new int[] { 20, 37, 21 },
				EnoughIsEnough.deleteNth( new int[] { 20, 37, 20, 21 }, 1 )
		);
		assertArrayEquals(
				new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
				EnoughIsEnough.deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )
				
		);
		assertArrayEquals(
				new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
				EnoughIsEnough.deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
		);
		assertArrayEquals(
				new int[] { 1, 1, 1, 1, 1 },
				EnoughIsEnough.deleteNth( new int[] { 1, 1, 1, 1, 1 }, 5 )
		);
		assertArrayEquals(
				new int[] { },
				EnoughIsEnough.deleteNth( new int[] { }, 5 )
		);

	}

}