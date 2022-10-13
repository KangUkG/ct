package leetcode.two_sum;

import java.util.HashMap;

public class Two_sum_ver2 {
	
	// 다른 답안 봤다
	
	public static void main(String[] args) {
		int[] nums = new int[] {-5, 2, 2, 7, 11, 15};
		int target = 4;
		
		int[] test = twoSum(nums, target);
		for(int i = 0 ; i < test.length;i++) {
			System.out.println(test[i]);
		}
		
	}
	
	private static int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> checkc = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length;i++) {
			if(checkc.containsKey(nums[i])) {
				int left = checkc.get(nums[i]);
				return new int[] {left, i};
			}else {
				checkc.put(target - nums[i], i);
			}
		}
		return new int[2];
		
	}

}


