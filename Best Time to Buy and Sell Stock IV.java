// k transaction
public class Solution {
    public int maxProfit(int k, int[] prices) {
        if (k < 1){
            return 0; 
        }
        if (prices.length <= 1){
            return 0; 
        }
        
        //fix for memory problem in frequent trades 
        if ( k >= prices.length/2 ){
            int profit = 0; 
            for (int i = 1; i < prices.length; i++){
                if (prices[i] > prices[i-1] ){
                    profit += prices[i] - prices[i-1];
                }
            }
            return profit; 
        }
        
        int[] buy = new int[k+1]; 
        int[] sell = new int[k+1]; 
        
        for (int i = 0; i <= k; i++){
            buy[i] = Integer.MIN_VALUE; 
            sell[i] = 0; 
        }
        
        for (int i = 0; i < prices.length; i++){
            for (int j = k; j > 0; j--){
                sell[j] = Math.max(sell[j], prices[i] + buy[j]); 
                buy[j] = Math.max(buy[j], sell[j-1] - prices[i]); 
            }
        }
        return sell[k]; 
    }
}