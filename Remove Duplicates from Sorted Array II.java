public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2){
        	return nums.length; 
        }
        int i = 1; 
        int cnt = 1;
        for (int j = 1; j < nums.length; j++){
        	if (nums[j] != nums[i]){
        		cnt = 1; 
        		nums[i++] = nums[j];
        	}else if (cnt > 0){
        		cnt++;  
        		nums[i++] = nums[j];
        	}
        	
        } 
        return i; 
	}
}