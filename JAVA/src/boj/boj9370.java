package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {
	int end, weight;
	public Node(int end, int weight) {
		this.end = end;
		this.weight = weight;
	}
	@Override
	public int compareTo(Node o) {
		return weight - o.weight;
	}
}


public class boj9370 {
	public static int INF;
	public static ArrayList<ArrayList<int[]>> graph;
	public static int[] dijkstra(int start, int n) {
		int[] distances = new int[n+1];
		for (int i=1; i<n+1; i++) {
			distances[i] = INF;
		}
		PriorityQueue<Node> que = new PriorityQueue<>();
		que.add(new Node(start, 0));
		distances[start] = 0;
		while (!que.isEmpty()) {
			Node nownode = que.poll();
			int now = nownode.end;
			int weight = nownode.weight;
			for (int[] nextnode : graph.get(now)) {
				int next = nextnode[0];
				int nextdis = nextnode[1];
				if (distances[next] > weight + nextdis) {
					distances[next] = weight + nextdis;
					que.add(new Node(next, distances[next]));
				}
			}
		}
		return distances;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int tc=0; tc<T; tc++) {
			graph = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			for (int i=0; i<n+1; i++) {
				graph.add(new ArrayList<>());
			}
			int[] targets = new int[t]; 
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			for (int i=0; i<m; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int d = Integer.parseInt(st.nextToken());
				graph.get(a).add(new int[]{b,d});
				graph.get(b).add(new int[]{a,d});
			}
			for (int i=0; i<t; i++) {
				targets[i] = Integer.parseInt(br.readLine());
			}
			INF = 200_000_000;
			PriorityQueue<Integer> rlt = new PriorityQueue<>();
			int[] start = dijkstra(s, n);
			int[] nodeg = dijkstra(g, n);
			int[] nodeh = dijkstra(h, n);
			for (int target : targets) {
				if (start[g]+nodeg[h]+nodeh[target] == start[target] || start[h]+nodeh[g]+nodeg[target] == start[target]) {
					rlt.add(target);
				}
			}
			while (!rlt.isEmpty()) {
				sb.append(rlt.poll()).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

