package com.ssafy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext appCtx = new GenericXmlApplicationContext("applicationContext.xml");
		
		SoccerPlayer soccerPlayer = appCtx.getBean(SoccerPlayer.class);
		Swimmer swimmer = appCtx.getBean(Swimmer.class);
		BasketballPlayer bsPlayer = appCtx.getBean(BasketballPlayer.class);
		
		try {
			soccerPlayer.playSoccer();
		} catch (Exception e) {
		}
		
		try {
			swimmer.swim();
		} catch (Exception e) {
		}
		
		try {
			bsPlayer.playBasketball();
		} catch (Exception e) {
		}
	}
}
