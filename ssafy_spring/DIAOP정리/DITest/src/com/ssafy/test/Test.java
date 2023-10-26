package com.ssafy.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext appCtx = new GenericXmlApplicationContext("applicationContext.xml");
					
		Driver driver = appCtx.getBean(Driver.class);
		driver.drive();
	}

}
