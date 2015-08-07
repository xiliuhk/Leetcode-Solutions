public class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0){
            return s.length(); 
        }
        if (s.length() == 1){
            return s.charAt(0) != '0'? 1 : 0; 
        }
        int prev1 = s.charAt(s.length()-1) != '0'? 1:0;
        int prev2 = 1; 
        int ret = 0; 
        for (int i = s.length() - 2; i >= 0; i--){
            if (s.charAt(i) == '0'){
                ret = 0; 
            }else{
                ret = Integer.parseInt(s.substring(i, i+2)) <= 26 ? prev1+prev2 : prev1; 
            }
            prev2 = prev1; 
            prev1 = ret; 
        }
        return ret; 
    }
}