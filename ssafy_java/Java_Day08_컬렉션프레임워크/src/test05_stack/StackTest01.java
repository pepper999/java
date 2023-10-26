package test05_stack;

import java.util.Stack;

public class StackTest01 {
    public static void main(String[] args) {
            
        Stack<Integer> stack = new Stack<>();
        
        // 값 넣기
        for (int i = 0; i < 10; i++) {
            stack.push(i); // 
        }
        
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " "); // 데이터 조회
            System.out.print(stack.pop() + " "); // 데이터 빼기
        }
    }
}
