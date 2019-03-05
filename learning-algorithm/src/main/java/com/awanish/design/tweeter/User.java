package com.awanish.design.tweeter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class User {
	private int id ;
	List<User> following ;
	List<Tweet> tweetList ;
	
	public User(int id){
		this.id=id;
		this.following=new ArrayList<User>();
		this.tweetList=new  ArrayList<Tweet>();;
	}

	public void follow( User user){
		this.following.add(user);
	}
	
	public void unFollow(User user){
		 if (user!=null && following.contains(user)){
			 following.remove(user);
		 }
	}
	
	public void submitTweet(Tweet t){
		this.tweetList.add(t);
	}
   
	public List<Tweet> getTweetList(){
		
		return this.tweetList;
	} 
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
	    if(this==obj){
	    	return true ;
	    } 
		if(obj==null){
			return false ;
		}
		if(obj.getClass()!=this.getClass()){
			return false ;
		}
		User other=(User)obj;
		if(this.id!=other.id){
			return false ;
		}
		return true ;
		
	}

	public List<User> getFollowingList() {
		// TODO Auto-generated method stub
		return this.following;
	}
	
}
