import java.util.LinkedList;
import java.util.Queue;

public class 그래프탐색_02_BFS {
    static int N = 7;
    // 인접행렬 저장할 수 있어야해
    static int[][] adj = {{0, 1, 1, 0, 0, 1, 0}, {1, 0, 0, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0, 0},
            {0, 1, 1, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 1, 1}, {1, 0, 0, 0, 1, 0, 0}, {0, 1, 0, 1, 1, 0, 0}};

    static boolean[] visited = new boolean[N]; // 방문처리를 할 배열
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        BFS(0); // 1번으로 돌리는거임.
    }

    // v : 시작정점
    static void BFS(int v) {
        // 시작정점을 큐에 넣는다.
        queue.add(v);
        visited[v] = true; // 방문처리를 한다.
        // 큐가 공백이 될때까지 반복문 수행
        // 큐가 공백이 아니라면 반복문 수행
        while (!queue.isEmpty()) {
            // 정점을 하나 꺼내자
            int t = queue.poll();
            System.out.println(t + 1);

            // 나와 연결되어 있으면서 방문하지 않은 친구들은 Q에 넣고 방문처리를 한다.
            for (int i = 1; i < adj.length; i++) {
                if (!visited[i] && adj[t][i] == 1) {
                    queue.add(i); // 큐에 넣고 방문처리
                    visited[i] = true;
                }

            }
        }

    }

}
