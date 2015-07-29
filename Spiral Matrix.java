public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<Integer>(); 
        if (matrix.length < 1 || matrix[0].length < 1){
            return ret; 
        }
        int x0 = 0, x1 = matrix.length-1, y0 = 0, y1 = matrix[0].length-1; 
        while (x0 <= x1 && y0 <= y1){
            for (int j = y0; j <= y1; j++){
                ret.add(matrix[x0][j]);
            }
            x0++; 
            for (int i = x0; i <= x1; i++){
                ret.add(matrix[i][y1]);
            }
            y1--; 
            if (x0 > x1 || y0 > y1){
                break; 
            }
            for (int j = y1; j >= y0; j--){
                ret.add(matrix[x1][j]);
            }
            x1--; 
            if (x0 > x1 || y0 > y1){
                break; 
            }
            for (int i = x1; i >= x0; i--){
                ret.add(matrix[i][y0]);
            }
            y0++; 
        }
        return ret; 
    }
}