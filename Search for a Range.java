public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0){
        	return new int[]{-1, -1};
        }
        int left = 0, right = nums.length-1, mid = 0; 
        while (left <= right){
        	mid = left + (right - left)/2; 
        	if (nums[mid] == target){
        		return getRange(nums, mid); 
        	}
        	if (nums[mid] < target){
        		left = mid + 1; 
        	}else{
        		right = mid - 1; 
        	}
        }
        return new int[]{-1, -1};
    }
    public int[] getRange(int[]nums, int mid){
    	int left = mid, right = mid; 
    	while (left >= 0 && nums[left] == nums[mid]){
    		left--; 
    	}
    	while (right < nums.length && nums[right] == nums[mid]){
    		right++; 
    	}
    	return new int[]{left+1, right-1};
    }
}