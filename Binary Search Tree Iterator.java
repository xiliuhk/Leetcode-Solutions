/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
 	private Stack<Integer> stk; 

 	public BSTIterator(TreeNode root) {
 		stk = new Stack<Integer>();
 		TreeNode cur = root; 
 		while (cur != null){
 			stk.push(cur); 
 			cur = cur.left; 
 		}
 	}
 	/** @return whether we have a next smallest number */
 	public boolean hasNext() {
 		return !stk.isEmpty(); 
 	}
 	/** @return the next smallest number */
    public int next() {
    	TreeNode node = stk.pop(); 
    	TreeNode cur = node; 
    	if (cur.right != null){
    		cur = cur.right; 
    		while (cur != null){
    			stk.push(cur); 
    			cur = cur.left; 
    		}
    	}
    	return node.val; 
	}
}