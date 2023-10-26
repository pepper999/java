package exception02_throws;

public class ThrowsTest02_UnChecked {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("예외처리");
        }
    }
    public static void method1() {
        method2();
    }
    public static void method2() {
        // index out of bounds
        // devide zero
        // unchecked exception 은 자동으로 throw
        int i = 1/0;
    }
}
