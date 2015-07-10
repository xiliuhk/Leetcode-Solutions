/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy = new ListNode(-1);
       ListNode p = dummy; 
       int sum = 0; 
       while (l1 != null || l2 != null){
           sum /= 10; 
           
           if (l1 != null){
               sum += l1.val; 
               l1 = l1.next; 
           }
           
           if (l2 != null){
               sum += l2.val; 
               l2 = l2.next; 
           }
           
           p.next = new ListNode(sum % 10);
           p = p.next; 
       }
       
       if (sum / 10 > 0){
           p.next = new ListNode(sum/10);
       }
       
       return dummy.next; 
    }
}