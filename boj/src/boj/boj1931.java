package boj;

import java.io.*;
import java.util.*;

public class boj1931 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] times = new int[N][2];
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			times[i][0] = Integer.parseInt(st.nextToken());
			times[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(times, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
                if (a[1] == b[1]) {
                    return a[0] - b[0];
                } else {
                    return a[1] - b[1];
                }
            }
		});
		int end = 0;
		int cnt = 0;
		for (int i=0; i<N; i++) {
			if (times[i][0] >= end) {
				end = times[i][1];
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}
