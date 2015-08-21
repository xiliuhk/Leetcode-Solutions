public class Solution {
    public int numDistinct(String s, String t) {
  		int m = t.length(); 
  		int n = s.length(); 

  		if (m > n){
  			return 0;
  		}

  		int[] path = new int[m+1]; 
  		path[0] = 1; 
  		for (int i = 0; i < n; i++){
  			for (int j = m-1; j >= 0; j--){
  				if (t.charAt(j) == s.charAt(i)){
  					path[j+1] += path[j]; 
  				}
  			}
  		}
  		return path[m]; 
  	}
}