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
    public ListNode middleNode(ListNode head) {
            ListNode temp=head;
            int c=0;
        while(temp!=null){
                c++;
                temp=temp.next;
        }
            //Length is odd
            if(!(c%2==0)){
                   int i=1;
                    while(i!=(c+1)/2){
                            i++;
                            head=head.next;
                    }
                    return head;
            }
            int j=1;
               while(j!=(c/2)+1){
                       j++;
                       head=head.next;
                       
               }
               return head;
    }
}