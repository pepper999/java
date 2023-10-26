package interface01;

public class Test {
    public static void main(String[] args) {
//      MyInterface i = new MyInterface(); // 인터페이스는 인스턴스 생성 불가
        MyClass m = new MyClass();
        
        m.method1();
        m.method2();
        System.out.println(m.MEMBER1);
        System.out.println(m.MEMBER2);
    }
}
