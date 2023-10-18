package boj;

import java.io.*;
import java.util.*;

public class boj7569 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[][] delta = {{1,0,0},{-1,0,0},{0,1,0},{0,-1,0},{0,0,1},{0,0,-1}};
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int[][][] graph = new int[H][N][M];
		Queue<int[]> que = new LinkedList<>();
		for (int h=0; h<H; h++) {
			for (int n=0; n<N; n++) {
				st = new StringTokenizer(br.readLine());
				for (int m=0; m<M; m++) {
					int now = Integer.parseInt(st.nextToken());
					graph[h][n][m] = now;
					if (now == 1) {
						que.add(new int[]{h,n,m});
					}
				}
			}
		}
		while (!que.isEmpty()) {
			int[] now = que.poll();
			int x = now[0];
			int y = now[1];
			int z = now[2];
			for (int i=0; i<6; i++) {
				int nx = x + delta[i][0];
				int ny = y + delta[i][1];
				int nz = z + delta[i][2];
				if (nx>=0 && nx<H && ny>=0 && ny<N && nz>=0 && nz<M && graph[nx][ny][nz] == 0) {
					que.add(new int[]{nx,ny,nz});
					graph[nx][ny][nz] = graph[x][y][z]+1;
				}
			}
		}
		int flag = 0;
		int rlt =0;
		for (int h=0; h<H; h++) {
			for (int n=0; n<N; n++) {
				for (int m=0; m<M; m++) {
					rlt = Math.max(rlt,  graph[h][n][m]);
					if (graph[h][n][m] == 0) {
						flag = 1;
					}
				}
			}
		}
		if (flag == 1) {
			System.out.print(-1);
		}
		else {
			System.out.print(rlt-1);
		}
	}
}