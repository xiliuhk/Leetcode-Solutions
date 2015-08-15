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
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return buildTree(0, inorder.length-1, 0, preorder, inorder);
	}
	public TreeNode buildTree(int inStart, int inEnd, int preStart, int[] preorder, int[] inorder){
		if (preStart > preorder.length-1 || inStart > inEnd){
			return null; 
		}
		TreeNode root = new TreeNode(preorder[preStart]);
		int inIndex = 0; 
		for (int i = inStart; i <= inEnd; i++){
			if (inorder[i] == root.val){
				inIndex = i; 
			}
		}
		root.left = buildTree(inStart, inIndex-1, preStart+1, preorder, inorder);
		root.right = buildTree(inIndex+1, preStart+(inIndex-inStart)+1), inEnd, preorder, inorder); 
		return root; 
	}
}