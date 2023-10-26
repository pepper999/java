import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 크루스칼_01 {

    static int[] p;


    public static void main(String[] args) {
        Scanner sc = new Scanner(input);

        int V = sc.nextInt(); // 정점 개수
        int E = sc.nextInt(); // 간선 수

        int[][] edges = new int[E][3];

        for (int i = 0; i < E; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            edges[i][2] = sc.nextInt();
        }

        Arrays.sort(edges, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });

        p = new int[V];
        for (int i = 0; i < V; i++) {
            p[i] = i; // makeset
        }

        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < E; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            if (findset(x) != findset(y)) {
                union(x, y);
                answer += edges[i][2];
                cnt++;
            }
            if (cnt == V - 1) {
                break;
            }
        }
        System.out.println(answer);
    }

    static void union(int x, int y) {
        p[findset(y)] = findset(x); // rank는 고려안함
    }

    static int findset(int x) {
//        if (x == p[x]) {
//            return x;
//        } else {
//            return findset(p[x]);
//        }
        if (x != p[x]) {
            p[x] = findset(p[x]);
        }
        return p[x];
    }

    static String input = "7 11\r\n" +
            "0 1 32\r\n" +
            "0 2 31\r\n" +
            "0 5 60\r\n" +
            "0 6 51\r\n" +
            "1 2 21\r\n" +
            "2 4 46\r\n" +
            "2 6 25\r\n" +
            "3 4 34\r\n" +
            "3 5 18\r\n" +
            "4 5 40\r\n" +
            "4 6 51\r\n" +
            "\r\n";
}
