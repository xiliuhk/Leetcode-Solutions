public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	if (gas.length == 0 || cost.length == 0){
    		return -1; 
    	}
    	int start = 0, end = gas.length-1; 
    	int sum = gas[end] - cost[end]; 
    	while (start < end){
    		if (sum >= 0){
    			sum += gas[start] - cost[start];
    			start++; 
    		}else{
    			end--; 
    			sum += gas[end] - cost[end]; 
    		}
    	}
    	if (sum >= 0){
    		return start; 
    	}else{
    		return -1; 
    	}
    }
}