package boj;

import java.io.*;
import java.util.*;

public class boj9012 {
	public static String solution(String str) {
		LinkedList<String> stack = new LinkedList<>();
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == '(') {
				stack.add("(");
			}
			else {
				if (stack.isEmpty()) {
					return "NO";
				}
				else {
					stack.removeLast();
				}
			}
		}
		if (!stack.isEmpty()) {
			return "NO";
		}
		return "YES";
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int t=0; t<N; t++) {
			String str = br.readLine();
			System.out.println(solution(str));
		}
	}
}
