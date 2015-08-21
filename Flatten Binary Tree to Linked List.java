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
    // public void flatten(TreeNode root) {
    //     if (root == null){
    //         return; 
    //     }
    //     TreeNode left = root.left; 
    //     TreeNode right = root.right; 
        
    //     root.left = null; 
        
    //     flatten(left);
    //     flatten(right); 
        
    //     root.right = left; 
        
    //     TreeNode cur = root; 
        
    //     while (cur.right != null){
    //         cur = cur.right; 
    //     }
    //     cur.right = right; 
        
    // }
    public void flatten(TreeNode root) {
        if (root == null){
            return; 
        }
        Stack<TreeNode> stk = new Stack<TreeNode>(); 
        stk.push(root); 
        while (!stk.isEmpty()){
            TreeNode node = stk.pop(); 
            if (node.right != null){
                stk.push(node.right);
            }
            if (node.left != null){
                stk.push(node.left); 
            }
            node.left = null; 
            if (!stk.isEmpty()){
                node.right = stk.peek();
            }
        }
        
    }
}