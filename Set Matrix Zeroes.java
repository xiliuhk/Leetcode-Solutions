public class Solution {
    public void setZeroes(int[][] matrix) {
        
        if (matrix.length == 0 || matrix[0].length == 0){
            return;
        }
        
        boolean rowZero = false, colZero = false; 
        
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    if (i == 0){
                        rowZero = true; 
                    }
                    if (j == 0){
                        colZero = true; 
                    }
                    matrix[i][0] = 0; 
                    matrix[0][j] = 0; 
                }
            }
        }
        for (int i = 1; i < matrix.length; i++){
            for (int j = 1; j < matrix[0].length; j++){
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0; 
                }
            }
        }
        if (rowZero){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0; 
            }
        }
        
        if (colZero){
            for (int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0; 
            }
        }
        
    }
}