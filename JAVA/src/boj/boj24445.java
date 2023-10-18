package boj;

import java.io.*;
import java.util.*;

public class boj24445 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		int[] visited = new int[N+1];
		for (int i=0; i<N+1; i++) {
			graph.add(new ArrayList<>());
			visited[i] = 0;
		}
		for (int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			graph.get(start).add(end);
			graph.get(end).add(start);
		}
		for (int i=1; i<N+1; i++) {
			Collections.sort(graph.get(i), Collections.reverseOrder());
		}
		LinkedList<Integer> que = new LinkedList<>();
		que.add(R);
		visited[R] = 1;
		int cnt = 1;
		while (!que.isEmpty()) {
			int now = que.poll();
			for (int next : graph.get(now)) {
				if (visited[next] == 0) {
					que.add(next);
					visited[next] = ++cnt;
				}
			}
		}
		for (int i=1; i<N+1; i++) {
			sb.append(visited[i]).append('\n');
		}
		System.out.print(sb);
	}
}