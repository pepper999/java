package boj;

import java.io.*;
import java.util.*;

public class boj2564 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] lines = new int[N][2];
		ArrayList<Integer> dp = new ArrayList<Integer>();
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			lines[i][0] = Integer.parseInt(st.nextToken());
			lines[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(lines, Comparator.comparingInt(a->a[0]));
		dp.add(0);
		for (int i=0; i<N; i++) {
			int num = lines[i][1];
			if (num > dp.get(dp.size()-1)) {
				dp.add(num);
			}
			else {
				int left = 0;
				int right = dp.size();
				while (left<right) {
					int mid = (left+right)/2;
					if (num>dp.get(mid)) {
						left = mid+1;
					}
					else {
						right = mid;
					}
				}
				dp.set(right, num);
			}
		}
		System.out.print(N - dp.size() + 1);
	}
}
