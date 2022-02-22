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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Counting size of linked list
            ListNode temp=head;
            int c=0;
            while(temp!=null){
                    c++;
                    temp=temp.next;
            }
            if(c==1){
                    return null;
            }
            int pos=c-n+1;
            if(pos==1){
                    return head=head.next;
            }
            int i=1;
            ListNode p=head;
            while(i<pos-1){
                    i++;
                    p=p.next;
            }
            p.next=p.next.next;
            return head;
            
    }
}