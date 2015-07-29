public class Solution {
    public String getPermutation(int n, int k) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++){
            list.add(i);
        }
        int fact = 1; 
        for (int i = 2; i <= n; i++){
            fact *= i; 
        }
        StringBuilder ret = new StringBuilder();
        k --; 
        for (; n > 0; n--){
            fact /= n; 
            ret.append(list.remove(k/fact));
            k %= fact; 
        }
        return ret.toString(); 
    }
}