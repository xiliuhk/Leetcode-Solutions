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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ret = new LinkedList<List<Integer>>();
        levelOrder(root, 0, ret);
        return ret; 
    }
    
    public void levelOrder(TreeNode root, int level, List<List<Integer>>ret){
        if (root == null){
            return; 
        }
        if (ret.size() < level+1){
            ret.add(new LinkedList<Integer>()); 
        }
        ret.get(level).add(root.val);
        levelOrder(root.left, level+1, ret); 
        levelOrder(root.right, level+1, ret); 
    }
}