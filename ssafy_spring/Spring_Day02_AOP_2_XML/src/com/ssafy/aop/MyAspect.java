package com.ssafy.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//공통관심사항들을 작성할 클래스를 생성한다.
@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(public * com.ssafy.aop.*.conding())")
    public void mypt() {
    }

    // 실행 이전
    @Before("mypt()")
    public void before() {
        System.out.println("컴퓨터를 부팅한다.");
    }

    // 실행 이후 (예외 없이)
    @AfterReturning("mypt()")
    public void afterReturning() {
        System.out.println("Git에 Push 한다.");
    }

    // 예외 발생
    @AfterThrowing(value = "mypt()", throwing = "th")
    public void afterThrowing(Throwable th) {
        System.out.println("반차를 낸다.");
        if (th instanceof OuchException) {
            ((OuchException) th).handleException();
        }
    }

    public void after() {
        System.out.println("하루를 마무리 한다.");
    }

    public void around() {
        this.before();
        try {
            this.afterReturning();
        } catch (Throwable e) {
            this.afterThrowing(e);
        } finally {
            this.after();
        }
    }
}
