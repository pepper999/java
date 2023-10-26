package com.ssafy.test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AtheleteAspect {
	@Pointcut("execution(public * *.*(..))")
	void pointcut() {
	}
	
	@Before("pointcut()")
	public void before() {
		System.out.println("준비운동을 합시다.");
	}
	
	@AfterThrowing("pointcut()") 
	public void afterThrowing() {
		System.out.println("다쳤다..ㅜㅜ");
	}
	
	@AfterReturning("pointcut()")
	public void afterReturn() {
		System.out.println("운동 다했다.");
	}
	
	@After("pointcut()")
	public void after() {
		System.out.println("집에 가자.");
		System.out.println();
	}
}
