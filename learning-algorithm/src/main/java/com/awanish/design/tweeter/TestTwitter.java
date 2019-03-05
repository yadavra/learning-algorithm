package com.awanish.design.tweeter;

import org.junit.Test;

public class TestTwitter {
	
	Twitter twitter = new Twitter();
	@Test
	public void testTwitter(){
		
		twitter.postTweet(1, 5);
		
		twitter.postTweet(1,3);
		twitter.postTweet(1,101);
		twitter.postTweet(1,13);
		twitter.postTweet(1,10);
		twitter.postTweet(1,2);
		twitter.postTweet(1,94);
		twitter.postTweet(1,505);
		twitter.postTweet(1,333);
		System.out.println(twitter.getNewsFeed(1));
		
		
		
		
	}

}

/*
 * 		twitter.postTweet(1, 5);
	twitter.follow(1,2);
	twitter.follow(2,1);
	System.out.println(twitter.getNewsFeed(2));
	twitter.postTweet(2,6);
	System.out.println(twitter.getNewsFeed(1));
	System.out.println(twitter.getNewsFeed(2));
	twitter.unfollow(2, 1);
	System.out.println(twitter.getNewsFeed(1));
	System.out.println(twitter.getNewsFeed(2));
	twitter.unfollow(1, 2);
	System.out.println(twitter.getNewsFeed(1));
	System.out.println(twitter.getNewsFeed(2));
 */