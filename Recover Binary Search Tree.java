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
    public void recoverTree(TreeNode root) {
        TreeNode prev = new TreeNode(Integer.MIN_VALUE);
        TreeNode n1 = null, n2 = null;

        while(root != null){
        	TreeNode cur = root.left; 

            if (cur != null){
            	while (cur.right != null && cur.right != root){
            		cur = cur.right; 
            	}
            	if (cur.right == null){
            		cur.right = root; 
            		root = root.left; 
            		continue; 
            	}else{
            		cur.right = null; 
            	}
            }

            if (root.val < prev.val){
            	if (first == null){
            		first = prev; 
            	}
            	second = root; 
            }
            prev = root; 
            root = root.right; 
        }
        int tmp = second.val;
        second.val = first.val; 
        first.val = tmp;
    }
}