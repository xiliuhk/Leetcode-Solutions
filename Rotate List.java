/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if ( k == 0 || head == null || head.next == null){
        	return head; 
        }
        
        ListNode dummy = new ListNode(-1); 
        dummy.next = head; 
        ListNode fast = dummy, slow = dummy;
        int len = 0; 
        while (fast.next != null){
            len++; 
            fast = fast.next; 
        }
        k %= len; 
        fast = dummy; 
        for (int i = 0; i < k; i++){
        	fast = fast.next; 
        } 
        while (fast.next != null){
        	fast = fast.next; 
        	slow = slow.next; 
        }
        fast.next = dummy.next; 
        dummy.next = slow.next; 
        slow.next = null; 

        return dummy.next; 
    }
}