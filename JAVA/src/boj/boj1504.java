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
		INF = 200_000_000;
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
		int[] start = dijkstra(1, N);
		int[] mid1 = dijkstra(u, N);
		int[] mid2 = dijkstra(v, N);
		int rlt = Math.min(start[u]+mid1[v]+mid2[N], start[v]+mid2[u]+mid1[N]);
		if (rlt >= INF) {
			System.out.print(-1);
		}
		else {
			System.out.print(rlt);
		}
	}
	public static int[] dijkstra(int start, int N) {
		int[] distances =new int[N+1];
		for (int i=0; i<N+1; i++) {
			distances[i] = INF;
		}
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
		return distances;
	}
}