
public class Array1_01_배열순회 {
    public static void main(String[] args) {

        int[] nums = { 0, 1, 2, 3, 4, 5 };

        // 1. 정방향 순회
        // 1-1. for
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        // 1-2. for each
        for (int i : nums) {
            System.out.println(i);
        }

        // 2. 역방향 순회
        // 2-1. 마지막 인덱스부터 0까지 거꾸로 반복문 순회
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
        // 2-2. 인덱스를 직접 조정하여 순회
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            System.out.println(nums[N - 1 - i]);
        }

        // 3. 어느 지점 부터 양 옆으로 퍼져 나가며 순회 - while 문 이용
        int st = 3; // 시작 포인트
        int i = 1; // 증가 포인트
        while (0 <= st - i || st + i < N) {
            if (i == 1) {
                System.out.println(nums[st]);
            }
            if (0 <= st - i) {
                System.out.println(nums[st - i]);
            }
            if (st + i < N) {
                System.out.println(nums[st + i]);
            }
            i++;
        }
    }
}
