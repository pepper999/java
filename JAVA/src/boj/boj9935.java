package boj;

import java.io.*;
import java.util.*;

public class boj9935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String bomb = br.readLine();
		StringBuilder sb = new StringBuilder();
		LinkedList<Character> stack = new LinkedList<>();
		for (int i=0; i<str.length(); i++) {
			stack.add(str.charAt(i));
			if (stack.size() >= bomb.length()) {
				boolean issame = true;
				for (int j=0; j<bomb.length(); j++) {
					if (stack.get(stack.size()-bomb.length()+j) != bomb.charAt(j)) {
						issame = false;
						break;
					}
				}
				if (issame) {
					for (int j=0; j<bomb.length(); j++) {
						stack.pollLast();
					}
				}
			}
		}
		for (char ch:stack) {
			sb.append(ch);
		}
		System.out.println(sb.length()>0 ? sb.toString():"FRULA");
	}
}
