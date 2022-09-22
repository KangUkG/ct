package backjoon.no_14425;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class String_set_ver2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n_cnt = Integer.parseInt(st.nextToken());
		int m_cnt = Integer.parseInt(st.nextToken());
		
		HashSet<String> string_set = new HashSet<String>();
		for(int i = 0; i < n_cnt;i++) {
			string_set.add(br.readLine());
		}
		int rst = 0;
		for(int i = 0; i < m_cnt;i++) {
			if(string_set.contains(br.readLine())) {
				rst++;
			}
		}
		bw.append(Integer.toString(rst));
		bw.flush();
	}

}
