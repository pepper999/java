import java.util.Arrays;

public class Stack_04_함수호출 {
    public static void main(String[] args) {
        System.out.println("메인함수 실행");
        func1();
        System.out.println("메인함수 종료");
    }
    
    public static void func1() {
        int a = 10;
        String chk = "a";
        int[] nums = {1, 2, 3};
        System.out.println("함수1 실행");
        func2(a, chk, nums);
        System.out.println(a);
        System.out.println(Arrays.toString(nums));
        System.out.println("함수1 종료");
    }
    
    public static void func2(int a, String chk, int[] nums) {
        a = 20;
        chk = "b";
        nums[1] = 10;
        System.out.println("함수2 실행");
        System.out.println("함수2 종료");
    }
}
