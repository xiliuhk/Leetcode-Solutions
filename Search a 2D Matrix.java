public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length; 
        if ( m == 0 || n == 0){
            return false; 
        }
        if (matrix[0][0] > target || matrix[m-1][n-1] < target){
            return false; 
        }
        int head = 0, tail = m - 1; 
        int mid = 0; 
        while (head <= tail){
            mid = head + (tail - head)/2; 

            if (matrix[mid][0] == target || matrix[mid][n-1] == target){
                return true; 
            }else if (matrix[mid][0] > target){
                tail = mid - 1;  
            }else if (matrix[mid][n-1] < target){
                head = mid + 1; 
            }else if (target > matrix[mid][0] && target < matrix[mid][n-1]){
                break;
            }
        }
        head = 0; tail = n-1; 
        int row = mid; 
        while (head <= tail){
            mid = head + (tail - head)/2; 
            if (matrix[row][mid] == target){
                return true; 
            }else if (matrix[row][mid] > target){
                tail = mid - 1;
            }else if (matrix[row][mid] < target){
                head = mid + 1; 
            }
        }
        return false; 
        
    }
}