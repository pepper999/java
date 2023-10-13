package boj;

import java.io.*;
import java.util.*;

public class boj1912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] dp = new int[N];
		dp[0] = Integer.parseInt(st.nextToken());
		for (int i=1; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (dp[i-1] < 0) {
				dp[i] = num;
			}
			else {
				dp[i] = dp[i-1] + num;
			}
		}
		int temp_max = -10000000;
		for (int i=0; i<N; i++) {
			if (dp[i] > temp_max) {
				temp_max = dp[i];
			}
		}
		System.out.println(temp_max);
	}
}
