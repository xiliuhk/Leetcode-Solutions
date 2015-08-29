public class Solution {
		List<List<String>> ret; 
		List<String> cur; 
		public List<List<String>> partition(String s) {
			ret = new ArrayList<List<String>>(); 
			if (s.length() == 0){
				return ret; 
			}
			cur = new ArrayList<String>(); 
			backTrack(s, 0); 
			return ret; 
		}

		public void backTrack(String s, int left){
			if (cur.size() > 0 && left >= s.length()){
				List<String> r = new ArrayList<String>(cur); 
				ret.add(r); 
			}
			for (int i = left; i < s.length(); i++){
				if (isPalindrome(s, left, i)){
					if (left == i){
						cur.add(Character.toString(s.charAt(i)));
					}else{
						cur.add(s.substring(left, i+1)); 
					}
					backTrack(s, i+1); 
					cur.remove(cur.size()-1); 
				}
			}
		}

		public boolean isPalindrome(String s, int left, int right){
			while (left < right && s.charAt(left) == s.charAt(right)){
				left++; 
				right--; 
			}
			return (left >= right); 
		}
}