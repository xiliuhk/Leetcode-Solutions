public class Solution {
    
    private int maxLen = 1; 
    private int maxIndex = 0;
    private int len = 0; 
    
    public String longestPalindrome(String s) {
        len = s.length(); 
        for (int i = 0; i < len; i++){
            findPalindrome(s, i, i+1);
            findPalindrome(s, i, i);
        }
        return s.substring(maxIndex, maxIndex+maxLen); 
    } 
    
    public void findPalindrome(String s, int left, int right){
        for (;left >= 0 && right < len && s.charAt(left) == s.charAt(right);left--, right++){
            if (right - left + 1 > maxLen){
                maxLen = right - left + 1; 
                maxIndex = left; 
                
            }
        }
    }
}