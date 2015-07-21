public class Solution {
    //Method 1. DP
    // for each ')' starting from s[1]
    // ')': dp[i] = dp[i-2], dp[0] = 2
    // '(' : dp[i] = dp[i-1] + dp[i-dp[i-1]-1]+2, dp[0] = 2
    public int longestValidParentheses(String s) {
		int maxLen = 0; 
		int[] dp = new int[n];
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) == ')'){
				if (s.charAt(i-1) == '('){
					if (i >= 2){
						dp[i] = dp[i-2]+2; 
					}else{
						dp[i] = 2; 
					}
				}else{
					int j = i - dp[i-1] - 1; 
					if (j == 0 && s.charAt(j) == '('){
						dp[i] = dp[i-1] + 2; 
					}else if (j > 0 && s.charAt(j) == '('){
						dp[i] = dp[i-1] + dp[j-1] + 2; 
					}
				}
				maxLen = Math.max(maxLen, dp[i])
			}
		}
		return len;
	}
	// Method 2. stack
    public int longestValidParentheses(String s) {
    	int maxLen = 0; 
    	int tmp = 0; 
    	Stack<Integer> stk = new Stack<Integer>();
    	for (int i = 0; i < s.length(); i++){
    		if (s.charAt(i) == '('){
    			stk.push(i);
    		}else{
    			if (stk.isEmpty() || s.charAt(stk.peek() != '(')){
    				stk.push(i);
    			}else{
    				stk.pop();
    				if (stk.isEmpty()){
    					tmp = i+1; 
    				}else{
    					tmp = i - stk.peek();
    				}
    				maxLen = Math.max(maxLen, tmp);
    			}
    		}
    	}
    	return maxLen;
    }
}