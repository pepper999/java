package boj;

import java.io.*;
import java.util.*;

public class boj1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> name = new HashMap<>();
		HashMap<Integer, String> num = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i=1; i<N+1; i++) {
			String str = br.readLine();
			name.put(str, i);
			num.put(i, str);
		}
		for (int i=0; i<M; i++) {
			String str = br.readLine();
			try {
				int number = Integer.parseInt(str);
				System.out.println(num.get(number));
			} catch (NumberFormatException e){
				System.out.println(name.get(str));
			}
		}
	}
}
