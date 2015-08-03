/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head; 
        }
        
        ListNode p = head, q = head.next; 
        
        while (q != null){
            if (p.val == q.val){
                p.next = q.next; 
            }else{
                p = q; 
            }
            q = q.next; 
        }
        return head; 
    }
}