package default_package;

public class Array06_빈도수구하기 {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 5, 7, 7, 9, 2, 8, 1, 1, 5, 3 };
        int[] cnt = new int[10];
        for (int n : arr) {
            cnt[n]++;
        }
        for (int i = 0; i < cnt.length; i++) {
            System.out.println(i + " : " + cnt[i] + "회");
        }
    }
}
