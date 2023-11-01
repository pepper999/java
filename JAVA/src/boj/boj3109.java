package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj3109 {
	public static char[][] map;
	public static int[][] delta;
	public static int R;
	public static int C;
	public static int cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		delta = new int[][] {{-1,1},{0,1},{1,1}};
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		cnt = 0;
		for (int i=0; i<R; i++) {
			String row = br.readLine();
			for (int j=0; j<C; j++) {
				map[i][j] = row.charAt(j);
			}
		}
		for (int i=0; i<R; i++) {
			dfs(i,0);
		}
		System.out.print(cnt);
	}
	public static boolean dfs(int x, int y) {
		if (y==C-1) {
			cnt++;
			return true;
		}
		for (int d=0; d<3; d++) {
			int nx = x+delta[d][0];
			int ny = y+delta[d][1];
			if (nx>=0 && nx<R && ny>=0 && ny<C && map[nx][ny]=='.') {
				map[nx][ny]='X';
				if (dfs(nx,ny)) {
					return true;
				};
			}
		}
		return false;
	}
}
