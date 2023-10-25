package boj;

import java.util.*;
import java.io.*;

public class boj9148 {
	static int[][][] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		dp = new int[21][21][21];
		while (true) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			if (A==-1 && B==-1 && C==-1) {
				break;
			}
			System.out.printf("w(%d, %d, %d) = %d\n", A, B, C, w(A, B, C));
			
		}
	}
	static int w(int a, int b, int c) {
		if (inRange(a, b, c) && dp[a][b][c] != 0) {
			return dp[a][b][c];
		}
		if (a<=0 || b<=0 || c<=0) {
			return 1;
		}
		if (a>20 || b>20 || c>20) {
			return dp[20][20][20] = w(20, 20, 20);
		}
		if (a<b && b<c) {
			return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		}
		return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
	
	static boolean inRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20; 
	}
}
