package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class boj9019 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int now = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken());
			Queue<Integer> que = new LinkedList<>();
			que.add(now);
			boolean[] visited = new boolean[10_000];
			String[] command = new String[10_000];
			visited[now] = true;
			command[now] = "";
			while (!que.isEmpty() && !visited[target]) {
				now = que.poll();
				int D = (2*now)%10_000;
				int S = (now==0)?9999:now-1;
				int L = (now%1000)*10+now/1000;
				int R = (now%10)*1000+now/10;
				if (!visited[D]) {
					que.add(D);
					visited[D]=true;
					command[D]=command[now]+"D";
				}
				if (!visited[S]) {
					que.add(S);
					visited[S]=true;
					command[S]=command[now]+"S";
				}
				if (!visited[L]) {
					que.add(L);
					visited[L]=true;
					command[L]=command[now]+"L";
				}
				if (!visited[R]) {
					que.add(R);
					visited[R]=true;
					command[R]=command[now]+"R";
				}
			}
			System.out.println(command[target]);
		}
	}
}