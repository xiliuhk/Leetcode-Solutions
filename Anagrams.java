public class Solution {
    public List<String> anagrams(String[] strs) {
        HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        List<String> ret = new ArrayList<String>();
        for (int i = 0; i < strs.length; i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            List<Integer> value = map.get(key);
            if (value == null){
                value = new ArrayList<Integer>(); 
                value.add(i); 
                map.put(key, value);
            }else{
                value.add(i);
            }
        }
        
        for (String key : map.keySet()){
            List<Integer> indexList = map.get(key); 
            if(indexList.size() > 1){
                for (Integer i : indexList){
                    ret.add(strs[i]);
                }
            }
        }
        return ret; 
    }
}