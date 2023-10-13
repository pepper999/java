package boj;

import java.util.*;

public class boj9663 {
	public static int cnt;
	public static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		cnt = 0;
		arr = new int[N];
		sol(N, 0);
		System.out.print(cnt);
	}
	public static void sol(int N, int depth) {
		if (depth == N) {
			cnt++;
			return;
		}
		for (int i=0; i<N; i++) {
			arr[depth] = i;
			if (isvalid(i, depth)) {
				sol(N, depth+1);
			}
		}
	}
	public static boolean isvalid(int i, int row) {
		for (int j=0; j<row; j++) {
			if (arr[j] == i || Math.abs(j-row) == Math.abs(arr[j]-i)) {
				return false;
			}
		}
		return true;
	}
}
