package exception02_throws;

public class ThrowsTest01_Checked {
    public static void main(String[] args) {
        // method(); // 사용 불가
        // 내부에서 객체를 생성하거나
//        ThrowsTest01_Checked t = new ThrowsTest01_Checked();
//        try {
//            t.method1();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        // static 메소드로 변경
          try {
              method1();
          } catch (ClassNotFoundException e) {
              e.printStackTrace();
          }
    }
    public static void method1() throws ClassNotFoundException {
        method2();
    }
    public static void method2() throws ClassNotFoundException {
        // check exception
        Class.forName("SSAFY");
    }
}
