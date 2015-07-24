public class Solution {
    public List<List<Integer>> permute(int[] nums) {
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
				swap(nums, i, j);
				permute(nums, ret, i+1);
				swap(nums, i, j);
			}
		}
	}
	private void swap(int[] nums, int a, int b){
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
	
		
}