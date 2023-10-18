package boj;

import java.io.*;
import java.util.*;

public class boj7562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int[][] delta = {{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};
		int T = Integer.parseInt(br.readLine());
		for (int t=0; t<T; t++) {
			int I = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int x_target = Integer.parseInt(st.nextToken());
			int y_target = Integer.parseInt(st.nextToken());
			int[][] visited = new int[I][I];
			visited[i][j] = 1;
			Queue<int[]> que = new LinkedList<>();
			que.add(new int[]{i,j});
			while (!que.isEmpty()) {
				int[] now = que.poll();
				int x = now[0];
				int y = now[1];
				if (x==x_target && y==y_target) {
					sb.append(visited[x_target][y_target]-1).append('\n');
					break;
				}
				for (int d=0; d<8; d++) {
					int nx = x + delta[d][0];
					int ny = y + delta[d][1];
					if (nx>=0 && nx<I && ny>=0 && ny<I && visited[nx][ny]==0) {
						que.add(new int[]{nx, ny});
						visited[nx][ny] = visited[x][y] + 1;
					}
				}
			}
		}
		System.out.print(sb);
	}
}
