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

//Approach: Take 2 pointers (slow and fast) and find the middle of the LL
        //  Reverse the LL followed by the node on which the slow pointer currently is.
        //  Now iterate the dummy node on the head and the slow pointer Node till the end of the LL
        // If at each iteration, the val at both nodes is the same...keep on or else return false.
class Solution {
    public boolean isPalindrome(ListNode head) {
        //Find the middle Node
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //Reverse the list from mid to end
        ListNode prev=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        //Check the values are matching or not
        while(prev!=null){
            if(prev.val!=head.val)
                return false;
            head=head.next;
            prev=prev.next;
        }
        return true;
    }
}