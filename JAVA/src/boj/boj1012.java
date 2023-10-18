package boj;

import java.io.*;
import java.util.*;

public class boj1012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int[] dx = {1,-1,0,0};
		int[] dy = {0,0,1,-1};
		for (int t=0; t<T; t++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[][] graph = new int[N][M];
			boolean[][] visited = new boolean[N][M];
			for (int i=0; i<K; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				graph[x][y] = 1;
			}
			int cnt = 0;
			for (int i=0; i<N; i++) {
				for (int j=0; j<M; j++) {
					if (graph[i][j]==1 && !visited[i][j]) {
						cnt++;
						Queue<int[]> que = new LinkedList<>();
						que.add(new int[]{i,j});
						visited[i][j] = true;
						while (!que.isEmpty()) {
							int[] now = que.poll();
							int x = now[0];
							int y = now[1];
							for (int d=0; d<4; d++) {
								int nx = x+dx[d];
								int ny = y+dy[d];
								if (nx>=0 && nx<N && ny>=0 && ny<M) {
									if (graph[nx][ny]==1 && !visited[nx][ny]) {
										que.add(new int[]{nx,ny});
										visited[nx][ny] = true;
									}
								}
							}
						}
					}
				}
			}
			sb.append(cnt).append('\n');
		}
		System.out.print(sb);
	}
}
