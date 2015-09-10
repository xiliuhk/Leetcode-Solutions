/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
 		// ListNode newHead = null; 
 		// while (head != null){
 		// 	ListNode next = head.next; 
 		// 	head.next = newHead; 
 		// 	newHead = head;
 		// 	head = next; 
 		// }
 		// return newHead; 
 		return reverseList(head, null); 
    }

    public ListNode reverseList(ListNode head, ListNode newHead){
    	if (head == null){
    		return newHead; 
    	}
    	ListNode next = head.next; 
    	head.next = newHead; 
    	return reverseList(next, head); 
    }
}