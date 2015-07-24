public class Solution {
    // //Greedy, maximize maxDist. O(n)
    // public int jump(int[] nums) {
    //     int curMax = 0, nJumps = 0, i = 0; 
    //     while (curMax < nums.length - 1){
    //         int lastMax = curMax; 
    //         for (; i <= lastMax; i++){
    //             curMax = Math.max(curMax, i+nums[i]);
    //         }
    //         nJumps++; 
    //         if (lastMax == curMax){
    //             return -1; 
    //         }
    //     }
    //     return nJumps;
    // }
	public int jump(int[] nums) {
    	int step_count = 0;
		int last_jump_max = 0;
		int current_jump_max = 0;
		for(int i=0; i<nums.length-1; i++) {
		    current_jump_max = Math.max(current_jump_max, i+A[i]);
		    if( i == last_jump_max ) {
		        step_count++;
		        last_jump_max = current_jump_max;
		    } 
		}
		return step_count;
    }

}
