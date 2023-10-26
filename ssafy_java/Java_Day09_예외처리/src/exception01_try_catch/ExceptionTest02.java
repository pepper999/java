package exception01_try_catch;

public class ExceptionTest02 {
    public static void main(String[] args) {
        int[] nums = {10};
        try {
            System.out.println(nums[4]);
            int n = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception 발생");
        }
        System.out.println("프로그램 종료");
    }
}
