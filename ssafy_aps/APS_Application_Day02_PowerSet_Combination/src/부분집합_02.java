public class 부분집합_02 {
	public static String[] 재료 = { "오이", "우엉", "햄", "참치" };

	public static void main(String[] args) {
		int N = 4;

		// i는 모든 부분집합이야
		for (int i = 0; i < (1 << N); i++) {
			// 재료검사를 하자!!
//			System.out.println(i);
			for (int j = 0; j < N; j++) {
				if ((i & (1 << j)) > 0) {
//					System.out.print(재료[j]);
				}
			}
			System.out.println(":김밥");
		}

	}
}
