package com.usa.senate.motion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.usa.senate.Senator;
import com.usa.senate.Senator.MemberType;
import com.usa.senate.Vote;
import com.usa.senate.exception.VotingNotAllowedException;

public class Motion {

	private String motionName;
	private List<Senator> memberVotedInFavorOfMotion = new ArrayList<Senator>();
	private List<Senator> memberVotedAgainstTheMotion = new ArrayList<Senator>();
	private boolean isMotionStarted;
	private Date motionStartTime;
	private Date motionEndTime;
	private boolean isMotionClosedForVoting;
	private String motionResult;

	public Motion(String motionName) {
		this.motionName = motionName;

	}

	public String getMotionName() {
		return motionName;
	}

	public void setMotionName(String motionName) {
		this.motionName = motionName;
	}

	public boolean isMotionStarted() {
		return isMotionStarted;
	}

	public void setMotionStarted(boolean isMotionStarted) {
		this.isMotionStarted = isMotionStarted;
	}

	public Date getMotionStartTime() {
		return motionStartTime;
	}

	public void setMotionStartTime(Date motionStartTime) {
		this.motionStartTime = motionStartTime;
	}

	public boolean isMotionClosedForVoting() {
		return isMotionClosedForVoting;
	}

	public void setMotionClosedForVoting(boolean isMotionClosedForVoting) {
		this.isMotionClosedForVoting = isMotionClosedForVoting;
	}

	public boolean isMotionPassed() {
		return false;
	}

	public Date getMotionEndTime() {
		return motionEndTime;
	}

	public void setMotionEndTime(Date motionEndTime) {
		this.motionEndTime = motionEndTime;
	}

	public String getMotionResult() {
		return motionResult;
	}

	boolean isMemberAllowedToVote(Senator member) {
		if (!this.isMotionStarted || isMotionClosedForVoting) {
			return false;
		}
		if (isMotionTied() && !MemberType.VICE_PRESIDENT.equals(member.getMemberType())) {
			return false;
		}

		return isMotionClosedForVoting;

	}

	private boolean isMotionTied() {
		if (memberVotedInFavorOfMotion.isEmpty() && this.memberVotedAgainstTheMotion.isEmpty()) {
			return false;
		}
		return memberVotedInFavorOfMotion.size() == this.memberVotedAgainstTheMotion.size();
	}

	public void voteForMotion(Senator member, Vote vote) throws VotingNotAllowedException {
		if (vote == null) {
			return;
		}
		if (!isMotionTied() && member.isVicePresident()) {
			throw new VotingNotAllowedException("Vice president can not vote if the motion is not Tie");
		}
		if (Vote.YES.equals(vote)) {
			this.memberVotedInFavorOfMotion.add(member);
		} else if (Vote.NO.equals(vote)) {
			this.memberVotedAgainstTheMotion.add(member);
		}
	}

	public int getCountInFavorOfMotion() {
		return memberVotedInFavorOfMotion.size();
	}

	public int getCountAgainstTheMotion() {
		return memberVotedAgainstTheMotion.size();
	}

}
