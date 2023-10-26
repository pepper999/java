package pkg1;

public class PackageTest {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.pkg);

        // 내부적으로 같은 이름의 클래스이지만 패키지가 다른 경우
        // 풀 패키지 명으로 자료형 명시

        pkg1.Person p1 = new pkg1.Person();
        pkg1.pkg2.Person p2 = new pkg1.pkg2.Person();
        pkg1.pkg2.pkg3.Person p3 = new pkg1.pkg2.pkg3.Person();
    }
}