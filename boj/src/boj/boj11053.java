package boj;

import java.io.*;
import java.util.*;

public class boj11053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		LinkedList<Integer> dp = new LinkedList<>();
		dp.add(0);
		for (int i=0; i<N; i++) {
			int now = Integer.parseInt(st.nextToken());
			if (now > dp.getLast()) {
				dp.add(now);
			}
			else {
				int left = 0;
				int right = dp.size();
				while (left < right) {
					int mid = (left + right)/2;
					if (now > dp.get(mid)) {
						left = mid+1;
					}
					else {
						right = mid;
					}
				}
				dp.set(right, now);
			}
		}
		System.out.print(dp.size()-1);
	}
}
