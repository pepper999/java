package interface01;

// 인터페이스를 구현하는 구현클래스
// 인터페이스는 자체적으로 인스턴스 생성 불가
// extends 대신 implements 사용
// 구현클래스는 반드시 추상메소드를 오버라이딩 해야함 - 아닐 경우 abstract로 표시
public class MyClass implements MyInterface {

    @Override
    public void method1() {
        System.out.println("메소드1");
    }

    @Override
    public void method2() {
        System.out.println("메소드2");
    }
    
}
