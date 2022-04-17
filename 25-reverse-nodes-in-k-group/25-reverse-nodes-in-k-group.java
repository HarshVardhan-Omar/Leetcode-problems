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
        private int getlength(ListNode head){
                ListNode temp=head;
                int c=0;
                while(temp!=null){
                        temp=temp.next;
                        c++;
                }
                return c;
        }
    public ListNode reverseKGroup(ListNode head, int k) {
            if(head==null){
                    return null;
            }
            if(getlength(head)<k){
                    return head;
            }
            
            //Step1: Reverse first k nodes
            
            int count=0;
            ListNode prev=null;
            ListNode curr=head;
            ListNode next=null;
            
            while(curr != null && count<k){
                    next=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=next;
                    count++;
            }
            
            if(next!=null){
                    head.next=reverseKGroup(next,k);
            }
            return prev;
        
    }
}