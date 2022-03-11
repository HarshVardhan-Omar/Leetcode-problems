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
    public ListNode rotateRight(ListNode head, int k) {
            int n=getlength(head);
            
            ListNode temp=head;
            ListNode prev=null;
            if(n<=1||k==0||k%n==0)
                    return head;
            if(k>n){
                    k=k%n;
            }
            int breakage=n-k;
            while(breakage>0&&temp!=null){
                    prev=temp;
                    temp=temp.next;
                    breakage--;    
            }
            prev.next=null;
            ListNode itr=temp;
            if(itr!=null){
                    while(itr.next!=null){
                            itr=itr.next;
                    }
                    itr.next=head;
            }
            return temp;
            
        
    }
    private int getlength(ListNode head){
            if(head==null){
                    return 0;
            }
            int c=0;
            ListNode temp=head;
            while(temp!=null){
                    temp=temp.next;
                    c++;
            }
            return c;
    }
}