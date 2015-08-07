public class Solution {
    //If we want to insert an element which is a dup, we can only insert it after the newly inserted elements from last step.
    public List<List<Integer>> subsetsWithDup(int[] nums){
        Arrays.sort(nums); 
        List<List<Integer>> ret = new ArrayList<List<Integer>>(); 
        //empty set
        ret.add(new ArrayList<Integer>()); 
        
        int len = 0, start = 0; 
        
        for (int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i-1] == nums[i]){
                start = len; 
            }else{
                start = 0; 
            }
            len = ret.size(); 
            for (int j = start; j < len; j++){
                ret.add(new ArrayList<Integer>(ret.get(j))); 
                ret.get(ret.size()-1).add(nums[i]); 
            }
        }
        return ret; 
        
    }
}