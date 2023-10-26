package modifier06_singleton;

public class PersonTest {
    public static void main(String[] args) {
//		Person p = new Person(); // 기본 생성자 private라 불가능

        Person p1 = Person.getInstance();
        Person p2 = Person.getInstance();
    }
}
