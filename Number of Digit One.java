public class Solution {
    public int countDigitOne(int n) {
        int ret = 0; 
        for (long m = 1; m <= n; m*=10){
            long a = n/m, b = n%m;
            ret += (a+8)/10*m + (a%10 == 1 ? b+1 : 0);
        }
        return ret;
    }
}