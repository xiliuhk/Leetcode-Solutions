public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i+1);
        }
        int[] ret = new int[2]; 
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i]) && i+1!= map.get(target - nums[i])){
                ret[0] = i+1;
                ret[1] = map.get(target - nums[i]);
                break;  
            }
        }
        return ret; 
    }
}