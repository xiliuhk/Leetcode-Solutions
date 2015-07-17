/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if (n == 0){
            return null; 
        }
        if (n == 1){
            return lists[0];
        }
        while (n > 1){
            int k = (n+1)/2; 
            for(int i = 0; i <n/2; i++){
                lists[i] = mergeTwoLists(lists[i], lists[i+k]); 
            }
            n = k; 
        }
        
        return lists[0];
        
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy; 
        
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                p.next = l1;
                l1 = l1.next; 
            }else{
                p.next = l2; 
                l2 = l2.next; 
            }
            p = p.next; 
        }
        if (l1 != null){
            p.next = l1; 
        }
        if (l2 != null){
            p.next = l2; 
        }
        return dummy.next; 
        
    }
}