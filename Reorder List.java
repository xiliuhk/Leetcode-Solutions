/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null||head.next.next == null){
            return; 
        }
        
        ListNode left = head, right = head;
        while (right.next != null && right.next.next != null ){
            left = left.next; 
            right = right.next.next;
        }
        
        ListNode mid = left, prev = left.next; 
        while (prev.next != null){
            ListNode cur = prev.next; 
            prev.next = cur.next;
            cur.next = mid.next; 
            mid.next = cur;
        }
        
        left = head;
        right = mid.next;
        
        while (left != mid){
            mid.next = right.next; 
            right.next = left.next; 
            left.next = right; 
            left = right.next; 
            right = mid.next; 
        }
    }
    
}