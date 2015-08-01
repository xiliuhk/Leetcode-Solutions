public class Solution {
    public int climbStairs(int n) {
        if ( n <= 2){
            return n; 
        }
        int l1 = 1, l2 = 2; 
        int ret = 0; 
        for (int i = n-2; i > 0; i--){
            ret = l1+l2; 
            l1 = l2; 
            l2 = ret;
        }
        return ret; 
    }
}