public class Solution {
    public int rob(int[] nums) {
        int include = 0, exclude = 0; 
        for (int i = 0; i < nums.length; i++){
        	int in = include, ex = exclude; 
        	include = ex + nums[i]; 
        	exclude = Math.max(ex, in); 
        }
        return Math.max(include, exclude); 
    }
}