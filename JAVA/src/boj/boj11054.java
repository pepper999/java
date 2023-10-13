package boj;

import java.io.*;
import java.util.*;

public class boj11054 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] nums = new int[N];
		int[] dp = new int[N];
		int[] dp2 = new int[N];
		for (int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1;
			dp2[i] = 1;
		}
		for (int i=0; i<N; i++) {
			for (int j=0; j<i; j++) {
				if (nums[j] < nums[i]) {
					dp[i] = Math.max(dp[j]+1, dp[i]);
				}
				if (nums[N-j-1] < nums[N-i-1]) {
					dp2[i] = Math.max(dp2[j]+1, dp2[i]);
				}
			}
		}
		int temp_max = 0;
		for (int i=0; i<N; i++) {
			temp_max = Math.max(temp_max, dp[i] + dp2[N-i-1]);
		}
		System.out.print(temp_max-1);
	}
}
