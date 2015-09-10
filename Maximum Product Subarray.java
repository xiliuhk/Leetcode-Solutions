public class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0){
            return 0; 
        }    
        int max = nums[0], min = nums[0], ret = nums[0]; 
        
        for (int i = 1; i < nums.length; i++){
            int max_tmp = max; 
            max = Math.max(nums[i], Math.max(nums[i]*max_tmp, nums[i]*min)); 
            min = Math.min(nums[i], Math.min(nums[i]*max_tmp, nums[i]*min)); 
            ret = Math.max(max, ret); 
        }
        return ret; 
    }
}