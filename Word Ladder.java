public class Solution {
    //BFS to get the shortest path
    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
    	Queue<String> queue = new LinkedList<String>(); 
    	queue.offer(beginWord); 
    	wordDict.remove(beginWord); 
    	int len = 1; 
    	while (!queue.isEmpty()){
    		int cnt = queue.size(); 
    		for (int i = 0; i < cnt; i++){
    			String cur = queue.poll(); 
    			for (char c = 'a'; c <= 'z'; c++){
    				for (int j = 0; j < cur.length(); j++){
    					if (c != cur.charAt(j)){
    						String tmp = replace(cur, j, c); 
    						if (tmp.equals(endWord)){
    							return len+1; 
    						}
    						if (wordDict.contains(tmp)){
    							queue.offer(tmp); 
    							wordDict.remove(tmp); 
    						}
    					}
    				}
    			}
    			len++; 
    		}
    		return 0; 
    	}

    	private String replace(String s, int i, char c){
        char[] chars = s.toCharArray(); 
        chars[i] = c; 
        return new String(chars); 
    	}
    }