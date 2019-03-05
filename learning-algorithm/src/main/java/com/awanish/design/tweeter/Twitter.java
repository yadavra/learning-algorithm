package com.awanish.design.tweeter;


import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.util.Queue;

class Twitter {
    Map<Integer,User> userMap = new HashMap<Integer,User>();
	
    /** Initialize your data structure here. */
    public Twitter() {
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
     	User user = null;
    	if(userMap.containsKey(userId)){
    		user=userMap.get(userId);
    	}else{
    		user= new User(userId);
    		userMap.put(userId, user);
    	}

    	Tweet tweet =new Tweet(tweetId, "Tweet"+tweetId, user);
    	user.submitTweet(tweet);
    	
        
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
    	   List<Integer> feed = new LinkedList<Integer>();
           if(!userMap.containsKey(userId)){
               return feed ;
           }
    	Queue<Tweet> tweetbySubmitionTime = new java.util.PriorityQueue<Tweet>(11 ,new Comparator<Tweet>() {

			@Override
			public int compare(Tweet o1, Tweet o2) {
				if(o1.getSubmitionTimeStamp().before(o2.getSubmitionTimeStamp()))return 1;
				if(o1.getSubmitionTimeStamp().after(o2.getSubmitionTimeStamp()))return -1;
				return 0;
			}
		});
    	User user =userMap.get(userId);
        List<User> followingUserList =user.getFollowingList(); 
        
       addListInQueue(tweetbySubmitionTime, user);
       for (User following:followingUserList){
    	   addListInQueue(tweetbySubmitionTime, following);
       }
       while(!tweetbySubmitionTime.isEmpty()){ 
           if(feed.size()>=10){
        		break;
        	}
        	feed.add(tweetbySubmitionTime.poll().getTweetId());
        }
    	return feed ;
    }

	private void addListInQueue(Queue<Tweet> tweetbySubmitionTime, User user) {
		for ( Tweet tw:user.getTweetList()){
			tweetbySubmitionTime.offer(tw);
            
        }
	}
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
    	if(!userMap.containsKey(followeeId)){
    		User user = new User(followeeId);
    		userMap.put(followeeId, user);
    	}
    	 if(!userMap.containsKey(followerId)){
     		User user = new User(followerId);
     		userMap.put(followerId, user);
     	}
    	if( userMap.containsKey(followerId)&& userMap.containsKey(followeeId)){
    		User user1 =userMap.get(followerId);
    		User user2 =userMap.get(followeeId);
    		user1.follow(user2);
    	}
    	
        
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
    	
    	if( userMap.containsKey(followerId)&& userMap.containsKey(followeeId)){
    		User user1 =userMap.get(followerId);
    		User user2 =userMap.get(followeeId);
    		user1.unFollow(user2);
    	}
        
    }
}
