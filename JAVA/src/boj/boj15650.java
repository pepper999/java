package boj;

import java.io.*;
import java.util.*;

public class boj15650 {
	public static int[] arr;
	public static boolean[] visited;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		visited = new boolean[N];
		arr = new int[M]; 
		solution(N, M, 0, 0);
		System.out.println(sb);
	}
	public static void solution(int N, int M, int depth, int now) {
		if (depth == M) {
			for (int val:arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i=now; i<N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i+1;
				solution(N, M, depth+1, i+1);
				visited[i] = false;
			}
			
		}
	}
}
