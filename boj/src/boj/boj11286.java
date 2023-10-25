package boj;

import java.io.*;
import java.util.*;

public class boj11286 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer num1, Integer num2) {
				if (Math.abs(num1) == Math.abs(num2)){
					return num1 - num2;
				}
				else {
					return Math.abs(num1) - Math.abs(num2);
				}
			}
		});
		for (int i=0; i<N; i++) {
			int order = Integer.parseInt(br.readLine());
			if (order == 0) {
				if (!que.isEmpty()) {
					System.out.println(que.poll());
				}
				else {
					System.out.println(0);
				}
			}
			else {
				que.add(order);
			}
		}
	}
}
