/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null){
        	return head; 
        }
        ListNode dummy = new ListNode(-1); 
        dummy.next = head; 

        ListNode prev = dummy; 
        for (int i = 0; i < m-1; i++){
        	prev = prev.next; 
        }
        ListNode start = prev.next; 
        ListNode cur = start.next;

        for (int i = m; i < n; i++){
        	start.next = cur.next; 
        	cur.next = prev.next; 
        	prev.next = cur; 
        	cur = start.next; 
        }

        return dummy.next; 


    }
}