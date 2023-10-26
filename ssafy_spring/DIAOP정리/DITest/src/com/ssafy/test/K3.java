package com.ssafy.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class K3 {
	Tire tire;
	String info;
	
	@Autowired
	K3(Tire tire) {
		info = tire.info + "가 달린 K3";
		this.tire = tire;
	}
	public String getInfo() {
		return info;
	}
}
