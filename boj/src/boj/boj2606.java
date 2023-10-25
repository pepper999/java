package boj;

import java.io.*;
import java.util.*;

public class boj2606 {
	public static Queue<Integer> que;
	public static ArrayList<ArrayList<Integer>> graph;
	public static boolean[] visited;
	public static int cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		graph = new ArrayList<>();
		visited = new boolean[N+1];
		for (int i=0; i<N+1; i++) {
			graph.add(new ArrayList<>());
		}
		for (int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			graph.get(start).add(end);
			graph.get(end).add(start);
		}
		que = new LinkedList<>();
		cnt = 0;
		bfs(1);
		System.out.println(cnt);
	}
	public static void bfs(int start) {
		que.add(start);
		visited[start] = true;
		while (!que.isEmpty()) {
			int now = que.poll();
			for (int next : graph.get(now)) {
				if (!visited[next]) {
					que.add(next);
					visited[next] = true;
					cnt ++;
				}
			}
		}
	}
}
