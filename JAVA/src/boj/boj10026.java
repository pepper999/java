package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class boj10026 {
	public static int N;
	public static char[][] graph;
	public static boolean[][] visited;
	public static boolean[][] visited_rg;
	public static int[][] delta;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		delta = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
		graph = new char[N][N];
		for (int i=0; i<N; i++) {
			String row = br.readLine();
			for (int j=0; j<N; j++) {
				graph[i][j] = row.charAt(j);
			}
		}
		visited = new boolean[N][N];
		visited_rg = new boolean[N][N];
		int cnt = 0;
		int cnt_rg = 0;
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (!visited[i][j]) {
					bfs(i,j);
					cnt++;
				}
				if (!visited_rg[i][j]) {
					bfs_rg(i,j);
					cnt_rg++;
				}
			}
		}
		System.out.print(cnt+" "+cnt_rg);
	}
	public static void bfs(int i, int j) {
		char color = graph[i][j];
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[]{i, j});
		visited[i][j] = true;
		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int x = poll[0];
			int y = poll[1];
			for (int d=0; d<4; d++) {
				int nx = x + delta[d][0];
				int ny = y + delta[d][1];
				if (0<=nx && nx<N && 0<=ny && ny<N && !visited[nx][ny]) {
					if (graph[nx][ny] == color) {
						que.add(new int[]{nx,ny});
						visited[nx][ny] = true;
					}
				}
			}
		}
	}
	public static void bfs_rg(int i, int j) {
		char color = graph[i][j];
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[]{i, j});
		visited_rg[i][j] = true;
		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int x = poll[0];
			int y = poll[1];
			for (int d=0; d<4; d++) {
				int nx = x + delta[d][0];
				int ny = y + delta[d][1];
				if (0<=nx && nx<N && 0<=ny && ny<N && !visited_rg[nx][ny]) {
					if (color == 'R' || color == 'G') {
						if (graph[nx][ny] == 'B') {
							continue;
						}
						else {
							que.add(new int[]{nx,ny});
							visited_rg[nx][ny] = true;
						}
					}
					else {
						if (graph[nx][ny] == color) {
							que.add(new int[]{nx,ny});
							visited_rg[nx][ny] = true;
						}
					}
				}
			}
		}
	}
}
