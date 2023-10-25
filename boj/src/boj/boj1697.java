package boj;

import java.io.*;
import java.util.*;

public class boj1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] visited = new int[200001];
        Queue<Integer> que = new LinkedList<>();
        que.add(N);
        visited[N] =1;
        while (!que.isEmpty()) {
            int now = que.poll();
            if (now == K) {
                break;
            }
            int[] next = {2 * now, 1 + now, now - 1};
            for (int i = 0; i < 3; i++) {
            	int nextpos = next[i];
                if (nextpos >= 0 && nextpos <= 200000 && visited[nextpos] == 0) {
                    que.add(nextpos);
                    visited[nextpos] = visited[now] + 1;
                }
            }
        }
        System.out.print(visited[K]-1);
    }
}

