package com.ssafy.test;

import org.springframework.stereotype.Component;

@Component
public class Swimmer {
	
	public void swim() throws InjuryException {
		System.out.println("수영을 합니다.");
		if (Math.random() * 100 > 30) {
			throw new InjuryException();
		}
	}
	
}
