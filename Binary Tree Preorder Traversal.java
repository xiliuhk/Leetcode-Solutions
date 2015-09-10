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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>(); 
        if (root == null){
            return ret; 
        }
        //postorderTraversal(root, ret); 
        Stack<TreeNode> stk = new Stack<TreeNode>(); 
        TreeNode top; 
        stk.push(root); 
        while (!stk.isEmpty()){
            top = stk.pop(); 
            ret.add(0, top.val); 
            if (top.left != null){
                stk.push(top.left); 
            }
            if (top.right != null){
                stk.push(top.right); 
            }
            
        }
        return ret; 
    }
    public void postorderTraversal(TreeNode root, List<Integer> ret) {
        if (root == null){
            return; 
        }
        
        postorderTraversal(root.left, ret); 
        postorderTraversal(root.right, ret); 
        ret.add(root.val);
    }
}