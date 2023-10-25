package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2206 {
	public static int[][] graph; 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		graph = new int[N][M];
		for (int i=0; i<N; i++) {
			String row = br.readLine();
			for (int j=0; j<M; j++) {
				graph[i][j] = Character.getNumericValue(row.charAt(j));
			}
		}
		System.out.print(bfs(N,M));
	}
	public static int bfs(int N, int M) {
		int[][] delta = {{1,0},{-1,0},{0,1},{0,-1}};
		Queue<int[]> que = new LinkedList<>();
		int[][][] visited = new int[N][M][2];
		visited[0][0][0] = 1;
		que.add(new int[]{0,0,0});
		while (!que.isEmpty()) {
			int[] now = que.poll();
			int x = now[0];
			int y = now[1];
			int breaks = now[2];
			if (x==N-1 && y==M-1) {
				return visited[x][y][breaks];
			}
			for (int i=0; i<4; i++) {
				int nx = x + delta[i][0];
				int ny = y + delta[i][1];
				if (nx>=0 && nx<N && ny>=0 && ny<M) {
					if (graph[nx][ny]==1 && breaks==0) {
						visited[nx][ny][1] = visited[x][y][0] + 1;
						que.add(new int[]{nx,ny,1});
					} 
					else if (graph[nx][ny]==0 && visited[nx][ny][breaks]==0) {
						visited[nx][ny][breaks] = visited[x][y][breaks] + 1;
						que.add(new int[]{nx, ny, breaks});
					}
				}
			}
		}
		return -1;
	}
}
