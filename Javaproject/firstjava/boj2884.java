import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class boj2884 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		if(A==0) A += 24;
		int C = ((A*60 + B) - 45)/60;
		int D = ((A*60 + B) - 45)%60;
		if(C==24) C -= 24;
		System.out.print(C + " " + D);
	}
}
