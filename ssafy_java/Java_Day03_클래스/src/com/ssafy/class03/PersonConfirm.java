package com.ssafy.class03;

public class PersonConfirm {
    static int personCount; // 클래스 변수
    String name; // 인스턴스 변수
    int age; // 인스턴스 변수
    String hobby; // 인스턴스 변수

    public void info() { // 리턴 타입이 없다면 void
        System.out.println("나의 이름은 " + name + "입니다.");
        System.out.println("나이는 " + age + "세, 취미는 " + hobby + "입니다.");
    }

    public void study(int time) {
        // int time을 매개변수(parameter)로 받으면
        // int time = 값; 을 선언한 것 과 같다
        // 받을때 : 매개변수(parameter) / 줄때 : 인자(Argument)
        System.out.println(time + "만큼 공부했음.");
    }

    // 메소드 오버로딩 - 파라미터의 개수 또는 순서 또는 타입이 다르다
    public void study(long time) {
        System.out.println(time + "만큼 공부했음.");
    }
}
