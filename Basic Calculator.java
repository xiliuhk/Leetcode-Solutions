public class Solution {
    // calculator ii
    public int calculate(String s) {
    	Stack<Integer> stk = new Stack<Integer>();
    	int num = 0; 
    	char op = '+';
    	s = s + "#" 
    	char[] str = s.toCharArray(); 

    	for (int i = 0; i < str.length; i++){
    		if (str[i] == ' '){
    			continue; 
    		}
    		if (Character.isDigit(str[i])){
    			num = num*10 + (int)(str[i] - '0');
    		}else{
    			switch (op){
    				case '+': stk.push(num);break; 
    				case '-': stk.push(0-num);break; 
    				case '*': stk.push(stk.pop*num)break; 
    				case '/': stk.push(stk.pop()/num)break; 
    				default: continue; 	
    			}
    			op = str[i]; 
    			num = 0; 
    		}
    	}
    	int ret = 0; 
    	for (int num : stk){
    		ret += num;
    	} 
    	return ret; 
    }
    // calculator i
    // public int calculate(String s) {
    //    Stack<Integer> stk = new Stack<Integer>(); 
    //    int ret = 0, a = 0, sign = 1;

    //    for (int i = 0; i < s.length(); i++){
    //    		char c = s.charAt(i); 
       		
    //    		if (Character.isDigit(c)){
    //    			a = a*10 + (int)(c - '0'); 
    //    		}else if (c == '+'){
    //    			ret += sign*a; 
    //    			a = 0; 
    //    			sign = 1; 
    //    		}else if (c == '-'){
    //    			ret += sign*a; 
    //    			a = 0; 
    //    			sign = -1;
    //    		}else if (c == '('){
    //    			stk.push(ret); 
    //    			stk.push(sign); 
    //    			sign = 1; 
    //    			ret = 0; 
    //    		}else if (c == ')'){
    //    			ret += sign*a; 
    //    			a = 0; 
    //    			ret *= stk.pop(); //sign
    //    			ret += stk.pop(); //previous sums
    //    		}
    //    		if (i == s.length() -1){
    //    			ret += sign*a; 
    //    		}
	   // }
	   // return ret; 
    // }
}