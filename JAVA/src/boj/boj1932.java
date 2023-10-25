package boj;

import java.io.*;
import java.util.*;

public class boj1932 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N+1][N+1];
		int[][] dp = new int[N+1][N+1];
		for (int i=1; i<N+1; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=1; j<i+1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i=1; i<N+1; i++) {
			for (int j=1; j<N+1; j++) {
				dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j])+arr[i][j];
			}
		}
		int rlt = 0;
		for (int i=0; i<N+1; i++) {
			rlt = Math.max(rlt, dp[N][i]);
		}
		System.out.println(rlt);
	}
}
