package boj;

import java.io.*;
import java.util.*;

public class boj12015 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] nums = new int[N];
		for (int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		ArrayList<Integer> subnums = new ArrayList<>();
		subnums.add(0);
		for (int i=0; i<N; i++) {
			int now = nums[i];
			if (now > subnums.get(subnums.size()-1)) {
				subnums.add(now);
			}
			else {
				int left = 0;
				int right = subnums.size();
				while (left<right) {
					int mid = (left+right)/2;
					if (subnums.get(mid) < now) {
						left = mid+1;
					}
					else {
						right = mid;
					}
				}
				subnums.set(left, now);
			}
		}
		System.out.print(subnums.size()-1);
	}
}
