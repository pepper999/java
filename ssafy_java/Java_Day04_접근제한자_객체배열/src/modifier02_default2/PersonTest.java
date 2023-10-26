package modifier02_default2;

import modifier02_default.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        // 다른 클래스 다른 패키지
        // 다른 패키지 이므로 default 접근 불가능
        p.info(); // public
    }
}
