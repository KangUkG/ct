package backjoon.no_1764;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Off_brand_name {
	public static void main(String[] args) throws IOException {
		// 듣지 못한 - N 명
		// 보지 못한 - M 명
		// N M
		// n , m 중복 명단 구하기 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n_cnt = Integer.parseInt(st.nextToken());
		int m_cnt = Integer.parseInt(st.nextToken());

		Map<String, Boolean> no_listen = new HashMap<String, Boolean>(); 
		for(int i = 0; i < n_cnt;i++) {
			no_listen.put(br.readLine(), true);
		}
		List<String> rst_list = new ArrayList<String>(); 
		for(int i = 0; i < m_cnt;i++) {
			String rst = br.readLine();
			if(no_listen.get(rst) != null) {
				rst_list.add(rst);
			}
		}
		
		System.out.println(rst_list.size());
		for(String a: rst_list) {
			System.out.println(a);
		}
//		rst_list.sort(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				int repeat_cnt = o1.length() <= o2.length() ? o1.length() : o2.length();
//				for(int i = 0; i < repeat_cnt;i++) {
//					if(o1.charAt(i) > o2.charAt(i)) return -1;
//				}
//				if(o1.length() > o2.length()) return -1;
//				return 1;
//			}
//		});
		ArrayList<String> test_b = new ArrayList<>(Arrays.asList("abca", "abcaa","aabbc", "abcaaa", "abc"));
		test_b.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int repeat_cnt = o1.length() <= o2.length() ? o1.length() : o2.length();
				System.out.println(repeat_cnt);
				for(int i = 0; i < repeat_cnt;i++) {
					System.out.println(o1.charAt(i) + " vs " + o2.charAt(i));
					if(o1.charAt(i) > o2.charAt(i)) return 1;
				}
				if(o1.length() > o2.length()) return 1;
				return -1;
			}
		});
		System.out.println(test_b.toString());
		
//		ArrayList<Integer> test_b = new ArrayList<>(Arrays.asList(3, 5, 2, 1));
//		System.out.println(test_b.toString());
//		test_b.sort(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				System.out.println(o1 + " vs " + o2 + " :::: " + (o1-o2));
//				return o1 - o2;
//			}
//		});
	
		
//		bw.append(Integer.toString(rst_list.size())).append("\n");
//		for(int i = 0; i < rst_list.size();i++) {
//			bw.append(rst_list.get(i));
//			if(i != i - rst_list.size()-1) {
//				bw.append("\n");
//			}
//		}
//		bw.flush();
		
		
		
		
		
		
	}

}
