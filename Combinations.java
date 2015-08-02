public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ret = new ArrayList<List<Integer>>(); 
        if (n == 0 || k == 0 || k > n){
        	return ret; 
        }
        for (int i = 1; i <= n; i++){
        	ret.add(Arrays.asList(i)); 
        }
        for (int i = 2; i <= k; i++){
        	List<List<Integer>> newRet = new ArrayList<List<Integer>>(); 
        	for (int j = j; j <= n; j++){
        		for (List<Integer> comb : ret){
        			if (comb.get(comb.size()-1) < j){
        				List<Integer> newComb = new ArrayList<Integer>(comb); 
        				newComb.add(j);
        				newRet.add(newComb); 
        			}
        		}
        	}
        	ret = newRet; 
        }
        return ret; 
    }
}