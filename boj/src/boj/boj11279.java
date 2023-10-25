package boj;

import java.io.*;
import java.util.*;

public class boj11279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> que = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine());
		for (int i=0; i<N; i++) {
			int order = Integer.parseInt(br.readLine());
			if (order == 0) {
				if (que.size() > 0) {
					System.out.println(-(que.poll()));
				}
				else {
					System.out.println(0);
				}
			}
			else {
				que.add(-order);
			}
		}
	}
}
