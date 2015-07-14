public class Solution {
    public boolean isMatch(String s, String p) {
        boolean[] d = new boolean[s.length()+1];
        d[s.length()] = true;
        for (int i = p.length()-1; i >= 0; i--){
            char c = p.charAt(i);
            if (c == '*'){
                for (int j = s.length()-1; j >= 0; j--){
                    d[j] = d[j] || d[j+1] && (p.charAt(i-1) == '.' || p.charAt(i-1) == s.charAt(j));
                }
                i--;
            }else{
                for (int j = 0; j < s.length(); j++){
                    d[j] = d[j+1] && (c == '.' || c == s.charAt(j));
                }
                d[s.length()] = false; 
            }
        }
        return d[0];
    }
}