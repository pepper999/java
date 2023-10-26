package test03_super;

public class Student extends Person {
    String major;

    public Student() {
//		super(); // 부모의 기본 생성자 호출
        this("자유전공");
        System.out.println("Student 기본 생성자");
    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public void study() {
        super.eat();
        System.out.println("공부를 한다.");
    }
}
