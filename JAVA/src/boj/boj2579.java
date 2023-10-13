package boj;

import java.io.*;
import java.util.Arrays;

public class boj2579 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	 	int[] dp = new int[N+1];
	 	int[] arr = new int[N];
	 	for (int i=0; i<N; i++) {
	 		arr[i] = Integer.parseInt(br.readLine());
	 	}
	 	if (N < 3) {
	 		System.out.print(Arrays.stream(arr).sum());
	 	}
        else {
            dp[1] = arr[0];
    	 	dp[2] = arr[1] + arr[0];
	     	for (int i=3; i<N+1; i++) {
	 	    	dp[i] = Math.max(dp[i-2], dp[i-3]+arr[i-2])+arr[i-1];
	     	}
	     	System.out.print(dp[N]);
        }
	}
}
