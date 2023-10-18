package boj;

import java.io.*;
import java.util.*;

public class boj2667 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[][] graph = new int[N][N];
		boolean[][] visited = new boolean[N][N];
		ArrayList<Integer> rlt = new ArrayList<>();
		for (int i=0; i<N; i++) {
			String row = br.readLine();
			for (int j=0; j<N; j++) {
				graph[i][j] = Character.getNumericValue(row.charAt(j));
			}
		}
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		Queue<int[]> que = new LinkedList<>();
		int danginum = 0;
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (graph[i][j] == 1 && !visited[i][j]) {
					danginum++;
					que.add(new int[]{i,j});
					visited[i][j] = true;
					int cnt = 1;
					while (!que.isEmpty()) {
						int[] now = que.poll();
						int x = now[0];
						int y = now[1];
						for (int k=0; k<4; k++) {
							int nx = x+dx[k];
							int ny = y+dy[k];
							if (nx>=0 && nx<N && ny>=0 && ny<N) {
								if (graph[nx][ny] == 1 && !visited[nx][ny]) {
									que.add(new int[]{nx,ny});
									visited[nx][ny] = true;
									cnt++;
								}
							}
						}
					}
					rlt.add(cnt);
				}
			}
		}
		Collections.sort(rlt);
		sb.append(danginum).append('\n');
		for (int i=0; i<danginum; i++) {
			sb.append(rlt.get(i)).append('\n');
		}
		System.out.println(sb);
	}
}
