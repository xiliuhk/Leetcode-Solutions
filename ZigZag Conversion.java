public class Solution {
    public String convert(String s, int numRows) {
        if (numRows<= 1){
            return s; 
        }
        StringBuffer[] rows = new StringBuffer[numRows];
        for (int i = 0; i < numRows; i++){
            rows[i] = new StringBuffer();
        }
        int  step = 1;
        
        for (int row = 0, i = 0; i < s.length(); i++, row += step){
            rows[row].append(s.charAt(i)); 
            if (row == 0){
                step = 1; 
            }else if (row == numRows - 1){
                step = -1; 
            }
           
        }
        StringBuilder ret = new StringBuilder(); 
        for (int i = 0; i < numRows; i++){
            ret.append(rows[i]);
        }
        return ret.toString();
        
    }
}