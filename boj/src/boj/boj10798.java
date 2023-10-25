package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class boj10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[][] chr = new char[5][15];
		for (int i=0; i<5; i++) {
			String str = br.readLine();
			for (int j=0; j<str.length(); j++) {
				chr[i][j] = str.charAt(j);
			}
		}
		for (int i=0; i<15; i++) {
			for (int j=0; j<5; j++) {
				if (chr[j][i] != '\u0000') {
					bw.write(chr[j][i]);					
				}
			}
		}
		
		bw.flush();
        bw.close();
	}
}
