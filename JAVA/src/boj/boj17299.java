package boj;

import java.io.*;
import java.util.*;

public class boj17299 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		int[] count = new int[1000001];
		LinkedList<Integer> stack = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			nums[i] = num;
			count[num]++;
			
		}
		for (int i=0; i<N; i++) {
			int num = nums[i];
			if (stack.isEmpty()) {
				stack.add(i);
			}
			else {
				while (!stack.isEmpty() && count[nums[stack.peekLast()]]<count[num]) {
					nums[stack.pollLast()] = num;
				}
				stack.add(i);
			}
		}
		while (!stack.isEmpty()) {
			nums[stack.pollLast()] = -1;
		}
		for (int num : nums) {
			bw.write(num+" ");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
