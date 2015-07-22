public class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1"; 
        }
        
        String prev = countAndSay(n-1); 
        StringBuilder ret = new StringBuilder(); 
        Integer cnt = 1;
        int i; 
        
        for (i = 1;i< prev.length(); i++){
            if (prev.charAt(i) == prev.charAt(i-1)){
                cnt ++;
            }else{
                ret.append(cnt.toString() + prev.charAt(i-1));
                cnt = 1; 
            }
        }
        ret.append(cnt.toString() + prev.charAt(i-1));
        
        return ret.toString(); 
    }
}