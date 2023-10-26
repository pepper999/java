import java.util.Arrays;

public class 백트래킹_03_순열3 {
    public static int[] nums;// 배열
    public static int N; // 원소수
    public static int[] result; // 결과저장
    public static boolean[] visited; // 해당 원소 사용 유무

    public static void main(String[] args) {
        nums = new int[] {0,1,2};
        N = nums.length;
        result = new int[N];
        visited = new boolean[N];
        perm(0);
    }

    // idx 현재 내가 판단하는 위치
    public static void perm(int idx) {
        if (idx == N) {
            System.out.println(Arrays.toString(result));
            return;
        }
        // 사용 할 수 있는 모든 원소 체크
        for (int i = 0; i < N; i++) {
            if (visited[i]) continue; // 이미 사용한 원소라면 쳐낸다
            result[idx] = nums[i]; // 해당 i번째 원소를 저장
            visited[i] = true; // i 번째 원소 사용 표시
            perm(idx+1);
            visited[i] = false; // 원상복구
        }
    }
}
