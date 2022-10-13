package backjoon.no_2562;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Maximum_number {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int rst = 0;
		int cnt = 0;
		for(int i = 0; i < 9;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num > rst) {
				rst = num; cnt = i;
			}
		}
		cnt++;
		bw.append(Integer.toString(rst)).append("\n").append(Integer.toString(cnt));
		bw.flush();
	}
}
