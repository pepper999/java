
public class 분할정복_02_거듭제곱_재귀 {
	public static void main(String[] args) {
		int C = 2;
		int N = 10;

		System.out.println(pow(C, N));

	}

	public static int pow(int C, int N) {
		// 기저조건
		if (N == 1)
			return C;
		// 재귀조건
		// 짝수일때
		if (N % 2 == 0) {
			return pow(C, N / 2) * pow(C, N / 2);
		}
		// 홀수일때
		else {
			return pow(C, (N - 1) / 2) * pow(C, (N - 1) / 2) * C;
		}
	}
	
	
//	public static int pow2(int C, int N) {
//		//위에 식은 사실 너무 비효율적이다. 
//		//똑같은 연산을 또 하지 않도록 코드를 수정해보자.
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
