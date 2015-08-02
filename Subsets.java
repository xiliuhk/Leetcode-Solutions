public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>>ret = new ArrayList<List<Integer>>(); 
		ret.add(new ArrayList<Integer>()); 
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++){
			int len = ret.size(); 
			for (int j = 0; j < len; j++){
				ret.add(new ArrayList<Integer>(ret.get(j)); 
				ret.get(ret.size()-1).add(nums[i]); 
			}
		}
		return ret; 
	}
}