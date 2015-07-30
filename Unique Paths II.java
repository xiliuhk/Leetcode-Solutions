public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
 		
 		int m = obstacleGrid.length, n = obstacleGrid[0].length;
 		
 		int[] dp = new int[n]; // for each row
        
        // base case: dp[0][0] = 1
        dp[0] = 1; 

        //dp[i][j] = dp[i][j-1] + dp[i-1][j]
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
            	if (obstacleGrid[i][j] == 1){
            		dp[j] = 0;
            	}else if (j > 0){
            	    dp[j] += dp[j-1];
            	}
            }
        }
        return dp[n-1]; 
 	}
 }