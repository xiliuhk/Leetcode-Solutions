public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer>tmp = new ArrayList<Integer>(); 
        List<List<Integer>>ret = new List<List<Integer>>(); 
        for (int i = 0; i < numRows; i++){
        	tmp.add(0, 1); 
        	for (int j = 1; j < tmp.size()-1; j++){
        		tmp.set(j, tmp.get(j)+tmp.get(j+1)); 
        	}
        	ret.add(new ArrayList<Integer>(tmp)); 
        }
        return ret; 
    }
}