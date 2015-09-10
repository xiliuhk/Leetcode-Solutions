public class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 0){
        	return 0; 
        }
        int left = 0, right = nums.length-1; 
        while (left < right){
        	int mid = left + (right - left)/2; 
        	if (nums[mid] > nums[right]){
        		left = mid + 1; 
        	}else if (nums[mid] < nums[right]){
        		right = mid; 
        	}else if (nums[left] == nums[mid]){
        		left ++; 
        		right --; 
        	}else{
        		right = mid; 
        	}
        }
        return nums[right]; 
    }
 //    public int findMin(int[] nums) {
 //    	if (nums.length == 0){
 //    		return 0; 
 //    	}
 //    	int left = 0, right = nums.length-1; 
 //    	while (left < right){
 //    		int mid = left + (right-left)/2; 
 //    		if (nums[mid] > nums[right]){
 //    			left = mid + 1; 
 //    		}else if (nums[mid] < nums[left]){
 //    			right = mid -1; 
 //    		}else if (nums[mid] < nums[left] && nums[mid] < nums[right]){
 //    			left++; 
 //    			right--; 
 //    		}
 //    	}
 //    	return nums[right];
	// }
}