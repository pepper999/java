package boj;

import java.io.*;
import java.util.*;

public class boj2630 {
	public static int[][] paper;
	public static int white;
	public static int blue;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		paper = new int[N][N];
		StringTokenizer st;
		white = 0;
		blue = 0;
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<N; j++) {
			paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		partition(0,0,N);
		System.out.println(white);
		System.out.println(blue);
	}
	public static void partition(int row, int col, int size) {
		int color = paper[row][col];
		for (int i=row; i<row+size; i++) {
			for (int j=col; j<col+size; j++) {
				if (paper[i][j] != color) {
					size/=2;
					partition(row, col, size);
					partition(row+size, col, size);
					partition(row, col+size, size);
					partition(row+size, col+size, size);
					return;
				}
			}
		}
		if (color==0) {
			white++;
		}
		else {
			blue++;
		}
	}	
}
