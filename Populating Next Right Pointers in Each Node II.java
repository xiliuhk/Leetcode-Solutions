/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null){
    		return; 
    	}
    	TreeLinkNode head = null, cur = root, prev = null; 

    	while (cur != null){
    		while (cur != null){
    			if (cur.left != null){
    				if (prev != null){
    					prev.next = cur.left; 
    				}else{
    					head = cur.left; 
    				}
    				prev = cur.left; 
    			}
    			if (cur.right != null){
    				if (prev != null){
    					prev.next = cur.right; 
    				}else{
    					head = cur.right; 
    				}
    				prev = cur.right; 
    			}
    			cur = cur.next; 
    			
    		}
    		cur = head; 
    		head = null;
    		prev = null;
    	}
    }
}