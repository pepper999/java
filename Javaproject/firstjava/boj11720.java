import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class boj11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bw.readLine());
		String str = bw.readLine();
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += str.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
