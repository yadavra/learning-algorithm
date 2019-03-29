package com.awanish.java.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;

public class ThreadRunner {
      
	@Test
	public  void test(){
		SharedObject obj= new SharedObject();
		convertEasternToUTC("30-08-2018 16:11:20" ,"");
//		Thread t1 = new Thread(new TaskOne(obj) );
//		Thread t2 = new Thread(new TaskTwo(obj) );
//		Thread t3 = new Thread(new TaskThree(obj) );
		
		
//		t1.start();
//		t2.start();
//		t3.start();
//		try {
//			t1.join();
//			t2.join();
//			t3.join();
//		} catch (InterruptedException e) {
//			
//		}
	}
	
	 protected Date convertEasternToUTC(String date, String error)  {
		    SimpleDateFormat convertToUTC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	        convertToUTC.setTimeZone(TimeZone.getTimeZone("UTC"));
	        
		    SimpleDateFormat easternFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		    easternFormat.setTimeZone(TimeZone.getTimeZone("EST5EDT"));
		    easternFormat.setLenient(true);
	        Date utc=null;
	        try {
	                       utc = easternFormat.parse(date);
	                
	            
	        } catch (ParseException e) {
	            
	        }
	        System.out.println("dateString " + convertToUTC.format(utc));

	       
	        return utc;
	    }
	
}
