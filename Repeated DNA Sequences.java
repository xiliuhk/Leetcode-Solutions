public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
    	List<String> ret = new ArrayList<String>(); 
    	if (s.length() < 10){
    		return ret; 
    	}
    	char[] map = new char[26]; 
    	map['C' - 'A'] = 1; 
    	map['G' - 'A'] = 2; 
    	map['T' - 'A'] = 3; 
    	
    	Set<Integer> word = new HashSet<Integer>(); 
		Set<Integer> dupWord = new HashSet<Integer>(); 
		
    	for (int i = 0; i + 10 <= s.length(); i++){
    		int v = 0; 
    		for (int j = i; j < i + 10; j++){
    			v <<= 2; 
    			v |= map[s.charAt(j) - 'A']; 
    		}
    		if (!word.add(v) && dupWord.add(v)){
    			ret.add(s.substring(i, i+10));
    		}
    	}
    	return rv; 
    }

}