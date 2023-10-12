package boj;

import java.io.*;
import java.util.*;

public class boj11478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> substrings = new HashSet<>();
		String str = br.readLine();
		for (int i=0; i<str.length(); i++) {
			for (int j=i+1; j <= str.length(); j++) {
				substrings.add(str.substring(i, j));
			}
		}
		System.out.println(substrings.size());
	}
}
