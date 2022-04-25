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
    private ListNode merge(ListNode l1, ListNode l2){
            if(l1 == null){
                    return l2;
            }
            if(l2 == null){
                    return l1;
            }
            if(l1.val>l2.val){
                    ListNode temp=l1;
                    l1=l2;
                    l2=temp;
            }
            ListNode res=l1;
            while(l1 != null && l2 != null){
                    ListNode temp=null;
                    while(l1 != null && l1.val <= l2.val){
                            temp=l1;
                            l1=l1.next;
                    }
                    temp.next=l2;
                    temp=l1;
                    l1=l2;
                    l2=temp;
            }
            return res;
            
    }
    public ListNode sortList(ListNode head) {
            if(head == null || head.next == null){
                    return head;
            }
            
            //Now we need to find the middle of the linked list
            ListNode mid=getmid(head);
            ListNode left=head;
            ListNode right=mid.next;
            mid.next=null;
            left=sortList(left);
            right=sortList(right);
            
            ListNode result=merge(left,right);
            return result;
        
    }
}