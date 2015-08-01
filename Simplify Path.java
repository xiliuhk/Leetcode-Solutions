public class Solution {
    public String simplifyPath(String path) {
        
        Deque<String> stk = new LinkedList<String>();
        String[] dirs = path.split("/");
        List<String> skip = new ArrayList<String>(Arrays.asList("..", ".", ""));
        
        for (String dir : dirs){
            if (!stk.isEmpty() && dir.equals("..")){
                stk.pop();
            }else if (!skip.contains(dir)){
                stk.push(dir); 
            }
        }
        StringBuilder ret = new StringBuilder();
        for (String dir : stk){
            ret.insert(0, dir);
            ret.insert(0, "/"); 
        }
        return ret.length() == 0 ? "/": ret.toString();
    }
}