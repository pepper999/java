package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class boj2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		boolean[][] paper = new boolean[101][101];
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int j=x; j<x+10; j++) {
				for (int k=y; k<y+10; k++) {
					if (!paper[j][k]) {
						paper[j][k] = true;
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
