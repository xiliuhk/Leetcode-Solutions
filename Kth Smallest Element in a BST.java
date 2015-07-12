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
    // Method 1. recursive inorder
    // int ret = 0; 
    // int cnt = 0; 
    // public int kthSmallest(TreeNode root, int k) {
    //     cnt = k; 
    //     helper(root);
    //     return ret; 
    // }
    // private void helper(TreeNode root){
    //     if (root == null){
    //         return; 
    //     }
    //     helper(root.left);
    //     if (--cnt == 0){
    //         ret = root.val; 
    //     }
    //     helper(root.right);
    // }
    // Method 2. iterative inorder
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stk = new Stack<TreeNode>(); 
        TreeNode p = root; 
        while (p != null){
            stk.push(p);
            p = p.left; 
        }
        int ret = 0;
        
        for (int i = 0; i < k; i++){
            p = stk.pop(); 
            ret = p.val; 
            p = p.right;
            while (p != null){
                stk.push(p);
                p = p.left;
            }
        }
        return ret; 
    }

}