public class Solution {
    public int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0){
        	return 0;
        }
        int m = grid.length, n = grid[0].length; 
        int[] dp = new int[n];
        for (int j = 0; j < n; j++){
        	dp[j] = Integer.MAX_VALUE; 
        }
        dp[0] = 0; 

        for (int i = 0; i < m; i++){
        	for (int j = 0; j < n; j++){
        		if (j == 0){
        			dp[j] = dp[j] + grid[i][j];
        			
        		}else{
        		    dp[j] = Math.min(dp[j-1], dp[j]) + grid[i][j];
        		}
        	}
        }
        return dp[n-1];
    }
}