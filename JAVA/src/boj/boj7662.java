package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class boj7662 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc=0; tc<T; tc++) {
			TreeMap<Integer, Integer> treemap = new TreeMap<>();
			int Q = Integer.parseInt(br.readLine());
			for (int q=0; q<Q; q++) {
				st = new StringTokenizer(br.readLine());
				String query = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				if (query.equals("I")) {
					treemap.put(num, treemap.getOrDefault(num,0)+1);
				}
				else if (!treemap.isEmpty()) {
					Integer Key;
					if (num == 1) {
						Key = treemap.lastKey();
					}
					else {
						Key = treemap.firstKey();
					}
					int cnt = treemap.get(Key);
					if (cnt == 1) {
						treemap.remove(Key);
					}
					else {
						treemap.put(Key, cnt-1);
					}
				}
			}
			if (treemap.isEmpty()) {
				System.out.println("EMPTY");
			}
			else {
				System.out.println(treemap.lastKey()+" "+treemap.firstKey());
			}
		}
	}
}
