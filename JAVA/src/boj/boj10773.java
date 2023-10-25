package boj;

import java.io.*;
import java.util.*;

public class boj10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		LinkedList<Integer> que = new LinkedList<>();
		for (int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num != 0) {
				que.add(num);
			}
			else {
				que.removeLast();
			}
		}
		int sum = 0;
		while (!que.isEmpty()) {
			int element = que.poll();
			sum += element;
		}
		System.out.print(sum);
	}
}
