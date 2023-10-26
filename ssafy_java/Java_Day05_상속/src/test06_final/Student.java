package test06_final;

public final class Student extends Person {
    String major;
    final double PI = 3.14;
//	PI = 1.23; // 재할당 불가

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
//	@Override
//	public void eat() { // final 재정의 불가
//		super.eat();
//		System.out.println("지식을 먹는다.");
//	}

    @Override
    public String toString() {
        return "Student [major=" + major + ", name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return name.equals(((Student) obj).name);
    }

    // 오버라이딩이 아님
    public boolean equals(Student st) {
        return name.equals(st.name);
    }

}
