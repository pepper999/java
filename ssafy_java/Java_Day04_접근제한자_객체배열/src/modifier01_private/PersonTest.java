package modifier01_private;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        // Person / PersonTest 다른 클래스 파일
        // p.age, p.anme 등은 private로 접근 불가
        p.info(); // public으로 접근 가능
    }
}
