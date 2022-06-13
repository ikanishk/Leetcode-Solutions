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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        //null check for both lists//
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        
        //Keep both pointers on the head of both the linked list.
        ListNode head = null, tail = null;
        while(list1!=null && list2!=null){
            if(head==null){
                if(list1.val<=list2.val){
                    head = tail = list1;
                    list1 = list1.next;
                }else{
                    head = tail = new ListNode(list2.val);
                    list2=  list2.next;
                }
                
            }else{
                if(list1.val<=list2.val){
                    tail.next = list1;
                    list1 = list1.next;
                }else{
                    tail.next = list2;
                    list2=  list2.next;
                }
                tail = tail.next;
            }
        }
        if(list1==null){
            tail.next = list2;
        }else{
            tail.next = list1;
        }
        return head;
    }
}