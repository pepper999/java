import java.util.Arrays;

public class Array2_04_CountingSort {
    public static void main(String[] args) {
        int[] arr = { 8, 8, 24, 12, 19, 3, 45, 60 };
        int N = arr.length;

        int K = -1;
        for (int i = 0; i < N; i++) {
            if (K < arr[i]) {
                K = arr[i];
            }
        }

        int[] count = new int[K + 1];
        for (int i = 0; i < N; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] sortArr = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            sortArr[--count[arr[i]]] = arr[i];
        }
        System.out.println(Arrays.toString(sortArr));
    }
}
