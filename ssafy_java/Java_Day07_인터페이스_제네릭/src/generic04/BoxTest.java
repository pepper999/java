package generic04;

class Person {}
class Student extends Person {}
class PersonBox<T>{}

public class BoxTest{
    public static void main(String[] args) {
        PersonBox<Object> po = new PersonBox<>();
        PersonBox<Person> pp = new PersonBox<>();
        PersonBox<Student> ps = new PersonBox<>();
        
        PersonBox<?> pAll = po;
        pAll = pp;
        pAll = ps;
        
        // Person 또는 상속 받은 경우만 넣을 수 있다
        PersonBox<? extends Person> pChild = pp;
        pChild = ps; // Person 자손인 Student 가능
        // pChild = po; // Obejct가 Person 조상이므로 불가능
        
        // Person 또는 조상만 받을 수 있다
        PersonBox<? super Person> pSuper = pp;
        pSuper = po; // Object는 Person 조상이므로 가능
        // pSuper = ps; // 불가능
    }
}