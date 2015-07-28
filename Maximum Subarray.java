public class Solution {
    // Method 1. O(1) space O(n) DP 
    public int maxSubArray(int[] nums) {
  		if (nums.length == 0){
  			return 0;
  		}
  		int prev = 0, cur = 0, max = 0; 
  		for (int i = 1; i < nums.length; i++){
  			if (prev <= 0){
  				cur = nums[i];
  			}else{
  				cur = prev + nums[i];
  			}
  			max = Math.max(max, cur);
  			prev = cur; 

  		}
  		return max; 
  	}
  	// Method 2. Divide and conquer 
    public int maxSubArray(int[] nums) {
    	if (nums.length == 0){
  			return 0;
  		}
  		return maxSubArray(nums, 0, nums.length-1);
    }
    public int maxSubArray(int[] nums, int start, int end){
   		if (start >= end){
   			return nums[start];
   		}
   		int mid = start + (end - start)/2;
  		int left = 	maxSubArray(nums, start, mid);
  		int right = maxSubArray(nums, mid+1, end);
  		int leftMax = nums[mid]; 
  		int rightMax = nums[mid+1]; 
  		int tmp = 0; 
  		for (int i = mid; i >= start; i--){
  			tmp += nums[i];
  			leftMax = Math.max(leftMax, tmp);
  		}
  		tmp = 0; 
  		for (int i = mid+1; i <= end; i++){
  			tmp += nums[i];
  			rightMax = Math.max(rightMax, tmp);
  		}
  		return Math.max(leftMax+rightMax, Math.max(left, right));
    }

}