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
            if(head==null)return head;
            if(head.next==null)return head;
            
           ListNode sentinal=new ListNode(0,head);
           
            ListNode pred=sentinal;
            while(head!=null){
                    if(head.next!=null&&head.next.val==head.val){
                            while(head.next!=null&&head.val==head.next.val){
                                    head=head.next;
                            }
                            pred.next=head.next;
                    }
                    else{
                            pred=pred.next;
                    }
                    head=head.next;
            }
            return sentinal.next;
            
        
    }
}