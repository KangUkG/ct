package backjoon.no_14425;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class String_set {
	
	public static void main(String[] args) throws IOException {
		// N���� ���ڿ�, ���� S, M���� ���ڿ� S���� �?
		// ù° �� -> ���ڿ��� ����, �ԷµǴ� ���ڿ��� ����
		// N�� -> S���� ���ڿ�, M�� �˻� ���ڿ� // ���ĺ� �ҹ���, 500����, �ߺ����ڿ� X
		
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
