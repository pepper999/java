import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prim_02_우선순위큐 {
    static final int INF = Integer.MAX_VALUE;
    static String input = "7 11\r\n" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
            + "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "3 5 18\r\n" + "4 5 40\r\n" + "4 6 51\r\n" + "\r\n";

    public static void main(String[] args) {
        Scanner sc = new Scanner(input);

        int V = sc.nextInt();
        int E = sc.nextInt();

        // 인접 리스트
        List<Edge>[] adjList = new ArrayList[V];

        // 리스트 생성
        for (int i = 0; i < V; i++)
            adjList[i] = new ArrayList<>();

        for (int i = 0; i < E; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int W = sc.nextInt();

            adjList[A].add(new Edge(A, B, W));
            adjList[B].add(new Edge(B, A, W));
        } // 입력끝

        // 방문처리를 하기 위해서
        boolean[] visited = new boolean[V];

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        // 시작정점을 하나 뽑고 넣어놓고 시작하겠다.
        visited[0] = true;

//		for(int i = 0 ; i<adjList[0].size(); i++) {
//			pq.add(adjList[0].get(i));
//		}
//		
//		for(Edge e : adjList[0])
//			pq.add(e);

        pq.addAll(adjList[0]);

        int pick = 1; // 이미 정점을 하나 뽑았으니
        int ans = 0;

        while (pick != V) {
            Edge e = pq.poll();

            if (visited[e.ed])
                continue; // 그냥 모조리 다 넣어버렸기 때문에 필요해 ㅠ

            ans += e.w;
            pq.addAll(adjList[e.ed]);
            visited[e.ed] = true;
            pick++;
        }

        System.out.println(ans);

    }

    static class Edge implements Comparable<Edge> {
        int st, ed, w;

        public Edge(int st, int ed, int w) {
            this.st = st;
            this.ed = ed;
            this.w = w;
        }

        @Override
        public int compareTo(Edge o) {
//			return this.w - o.w;
            return Integer.compare(this.w, o.w);
        }

    }
}
