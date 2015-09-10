public class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 0){
            return -1; 
        }
        int majority = nums[0]; 
        int cnt = 0; 
        for (int i = 0; i < nums.length; i++){
            if (cnt == 0){
                majority = nums[i]; 
                cnt ++; 
            }else if (nums[i] == majority){
                cnt ++; 
            }else {
                cnt --; 
            }
        }
        return majority; 
    }
}