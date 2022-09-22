package backjoon.no_14425;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class String_set_ver3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n_cnt = Integer.parseInt(st.nextToken());
		int m_cnt = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> string_map = new HashMap<String, Integer>(); 
		for(int i = 0; i < n_cnt;i++) {
			string_map.put(br.readLine(), 1);
		}
		int rst = 0;
		for(int i = 0; i < m_cnt;i++) {
			String ad = br.readLine();
			if(string_map.containsKey(ad)) {
				rst += string_map.get(ad);
			}
		}
		bw.append(Integer.toString(rst));
		bw.flush();
	}
}
