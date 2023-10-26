package practice;

import java.util.Scanner;

public class SpiderWeb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
        int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };

        int N = sc.nextInt();
        int[][] map = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        
        int ans = 0;
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int count = (map[i][j] == 0) ? 1 : 0;
                for (int k = 0; k < 8; k++) {
                    int obsCount = (map[i][j] == 0) ? 0 : 1;
                    boolean flag = true;
                    int l = 1;
                    while (flag) {
                        int nx = i + dx[k] * l;
                        int ny = j + dy[k] * l;
                        if (0 <= nx && nx < N && 0 <= ny && ny < N) {
                            if (map[nx][ny] == 0) {
                                count++;
                                obsCount = 0;
                            }
                            else obsCount++;
                            if (obsCount == 2) flag = false;
                        } else flag = false;
                        l++;
                    }

                }
                if (count > ans) {
                    ans = count;
                    x = i;
                    y = j;
                }
                
            }
        }
        System.out.println(ans);
        System.out.println(x + "," + y);

        sc.close();
    }

}