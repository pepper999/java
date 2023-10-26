package com.ssafy.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfig {
	
	@Bean
//	@Scope("prototype")
	public Desktop desktop() {
		return new Desktop();
	}
	
	@Bean
	public Laptop laptop() {
		return new Laptop();
	}
	
	
	@Bean
	public Programmer programmer() {
//		Programmer pr = new Programmer();
//		pr.setComputer(desktop()); //설정자 주입
		
		Programmer pr = new Programmer(desktop()); //생성자 주입
		
		
		return pr;
	}
	
}
