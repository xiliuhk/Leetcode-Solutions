public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false; 
        }
        return (x == reverse(x));
    }
    
    public int reverse(int x) {
        long result =0;
        while(x != 0)
        {
            result = (result*10) + (x%10);
            if(result > Integer.MAX_VALUE) return 0;
            if(result < Integer.MIN_VALUE) return 0;
            x = x/10;
        }
        return (int)result;
    }
}
