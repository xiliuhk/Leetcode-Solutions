public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder(); 
        ret.append((numerator > 0)^(denominator>0)? "-" : ""); 
        long num = Math.abs((long)numerator); 
        long den = Math.abs((long)denominator); 
        ret.append(num/den); 
        num %= den; 
        if (num == 0){
        	return sb.toString(); 
        }
        ret.append("."); 
        HashMap<Long, Integer> map = new HashMap<Long, Integer>(); 
        map.put(num, ret.length()); 

        while (num != 0){
        	num *= 10; 
        	ret.append(num/den); 
        	num %= den; 
        	if (map.containsKey(num)){
        		ret.insert(map.get(num), "("); 
        		ret.append(")"); 
        		return sb.toString(); 
        	}
        	map.put(num, sb.length()); 
        }
        return sb.toString(); 
     }
 }