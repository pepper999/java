package boj;

import java.io.*;
import java.util.*;

public class boj17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		LinkedList<Integer> stack = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		for (int i=0; i<N; i++) {
			if (stack.isEmpty()) {
				stack.add(i);
			}
			else {
				if (nums[stack.peekLast()] > nums[i]) {
					stack.add(i);
				}
				else {
					while (!stack.isEmpty() && nums[stack.peekLast()] < nums[i]) {
						nums[stack.pollLast()] = nums[i];
					}
					stack.add(i);
				}
			}
		}
		while (!stack.isEmpty()) {
			nums[stack.pollLast()] = -1;
		}
		for (int num : nums) {
			sb.append(num).append(' ');
		}
		System.out.println(sb);
	}
}
