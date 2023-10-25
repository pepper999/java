package boj;

import java.io.*;
import java.util.*;

public class boj16928 {
	public static ArrayList<ArrayList<Integer>> graph;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		graph = new ArrayList<>();
		for (int i=0; i<101; i++) {
			graph.add(new ArrayList<>());
		}
		for (int i=0; i<N+M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			graph.get(start).add(end);
		}
		System.out.print(bfs());
	}
	public static int bfs() {
		Queue<Integer> que = new LinkedList<>();
		int[] visited = new int[101];
		que.add(1);
		visited[1] = 1;
		while (!que.isEmpty()) {
			int now = que.poll();
			for (int i=1; i<7; i++) {
				int next = now+i;
				if (!graph.get(next).isEmpty()) {
					next = graph.get(next).get(0);
				}
				if (next == 100) {
					return visited[now];
				}
				if (visited[next]==0) {
					visited[next] = visited[now] + 1;
					que.add(next);
				}
			}
		}
		return 0;
	}
}
