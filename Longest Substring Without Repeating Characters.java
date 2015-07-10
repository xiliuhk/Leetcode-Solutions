public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0; 
        }
        
        HashMap<Character, Integer>map = new HashMap<Character, Integer>();
        
        int maxLen = 1; 
        
        int start = 0; 
        
        for (int end = start; end < s.length(); end++){
            if (map.containsKey(s.charAt(end))){
                start = Math.max(map.get(s.charAt(end)) + 1, start); 
            }
            map.put(s.charAt(end), end); 
            maxLen = Math.max(maxLen, end-start+1);
        }
        
        return maxLen;
    }
}