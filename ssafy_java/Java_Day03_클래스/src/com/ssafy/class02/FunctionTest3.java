package com.ssafy.class02;

public class FunctionTest3 {
    public static void main(String[] args) {
        System.out.println("아침에 일어난다.");
        이동("교육장", "대중교통");
        교육();
        이동("집", "두 다리");
        System.out.println("과제를 해결한다.");
        System.out.println("잔다.");

        System.out.println("아침에 일어난다.");
        System.out.println("아침을 먹는다.");
        이동("교육장", "리무진");
        교육();
        이동("집", "비행기");
        System.out.println("과제를 해결한다.");
        System.out.println("잔다.");
    }

    public static void 교육() {
        System.out.println("오전 수업을 열심히 듣는다.");
        System.out.println("점심을 먹는다.");
        System.out.println("오후 수업을 듣는다.");
    }

    public static void 이동(String 장소, String 탈것) {
        System.out.println(장소 + "(으)로 " + 탈것 + "(을)를 이용하여 이동한다.");
    }

}
