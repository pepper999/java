package practice;

import java.util.Scanner;

public class SpiderWeb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int[] dr = { 0, 1, 1, 1, 0, -1, -1, -1 };
        int[] dc = { 1, 1, 0, -1, -1, -1, 0, 1 };
        
        int max = 0;
        int row = -1;
        int col = -1;
        for (int x = 0; x < N; x++) {
        	for (int y = 0; y < N; y++) {
                int cnt = 1;
                for (int d = 0; d < 8; d++) {
        	        int bg = arr[x][y];
        	        int r = x + dr[d];
        	        int c = y + dc[d];        	        
        	        while (r >= 0 && r < N && c >= 0 && c < N) {
        	        	if (arr[r][c] == 1 && bg == 1) break;
        	        	else if (arr[r][c] == 0) cnt++;
        	        	bg = arr[r][c];
        	        	r += dr[d];
        	        	c += dc[d];
        	        }
                }
                if (max < cnt) {
                	max = cnt;
                	row = x;
                	col = y;
    			}
        	}
        }
        
        System.out.println(max);
        System.out.printf("%d,%d", row, col);
    }

}