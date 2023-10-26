package test04_overriding;

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

    // 오버라이딩
    // 메소드의 이름, 반환형, 매개변수가 동일해야
    // 어노테이션을 사용하여 명확하게함
    @Override
    public void eat() { // 재정의
        super.eat();
        System.out.println("지식을 먹는다.");
    }
}
