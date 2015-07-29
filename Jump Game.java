public class Solution {
    public boolean canJump(int[] nums) {
        int maxLen = 0; 
        for (int i = 0; i < nums.length; i++){
            if (i > maxLen || maxLen >= nums.length-1){
                break; 
            }
            maxLen = Math.max(maxLen, i+nums[i]);
        }
        return maxLen >= nums.length-1;
    }
}