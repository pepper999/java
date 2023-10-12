package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class boj14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		HashMap<String, Integer> hm = new HashMap<>();
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i=0; i<N; i++) {
			hm.put(br.readLine(), 0);
		}
		int cnt = 0;
		for (int i=0; i<M; i++) {
			if (hm.get(br.readLine()) != null) {
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}
