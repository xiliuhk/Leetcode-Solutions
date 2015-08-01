public class Solution {
    public String addBinary(String a, String b) {
        if (a == ""){
            return b;
        }
        if (b == ""){
            return a;
        }
        StringBuilder ret = new StringBuilder();
        int a_i = a.length() -1; 
        int b_i = b.length() -1; 
        int carry = 0;
        while (a_i >= 0 || b_i >= 0 || carry == 1){
            int a_d = 0; 
            if (a_i >= 0){
                a_d = (a.charAt(a_i) == '1')?1:0;
                a_i --;
            }
            int b_d = 0; 
            if (b_i >= 0){
                b_d = (b.charAt(b_i) == '1')?1:0;
                b_i --;
            }
            char c = (char)('0' + (a_d^b_d^carry));
            ret.insert(0, c);
            carry = ((a_d + b_d + carry)>=2)?1:0;
        }
        
        return ret.toString();
        
    }
}