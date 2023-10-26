package test02_inheritance;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Student st = new Student();
        Person p1 = new Student(); // 다형성
        // Student s1 = new Person(); // 불가능
    }
}
