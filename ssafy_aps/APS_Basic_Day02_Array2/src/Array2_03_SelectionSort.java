import java.util.Arrays;

public class Array2_03_SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 64, 25, 10, 22, 11 };
        int N = nums.length; // nums의 총 길이

        // 한싸이클 당 하나 정렬 되므로 N-1번 / 마지막은 정렬 필요 x
        for (int i = 0; i < N - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < N; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int tmp = nums[i];
                nums[i] = nums[minIdx];
                nums[minIdx] = tmp;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
