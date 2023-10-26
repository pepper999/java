package modifier03_protected2;

import modifier03_protected.Person;

public class Student extends Person {

    public static void main(String[] args) {
        Student s = new Student();
        // 상속 받은 경우
        // 다른패키지이지만 protected 특성 상 접근 가능
        s.age = 10;
        s.name = "Yang";
    }

}