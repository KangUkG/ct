package leetcode.palindrome_number;

public class Palindro {
	
	public static void main(String[] args) {
		String test = "12321";
		String[] test_arr = test.split("");
		int line = (int)Math.ceil(test_arr.length/2);
		boolean sisi = true;
		for(int i = 0; i < line+1;i++) {
			if(test_arr[i].equals(test_arr[test_arr.length-(i+1)])) {
				continue;
			}else {
				// false
				System.out.println(false);
				break;
			}
		}
		System.out.println(sisi);
		
	}

}
