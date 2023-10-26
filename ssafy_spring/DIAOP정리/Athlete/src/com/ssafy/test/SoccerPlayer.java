package com.ssafy.test;

import org.springframework.stereotype.Component;

@Component
public class SoccerPlayer {
	
	public void playSoccer() throws InjuryException {
		System.out.println("축구를 합니다.");
		if (Math.random() * 100 > 30) {
			throw new InjuryException();
		}
	}
	
}
