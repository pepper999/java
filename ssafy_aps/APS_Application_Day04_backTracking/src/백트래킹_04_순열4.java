import java.util.Arrays;

public class 백트래킹_04_순열4 {
    public static int[] nums;// 배열
    public static int N; // 원소수
    public static int[] result; // 결과저장

    public static void main(String[] args) {
        nums = new int[] {0,1,2};
        N = nums.length;
        result = new int[N];
        perm(0, 0);
    }

    // idx 현재 내가 판단하는 위치
    public static void perm(int idx, int visited) {
        if (idx == N) { // if (visited == (1<<N)-1)
            System.out.println(Arrays.toString(result));
            return;
        }
        // 사용 할 수 있는 모든 원소 체크
        for (int i = 0; i < N; i++) {
            if ((visited & (1 << i)) > 0) continue; // 이미 사용한 원소라면 쳐낸다
            result[idx] = nums[i]; // 결과 저장
            perm(idx+1, visited | (1 << i));
        }
    }
}
