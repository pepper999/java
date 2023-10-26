package exception03_finally;

public class FinallyTest01 {
//	try {
//	  // 예외가 발생할 가능성이 있는 코드
//	}catch(Exception e) {
//	  // 예외 처리 코드
//	}finally {
//	  // 예외 상관없이 항상 수행해야 하는 코드
//	}

    // 1. 정상실행 - 1,2,4,5
    // 2. 예외 발생 시 - 1,3,4,5
    // 3. 예외 미 처리 - 1,4,에러
    // 4. 정상 실행 시 try 구문에 return이 들어가면 - 1,2,4
    // 5. 예외 발생 시 catch 구문에 return이 들어가면 - 1,3,4
	public static void main(String[] args) {
		int num = 0;
		int[] nums = {1};
		try {
			System.out.println("1");
			int i = 1 / num; 
//			nums[2] = 10;
			System.out.println("2");
//			return;
		} catch (ArithmeticException e) {
			System.out.println("3");
			return;
		} finally {
			System.out.println("4");
		}
		System.out.println("5");
	}
}
