package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1806 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int[] nums = new int[N+1];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		int left = 0;
		int right = 0;
		int rlt = 100_001;
		int total = 0;
		while(left<=N && right<=N) {
			System.out.println(left+" "+right+" "+total);
			if (total >= S) {
				rlt = Math.min(rlt, right-left);
				total-=nums[left++];
			}
			else {
				total+=nums[right++];
			}
		}
		if (rlt==100_001) {
			System.out.println(0);
		}
		else {
			System.out.println(rlt);
		}
	}
}
