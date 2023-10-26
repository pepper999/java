package com.ssafy.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component	
public class Driver {
	K3 car;
	
	@Autowired
	Driver(K3 car) {
		this.car = car;
	}
	
	public void drive() {
		System.out.println(car.getInfo() + "로 운전을 합니다.");
	}
}
