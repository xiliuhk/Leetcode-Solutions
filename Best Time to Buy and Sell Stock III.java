//two transaction
public class Solution {
    public int maxProfit(int[] prices) {
        
        if ( prices == null || prices.length <= 1 ){
            return 0; 
        }
        
        int buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE;
        int sell1 = 0, sell2 = 0;
        
        for (int i = 0; i < prices.length; i++){
            
            sell2 = Math.max(sell2, prices[i] + buy2);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            
            sell1 = Math.max(sell1, prices[i] + buy1);
            buy1 = Math.max(buy1, - prices[i]);
            
        }
        
        return sell2;
    }
}