package test06_final;

class Parent {
    int data = 10;

    public void print() {
        System.out.println(data);
    }
}

class Child extends Parent {
    int data = 20;

    public void print() {
        int data = 30;
        System.out.println(data);
        System.out.println(this.data);
        System.out.println(super.data);
    }
}

public class ExtendsTest {
    public static void main(String[] args) {

        Child c = new Child();
        c.print();

        Parent p = new Child();
        p.print();

    }

}
