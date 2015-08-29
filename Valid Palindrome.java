public class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1; 
        s = s.toLowerCase(); 
        while (left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++; 
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--; 
            }
            if (s.charAt(right) != s.charAt(left)){
                return false; 
            }else{
                left++; 
                right--; 
            }
        }
        return true; 
    }
}