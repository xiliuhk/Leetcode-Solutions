public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<List<Integer>>ret = new ArrayList<List<Integer>>();
    	if (candidates.length == 0){
    		return ret; 
    	}
    	Arrays.sort(candidates);
    	List<Integer> cur = new ArrayList<Integer>();
    	dfs(candidates, target, cur, ret, i);
    	return ret;
    }
    public void dfs(int[] nums, int target, List<Integer> cur, List<List<Integer>> ret, int i){
    	if ( target < 0 ){
    		return;
    	}else if ( target == 0){
    		ret.add(new ArrayList<Integer>(cur));
    	}else{
    		while ( i < nums.length && target - nums[i] >= 0){
    			cur.add(candidates[i]);
    			dfs(candidates, target - nums[i], cur, ret, i);
    			cur.remove(cur.size() - 1); 
    			i++;
    		}
    	}
    }
}