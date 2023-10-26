import java.util.Arrays;

public class Stack_09_피보나치 {
    public static int[] cnt = new int[50];
    public static void main(String[] args) {
        System.out.println(fibo(45));
        System.out.println(Arrays.toString(cnt));
        System.out.println(fibo2(45));
//        memo[0] = 0;
//        memo[1] = 1;
    }
    public static int fibo(int n) {
        // 기본파트 fibo(0) = 0 / fibo(1) = 1
//        if (n==0) return 0;
//        if (n==1) return 1;
        cnt[n]++;
        if (n<=1) return n;
        // 재귀파트
        return fibo(n-1)+fibo(n-2);
    }
    
    public static int[] memo = new int[50];
    static {
        memo[0] = 0;
        memo[1] = 1;
    }
    
    public static int fibo2(int n) {
        if (n>=2 && memo[n] == 0) {
            memo[n] = fibo2(n-1) + fibo2(n-2);
        }
        return memo[n];
    }
}
