import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class boj3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[42];
		for (int i=0; i<10; i++) {
			arr[(Integer.parseInt(br.readLine()))%42] = 1;
		}
		int sum = 0;
		for (int i=0; i<42; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
