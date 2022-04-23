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
    private ListNode getmid(ListNode head){
            ListNode slow=head;
            ListNode fast=head.next;
            while(fast != null && fast.next != null){
                    fast=fast.next.next;
                    slow=slow.next;
            }
            return slow;
    }
    private ListNode reverse(ListNode head){
            ListNode curr=head;
            ListNode prev=null;
            
            while(curr != null){
                   ListNode temp=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=temp;
            }
            return prev;
    }
    public boolean isPalindrome(ListNode head) {
            
            if(head.next == null){
                    return true;
            }
            
            
            ListNode middle=getmid(head);
            // System.out.println(middle.val);
            middle.next=reverse(middle.next);
            
            ListNode head1=head;
            ListNode head2=middle.next;
            
            while(head2 != null){
                    if(head1.val != head2.val){
                            return false;
                    }
                    head1=head1.next;
                    head2=head2.next;
            }
            return true;
        
    }
}