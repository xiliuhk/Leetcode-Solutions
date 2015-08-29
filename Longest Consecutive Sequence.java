public class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0; 
        Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>(); 
        for (int num : nums){
            visited.put(num, false); 
        }
        int len, k; 
        for (int num : nums){
            if (visited.containsKey(num-1) || visited.get(num)){
                continue; 
            }
            visited.put(num, true);
            k = num;
            len = 0; 
            while (visited.containsKey(k)){
                len++; 
                k++; 
            }
            longest = (longest < len)? len : longest; 
        }
        return longest; 
    }
}