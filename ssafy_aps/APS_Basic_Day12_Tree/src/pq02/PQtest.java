package pq02;

import java.util.PriorityQueue;

public class PQtest {
    public static void main(String[] args) {
        PriorityQueue<Person> pq = new PriorityQueue<>();
        pq.offer(new Person("a", 10));
        pq.offer(new Person("b", 11));
        pq.offer(new Person("c", 12));
        pq.offer(new Person("d", 13));
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
