public class Solution {
    public boolean isUgly(int num) {
        if (num == 0 ){
            return false;
        }
        int[] div = {2, 3, 5}; 
        for (int i : div){
            while (num % i == 0){
                num /= i; 
            }
        }
        return num == 1; 
    }
}