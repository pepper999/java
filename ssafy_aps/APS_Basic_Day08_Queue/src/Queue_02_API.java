import java.util.LinkedList;
import java.util.Queue;

public class Queue_02_API {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // 추가 : add, offer
        // 삭제 : remove, poll
        // 조회 : element, peek
        // add, remove, element 예외 발생
        // offer, poll, peek 예외 미발생
        System.out.println(queue.add("가나다"));
        System.out.println(queue.add("라마바"));
        System.out.println(queue.offer("abc"));
        System.out.println(queue.offer("def"));
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.peek());
    }
}
