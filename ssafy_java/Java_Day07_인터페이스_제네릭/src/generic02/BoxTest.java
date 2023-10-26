package generic02;


class Box<T> {
    private T t;
    
    public T getT() {
        return t;
    }
    
    public void setT(T t) {
        this.t = t;
    }
}

class Person {}

public class BoxTest{
    public static void main(String[] args) {
        // 박스를 생성 할 때 어떤 박스 인지 명시
        // Box box = new Box(); 이렇게 사용 시 T 부분에 Object 들어감. 사용지양
        
        Box<String> box1 = new Box<String>();
        box1.setT("hi");
        String str = box1.getT();
        System.out.println("문자열");
        
        // box1.setT(new Person()) // 불가능
        
        Box<Person> box2 = new Box<>(); // 뒤쪽 생성자 부분 타입 생략 가능
        
        // Box<Person> box3 = new Box<T>(); // 불가능
        // Box<T> box4 = new Box<Person>(); // 불가능
        
    }
}