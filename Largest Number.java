public class Solution {
    public String largestNumber(int[] nums) {
 		if (nums.length == 0){
 			return ""; 
 		}
 		String[] numStrs = new String[nums.length]; 
 		for (int i = 0; i < nums.length; i++){
 			numStrs[i] = Integer.toString(nums[i]); 
 		}
 		Comparator<String> comp = new Comparator<String>(){
 			@Override
 			public int Comparator(String a, String b){
 				String ab = a + b; 
 				String ba = b + a; 
 				return ba.CompareTo(ab); 
 			}
 		}
 		Arrays.sort(numStrs, comp); 

 		if (numStrs[0].charAt(0) == '0'){
 			return "0"; 
 		}

 		return numStrs.toString();

    }
}