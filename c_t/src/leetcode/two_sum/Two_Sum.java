package leetcode.two_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Two_Sum {

	
	// 2진검색 후 찾으려 했으나, 동일값 더하기 하면 안되고, 원하는 결과값ㅇ에 따른 후처리로 인해
	// 코드가 지저분해지는 문제가 생겼다. 다른 방법을 원하는 듯싶다.
	
	public static void main(String[] args) {
		int[] tes = new int[] {3, 2, 4};
		int target = 6;
		
		int[] rst = twoSum(tes, target);
//		System.out.println(rst.length);
		for(int i = 0; i < rst.length;i++) {
			System.out.println(rst[i] + " ----------");
		}

	}
	
	private static int[] twoSum(int[] nums, int target) {
		int[] rs_arr;
		// 정렬
		int[] tes2 = Arrays.stream(nums).sorted().toArray();
		for(int i = 0; i < tes2.length;i++) {
			System.out.print(tes2[i] + " ");
		}
		System.out.println();
		// 숫자 검색
		for(int i = 0; i < tes2.length;i++) {
			int find_num = target - tes2[i];
			System.out.println(find_num);
			int rst = binary_search(tes2, find_num);
			if(rst != -1) {
				
				binary_search(nums, tes2[i]);
				binary_search(nums, rst);
				
				rs_arr = new int[1];
				return rs_arr;
			}
		}
		return new int[1];
	}
	
	private static int binary_search(int[] arr, int target) {
		int guess;
		int min = 0;
		int max = arr.length - 1;

		while(min <= max) {
			
			guess = (int)Math.floor((min+max)/2);	
			if(arr[guess] == target) {
				return guess;
			}else if(arr[guess] > target) {
				max = guess - 1;
			}else {
				min = guess + 1;
			}
		}
		return -1;
	}
	
}
