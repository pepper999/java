package jvm;

public class Person {
    // 클래스 변수
    // 모든 인스턴스가 공유
    static int pCount;

    // 인스턴스 변수
    // 인스턴스마다 메모리 할당 (heap 영역)
    String name;
    String hobby;
    int age;

    // non-static 영역
    public void count() {
        System.out.println(pCount); // 가능
    }

    // static 영역
//	public static void main(String[] args) {
//		System.out.println(name); // 불가능
//	}
}
