
public class Array1_02_Gravity {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 2, 0, 0, 6, 0, 7, 0 };
        int N = arr.length;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int cnt = N - i;
            for (int k : arr) {
                if (arr[i] <= k) {
                    cnt--;
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}
