public class Solution {
    public String reverseWords(String s) {
    	char[] str = s.toCharArray(); 
    	StringBuilder sb = new StringBuilder();
        int start = 0, end = 0; 
    	while (start < s.length() && end <= s.length()){
    		if (end < s.length() && str[end] != ' '){
    			end++; 
    		}else if (start < end){
    			sb.insert(0, s.substring(start, end)+" "); 
    			start = end+1; 
    			end++; 
    		}else{
    		    start++; 
    		    end++; 
    		}
    	}
    	return (sb.length() > 1)? sb.deleteCharAt(sb.length()-1).toString(): "";
    }
}