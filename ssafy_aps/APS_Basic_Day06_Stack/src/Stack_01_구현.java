public class Stack_01_구현 {
    public static int[] stack = new int[5];
    public static int top = -1;
    
    public static void main(String[] args) {
    
    }
    
    public static boolean isEmpty() {
        return top == -1;
    }
    
    public static boolean isFull() {
        return top == stack.length - 1;
    }
    
    public static void push(int value) {
        if (isFull()) {
            System.out.println("가득참");
            return;
        }
        stack[++top] = value;
    }
    
    public static int pop() {
        if (isEmpty()) {
            System.out.println("비었음");
            return -1;
        }
        return stack[top--];
    }
    
    public static int peek() {
        if (isEmpty()) {
            System.out.println("비었음");
            return -1;
        }
        return stack[top];
    }
}
