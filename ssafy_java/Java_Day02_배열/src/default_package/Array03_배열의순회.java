package default_package;

import java.util.Arrays;

public class Array03_배열의순회 {
    public static void main(String[] args) {
        int[] nums = { 45, 9, 3, 7, 16, 25 };

        // 반복문을 통한 순회
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // for-each
        // for (자료형 변수명 : 반복 할 수 있는 것) {}
        for (int n : nums) {
            System.out.println(n);
            // x *= 2 // 읽기만 가능하기에 이러한 처리는 불가능
        }

        // 배열 안의 값을 바로 보는 방법
        System.out.println(Arrays.toString(nums));

    }
}
