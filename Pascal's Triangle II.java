public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>tmp = new ArrayList<Integer>(); 
        
        for (int i = 0; i <= rowIndex; i++){
            tmp.add(0, 1); 
            for (int j = 1; j < tmp.size()-1; j++){
                tmp.set(j, tmp.get(j)+tmp.get(j+1)); 
            }
        }
        return tmp; 
    }
}