import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_03_마이쮸 {
    static class Person {
        int num; // 사람의 번호
        int cnt; // 현재 가지고 갈 수 있는 마이쮸 개수
        public Person(int num) {
            this.num = num;
            this.cnt = 1;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 20;
        int pNum = 1;
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person(pNum++));
        while (N > 0) {
            Person p = queue.poll();
            N -= p.cnt;
            if (N <= 0) {
                System.out.println("last : " + p.num);
            } else {
                System.out.println(p.num + " Person : " + p.cnt);
                p.cnt++;
                System.out.println("remain : " + N);
                queue.add(p);
                queue.add(new Person(pNum++));
            }
        }
    }
}
