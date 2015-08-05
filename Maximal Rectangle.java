public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rlen = matrix.length; 
        if (rlen == 0 ){
            return 0; 
        }
        int clen = matrix[0].length;
        if ( clen == 0){
            return 0; 
        }
        int maxRect = 0; 
        int[] h = new int[clen]; 
        for (int i = 0; i < rlen; i++){
            Stack<Integer> stk = new Stack<Integer>(); 
            for (int j = 0; j <= clen; j++){
                if (j < clen){
                    if (matrix[i][j] == '1'){
                        h[j] += 1;    
                    }else {
                        h[j] = 0; 
                    }
                }
                while (!stk.isEmpty() && ( j== clen || h[stk.peek()] >= h[j] )){
                    maxRect = Math.max(
                        maxRect, 
                        h[stk.pop()]* (stk.isEmpty() ? j : j-1-stk.peek()) ) ; 
                }
                stk.push(j); 
            }
            
        }
        return maxRect; 
    }
}