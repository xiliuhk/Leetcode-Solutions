/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
    
    	ListNode dummy = new ListNode(-1); 
    	ListNode cur = head; 
    	ListNode pre = dummy; 
    	while (cur != null ){
    		pre = dummy; 
    		while (pre.next != null && pre.next.val < cur.val){
    			pre = pre.next; 
    		}
    		ListNode to_swap = cur.next; 
    		cur.next = pre.next; 
    		pre.next = cur; 
    		cur = to_swap; 
    	}
    	return dummy.next; 
    }

    public ListNode sortList(ListNode head) {
     	// merge sort
     	if (head == null || head.next = null){
     		return head; 
     	}
     	ListNode fast = head, slow = head; 
     	while (fast != null && fast.next != null){
     		fast = fast.next.next; 
     		slow = slow.next; 
     	}
     	ListNode mid = sortList(slow.next); 
     	slow.next = null; 
     	return merge(sortList(head), mid); 
    }

    private ListNode merge(ListNode h1, ListNode h2){
    	ListNode dummy = new ListNode(-1); 
    	ListNode p = dummy; 
    	while (h1 != null && h2 != null){
    		if (h1.val < h2.val){
    			p.next = h1; 
    			h1 = h1.next; 
    		}else{
    			p.next = h2; 
    			h2 = h2.next; 
    		}
    		p = p.next; 
    	}
    	p.next = (h1 != null)? h1: h2; 

    	return dummy.next; 
    }
}