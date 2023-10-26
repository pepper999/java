import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 그래프_02_인접리스트 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 정점의 개수(V)와 간선의 수(E)가 주어진다.
        int V = sc.nextInt();
        int E = sc.nextInt();

        // 인접 리스트
        List<Integer>[] adjList = new ArrayList[V + 1];

        for (int i = 0; i < V + 1; i++) {
            adjList[i] = new ArrayList<>();
        }

        // 간선 정보 입력
        for (int i = 0; i < E; i++) {
            int A = sc.nextInt(); // 시작 정점
            int B = sc.nextInt(); // 끝 정점
            int w = sc.nextInt(); // 가중치 그래프라고 했을 때 가중치 값

            adjList[A].add(B);
            adjList[B].add(A); // 무향 그래프 인 경우
        }
    }
}
