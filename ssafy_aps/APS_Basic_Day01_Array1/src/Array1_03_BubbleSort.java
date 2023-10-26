import java.util.Arrays;

public class Array1_03_BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 24, 99999, 99, 31, 213124, 7, 35 };
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int num = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = num;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}