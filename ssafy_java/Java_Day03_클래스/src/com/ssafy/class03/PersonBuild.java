package com.ssafy.class03;

public class PersonBuild {
    public static void main(String[] args) {
        PersonConfirm p = new PersonConfirm(); // 인스턴스 생성
        p.age = 10;
        p.hobby = "유튜브보기";
        p.name = "Yang";

        p.info();

        PersonConfirm p2 = new PersonConfirm();
        // study가 int타입을 받는 경우
        p2.study((byte) 10); // 묵시적 형변환 가능
        p2.study((short) 10); // 묵시적 형변환 가능
        p2.study(10);
//		p2.study(10L); // 불가능
//		p2.study(10.0f); // 불가능
//		p2.study(10.0); // 불가능
//		p2.study(10, 10); // 불가능		

    }
}
