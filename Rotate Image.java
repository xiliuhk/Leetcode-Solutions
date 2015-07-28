public class Solution {
    public void rotate(int[][] matrix) {
    	int len = matrix.length; 
    	for (int i = 0; i < len; i++){
    		for (int j = i; j < len; j++){
    			int tmp = matrix[i][j];
    			matrix[i][j] = matrix[j][i];
    			matrix[j][i] = tmp;
    		}
    	}
    	for (int i = 0; i < len; i++){
    		for (int j = 0; j < len/2; j++){
    			int k = len - j - 1; 
    			int tmp = matrix[i][j];
    			matrix[i][j] = matrix[i][k];
    			matrix[i][k] = tmp;
    		}
    	}
    }

}