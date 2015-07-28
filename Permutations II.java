public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
    	List<List<Integer>> ret = new ArrayList<>(); 
		permute(nums, ret, 0);
		return ret; 
	}
	public void permute(int[] nums, List<List<Integer>> ret, int i){
		if (i >= nums.length){
			List<Integer> cur = new ArrayList<Integer>();
			for (int num : nums){
				cur.add(num);
			}
			ret.add(cur);
		}else{
			for (int j = i; j < nums.length; j++){
				if (i == start || !containsDup(nums, i, j)){
					swap(nums, i, j);
					permute(nums, ret, i+1);
					swap(nums, i, j);	
				}
			}
		}
	}
	private void swap(int[] nums, int a, int b){
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
	private boolean containsDup(int[] nums, int start, int end){
		for (int i = start; i < end; i++){
			if (nums[i] == nums[end]){
				return true; 
			}
		}
		return false;
	}
}