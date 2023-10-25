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

public class boj1753 {
	public static ArrayList<ArrayList<Node>> graph;
	public static int[] distances;
	public static int INF = 100_000_000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(br.readLine());
		graph = new ArrayList<>();
		distances = new int[V+1];
		for (int i=0; i<V+1; i++) {
			graph.add(new ArrayList<>());
			distances[i] = INF;
		}
		for (int i=0; i<E; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			graph.get(u).add(new Node(v,w));
		}
		dijkstra(K);
		for (int i=1; i<V+1; i++) {
			if (distances[i] == INF) {
				sb.append("INF").append("\n");
			}
			else {
				sb.append(distances[i]).append("\n");
			}
		}
		System.out.print(sb);
	}
	public static void dijkstra(int start) {
		PriorityQueue<Node> que = new PriorityQueue<>();
		que.add(new Node(start, 0));
		distances[start] = 0;
		while (!que.isEmpty()) {
			Node nownode = que.poll();
			int now = nownode.end;
			for (Node next : graph.get(now)) {
				if (distances[next.end] > distances[now] + next.weight) {
					distances[next.end] = distances[now] + next.weight;
					que.add(new Node(next.end, distances[next.end]));
				}
			}
		}
	} 
}