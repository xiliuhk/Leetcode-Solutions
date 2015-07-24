public class Solution {
    public boolean isMatch(String s, String p) {
        String processed = p.replace("*", "");
        if (processed.length() > s.length()){
        	return false; 
        }
        boolean[] d = new boolean[s.length()+1];
        d[0] = true;
        for (int i = 1; i <= p.length(); i++){
        	char c = p.charAt(i-1);
        	if (c == '*'){
        		for (int j = 1; j <= s.length(); j++){
        			d[j] = d[j] || d[j-1];
        		}
        	}else{
        		for (int j = s.length(); j >= 1; j--){
        			d[j] = d[j-1] && (c == '?' || c == s.charAt(j-1));
        		}
        	}
        	d[0] = d[0] && c == '*';
        }
        return d[s.length()];
    }
}