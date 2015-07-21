public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0){
            return 0;
        }
        int cnt = 0; 
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[i-cnt] = nums[i];
            }else{
                cnt++;
            }
        }
        return nums.length - cnt; 
    }
}