public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--){
            int cur = digits[i] + carry;
            digits[i] = cur % 2;
            carry = cur /2; 
        }
        if (carry == 1){
            digits = ArrayUtils.insert(0, carry);
        }
        return digits;
    }
}