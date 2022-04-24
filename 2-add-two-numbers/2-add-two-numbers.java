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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummy=new ListNode(0);
            ListNode curr=dummy;
            int carry=0;
            while(l1 != null || l2 != null){
                    int sum=0;
                    if(l1 != null && l2 != null){
                            sum=l1.val+l2.val+carry;
                    }
                    else{
                            if(l1 == null){
                                    sum=l2.val+carry;
                            }
                            else{
                                    sum=l1.val+carry;
                            }
                    }
                    carry=sum/10;
                    int sum1= sum%10;
                    ListNode newnode=new ListNode(sum1);
                    curr.next=newnode;
                    curr=newnode;   
                    if(l1 != null){
                            l1=l1.next;
                    }
                    if(l2 != null){
                            l2=l2.next;
                    }
            }
            if(carry != 0){
                    ListNode carrynode=new ListNode(carry);
                    curr.next=carrynode;
                    curr=carrynode;
            }
            return dummy.next;
        
    }
}