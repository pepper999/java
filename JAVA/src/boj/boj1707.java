package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1707 {
	public static ArrayList<ArrayList<Integer>> graph;
	public static int[] visited;
	public static int V;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int K = Integer.parseInt(br.readLine());
		for (int t=0; t<K; t++) {
			st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			visited = new int[V+1];
			graph = new ArrayList<>();
			for (int i=0; i<V+1; i++) {
				graph.add(new ArrayList<>());
			}
			for (int i=0; i<E; i++) {
				st = new StringTokenizer(br.readLine());
				int u = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());
				graph.get(u).add(v);
				graph.get(v).add(u);
			}
			int flag = 1;
			for (int i=1; i<V+1; i++) {
				if (visited[i] == 0) {
					boolean rlt = bfs(i);
					if (!rlt) {
						flag = 0;
						break;
					}
				}
			}
			if (flag == 0) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
	}
	public static boolean bfs(int start) {
		Queue<Integer> que = new LinkedList<>();
		que.add(start);
		visited[start] = 1;
		while (!que.isEmpty()) {
			int now = que.poll();
			for (int next : graph.get(now)) {
				if (visited[now] == visited[next]) {
					return false;
				}
				if (visited[next] == 0) {
					visited[next] = visited[now] * (-1);
					que.add(next);
				}
			}
		}
		return true;
	}
}
