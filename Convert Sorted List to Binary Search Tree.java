/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null){
            return null; 
        }
        if (head.next == null){
            return new TreeNode(head.val); 
        }
        ListNode slow = head, fast = head.next; 
        while (fast != null && fast.next != null && fast.next.next != null){
            fast = fast.next.next; 
            slow = slow.next; 
        }
        TreeNode root = new TreeNode(slow.next.val);
        ListNode second = slow.next.next; 
        slow.next = null; 
        root.left = sortedListToBST(head); 
        root.right = sortedListToBST(second);
        return root; 
    }
}