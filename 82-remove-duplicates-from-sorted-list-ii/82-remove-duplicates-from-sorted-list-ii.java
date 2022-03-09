/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = new ListNode();
        prev.next = head;
        
        ListNode curr = head;
        
        while(curr != null && curr.next != null) {
            boolean removeCurr = false;
            while(curr.next != null && curr.val == curr.next.val) {
                removeCurr = true;
                curr.next = curr.next.next;
            }
            
            if(removeCurr) {
                prev.next = curr.next;
                if(head == curr) {
                    head = curr.next;
                }
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        
        return head;
    }
}