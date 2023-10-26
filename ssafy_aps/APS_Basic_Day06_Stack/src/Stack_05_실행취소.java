import java.util.Scanner;
import java.util.Stack;

public class Stack_05_실행취소 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> ctrlZ = new Stack<>(); // 뒤로
        Stack<String> ctrlY = new Stack<>(); // 앞으로

        String work = "";
        while (true) {
            System.out.println("1. 새로운 작업");
            System.out.println("2. Ctrl + Z");
            System.out.println("3. Ctrl + Y");
            System.out.println("0. 종료");

            int N = sc.nextInt();
            if (N == 1) {

            } else if (N == 2) {
                if (ctrlZ.isEmpty()) {
                    System.out.println("이전 작업 없음");
                } else {
                    ctrlY.push(work);
                    work = ctrlZ.pop();
                    System.out.println(work);
                }
            } else if (N == 3) {
                if (ctrlY.isEmpty()) {
                    System.out.println("현재 최선 작업");
                } else {
                    ctrlZ.push(work);
                    work = ctrlY.pop();
                    System.out.println(work);
                }
            } else {
                System.out.println("종료");
                break;
            }
        }
    }
}
