/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
        	return head;
        }

        ListNode dummy = new ListNode(-1); 
        dummy.next = head; 

        ListNode p = dummy, q = head; 

        while (q != null){
        	while (q.next != null && q.val == q.next.val){
        		q = q.next; 
        	}
        	if (p.next == q){
        		p = q; 
        	}else{
        		p.next = q.next; 
        	}
        	q = q.next; 
        }
        return dummy.next; 
    }
}