import java.util.Scanner;

public class SWEA_1486_장훈이의높은선반_3 {
	static int N, B, ans; // N: 점원의수 1~20 / B : 선반의높이 1 ~ 모든 점원키의합
	static int[] H; // 점원들의 키 배열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			B = sc.nextInt();
			H = new int[N];
			for (int i = 0; i < N; i++) {
				H[i] = sc.nextInt();
			} // 입력 끝
//			-----------------------------------------------
//			ans = Integer.MAX_VALUE; 
			ans = 987654321;
			powerset(0, 0);
			System.out.println("#" + tc + " " + (ans - B));
		} // tc

	}// main
	//sum : 중간 합
	public static void powerset(int idx, int sum) {
		if(sum > ans) return; //이미 내가 최고의 값을 가지고 있는데 중간결과가 나를 벗어나? 응 안해~
		
		// 기저부분
		if (idx == N) {
			if (sum >= B)
				ans = Math.min(ans, sum);
			return;

		}
		// 재귀부분
		powerset(idx + 1, sum+H[idx]);
		powerset(idx + 1, sum);

	}

}
