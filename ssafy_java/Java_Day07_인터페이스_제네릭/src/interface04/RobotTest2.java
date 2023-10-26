package interface04;

interface MyPrint1 {
    public default void print() {
        System.out.println("정보출력1");
    }
}

interface MyPrint2 {
    public default void print() {
        System.out.println("정보출력2");
    }
}

//class Robot implements MyPrint1, MyPrint2 {
//    재작성 필요
//}

public class RobotTest2 {
    public static void main(String[] args) {
    }
}
