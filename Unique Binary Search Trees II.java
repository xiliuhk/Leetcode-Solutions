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
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode>[] ret = new List<TreeNode>[n+1]; 
        ret[0] = new ArrayList<TreeNode>(); 
        ret[0].add(null); 
        for (int i = 1; i <= n; i++){
        	ret[i] = new ArrayList<TreeNode>(); 
        	for (int j = 1; j <= i; j++){
        		for (TreeNode nodeL : ret[j-1]){
        			for (TreeNode nodeR : ret[i-j]){
        				TreeNode node = new TreeNode(j); 
        				node.left = nodeL; 
        				node.right = clone(NodeR, j); 
        				ret[i].add(node); 
        			}
        		}
        	}
        }
        return ret[n];
    }
    private TreeNode clone(TreeNode t, int offset){
    	if (t == null){
    		return t; 
    	}
    	TreeNode ret = new TreeNode(t.val + offset); 
    	ret.left = clone(n.left, offset);
    	ret.right = clone(n.right, offset);
    	return ret;
    }
}