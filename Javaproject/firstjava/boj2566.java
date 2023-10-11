import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class boj2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int temp_max=0;
		int x=0, y=0;
		for (int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j=0; j<9; j++) {
				int num = Integer.parseInt(st.nextToken());
				if(num>temp_max) {
					temp_max = num;
					x = i;
					y = j;
				}
			}
		}
		System.out.println(temp_max);
		System.out.println((x+1)+" "+(y+1));
	}
}
