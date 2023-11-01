package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] trees = new int[N];
		st = new StringTokenizer(br.readLine());
		long right = 0;
		long left = 0;
		long total = 0;
		long rlt = 0;
		for (int i=0; i<N; i++) {
			int tree = Integer.parseInt(st.nextToken());
			right = Math.max(tree, right);
			trees[i] = tree;
		}
		while (left<right) {
			long mid = (left+right)/2;
			for (int tree:trees) {
				if (mid < tree) {
					total += (tree-mid);
				}
			}
			if (total>=M) {
				left = mid+1;
				rlt = mid;
				total = 0;
			}
			else {
				right = mid;
				total = 0;
			}
		}
		System.out.print(rlt);
	}
}
