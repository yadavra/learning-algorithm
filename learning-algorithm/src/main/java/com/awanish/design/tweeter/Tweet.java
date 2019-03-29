package com.awanish.design.tweeter;

import java.sql.Timestamp;

public class Tweet  {
	private int id ;
	private Timestamp submitionTimeStamp ;
	private User submittedBy ;
	private String tweetContent ;
	
	public Tweet(int id ,String content , User submittedBy){
		this.id=id;
		this.submittedBy=submittedBy;
		this.tweetContent=content;
		this.submitionTimeStamp=new Timestamp(System.currentTimeMillis());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((submitionTimeStamp == null) ? 0 : submitionTimeStamp.hashCode());
		result = prime * result + ((submittedBy == null) ? 0 : submittedBy.hashCode());
		return result;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tweet other = (Tweet) obj;
		if (id != other.id)
			return false;
		if (submitionTimeStamp == null) {
			if (other.submitionTimeStamp != null)
				return false;
		} else if (!submitionTimeStamp.equals(other.submitionTimeStamp))
			return false;
		if (submittedBy == null) {
			if (other.submittedBy != null)
				return false;
		} else if (!submittedBy.equals(other.submittedBy))
			return false;
		return true;
	}

	public User getSubmittedBy() {
		return submittedBy;
	}

	public void setSubmittedBy(User submittedBy) {
		this.submittedBy = submittedBy;
	}

	public String getTweetContent() {
		return tweetContent;
	}

	public void setTweetContent(String tweetContent) {
		this.tweetContent = tweetContent;
	}

	

	public Integer getTweetId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public Timestamp getSubmitionTimeStamp() {
		return submitionTimeStamp;
	}

	public void setSubmitionTimeStamp(Timestamp submitionTimeStamp) {
		this.submitionTimeStamp = submitionTimeStamp;
	}
	
	//2019-03-04 20:00:28.437
	
		
}

