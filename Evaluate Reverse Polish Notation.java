public class Solution {
    public int evalRPN(String[] tokens) {
    	Stack<Integer> ret = new Stack<Integer>(); 
    	for (int i = 0; i < tokens.length; i++){
    		if (tokens[i].equals("+")){
    			ret.add(ret.pop() + ret.pop()); 
    		}else if (tokens[i].equals("-")){
    			ret.add(0-ret.pop()+ret.pop());
    		}else if (tokens[i].equals("*")){
    			ret.add(ret.pop()*ret.pop());
    		}else if (tokens[i].equals("/")){
    			int b = ret.pop(); 
    		    int a = ret.pop();
    			ret.add(1/ret.pop()*ret.pop());
    		}else{
    			ret.add(Integer.parseInt(tokens[i])); 
    		}
    	}
    	return ret.pop(); 
    }
}