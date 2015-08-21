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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>(); 
        
        pathSum(root, sum, new ArrayList<Integer>(), ret); 
        return ret; 
    }
    public void pathSum(TreeNode root, int sum, List<Integer>path, List<List<Integer>>ret){
        if (root == null){
            return; 
        }
        path.add(root.val); 
        if (root.left == null && root.right == null && root.val == sum){
            ret.add(new ArrayList(path)); 
        }else{
            pathSum(root.left, sum-root.val, path, ret); 
            pathSum(root.right, sum-root.val, path, ret); 
        }
        path.remove(path.size()-1);
        
    }
}