/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    // recursive reverse first k
    // public ListNode reverseKGroup(ListNode head, int k) {
    //     ListNode cur = head; 
    //     int cnt = 0; 
    //     while (cur != null && cnt != k){
    //         cur = cur.next;
    //         cnt ++; 
    //     }
    //     if (cnt == k){
    //         cur = reverseKGroup(cur, k);
    //         for (; cnt > 0; cnt--){
    //             ListNode tmp = head.next; 
    //             head.next = cur; 
    //             cur = head; 
    //             head = tmp; 
    //         }
    //         head = cur; 
    //     }
    //     return head;
    // }
    
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1 || head.next == null){
            return head; 
        }
        ListNode prev = new ListNode(-1); 
        prev.next = head; 
        head = prev; 
        ListNode cur = prev.next;
        
        while (cur != null){
            int cnt = k; 
            for (; cnt > 1 && cur != null; cnt--){
                cur = cur.next;
            }
            if (cur != null){
                cur = prev.next; 
                cnt = k; 
                for (;cnt > 1;cnt--){
                   ListNode tmp = cur.next; 
                   cur.next = tmp.next; 
                   tmp.next = prev.next; 
                   prev.next = tmp; 
                }
                prev = cur; 
                cur = cur.next; 
            }
        }
        return head.next; 
    }
}