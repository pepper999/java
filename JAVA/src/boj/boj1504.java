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

public class boj1504 {
	public static ArrayList<ArrayList<Node>> graph;
	public static int INF;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		INF = Integer.MAX_VALUE;
		graph = new ArrayList<>();
		for (int i=0; i<N+1; i++) {
			graph.add(new ArrayList<>());
		}
		for (int i=0; i<E; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			graph.get(a).add(new Node(b,c));
			graph.get(b).add(new Node(a,c));
		}
		st = new StringTokenizer(br.readLine());
		int u = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int total = 0;
		total += dijkstra(1, u, N);
		total += dijkstra(u, v, N);
		total += dijkstra(v, N, N);
		System.out.print(total);
	}
	public static int dijkstra(int start, int end, int N) {
		int[] distances =new int[N+1];
		PriorityQueue<Node> que = new PriorityQueue<>();
		que.add(new Node(start,0));
		distances[start] = 0;
		while (!que.isEmpty()) {
			Node curNode = que.poll();
			int now = curNode.end;
			for (Node next : graph.get(now)) {
				if (distances[next.end] > distances[now] + next.weight) {
					distances[next.end] = distances[now] + next.weight;
					que.add(new Node(next.end ,distances[next.end]));
				}
			}
		}
		return distances[end];
	}
}