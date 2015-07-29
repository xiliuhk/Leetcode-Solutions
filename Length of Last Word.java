public class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0; 
        int i = s.length() - 1; 
        while (i >= 0 && (s.charAt(i) == ' ' || !Character.isLetter(s.charAt(i)))){
            i--; 
        }
        while (i >= 0 &&  s.charAt(i) != ' ' && Character.isLetter(s.charAt(i))){
            i--; 
            len++; 
        }
        return len; 
    }
}