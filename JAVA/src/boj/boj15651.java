package boj;

import java.io.*;
import java.util.*;

public class boj15651 {
	public static int arr[];
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		sol(N, M, 0);
		System.out.println(sb);
	}
	public static void sol(int N, int M, int depth) {
		if (depth == M) {
			for (int val:arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i=0; i<N; i++) {
			arr[depth] = i+1;
			sol(N, M, depth+1);
		}
	}
}
