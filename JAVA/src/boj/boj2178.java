package boj;

import java.io.*;
import java.util.*;

public class boj2178 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[][] delta = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] graph = new int[N][M];
		int[][] visited = new int[N][M];
		for (int i=0; i<N; i++) {
			String row = br.readLine();
			for (int j=0; j<M; j++) {
				graph[i][j] = Character.getNumericValue(row.charAt(j));
			}
		}
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[]{0,0});
		visited[0][0] = 1;
		while (!que.isEmpty()) {
			int[] now = que.poll();
			int x = now[0];
			int y = now[1];
			if (x==N-1 && y==M-1) {
				break;
			}
			for (int i=0; i<4; i++) {
				int nx = x+delta[i][0];
				int ny = y+delta[i][1];
				if (nx>=0 && nx<N && ny>=0 && ny<M && visited[nx][ny]==0 && graph[nx][ny]==1) {
					que.add(new int[]{nx,ny});
					visited[nx][ny] = visited[x][y] +1;
				}
			}
		}
		System.out.print(visited[N-1][M-1]);
	}
}

