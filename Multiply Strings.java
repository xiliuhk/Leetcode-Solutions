public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length(); 
        int len2 = num2.length();
        StringBuilder ret = new StringBuilder(); 
        int[] product = new int[len1+len2];
        for (int i = len1-1; i >= 0; i--){
            for (int j = len2-1; j >= 0; j--){
                int k = len1 - 1 + len2 - 1 - i - j;
                product[k] += (num1.charAt(i) - '0')*(num2.charAt(j) - '0'); 
                product[k+1] += product[k] / 10;
                product[k] %= 10; 
            }
        }
        for (int i = product.length - 1; i >0; i--){
            if (product[i] != 0 || ret.length() > 0){
                ret.append(product[i]);
            }
        }
        ret.append(product[0]);
        return ret.toString();
        
    }
}