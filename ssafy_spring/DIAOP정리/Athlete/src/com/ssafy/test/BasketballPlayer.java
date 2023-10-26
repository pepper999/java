package com.ssafy.test;

import org.springframework.stereotype.Component;

@Component
public class BasketballPlayer {
	
	public void playBasketball() throws InjuryException {
		System.out.println("농구를 합니다.");
		if (Math.random() * 100 > 30) {
			throw new InjuryException();
		}
	}
	
	
}
