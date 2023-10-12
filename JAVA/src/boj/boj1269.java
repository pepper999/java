package boj;

import java.io.*;
import java.util.*;

public class boj1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Set<String> set = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			set.add(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<M; i++) {
			set.add(st.nextToken());
		}
		System.out.println(2*set.size()-N-M);
	}
}
