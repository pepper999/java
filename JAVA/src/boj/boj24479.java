package boj;

import java.io.*;
import java.util.*;

public class boj24479 {
	public static int[] visited;
	public static int cnt;
	public static ArrayList<ArrayList<Integer>> graph;
	public static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		graph = new ArrayList<>();
		for (int i=0; i<N+1; i++) {
			graph.add(new ArrayList<>());
		}
		for (int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		for (int i=1; i<N+1; i++) {
			Collections.sort(graph.get(i));
		}
		visited = new int[N+1];
		cnt = 0;
		dfs(R);
		for (int i=1; i<N+1; i++) {
			sb.append(visited[i]).append('\n');
		}
		System.out.print(sb);
		
	}
	public static void dfs(int now) {
		visited[now] = ++cnt;
		for (int next : graph.get(now)) {
			if (visited[next] ==0) {
				dfs(next);
			}
		}
	}
}