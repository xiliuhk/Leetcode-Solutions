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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ret = new ArrayList<String>(); 
        if (root != null){
            binaryTreePaths(root, "", ret);
        }
        return ret; 
    }
    public void binaryTreePaths(TreeNode root, String parent, List<String>ret){
        if (root.left == null && root.right == null){
            ret.add(parent+root.val); 
        }
        if (root.left != null){
            binaryTreePaths(root.left, parent+root.val+"->", ret); 
        }
        if (root.right != null){
            binaryTreePaths(root.right, parent+root.val+"->", ret); 
        }

    }
    
}