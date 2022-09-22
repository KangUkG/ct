package backjoon.no_1620;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class DasomLee_pokemon {

	public static void main(String[] args) throws IOException {
		// 개수 N / 문제 M ( 100,000 >= N, M >= 1)
		// capitalize, 영어, / 일부는 마지막 대문자 / 2 ~ 20 
		// 숫자 or 문자에 맞는 답 출력 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n_cnt = Integer.parseInt(st.nextToken());
		int m_cnt = Integer.parseInt(st.nextToken());
		Map<String, Integer> poke_dict = new HashMap<String, Integer>();
		for(int i = 0; i < n_cnt;i++) {
			poke_dict.put(br.readLine(), i+1);
		}
		for(int i = 0; i < m_cnt;i++) {
			String question = br.readLine();
		}
		System.out.println(poke_dict.get("Bulbasaur"));
		System.out.println(poke_dict.get("bubu"));
		
	}
}
