package com.awanish.design.lrucache;

import org.junit.Test;

public class LRUCacheTest {
	
	    @Test
	    public void testLru(){
	    	LRUCache lru = new LRUCache(2);
	    	lru.put(2, 1);
	    	lru.put(1, 1);
	    	lru.put(2, 3);
	    	lru.put(4, 1);
	    	System.out.println(lru.get(1));
	    	
	    	System.out.println(lru.get(2));
	    	
	    	
	    }

}
