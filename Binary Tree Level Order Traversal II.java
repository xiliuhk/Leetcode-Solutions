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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>ret = new LinkedList<List<Integer>>();
        levelOrderBottom(root, 0, ret);
        return ret; 
    }
    public void levelOrderBottom(TreeNode root, int level, List<List<Integer>>ret){
        if (root == null){
            return; 
        }
        if (ret.size() < level+1){
            ret.add(0, new LinkedList<Integer>()); 
        }
        ret.get(ret.size() - 1 - level).add(root.val);
        levelOrderBottom(root.left, level+1, ret); 
        levelOrderBottom(root.right, level+1, ret); 
    }
}