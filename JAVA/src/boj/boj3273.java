package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj3273 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);
		int num = Integer.parseInt(br.readLine());
		int left = 0;
		int right = n-1;
		int cnt = 0;
		while (left<right) {
			if (nums[left]+nums[right] > num) {
				right --;
			}
			else if (nums[left]+nums[right] < num) {
				left ++;
			}
			else {
				cnt ++;
				left ++;
			}
		}
		System.out.print(cnt);
	}
}
