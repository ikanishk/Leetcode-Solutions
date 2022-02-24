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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode slow = head, fast = head, prev=null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        return merge(l1, l2);
    }
    
    ListNode merge(ListNode l1, ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        ListNode left = l1, right = l2;
        ListNode temp = new ListNode(-1);
        ListNode cur = temp;
        
        while(left!=null && right!=null){
            if(left.val<right.val){
                cur.next = left;
                left = left.next;
            }
            else{
                cur.next = right;
                right = right.next;
            }
            cur = cur.next;
        }
        if(left==null || right==null)
            cur.next = (left==null) ? right:left;
        
        return temp.next;
    }
}