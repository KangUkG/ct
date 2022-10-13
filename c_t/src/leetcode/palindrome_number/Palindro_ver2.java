package leetcode.palindrome_number;

public class Palindro_ver2 {

	public static void main(String[] args) {
		
	}
	
	
	private static boolean isPalindrome(int x) {
        //optimizations
        if(x<0) return false;
        if(x<10) return true;
        if(x%10==0) return false;
        if(x<100&&x%11==0) return true;
        if(x<1000&&((x/100)*10+x%10)%11==0) return true;

        
        //actual logic
        int v=x%10;
        x=x/10;
        while(x-v>0)
        {
                v=v*10+x%10;
                x/=10;
        }
        if(v>x){v/=10;}
        return v==x?true:false;
	}
}
