package test05_object;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("Person 기본생성자");
    }

    // 파라미터가 있는 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        super();
        this.name = name;
    }

    public void eat() {
        System.out.println("음식을 먹는다.");
    }

}
