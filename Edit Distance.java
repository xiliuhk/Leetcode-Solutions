public class Solution {
    public int minDistance(String word1, String word2) {
        int[] dp = new int[word2.length()+1];
        for (int i = 1; i <= word2.length(); i++){
            dp[i] = i; 
        }
        for (int i = 0; i < word1.length(); i++){
            int prev = i+1; 
            for (int j = 0; j < word2.length(); j++){
                int cur = 0; 
                if (word1.charAt(i) == word2.charAt(j)){
                    cur = dp[j];
                }else{
                    cur = Math.min(Math.min(dp[j], dp[j+1]), prev)+1;
                }
                dp[j] = prev; 
                prev = cur;
            }
            dp[word2.length()] = prev;
        }
        return dp[word2.length()]; 
    }
}