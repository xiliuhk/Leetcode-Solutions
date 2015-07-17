public class Solution {
    public List<String> generateParenthesis(int n) {
        List<List<String>>ret = new ArrayList<>(); 
        ret.add(Collections.singletonList(""));
        for (int i = 1; i <= n; i++){
            List<String> list = new ArrayList<>(); 
            for (int j = 0; j < i; j++){
                for (String left : ret.get(j)){
                    for (String right : ret.get(i-1-j)){
                        list.add("("+left+")"+right);
                    }
                }
            }
            ret.add(list);
        }
        return ret.get(ret.size()-1);
    }
}