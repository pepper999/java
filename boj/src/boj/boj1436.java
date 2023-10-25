package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class boj1436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int num = 0;
		for (int i=0; cnt<N; i++) {
			if (String.valueOf(i).contains("666")) {
				cnt++;
				num = i;
			}
		}
		System.out.print(num);
	}
}
