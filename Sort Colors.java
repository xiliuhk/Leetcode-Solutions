public class Solution {
    public void sortColors(int[] nums) {
        int red = 0, blue = nums.length-1; 
        int i = 0; 
        while (i <= blue && i <= nums.length){
            if (nums[i] == 0 && i > red){
                swap(nums, i, red); 
                red++; 
            }else if (nums[i] == 2 && i < blue){
                swap(nums, i, blue);
                blue--; 
            }else{
                i++;
            }
        }
    }
    public void swap(int[] nums, int a, int b){
        int tmp = nums[a]; 
        nums[a] = nums[b]; 
        nums[b] = tmp; 
    }
}