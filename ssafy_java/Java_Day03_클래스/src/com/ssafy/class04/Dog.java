package com.ssafy.class04;

public class Dog {
    String name;

    // 기본생성자 : 아무 매개변수 없음, 클래스 명과 동일, 반환타입 없음
    // 기본 생성자는 작성하지 않아도 컴파일러가 자동으로 집어넣는다.
    public Dog() {
        System.out.println("기본생성자");
    }

    public Dog(String name) {
        this.name = name; // this는 파이썬의 self 와 비슷
    }
}
