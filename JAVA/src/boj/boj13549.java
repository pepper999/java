package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

public class boj13549 {
	public static int INF;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		INF = 200_000_000;
		System.out.println(dijkstra(N,M));
	}
	public static int dijkstra(int start, int end) {
		int[] distances = new int[200_000];
		for (int i=0; i<199_999; i++) {
			distances[i] = INF;
		}
		PriorityQueue<Node> que = new PriorityQueue<>();
		que.add(new Node(start, 0));
		distances[start] = 0;
		while (!que.isEmpty()) {
			Node nownode = que.poll();
			int now = nownode.end;
			if (now == end) {
				break;
			}
			int[][] deltas = new int[][]{new int[]{now+1,1}, new int[]{now-1, 1}, new int[]{now*2, 0}};
			for (int[] delta : deltas) {
				int next = delta[0];
				int nextdistance = delta[1];
				if (next >=0 && next < 199_999 && distances[next] > distances[now]+nextdistance) {
					distances[next] = distances[now]+nextdistance;
					que.add(new Node(next, distances[next]));
				}
			}
		}
		return distances[end];
	}
}

