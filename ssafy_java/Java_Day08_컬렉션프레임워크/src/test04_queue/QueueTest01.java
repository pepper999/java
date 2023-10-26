package test04_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        // 선입선출 FIFO
        // 구현체(클래스)는 LinkedList를 사용
        Queue<Integer> queue = new LinkedList<>();
        
        // 값 넣기
        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }
        
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " "); // 데이터 조회
            System.out.print(queue.poll() + " "); // 데이터 빼내기
        }
    }
}
