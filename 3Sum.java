public class Solution {
     public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ret = new ArrayList<>(); 
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
                    if (nums[b] + nums[c] + nums[i] == 0){
                        ret.add(Arrays.asList(nums[i], nums[b], nums[c]));
                        b++; 
                        c--;
                        while (b<c && nums[b] ==nums[b-1]){
                            b++;
                        }
                        while (b<c && nums[c] == nums[c+1]){
                            c--;
                        }
                    }else if (nums[b]+nums[c]+nums[i] < 0){
                        b++;
                    }else{
                        c--; 
                    }
                }
                
            }
        }
        return ret; 
     }
}