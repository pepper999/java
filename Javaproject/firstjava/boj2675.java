import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class boj2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int nums = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			for (int j=0; j<str.length(); j++) {
				for (int k=0; k<nums; k++) {
				System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}
}