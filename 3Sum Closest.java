public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int ret = 0; 
        
        if (nums.length < 3){
            return ret; 
        }
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length-2; i++){
            if (i > 0 && nums[i-1] == nums[i]){
                continue; 
            }else{
                int b = i+1; 
                int c = nums.length-1; 
                
                while (b < c){
                    int diff = nums[b] + nums[c] + nums[i] - target; 
                    if (Math.abs(diff) < minDiff){
                        ret = diff + target; 
                        minDiff = Math.abs(diff);
                    }else if (diff < 0){
                        b++;
                        while (b+1 < c && nums[b+1] == nums[b]){
                            b++;
                        }
                            
                    }else{
                        c--;
                        while (b < c-1 && nums[c] == nums[c-1]){
                            c--;
                        }
                    }
                }
                
            }
        }
        return ret; 
    }
}