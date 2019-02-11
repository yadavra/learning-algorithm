package com.awanish;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.usa.senate.SenateBuilder;
import com.usa.senate.Senator;
import com.usa.senate.USSenate;
import com.usa.senate.Vote;
import com.usa.senate.exception.VotingNotAllowedException;
import com.usa.senate.motion.Motion;
import com.usa.senate.motion.MotionBuilder;



public class USVotinOnMotion {

	private USSenate usSenate ;
	private Motion motion ;

	@Before
	public void buildVoters() {
		List<String> senatorList = getSenators();
		 usSenate =SenateBuilder.buildSenate(senatorList, "Senator_1");
		 motion = MotionBuilder.prepareMotion("Motion on Bill261");

	}

	private List<String> getSenators() {
		ArrayList<String> listOfSenatorsName = new ArrayList<String>();
		for(int i=1;i<=101;i++){
			listOfSenatorsName.add("Senator_"+i);
		}
		return listOfSenatorsName;
	}

	@Test(expected = VotingNotAllowedException.class)
	public void voteOnMotionWhenMotionNotStarted() throws VotingNotAllowedException {
		for (int i = 0; i < usSenate.getSenators().size(); i++) {
			Senator mb = usSenate.getSenators().get(i);
			if (i % 2 == 0) {
				motion.voteForMotion(mb, Vote.YES);
			} else {
				motion.voteForMotion(mb, Vote.NO);
			}

		}
	}

	@Test(expected = VotingNotAllowedException.class)
	public void voteOnMotionWhenMotionTied() throws VotingNotAllowedException {
		motion.setMotionStarted(true);
		motion.setMotionStartTime(new Date());
		motion.setMotionClosedForVoting(false);
		for (int i = 0; i < usSenate.getSenators().size(); i++) {
			Senator mb = usSenate.getSenators().get(i);
			if (i % 2 == 0) {
				motion.voteForMotion(mb, Vote.YES);
			} else {
				motion.voteForMotion(mb, Vote.NO);
			}
		}
		motion.setMotionEndTime(new Date());
		Assert.assertFalse(motion.isMotionPassed());
	}
	
	@Test(expected = VotingNotAllowedException.class)
	public void voteOnMotionWhenMotionIsClosed() throws VotingNotAllowedException {
		motion.setMotionStarted(true);
		motion.setMotionStartTime(new Date());
		motion.setMotionEndTime(new Date());
		motion.setMotionClosedForVoting(true);
		for (int i = 0; i < this.usSenate.getSenators().size(); i++) {
			Senator mb = this.usSenate.getSenators().get(i);
			if (i % 2 == 0) {
				motion.voteForMotion(mb, Vote.YES);
			} else {
				motion.voteForMotion(mb, Vote.NO);
			}

		}
		motion.setMotionEndTime(new Date());
		Assert.assertFalse(motion.isMotionPassed());
	}
	@Test(expected = VotingNotAllowedException.class)
	public void voteOnMotionWhenMotionIsPassed() throws VotingNotAllowedException {
		motion.setMotionStarted(true);
		motion.setMotionStartTime(new Date());
		motion.setMotionEndTime(new Date());
		motion.setMotionClosedForVoting(true);
		for (int i = 0; i < this.usSenate.getSenators().size(); i++) {
			Senator mb = this.usSenate.getSenators().get(i);
			if(!mb.isVicePresident()){
				motion.voteForMotion(mb, Vote.YES);
			} 
			}

		
	  this.motion.setMotionEndTime(new Date());
		Assert.assertFalse(motion.isMotionPassed());
	}
	
}
