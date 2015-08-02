public class Solution {
    public String minWindow(String s, String t) {
        String ret = ""; 
        if (s.length() == 0 || t.length() == 0){
            return ret; 
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++){
            if (map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))+1); 
            }else{
                map.put(t.charAt(i), 1); 
            }
        }
        int tlen = t.length(); 
        int j = 0; 
        int minLen = Integer.MAX_VALUE; 
        for (int i = 0; i < s.length(); i++){
            if (!map.containsKey(s.charAt(i))){
                continue; 
            }
            map.put(s.charAt(i), map.get(s.charAt(i))-1); 
            if (map.get(s.charAt(i)) >= 0){
                tlen--; 
            }
            while (tlen == 0){
                if (map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j), map.get(s.charAt(j))+1); 
                    if (map.get(s.charAt(j)) > 0){
                        if (minLen > i-j+1){
                            ret = s.substring(j, i+1); 
                            minLen = i-j+1; 
                        }
                        tlen++; 
                    }
                    
                }
                j++; 
            }
        }
        return ret; 
    }
}