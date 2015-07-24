public class Solution {
    // public String countAndSay(int n) {
    //     if (n == 1) {
    //         return "1"; 
    //     }
        
    //     String prev = countAndSay(n-1); 
    //     StringBuilder ret = new StringBuilder(); 
    //     Integer cnt = 1;
    //     int i; 
        
    //     for (i = 1;i< prev.length(); i++){
    //         if (prev.charAt(i) == prev.charAt(i-1)){
    //             cnt ++;
    //         }else{
    //             ret.append(cnt.toString() + prev.charAt(i-1));
    //             cnt = 1; 
    //         }
    //     }
    //     ret.append(cnt.toString() + prev.charAt(i-1));
        
    //     return ret.toString(); 
    // }
    public String countAndSay(int n) {
        if (n == 0){
            return "";
        }
        if (n == 1) {
            return "1"; 
        }
        StringBuilder ret = new StringBuilder("1");
        String s = ""; 
        for (int i = 0; i < n; i++){
            int len = ret.length(); 
            for (int j = 0; j+1 < len; j++){
                Integer cnt = 1; 
                while (j < len && ret.charAt(j) == ret.charAt(j+1)){
                    j++; 
                    cnt ++; 
                }
                s += cnt.toString() + ret.charAt(j); 
            }
            ret.append(s); 
            s = ""; 
        }
        return ret.toString(); 

    }
}