package com.usa.senate;

import com.usa.senate.exception.VotingNotAllowedException;
import com.usa.senate.motion.Motion;

public class Senator {
	private String name;

	private String memberId;

	private MemberType memberType = MemberType.Senate;

	private Vote vote;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public MemberType getMemberType() {
		return memberType;
	}

	public void setMemberType(MemberType memberType) {

		this.memberType = memberType;

	}

	public Vote getVote() {
		return vote;
	}



	public enum MemberType {
		Senate, VICE_PRESIDENT;

	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) { 
		this.memberId = memberId;
	}

	public boolean isVicePresident() {
		return MemberType.VICE_PRESIDENT.equals(this.memberType);
	}

}
