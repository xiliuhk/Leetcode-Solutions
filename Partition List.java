/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(-1); 
        ListNode right = new ListNode(-1); 
        ListNode l = left, r = right; 
        
        while (head != null){
            if (head.val < x){
                l.next = head; 
                l = l.next; 
                head = head.next; 
            }else{
                r.next = head; 
                r = r.next; 
                head = head.next; 
            }
        }
        r.next = null; 
        l.next = right.next;
        
        return left.next; 
    }
}