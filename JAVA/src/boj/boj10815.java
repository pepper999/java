package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class boj10815 {
	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> owned = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			owned.put(st.nextToken(), 0);
		}
		StringBuilder rlt = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<M; i++) {
			if (owned.get(st.nextToken()) != null) {
				rlt.append("1 ");
			}
			else {
				rlt.append("0 ");
			}
		}
		System.out.println(rlt.toString());
	}
}
