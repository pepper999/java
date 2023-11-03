package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1450 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] things = new int[N];
		for (int i=0; i<N; i++) {
			things[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(things);
		int left = 0;
		int right = 1;
		int total = things[0];
		int count = 0;
		while (left<N && right<N && left<right) {
			System.out.println(left+" "+right+" "+total);
			if (total<=C) {
				count++;
				total+=things[right++];
			}
			else {
				total-=things[left++];
			}
		}
	}
}
