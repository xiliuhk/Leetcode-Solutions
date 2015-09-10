public class Solution {
    public void rotate(int[] nums, int k) {
        int start = k % nums.length; 
        if (start == 0){
            return;
        }
        
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, start-1); 
        reverse(nums, start, nums.length-1); 
    }
    
    public void reverse(int[] nums, int left, int right){
        while (left < right){
            int tmp = nums[left]; 
            nums[left] = nums[right]; 
            nums[right] = tmp; 
            left++; 
            right--;
        }
    }
    
    
}