package com.usa.senate.motion;

public class MotionBuilder {

	private MotionBuilder() {
	}

	public static Motion prepareMotion(String motionName) {
		
		if (motionName == null || motionName == "") {
			motionName = "Unknown Motion";
		} 
		Motion motion = new Motion(motionName);
		return motion;
	}

}
