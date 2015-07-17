/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    //recursive
    public ListNode swapPairs(ListNode head) {
    	if (head == null || head.next == null){
    		return head; 
    	}
    	ListNode p = head.next; 
    	head.next = swapPairs(head.next.next); 
    	p.next = head; 
    	return p; 
	}
	//iterative
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null){
    		return head; 
    	}

    	ListNode dummy = new ListNode(-1); 
    	dummy.next = head; 
    	ListNode p = dummy;
    	while (p.next != null && p.next.next != null){
    		ListNode n1 = p.next; 
    		ListNode n2 = p.next.next; 
    		n1.next = n2.next; 
    		p.next = n2; 
    		n2.next = n1; 
    		p = p.next.next; 
    	}
    	return dummy.next;
	}
    	
}