public class Solution {
    public int[] singleNumber(int[] nums) {
        int diff = 0; 
        for (int n : nums){
            diff ^= n; 
        }
        diff &= -diff; 
        int[] ret = {0, 0}; 
        for (int n : nums){
            if ( (n & diff) == 0){
                ret[0] ^= n;
            }else{
                ret[1] ^= n;
            }
        }
        return ret; 
    }
}