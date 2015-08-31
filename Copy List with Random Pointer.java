/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
 		RandomListNode p = head; 
 		RandomListNode next = null; 
    	//duplicate nodes
    	while (p != null){
    		next = p.next; 
    		RandomListNode copy = new RandomListNode(p.label); 
    		p.next = copy; 
    		copy.next = next; 
    		p = next; 
    	}

    	//copy random pointers
    	p = head; 
    	while (p != null){
    		if (p.random != null){
    			p.next.random = p.random.next; 
    		}
    		p = p.next.next; 
    	}

    	// split
    	p = head; 
    	RandomListNode dummy = new RandomListNode(-1); 
    	RandomListNode newnode = null; 
    	RandomListNode newP = dummy; 

    	while (p != null){
    		next = p.next.next; 
    		newNode = p.next; 
    		newP.next = newNode; 
    		newP = newNode; 
    		p.next = next; 
    		p = next; 
    	}

    	return dummy.next; 
    }
}