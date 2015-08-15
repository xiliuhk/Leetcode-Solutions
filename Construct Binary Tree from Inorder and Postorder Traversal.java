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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(0, inorder.length-1, 0, postorder.length-1, inorder, postorder);
    }
    public TreeNode buildTree(int inStart, int inEnd, int postStart, int postEnd, int[] inorder, int[] postorder) {
        if (postEnd < postStart){
        	return null; 
        }
        TreeNode root = new TreeNode(postorder[postEnd]); 
        int pos = 0; 
        for (int i = inStart; i <= inEnd; i++){
        	if (inorder[i] == root.val){
        		pos = i; 
        		break; 
        	}
        }
        root.left = buildTree(inStart, pos-1, postStart, postStart+(pos-inStart)-1, inorder, postorder);
        root.right = buildTree(pos+1, inEnd, postEnd-(inEnd-pos), postEnd-1, inorder, postorder);
    	return root; 
    }
}