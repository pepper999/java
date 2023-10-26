package exception01_try_catch;

public class ExceptionTest03 {
	public static void main(String[] args) {
		int[] nums = { 10 };

		try {
			System.out.println(nums[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); // 인덱스 에러
		} catch (ArithmeticException e) {
			e.printStackTrace(); // 수학적 예외상황
		}
		System.out.println("프로그램을 종료합니다.");
		
		try {
			System.out.println(nums[2]);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			//e가 instanceof 를 통해 어떤 예외인지 처리해야될 수도 있음.
			e.printStackTrace();
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
