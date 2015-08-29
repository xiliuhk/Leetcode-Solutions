/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	private int maxPath; 
    public int maxPathSum(TreeNode root) {
        maxPath = Integer.MIN_VALUE; 
        dfs(root);
        return maxPath;
    }

    private int dfs(TreeNode root){
    	if (root == null){
    		return 0; 
    	}
    	int left = Math.max(0, dfs(root.left));
    	int right = Math.max(0, dfs(root.right));
    	maxPath = Math.max(maxPath, left+right+root.val);
    	return root.val + Math.max(left, right);
    }
}