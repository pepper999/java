package generic01;

class Box {
    private Object obj;
    
    public Object getobj() {
        return obj;
    }
    
    public void setObj(Object obj) {
        this.obj = obj;
    }
}

class Person {}

public class BoxTest{
    public static void main(String[] args) {
        Box box = new Box();
        box.setObj("hello");
        box.setObj(new Person());
        Object obj = box.getobj();
        
        if(obj instanceof String) {
            String str = (String)obj;
            System.out.println("문자열");
        } else if (obj instanceof Person) {
            Person p = (Person)obj;
            System.out.println("Person");
        } else {
            System.out.println("결과 없음");
        }
    }
}