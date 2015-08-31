public class Solution {
    public List<String> wordBreak(String s, Set<String> wordDict) {
    	Map<String, List<String>> map = new HashMap<String, List<String>>(); 
    	return wordBreak(s, wordDict, map); 
    }
    public List<String> wordBreak(String s, Set<String>dict, Map<String, List<String>> map){
    	if (map.containsKey(s)){
    		return map.get(s); 
    	}
    	List<String> ret = new ArrayList<String>(); 
    	if (s.length() == 0){
    		return ret; 
    	}
    	for (int len = 1; len <= s.length(); len++){
    		String suffix = s.substring(0, len); 
    		if (!dict.contains(suffix)){
    			continue; 
    		}
    		if (len == s.length()){
    			ret.add(suffix);
    		}else{
    			String prefix = s.substring(len); 
    			List<String> tmp = wordBreak(prefix, dict, map); 
    			for (String word : tmp){
    				word = suffix + " " + word;
    				ret.add(word); 
    			}
    		}
    	}
    	map.put(s, ret); 
    	return ret; 
    }
}