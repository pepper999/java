package boj;

import java.io.*;
import java.util.*;

public class boj7576 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[][] delta = {{1,0},{-1,0},{0,1},{0,-1}};
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[][] graph = new int[N][M];
		Queue<int[]> que = new LinkedList<>();
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<M; j++) {
				int num = Integer.parseInt(st.nextToken());
				graph[i][j] = num;
				if (num == 1) {
					que.add(new int[]{i,j});
				}
			}
		}
		while (!que.isEmpty()) {
			int[] now = que.poll();
			int x = now[0];
			int y = now[1];
			for (int i=0; i<4; i++) {
				int nx = x + delta[i][0];
				int ny = y + delta[i][1];
				if (nx>=0 && nx<N && ny>=0 && ny<M && graph[nx][ny] == 0) {
					que.add(new int[]{nx,ny});
					graph[nx][ny] = graph[x][y] + 1;
				}
			}
		}
		int rlt = 0;
		int flag = 0;
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				rlt = Math.max(rlt, graph[i][j]);
				if (graph[i][j] == 0) {
					flag = 1;
				}
			}
		}
		if (flag ==1 ) {
			System.out.print(-1);
		}
		else {
			System.out.print(rlt-1);
		}
	}
}
