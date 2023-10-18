package boj;

import java.io.*;
import java.util.*;

public class boj1260 {
	public static StringBuilder sb;
	public static ArrayList<ArrayList<Integer>> graph;
	public static boolean[] visited1;
	public static boolean[] visited2;
	public static LinkedList<Integer> stack;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		graph = new ArrayList<>();
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
		for (int i=1; i<N+1; i++) {
			Collections.sort(graph.get(i));
		}
		stack = new LinkedList<>();
		visited1 = new boolean[N+1];
		visited2 = new boolean[N+1];
		dfs(V);
		sb.append('\n');
		bfs(V);
		System.out.print(sb);
	}
	public static void dfs(int now) {
		stack.add(now);
		visited1[now] = true;
		sb.append(now).append(" ");
		for (int next : graph.get(now)) {
			if (!visited1[next]) {
				dfs(next);
			}
		}
	}
	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<>();
		que.add(start);
		sb.append(start).append(" ");
		visited2[start] = true;
		while (!que.isEmpty()) {
			int now = que.poll();
			for (int next : graph.get(now)) {
				if (!visited2[next]) {
					sb.append(next).append(" ");
					que.add(next);
					visited2[next] = true;
				}
			}
		}
	}
}
