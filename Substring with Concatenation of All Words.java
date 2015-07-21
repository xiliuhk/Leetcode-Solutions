public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ret = new ArrayList<Integer>();
        HashMap<String, Integer> toFind = new HashMap<String, Integer>();
        HashMap<String, Integer> found = new HashMap<String, Integer>();
        int m = words.length, n = words[0].length();
        
        for (int i = 0; i < m; i++){
            if (!toFind.containsKey(words[i])){
                toFind.put(words[i], 1);
            }else{
                toFind.put(words[i], toFind.get(words[i])+1);
            }
        }
        
        for (int i = 0; i <= s.length() - n*m; i++){
            found.clear();
            int j = 0; 
            for (; j < m; j++){
                int k = i + j*n;
                String word = s.substring(k, k+n);
                if (!toFind.containsKey(word)){
                    break; 
                }
                if (!found.containsKey(word)){
                    found.put(word, 1);
                }else{
                    found.put(word, found.get(word)+1);
                }
                if (found.get(word) > toFind.get(word)){
                    break;
                }
            }
            if (j == m){
                ret.add(i);
            }
        }
        return ret; 
    }
}