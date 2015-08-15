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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ret = new LinkedList<List<Integer>>();
        zigzagLevelOrder(root, 0, ret); 
        return ret; 
    }
    public void zigzagLevelOrder(TreeNode root, int level, List<List<Integer>>ret){
        if (root == null){
            return; 
        }
        if (ret.size() < level+1){
            ret.add(new LinkedList<Integer>()); 
        }
        if (level%2 == 0){
            ret.get(level).add(root.val);
        }else{
            ret.get(level).add(0, root.val);
        }
        
        zigzagLevelOrder(root.left, level+1, ret); 
        zigzagLevelOrder(root.right, level+1, ret); 
    }
}