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
    public boolean isValidBST(TreeNode root) {
        
        long prev_val = Long.MIN_VALUE;
        
        TreeNode cur = root, prev = null;
        while(cur != null){
            if (cur.left == null){
                //ret.add(cur.val);
                if (prev_val >= cur.val){
                    return false;
                }else{
                    prev_val = cur.val; 
                }
                cur = cur.right;
            }else{
                prev = cur.left; 
                while (prev.right != null && prev.right != cur){
                    prev = prev.right; 
                }
                if (prev.right == null){
                    prev.right = cur; 
                    cur = cur.left; 
                }else{
                    prev.right = null; 
                    //ret.add(cur.val);
                    if (prev_val >= cur.val){
                        return false;
                    }else{
                        prev_val = cur.val; 
                    }
                    cur = cur.right; 
                }
            }
        }
        return true; 
        //return ret; 
    }   
    // public boolean isValidBST(TreeNode root) {
    //     return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    // }
    // public boolean isValidBST(TreeNode root, long min, long max){
    //     if (root == null){
    //         return true; 
    //     }
    //     if (root.val <= min || root.val >= max){
    //         return false; 
    //     }
    //     return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    // }
}