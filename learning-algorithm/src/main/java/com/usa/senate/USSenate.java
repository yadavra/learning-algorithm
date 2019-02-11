package com.usa.senate;

import java.util.List;

import com.usa.senate.motion.Motion;

public class USSenate {

	private List<Senator> senator ;
	private Senator vicePresident ;
	private Motion motion ;
	
	public List<Senator> getSenator() {
		return senator;
	}
	public void setSenator(List<Senator> senator) {
		this.senator = senator;
	}
	public Motion getMotion() {
		return motion;
	}
	public void setMotion(Motion motion) {
		this.motion = motion;
	}
	public List<Senator> getSenators() {
		return senator;
	}
	public void setSenators(List<Senator> senator) {
		this.senator = senator;
	}
	public Senator getVicePresident() {
		return vicePresident;
	}
	public void setVicePresident(Senator vicePresident) {
		this.vicePresident = vicePresident;
	}
	
}
