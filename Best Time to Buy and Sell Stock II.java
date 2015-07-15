public class Solution {
    public int maxProfit(int[] prices) {
         if (prices == null || prices.length <= 1){
            return 0;
        }
        
        int low = prices[0]; 
        int profit = 0; 
        for (int i = 0; i < prices.length; i++){
            if (prices[i] > low){
                profit += prices[i] - low; 
            }
            low = prices[i];
        }
        
        return profit; 
    }
}