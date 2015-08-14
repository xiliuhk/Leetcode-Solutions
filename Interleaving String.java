public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()){
        	return false; 
        }
        boolean[] opt = new boolean[s2.length()+1];
        opt[0] = true; 
        for (int j = 0; j < s2.length(); j++){
        	opt[j+1] = opt[j] && s2.charAt(j) == s3.charAt(j);
        }
        for (int i = 0; i < s1.length(); i++){
        	opt[0] = opt[0] && s1.charAt(i) == s3.charAt(i);
        	for (int j = 0; j < s2.length(); j++){
        		opt[j+1] = (s1.charAt(i) == s3.charAt(i+j+1) && opt[j+1]) || (s2.charAt(j) == s3.charAt(i+j+1) && opt[j]);
        	}
        }
        return opt[s2.length()];
    }
}