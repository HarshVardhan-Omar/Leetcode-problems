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
    public ListNode swapPairs(ListNode head) {
        if(head==null)
                return head;
        if(head.next==null)
                return head;
            
         ListNode temp=head;
         return swap(head,temp);
        
    }
   private ListNode swap(ListNode head,ListNode temp){
           // ListNode temp=head;
           if(head==null||head.next==null){
                   return temp;
           }
           int temp1=head.val;
           head.val=head.next.val;
           head.next.val=temp1;
           return swap(head.next.next,temp);
   }
}