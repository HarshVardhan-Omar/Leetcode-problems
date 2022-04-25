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
    public ListNode reverseBetween(ListNode head, int left, int right) {
            if(head == null || head.next == null){
                    return head;
            }
            if(left == right){
                    return head;
            }
            int k=0;
            ListNode temp1=head;
            while(temp1!=null && left>1 && k!=left-2){
                    temp1=temp1.next;
                    k++;
            }
            int i=0;
            ListNode temp=head;
            while(i != left-1){
                    temp=temp.next;
                    i++;
            }
            ListNode left1=temp;
            ListNode prev=temp;
            ListNode curr=prev.next;
            while(i != right-1){
                    ListNode next=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=next;
                    i++;
            }
            boolean flag=false;
            if(temp1==head){
                    flag=true;
            }
            left1.next=curr;
            if(temp1 != left1){
                    temp1.next=prev;
            }
            else{
                    temp1=prev;
            }
            return flag?temp1:head;
    }
}