package default_package;

public class Array08_2차원배열_실습문제 {
    public static void main(String[] args) {
        int[][] grid = { { 2, 3, 1, 4, 7 }, { 8, 13, 3, 33, 1 }, { 7, 4, 5, 80, 12 }, { 17, 9, 11, 5, 4 },
                { 4, 5, 91, 27, 7 } };

        // 행 우선순회
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] % 3 == 0) {
                    sum += grid[i][j];
                    cnt++;
                }
            }
        }
        System.out.printf("개수 : %d, 총합 : %d", cnt, sum);
    }
}
