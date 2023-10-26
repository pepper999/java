package pq01;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQtest {
    public static void main(String[] args) {
        //얘는 최소힙으로 만들어 져있다.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.offer(100);
        pq.add(2);
        pq.add(3);
        pq.add(4);

//		while(!pq.isEmpty()) {
//			System.out.println(pq.poll());
//		}
        
        //얘는 최대힙으로 만들고 싶어졌어!
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        
        pq2.offer(-100);
        pq2.add(-2);
        pq2.add(-3);
        pq2.add(-4);
        
        while (!pq2.isEmpty()) {
            System.out.println(-pq2.poll());
        }
        
        //얘는 최대힙으로 만들고 싶어졌어!
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(Collections.reverseOrder());
        
        pq3.offer(100);
        pq3.add(2);
        pq3.add(3);
        pq3.add(4);
        
        while (!pq3.isEmpty()) {
            System.out.println(pq3.poll());
        }
    }
}
