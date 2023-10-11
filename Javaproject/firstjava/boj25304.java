import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class boj25304 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int X = Integer.parseInt(str);
		str = br.readLine();
		int N = Integer.parseInt(str);
		for(int i = 0; i<N; i++) {
			str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			int price = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			X -= price*num;
		}
		if(X == 0) System.out.println("Yes");
		else System.out.println("No");
	}
}