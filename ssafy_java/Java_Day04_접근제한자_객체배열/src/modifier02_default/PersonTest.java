package modifier02_default;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        // Person / PersonTest 다른 클래스 같은 패키지
        // 속성 접근 가능
        p.age = 10;
        p.name = "Yang";

    }
}
