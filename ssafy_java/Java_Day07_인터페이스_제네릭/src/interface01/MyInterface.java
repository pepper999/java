package interface01;


// 다중상속 가능 - 메소드의 구현부가 없어 사용할 일이 없기 때문
public interface MyInterface {
    //모든 변수는 상수이다 public static final 이며 생략 가능
    public static final int MEMBER1 = 10;
    /* public static final */ int MEMBER2 = 20;
    
    // 모든 메소드는 추상메소드이다 public abstract이며 생략 가능
    public abstract void method1();
    /* public abstract */ void method2();
    
}
