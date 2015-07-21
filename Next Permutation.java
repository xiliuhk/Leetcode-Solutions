public class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2; 
        while (i >= 0 && nums[i] >= nums[i+1]){
            i--; 
        }
        if (i >= 0){
            int j = i+1; 
            while (j < nums.length && nums[j] > nums[i]){
                j++; 
            }
            swap(nums, i, j-1);
        }
        reverse(nums, i+1, nums.length-1);
    }
    public void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b]; 
        nums[b] = tmp;
    }
    public void reverse(int[] nums, int start, int end){
        while (start < end){
            swap(nums, start, end);
            start++;
            end--; 
        }
    }
}