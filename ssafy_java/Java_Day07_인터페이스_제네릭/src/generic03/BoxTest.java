package generic03;

interface Cookable{}
interface Movable {}

// class Box<T extends Person & Cookable & Movable> // 인터페이스는 다중상속 가능
class Box<T extends Person> {
    private T t;
    
    public T getT() {
        return t;
    }
    
    public void setT(T t) {
        this.t = t;
    }
}

class Person {}
class Student extends Person {}

public class BoxTest{
    public static void main(String[] args) {
        Box<Person> box2 = new Box<>();
        Box<Student> box3 = new Box<>();
    }
}