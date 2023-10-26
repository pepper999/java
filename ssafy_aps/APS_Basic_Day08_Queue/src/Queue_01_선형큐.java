
public class Queue_01_선형큐 {
    public static String[] queue = new String[5];
    public static int front = -1, rear = -1;
    
    public static void main(String[] args) {
    
    }
    
    public static boolean isEmpty() {
        return front == rear;
    }
    
    public static boolean isFull() {
        return rear == queue.length -1;
    }
    
    public static void enQueue(String item) {
        if(isFull()){
            System.out.println("가득참");
            return;
        }
        queue[++rear] = item;
    }
    
    public static String deQueue(String item) {
        if(isEmpty()){
            System.out.println("공백상태");
            return null;
        }
        return queue[++front];
    }
}
