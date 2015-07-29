public class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] matrix = new int[n][n];
        
        if (n == 0){
            return matrix; 
        }
        
        int x0 = 0, x1 = n-1, y0 = 0, y1 = n-1; 
        
        int k = 1; 
        
        while (x0 <= x1 && y0 <= y1 ){
            for (int j = y0; j <= y1; j++){
                matrix[x0][j] = k; 
                k++; 
            }
            x0++; 
            for (int i = x0; i <= x1; i++){
                matrix[i][y1] = k;
                k++; 
            }
            y1--;
            if (x0 > x1 || y0 > y1){
                break; 
            }
            for (int j = y1; j >= y0; j--){
                matrix[x1][j] = k; 
                k++; 
            }
            x1--; 
        
            if (x0 > x1 || y0 > y1){
                break; 
            }
            
            for (int i = x1; i >= x0; i--){
                matrix[i][y0] = k;
                k++;
            }
            y0++;
        }
        return matrix; 
    }
}