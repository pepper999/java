package interface05;

public class Test {
    public static void main(String[] args) {
        HdmiOutput monitor = new Monitor(); // 다형성
        HdmiOutput tv = new TV();
        HdmiInput computer = new Computer();
        computer.setOutput(monitor);
        computer.show();
        computer.setOutput(tv);
        computer.show();
    }
}
