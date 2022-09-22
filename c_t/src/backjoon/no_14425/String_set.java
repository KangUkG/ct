package backjoon.no_14425;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class String_set {
	
	public static void main(String[] args) throws IOException {
		// N개의 문자열, 집합 S, M개의 문자열 S포함 몇개?
		// 첫째 줄 -> 문자열의 개수, 입력되는 문자열의 개수
		// N개 -> S포함 문자열, M개 검사 문자열 // 알파벳 소문자, 500이하, 중복문자열 X
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n_cnt = Integer.parseInt(st.nextToken());
		int m_cnt = Integer.parseInt(st.nextToken());
		
		String[] string_set = new String[n_cnt];
		for(int i = 0; i < n_cnt;i++) {
			string_set[i] = br.readLine();
		}
		int rst = 0;
		for(int i = 0; i < m_cnt;i++) {
			String input = br.readLine();
			for(int j = 0; j < n_cnt; j++) {
				if(string_set[j].equals(input)) {
					rst++;
				}
			}
		}
		bw.append(Integer.toString(rst));
		bw.flush();
	}
}
